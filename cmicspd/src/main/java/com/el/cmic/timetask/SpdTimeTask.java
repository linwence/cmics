package com.el.cmic.timetask;

import java.util.TimerTask;

import com.el.cmic.service.goods.BalePriceService;
import com.el.cmic.service.goods.BaleService;
import com.el.cmic.service.orderback.SpdOrderBackService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.el.cmic.service.department.DepartmentDataService;
import com.el.cmic.service.supplier.SupplierService;
import com.el.utils.DateUtil;

@Component
public class SpdTimeTask extends TimerTask {
    private Logger logger = Logger.getLogger(SpdTimeTask.class);
    @Autowired
    private BaleService baleServiceImpl;

    @Autowired
    private DepartmentDataService departmentDataService;

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private BalePriceService balePriceServiceImpl;
    @Autowired
    private SpdOrderBackService spdOrderBackServiceImpl;

    @Override
    public void run() {
        //商品基础数据
        logger.info("........医药医材信息接口调用开始........");
        baleServiceImpl.callBaleInterface();
        logger.info("........医药医材信息接口调用结束........");

        //职员部门信息基础数据推送（
        logger.info("........职员部门信息接口调用开始........");
        departmentDataService.callSpdDepartmentInterface();
        logger.info("........职员部门信息接口调用结束........");
        //供应商
        logger.info("........供应商信息接口调用开始........");
        supplierService.callSupplierInterface();
        logger.info("........供应商信息接口调用结束........");
        //商品配送价
        logger.info("........商品配送价接口调用开始........");
        balePriceServiceImpl.callBalePriceImplement();
        logger.info("........商品配送价接口调用结束........");

        //9.	SPD订单返回接口表
        logger.info("........SPD订单返回接口表接口调用开始........");
        spdOrderBackServiceImpl.CallSpdOrderBackInterface();
        logger.info("........SPD订单返回接口表接口调用结束........");

        //String timestamp = DateUtil.getTimeStamp();
        //	System.out.println(timestamp);
    }

}
