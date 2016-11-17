package com.el.cmic.controller;

import com.el.cmic.timetask.WmsTimeTask;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vincent on 2016/11/11.
 */
@Controller
@RequestMapping("/wms")
public class ManualCallWmsController {
    private final Logger logger = Logger.getLogger(ManualCallWmsController.class);
    @Autowired
    private WmsTimeTask wmsTimeTask;

    @RequestMapping("/manual")
    @ResponseBody
    public String callWms() {
        logger.info("......手动调用WMS接口开始......");
        wmsTimeTask.run();
        logger.info("......手动调用WMS接口结束......");
        return "执行完成";
    }
}
