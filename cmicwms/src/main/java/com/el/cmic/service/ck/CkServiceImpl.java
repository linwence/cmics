package com.el.cmic.service.ck;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.el.cfg.domain.Ve8wms20;
import com.el.cmic.common.WmsInterfaceType;
import com.el.cmic.common.domain.WmsData;
import com.el.cmic.common.domain.WmsRequest;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.common.service.Ve8wms20Service;
import com.el.cmic.domain.ck.CkOrder;
import com.el.cmic.domain.ck.CkOrderDtl;
import com.el.cmic.domain.inbound.F41002Cnv1;
import com.el.cmic.domain.log.Fe8wmslg;
import com.el.cmic.mapper.ck.CkMapper;
import com.el.cmic.mapper.inbound.InAndOutCnvMapper;
import com.el.utils.HttpRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vincent on 2016/10/24.
 */
@Service
public class CkServiceImpl implements CkService {
    Logger logger = Logger.getLogger(CkServiceImpl.class);
    @Value("${wms.Url}")
    private String url;
    // @Value("${wms.AppKey}")
    //private String appKey;
    //@Value("${wms.AppPassword}")
    //private String appPassword;
    @Value("${wms.Ver}")
    private String ver;
    @Value("${wms.ID}")
    private String wmsId;
    @Autowired
    private CkMapper ckMapper;
    @Autowired
    private InAndOutCnvMapper inAndOutCnvMapper;

    @Resource(name = "httpRequest")
    private HttpRequest httpRequest;
    //@Resource(name = "wmsRequest")
    //private WmsRequest wmsRequest;
    @Autowired
    private Ve8wms20Service ve8wms20ServiceImpl;

    public void callWmsCkInterface() {
        // System.out.println("wmsRequest hasCode=" +wmsRequest.hashCode());
        try {
            List<Ve8wms20> ve8wms20List = ve8wms20ServiceImpl.selectAllVe8wms20();
            for (Ve8wms20 ve8wms20 : ve8wms20List
                    ) {
                //获取表头
                List<CkOrder> ckOrderList = ckMapper.selectAll(ve8wms20.getLsco(), ve8wms20.getLsmcu());
                for (CkOrder ckOrder : ckOrderList
                        ) {
                    try {
                        //根据表头获取明细
                        List<CkOrderDtl> ckOrderDtlList = ckMapper.selectCkOrderDtlByDoco(ckOrder.getDoco(), ckOrder.getDcto(), ckOrder.getCo());
                        //组装拆配单位换算
                        if (ckOrder.getFlag().equals("IA")) {
                            for (CkOrderDtl dtl : ckOrderDtlList
                                    ) {
                                // 先判断F4111.TRUM如果不等于F4101.UOM1，执行下面换算：
                                //F4111.LITM=F4101.LITM
                                //F4111.TRUM=F41002.UM    F4101.UOM1=F41002.RUM ,取到转换系数 F41002.CNV1
                                //下传WMS的“数量”*F41002.CNV1
                                F41002Cnv1 f41002Cnv1 = inAndOutCnvMapper.selectCnv1ByF4111(ckOrder.getWmsCo(), ckOrder.getWmsMcu(),
                                        ckOrder.getDoco().toString(), ckOrder.getDcto(), dtl.getLnid());
                                if (null != f41002Cnv1 && f41002Cnv1.getCnv1().doubleValue() > 0) {
                                    dtl.setUorg(dtl.getUorg().multiply(f41002Cnv1.getCnv1()));
                                    dtl.setUprc(dtl.getUprc().divide(f41002Cnv1.getCnv1()));
                                }

                            }
                        }


                        ckOrder.setCkOrderDtlList(ckOrderDtlList);

                        WmsData wmsData = new WmsData(WmsInterfaceType.CK_TYPE, wmsId);
                        wmsData.setInterfaceData(ckOrder);
                        //生成data数据
                        String data = JSON.toJSONString(wmsData, SerializerFeature.WriteMapNullValue);
                        WmsRequest wmsRequest = new WmsRequest(ve8wms20.getLse8appk(), ve8wms20.getLsepapsd(), data, ver);
                        //wmsRequest.setData(data);
                        Fe8wmslg fe8wmslg = new Fe8wmslg();
                        fe8wmslg.setLsdoco(ckOrder.getDoco());
                        fe8wmslg.setLsdcto(ckOrder.getDcto());
                        fe8wmslg.setLskcoo(ckOrder.getCo());
                        fe8wmslg.setLsvar1(data);
                        //fe8wmslg.setLsdl03("Request");
                        fe8wmslg.setLsdl03(WmsInterfaceType.CK_TYPE);
                        //调用请求
                        String encodeResult = httpRequest.sendPost(wmsRequest.toMap(), fe8wmslg);

                        byte[] bytes = Base64Utils.decodeFromString(encodeResult);
                        String decodeResult = new String(bytes, "utf-8");

                        afterResponse(decodeResult, ckOrderDtlList);
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error("调用WMS出库推送接口失败," + e.getMessage());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("调用WMS出库推送接口失败," + ex.getMessage());
        }
    }

    public void afterResponse(String jsonString, List<CkOrderDtl> ckOrderDtlList) {
        WmsResult wmsResult = JSON.parseObject(jsonString, WmsResult.class);
        if (wmsResult.isSuccess()) {
            //更新状态
            update(ckOrderDtlList);
        } else {

        }
    }

    @Transactional
    public void update(List<CkOrderDtl> ckOrderDtlList) {
        for (CkOrderDtl ckOrderDtl : ckOrderDtlList
                ) {
            ckMapper.updateCk(ckOrderDtl);
        }
    }


}