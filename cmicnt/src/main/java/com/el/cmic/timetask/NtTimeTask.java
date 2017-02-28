package com.el.cmic.timetask;

import com.el.cmic.service.goods.ProductServiceImpl;
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

    @Override
    public void run() {
        //  货品接口
        logger.info("........货品接口调用开始........");
        productServiceImpl.callNtInterface();
        logger.info("........货品接口调用结束........");


    }
}
