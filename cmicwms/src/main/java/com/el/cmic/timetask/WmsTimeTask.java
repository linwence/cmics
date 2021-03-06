package com.el.cmic.timetask;

import com.el.cmic.service.ck.CkService;
import com.el.cmic.service.ckcancel.CkCancelService;
import com.el.cmic.service.customer.CustomPropelService;
import com.el.cmic.service.goods.BalesService;
import com.el.cmic.service.inbound.InboundService;

import com.el.cmic.service.repertory.InInvertoryCancelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/31.
 */
@Component
public class WmsTimeTask extends TimerTask {
    private Logger logger = Logger.getLogger(WmsTimeTask.class);

    @Autowired
    private CkService ckServiceImpl;
    @Autowired
    private CkCancelService ckCancelServiceImpl;

    @Autowired
    private InboundService inboundService;
    @Autowired
    private BalesService balesServiceImpl;
    @Autowired
    private CustomPropelService customPropelServiceImpl;
    @Autowired
    private InboundService inboundServiceImpl;
    @Autowired
    private InInvertoryCancelService inInvertoryCancelServiceImpl;

    @Override
    public void run() {
        //  货品接口
        logger.info("........货品接口调用开始........");
        balesServiceImpl.callWmsGoodsInterface();
        logger.info("........货品接口调用结束........");
        // 客商接口
        logger.info("........客商接口调用开始........");
        customPropelServiceImpl.callWmsCustomInterface();
        logger.info("........客商接口调用结束........");

        //入库推送接口
        logger.info("........入库接口调用开始........");
        inboundService.callWmsInboundPushInterface();
        logger.info("........入库接口调用结束........");

        // 入库取消推送接口
        logger.info("........入库取消接口调用开始........");
        inInvertoryCancelServiceImpl.callWmsInCancelInterface();
        logger.info("........入库取消接口调用结束........");


        //调用wms的出库接口
        logger.info("........出库接口调用开始........");
        ckServiceImpl.callWmsCkInterface();
        logger.info("........出库接口调用结束........");

        //调用出库取消接口
        logger.info("........出库取消接口调用开始........");
        ckCancelServiceImpl.callWmsCkCancelInterface();
        logger.info("........出库取消接口调用结束........");

    }
}
