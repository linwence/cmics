package com.el.cmic.controller;

import com.el.cmic.timetask.SpdTimeTask;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vincent on 2016/11/26.
 */
@Controller
@RequestMapping("/spd")
public class ManualCallSpdController {
    private Logger logger=Logger.getLogger(ManualCallSpdController.class);
    @Autowired
    private SpdTimeTask spdTimeTask;
    @RequestMapping("/manual")
    @ResponseBody
    public String callSpd(){
        logger.info("......手动调用SPD接口开始......");
        spdTimeTask.run();
        logger.info("......手动调用SPD接口结束......");
        return "执行完成";
    }
}
