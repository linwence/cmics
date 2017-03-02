package com.el.cmic.timetask;

import com.el.cmic.service.applydetail.ApplyDetailServiceImpl;
import com.el.cmic.service.applyhead.ApplyHeadServiceImpl;
import com.el.cmic.service.goods.ProductServiceImpl;
import com.el.cmic.service.saleorderdetail.SaleOrderDetailServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/31.
 */
@Component
public class NtTimeTask extends TimerTask {
    private Logger logger = Logger.getLogger(NtTimeTask.class);

   /* @Autowired
    private ProductService productServiceImpl;*/

    @Resource
    private ProductServiceImpl productServiceImpl;

    @Resource
    private SaleOrderDetailServiceImpl saleOrderDetailServiceImpl;

    @Resource
    private ApplyHeadServiceImpl applyHeadServiceImpl;

    @Resource
    private ApplyDetailServiceImpl applyDetailServiceImpl;

    @Override
    public void run() {
        //  货品接口
        logger.info("........货品接口调用开始........");
        productServiceImpl.callNtInterface();
        logger.info("........货品接口调用结束........");

        logger.info("........订单明细接口调用开始........");
        saleOrderDetailServiceImpl.callNtInterface();
        logger.info("........订单明细接口调用结束........");

        logger.info("........发票申请表头接口调用开始........");
        applyHeadServiceImpl.callNtInterface();
        logger.info("........发票申请表头接口调用结束........");

        logger.info("........发票申请明细接口调用开始........");
        applyDetailServiceImpl.callNtInterface();
        logger.info("........发票申请明细接口调用结束........");


    }
}
