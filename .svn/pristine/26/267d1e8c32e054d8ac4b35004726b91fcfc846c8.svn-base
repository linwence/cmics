package com.el.dev.emp.controller;

import com.el.dev.emp.domain.Emp;
import com.el.dev.emp.service.EmpService;
import com.el.utils.JdeBsfn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return empService.queryEmp();
    }

    @RequestMapping("/date1")
    @ResponseBody
    public String date1(Date date1) {
        return date1.toString();
    }

   /* @InitBinder("date1")
    public void initDate(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MMdd"), true));
    }*/

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


}
