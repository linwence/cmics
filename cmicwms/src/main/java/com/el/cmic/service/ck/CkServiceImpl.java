package com.el.cmic.service.ck;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.el.cfg.domain.FE8WMS20;
import com.el.cmic.common.WmsInterfaceType;
import com.el.cmic.common.domain.WmsData;
import com.el.cmic.common.domain.WmsRequest;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.ck.CkOrder;
import com.el.cmic.domain.ck.CkOrderDtl;
import com.el.cmic.domain.log.Fe8wmslg;
import com.el.cmic.mapper.ck.CkMapper;
import com.el.cmic.service.repertory.FE8WMS20Service;
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
    @Resource(name = "httpRequest")
    private HttpRequest httpRequest;
    //@Resource(name = "wmsRequest")
    //private WmsRequest wmsRequest;
    @Autowired
    private FE8WMS20Service fe8WMS20ServiceImpl;
    public void callWmsCkInterface() {
        // System.out.println("wmsRequest hasCode=" +wmsRequest.hashCode());
        List<FE8WMS20> fe8WMS20List = fe8WMS20ServiceImpl.selectAllFE8WMS20();
        for (FE8WMS20 fe8wms20 : fe8WMS20List
                ) {
            //获取表头
            List<CkOrder> ckOrderList = ckMapper.selectAll(fe8wms20.getLsco());
            for (CkOrder ckOrder : ckOrderList
                    ) {
                try {
                    //根据表头获取明细
                    List<CkOrderDtl> ckOrderDtlList = ckMapper.selectCkOrderDtlByDoco(ckOrder.getDoco(), ckOrder.getDcto(), ckOrder.getCo());
                    ckOrder.setCkOrderDtlList(ckOrderDtlList);

                    WmsData wmsData = new WmsData(WmsInterfaceType.CK_TYPE, wmsId);
                    wmsData.setInterfaceData(ckOrder);
                    //生成data数据
                    String data = JSON.toJSONString(wmsData, SerializerFeature.WriteMapNullValue);
                    WmsRequest wmsRequest = new WmsRequest(fe8wms20.getLse8appk(), fe8wms20.getLsepapsd(), data,ver);
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
                    logger.error("调用WMS入库推送接口失败," + e.getMessage());
                }
            }
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
