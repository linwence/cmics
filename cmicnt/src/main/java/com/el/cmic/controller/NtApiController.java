package com.el.cmic.controller;

import com.el.cmic.common.NtRequestParam;
import com.el.cmic.common.NtRequestParamByCode;
import com.el.cmic.common.NtRequestParamByTime;
import com.el.cmic.common.NtResult;
import com.el.cmic.domain.invoice.InvoiceDomain;
import com.el.cmic.service.applydetail.ApplyDetailServiceImpl;
import com.el.cmic.service.applyhead.ApplyHeadServiceImpl;
import com.el.cmic.service.goods.ProductServiceImpl;
import com.el.cmic.service.invoice.InvoiceService;
import com.el.cmic.service.saleorderdetail.SaleOrderDetailServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincent on 2017/2/17.
 */
@RestController
@Scope(value = "prototype")
@RequestMapping("/api")
public class NtApiController {
    Logger logger = Logger.getLogger(NtApiController.class);
    @Resource
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private InvoiceService invoiceServiceImpl;

    @Resource
    private SaleOrderDetailServiceImpl saleOrderDetailServiceImpl;

    @Resource
    private ApplyHeadServiceImpl applyHeadServiceImpl;

    @Resource
    private ApplyDetailServiceImpl applyDetailServiceImpl;

    @Value("${nt.userCode}")
    private String ntUserCode;
    @Value("${nt.pwd}")
    private String ntPwd;

    @RequestMapping("/product/time")
    public String productByTime(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {

        if (productServiceImpl.callNtInterface(timeBegin, timeEnd)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping(value = "/product/code")
    public String productByKey(@RequestParam("code") String code) {
        if (productServiceImpl.callNtInterface(code)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping("/saleoderdetail/time")
    public String saleOrderDetailByTime(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {

        if (saleOrderDetailServiceImpl.callNtInterface(timeBegin, timeEnd)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping(value = "/saleoderdetail/code")
    public String saleOrderDetailBtTime(@RequestParam("vr02") String vr02) {
        if (saleOrderDetailServiceImpl.callNtInterface(vr02)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping("/applyhead/time")
    public String getApplyHeadByTime(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {

        if (applyHeadServiceImpl.callNtInterface(timeBegin, timeEnd)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping(value = "/applyhead/code")
    public String getApplyHeadByCode(@RequestParam("doc") String doc) {
        if (applyHeadServiceImpl.callNtInterface(doc)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping("/applydeatil/time")
    public String getApplyDetailByTime(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {

        if (applyDetailServiceImpl.callNtInterface(timeBegin, timeEnd)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping(value = "/applydetail/code")
    public String getApplyDetailByCode(@RequestParam("doc") String doc, @RequestParam("lnid") String lnid) {
        if (applyDetailServiceImpl.callNtInterface(doc, lnid)) {
            return "调用成功";
        } else {
            return "调用失败";
        }
    }

    @RequestMapping(value = "/JDEForGYBusi/GetInvoiceByTime", method = RequestMethod.POST)
    @ResponseBody
    //public NtResult invoiceByTime(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd) {
    public NtResult invoiceByTime(@RequestBody NtRequestParamByTime ntRequestParamByTime) {

        NtResult ntResult = new NtResult("1", "", null);
        if (ntRequestParamByTime == null) {
            ntResult.setResultCode("-1");
            ntResult.setData("参数为空");
            return ntResult;
        }
        logger.info("纳通参数:" + ntRequestParamByTime.toString());

        if (!ntUserCode.equals(ntRequestParamByTime.getUserCode()) || !ntPwd.equals(ntRequestParamByTime.getPwd())) {
            ntResult.setResultCode("-1");
            ntResult.setResultMsg("用户名或者密码不正确，请检查");
            return ntResult;
        }


        try {
            List<InvoiceDomain> invoiceDomainList = invoiceServiceImpl.selectInvoiceByTime(ntRequestParamByTime.getTimeBegin(), ntRequestParamByTime.getTimeEnd());
            ntResult.setData(invoiceDomainList);
        } catch (Exception ex) {
            ntResult.setResultCode("-1");
            ntResult.setResultMsg("获取开票发票信息失败，失败原因:" + ex.getMessage());
        }
        return ntResult;
    }

    @RequestMapping(value = "/JDEForGYBusi/GetInvoiceByCode", method = RequestMethod.POST)
    @ResponseBody
    public NtResult invoiceByCode(@RequestBody NtRequestParamByCode ntRequestParamByCode) {
        NtResult ntResult = new NtResult("1", "", null);
        if (ntRequestParamByCode == null) {
            ntResult.setResultCode("-1");
            ntResult.setData("参数为空");
            return ntResult;
        }
        logger.info("纳通参数:" + ntRequestParamByCode.toString());

        if (!ntUserCode.equals(ntRequestParamByCode.getUserCode()) || !ntPwd.equals(ntRequestParamByCode.getPwd())) {
            ntResult.setResultCode("-1");
            ntResult.setResultMsg("用户名或者密码不正确，请检查");
            return ntResult;
        }

        try {
            List<InvoiceDomain> invoiceDomainList = invoiceServiceImpl.selectInvoiceByNtDoc(ntRequestParamByCode.getDoc());
            ntResult.setData(invoiceDomainList);

        } catch (Exception ex) {
            ntResult.setResultCode("-1");
            ntResult.setResultMsg("获取开票发票信息失败，失败原因:" + ex.getMessage());
        }
        return ntResult;
    }

    @InitBinder("timeBegin")
    public void initTimeBegin(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
    }

    @InitBinder("timeEnd")
    public void initTimeEnd(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
    }
}
