package com.el.cmic.service.repertory.impl;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.repertory.InInvertoryCancel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.cfg.domain.FE8WMS20;
import com.el.cfg.domain.FE8WMS21;
import com.el.cmic.domain.repertory.StroTransferPush;
import com.el.cmic.domain.repertory.StroTransferPushItem;
import com.el.cmic.mapper.repertory.StoTransferPushMapper;
import com.el.cmic.service.repertory.FE8WMS20Service;
import com.el.cmic.service.repertory.FE8WMS21Service;
import com.el.cmic.service.repertory.StoTransferPushService;
import com.el.utils.DateUtil;

@Service
public class StoTransferPushServiceImpl implements StoTransferPushService {
    Logger logger = Logger.getLogger(StoTransferPushServiceImpl.class);
    @Autowired
    private StoTransferPushMapper stoTransferPushMapper;

    @Autowired
    private FE8WMS20Service fE8WMS20Service;

    @Autowired
    private FE8WMS21Service fE8WMS21Service;

    @Override
    public WmsResult acceptData(String data) {
        WmsResult wmsResult = new WmsResult(true, "0000", "成功");
        try {
            StroTransferPush stroTransferPush = JSONObject.toJavaObject(JSONObject.parseObject(data), StroTransferPush.class);
            insertSTPush(stroTransferPush);
        } catch (Exception e) {
            logger.error("接收库存转移失败:" + e.getMessage());
            e.printStackTrace();
            wmsResult.setCode("1004");
            wmsResult.setSuccess(false);
            wmsResult.setMessage(e.getMessage());
        }

        return wmsResult;
    }

    @Override
    @Transactional
    public Integer insertSTPush(StroTransferPush stroTransferPush) {
        int count = 0;//储存插上记录数
        List<StroTransferPushItem> listItem = stroTransferPush.getListItem();
        //添加明细
        if (listItem != null && listItem.size() > 0) {
            for (StroTransferPushItem temp : listItem) {
                //mcu kcoo  转换
                FE8WMS21 fE8WMS21 = fE8WMS21Service.selectFE8WMS21ByMcu(stroTransferPush.getTwmcu().trim());
                FE8WMS20 fE8WMS20 = fE8WMS20Service.selectFE8WMS20ByKcoo(stroTransferPush.getTwkcoo());
                temp.setTwmcu(fE8WMS21.getLsmcu());
                temp.setTwkcoo(fE8WMS20.getLsco());
                temp.setTwvr01(stroTransferPush.getTwvr01());
                temp.setTwtrdj(DateUtil.dateStrToJuLian(stroTransferPush.getTwtrdjStr()));
                temp.setTwfil2(stroTransferPush.getTwfil2());

                //数据转换(当移出库类型有值时，为“F”否则为T)
               /* if (temp.getTwev01() != null && "".equals(temp.getTwev01())) {
                    temp.setTwev01("F");
                } else {
                    temp.setTwev01("T");
                }
                //当移入库类型有值时，为“T”否则为F
                if (temp.getTwev02() != null && "".equals(temp.getTwev02())) {
                    temp.setTwev02("T");
                } else {
                    temp.setTwev02("F");
                }*/

                count += stoTransferPushMapper.insertSTPushItem(temp);
            }
        }
        return count;
    }

}
