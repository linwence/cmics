package com.el.dev.emp.controller;

import com.el.dev.emp.domain.F4101;
import com.el.dev.emp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vincent on 2016/7/14.
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/f4101new")
    public ModelAndView itemView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("f4101new");
        return modelAndView;
    }

    @RequestMapping(value="/api",produces="application/json;charset=UTF-8")
    public @ResponseBody List<F4101> loadItems() {
        return itemService.findF4101ByAll();
    }

    @RequestMapping(value = "/map")
    public @ResponseBody Map<String,Object> loadMapItems(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("f4101s",itemService.findF4101ByAll());
        return map;
    }

    @RequestMapping("/f4101")
    public ModelAndView findItem() {
        ModelAndView modelAndView = new ModelAndView();
        List<F4101> f4101s = itemService.findF4101ByAll();
        modelAndView.addObject("f4101s", f4101s);
        modelAndView.setViewName("f4101");
        return modelAndView;
    }
}
