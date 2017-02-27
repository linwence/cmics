package com.el.cmic.timetask;

import com.el.cmic.service.goods.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/31.
 */
@Component
public class NtTimeTask extends TimerTask {
    private Logger logger = Logger.getLogger(NtTimeTask.class);

    @Autowired
    private ProductService productServiceImpl;


    @Override
    public void run() {
        //  货品接口
        logger.info("........货品接口调用开始........");
        productServiceImpl.callNtInterface();
        logger.info("........货品接口调用结束........");


    }
}
