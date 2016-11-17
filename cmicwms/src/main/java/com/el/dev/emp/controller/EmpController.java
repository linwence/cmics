package com.el.dev.emp.controller;

import com.el.dev.emp.domain.Emp;
import com.el.dev.emp.service.EmpService;
import com.el.utils.JdeBsfn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vincent on 2016/7/15.
 */
@Controller
@RequestMapping("/api/emp")
public class EmpController {
    Logger logger = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;

    @Autowired
    private JdeBsfn jdeBsfn;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Emp> queryEmp() {
        logger.info("......sssss........");
        return empService.queryEmp();
    }

    @RequestMapping("/date1")
    @ResponseBody
    public String date1(Date date1) {
        return date1.toString();
    }

    @InitBinder("date1")
    public void initDate(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @RequestMapping("/map")
    @ResponseBody
    public String map(MapForm mapForm) {
        return mapForm.toString();
    }

    @RequestMapping("/map2")
    @ResponseBody
    public String map(Map<String, Object> mapForm) {
        return mapForm.toString();
    }

  /*  @RequestMapping("/list")
    @ResponseBody
    public String list(ListForm listForm) {
        return listForm.toString();
    }*/

    @RequestMapping("/ukid/{tablename}")
    @ResponseBody
    public String ukid(@PathVariable(value = "tablename") String tableName) {
        Map m = new HashMap();
        // String tableName = "F58H0401";
        m.put("szObjectName", tableName);
        Map ret = null;
        try {
            ret = jdeBsfn.call("GetNextUniqueKeyID", m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String retString = tableName + "'s ukid=" + ret.get("mnUniqueKeyID").toString();
        return retString;
    }

    @RequestMapping(value = "/goods", method = RequestMethod.POST)
    @ResponseBody
    public String multipartFormData(@RequestParam("appkey") String appKey, @RequestParam("timestamp") String timestamp, @RequestParam("data") String data, @RequestParam("sign") String sign, @RequestParam("ver") String ver) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(data);
        stringBuilder.append("\"").append("appKey").append("\":").append("\"").append(appKey).append("\"");

        return stringBuilder.toString();
    }

    @RequestMapping(value = "/goods2", method = RequestMethod.POST)
    @ResponseBody
    public String multipartFormData(@RequestParam("appkey") String appKey) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("=================================");


        return stringBuilder.toString();
    }

    //
    @RequestMapping(value = "/goods3", method = RequestMethod.POST)
    @ResponseBody
    public String multipartFormData2(@RequestParam(name = "appkey") String appkey,
                                     @RequestParam(name = "timestamp") String timestamp,
                                     @RequestParam(name = "data") String data,
                                     @RequestParam(name = "sign") String sign,
                                     @RequestParam(name = "ver") String ver) {


        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("=================================");
        stringBuilder.append(appkey);

        return stringBuilder.toString();
    }


}
