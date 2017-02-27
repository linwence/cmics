//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0101z2;
import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe841005;
import com.el.cmic.callmdm.domain.RqInputHeader;
import com.el.cmic.callmdm.domain.RqM001InputMfr;
import com.el.cmic.callmdm.mapper.MftMapper;
import com.el.cmic.callmdm.service.CallMdmService;
import com.el.cmic.callmdm.service.Fe8Log01Service;
import com.el.cmic.callmdm.service.RqC001Service;
import com.el.utils.JAXBListUtil;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import nc.itf.mdm.ws.mfr.QxmdmMfrService;
import nc.itf.mdm.ws.mfr.QxmdmMfrServicePortType;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("rqMCallMdmServiceImpl")
public class RqMCallMdmServiceImpl implements CallMdmService {
    Logger logger = Logger.getLogger(RqMCallMdmServiceImpl.class);
    private String ukid = "0";
    @Value("${schema}")
    private String schema;
    @Value("${ctlSchema}")
    private String ctlSchema;
    @Value("${mdm.username}")
    private String mdmUserName;
    @Value("${mdm.password}")
    private String mdmPassword;
    @Value("${QxmdmMfrService_Url}")
    private String QxmdmMfrService_Url;
    @Autowired
    private MftMapper mftMapper;
    @Autowired
    Fe8Log01Service fe8Log01ServiceImpl;
    @Autowired
    private RqC001Service rqC001ServiceImpl;
    private F0101z2 f0101z2 = new F0101z2();

    public RqMCallMdmServiceImpl() {
    }

    public void addCallWS() {
        try {
            this.callWs("ADD");
        } catch (Exception var2) {
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("调用新增厂家接口失败：" + var2.getMessage());
            this.logger.error("----------------------------------------------------------------------------------------------");
        }

    }

    public void updateCallWS() {
        try {
            this.callWs("MOD");
        } catch (Exception var2) {
            this.logger.error("调用生产厂家修改申请接口失败:" + var2.getMessage());
        }

    }

    private void callWs(String funcType) {
        List rqM001InputMfrList = this.mftMapper.mfrQry(this.schema, this.ctlSchema, funcType);
        Iterator var3 = rqM001InputMfrList.iterator();

        while(var3.hasNext()) {
            RqM001InputMfr rqM001InputMfr = (RqM001InputMfr)var3.next();

            try {
                String e = rqM001InputMfr.getAn8();
                String ev01 = rqM001InputMfr.getEv01();
                String data = this.genDataXml(rqM001InputMfr, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用厂家接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
                this.fe8Log01ServiceImpl.saveFe8Log01("Request", e, "M01", data, "INFO", funcType, "", "0");
                String responseXml = this.callQxmdmCusService(data, ev01, funcType);
                this.afterResponse(responseXml, e, funcType);
            } catch (Exception var9) {
                var9.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用新增厂家接口失败：" + var9.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private String genDataXml(RqM001InputMfr rqM001InputMfr, String funcType) {
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        this.ukid = rqM001InputMfr.getUkid();
        String kcoo = rqM001InputMfr.getKcoo();
        this.logger.info("BillInfo信息：An8：" + rqM001InputMfr.getAn8());
        String billInfo = this.getBillInfo(rqM001InputMfr.getAn8(), this.ukid, (String)null);
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("M01", billInfo, "TOMDM", funcType);
        if(kcoo.length() > 3) {
            rqInputHeader.setCorp(kcoo.substring(0, 3));
        } else {
            rqInputHeader.setCorp(kcoo);
        }

        jaxbListUtil = new JAXBListUtil(new Class[]{RqInputHeader.class});
        String header = jaxbListUtil.toXml(rqInputHeader, "utf-8");
        System.out.println(header);
        jaxbListUtil = new JAXBListUtil(new Class[]{RqM001InputMfr.class});
        rqM001InputMfr.setMfbrand("");
        rqM001InputMfr.setUkid((String)null);
        rqM001InputMfr.setEv01((String)null);
        rqM001InputMfr.setAn8((String)null);
        rqM001InputMfr.setKcoo((String)null);
        this.f0101z2.setSzedus(rqM001InputMfr.getSZEDUS());
        this.f0101z2.setSzedbt(rqM001InputMfr.getSZEDBT());
        this.f0101z2.setSzedtn(rqM001InputMfr.getSZEDTN());
        this.f0101z2.setSzedln(new BigDecimal(rqM001InputMfr.getSZEDLN()));
        rqM001InputMfr.setSZEDUS((String)null);
        rqM001InputMfr.setSZEDTN((String)null);
        rqM001InputMfr.setSZEDLN((String)null);
        rqM001InputMfr.setSZEDBT((String)null);
        String rqMfrXml = jaxbListUtil.toXml(rqM001InputMfr, "utf-8");
        System.out.println(rqMfrXml);
        String detail = "<detail>" + rqMfrXml + "</detail>";
        System.out.println(detail);
        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }

    private String callQxmdmCusService(String data, String ev01Flag, String funcType) throws Exception {
        QxmdmMfrService qxmdmMfrService = new QxmdmMfrService(new URL(this.QxmdmMfrService_Url));
        QxmdmMfrServicePortType qxmdmMfrServicePortType = qxmdmMfrService.getQxmdmMfrServiceSOAP11PortHttp();
        String responseXml = "";
        if(StringUtils.isEmpty(ev01Flag)) {
            ev01Flag = "";
        }

        if(!funcType.equals("ADD") && (!funcType.equals("MOD") || ev01Flag.equals("Y"))) {
            responseXml = qxmdmMfrServicePortType.reqModMfrSrv(data, this.mdmUserName, this.mdmPassword);
        } else {
            this.logger.info("正在调用新增接口");
            responseXml = qxmdmMfrServicePortType.reqMfrSrv(data, this.mdmUserName, this.mdmPassword);
        }

        return responseXml;
    }

    private void afterResponse(String responseXml, String an8, String funcType) throws DocumentException {
        this.logger.info("正在接收返回信息");
        BigDecimal an8Num = new BigDecimal(an8);
        Document document = DocumentHelper.parseText(responseXml);
        Element root = document.getRootElement();
        Element headerElement = root.element("header");
        Element errCode = headerElement.element("errcode");
        Element dataType = headerElement.element("datatype");
        Element msg = headerElement.element("msg");
        String logType = "";
        String flag = "";
        String ev01 = null;
        String codeValue = "";
        String msgerr = "";
        Element fe841005;
        if(!errCode.getText().equals("SUCCESS")) {
            logType = "ERROR";
            flag = "E";
            fe841005 = headerElement.element("msg");
            msgerr = fe841005.getText();
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("MDM接口接收错误" + msgerr);
            this.logger.error("----------------------------------------------------------------------------------------------");
        } else {
            logType = "INFO";
            fe841005 = headerElement.element("codeinfo");
            Element f0101 = fe841005.element("code");
            Element codeValueElement = f0101.element("codevalue");
            flag = "Y";
            ev01 = "N";
            codeValue = codeValueElement.getText();
        }

        if(funcType.equals("ADD")) {
            Fe80101 fe8410051 = new Fe80101();
            fe8410051.setKsan8(an8Num);
            fe8410051.setKsflag(flag);
            fe8410051.setKsev01(ev01);
            if(flag.equals("Y")) {
                fe8410051.setKse8kstym(codeValue);
            }

            this.rqC001ServiceImpl.updateFE80101(fe8410051);
            if(flag.equals("Y")) {
                F0101 f01011 = new F0101();
                f01011.setAban8(an8Num);
                f01011.setAbalky(codeValue);
                this.rqC001ServiceImpl.updateF0101(f01011);
                this.logger.info("结束");
            }

            this.f0101z2.setSzurrf(flag);
            this.mftMapper.updatef0101z2(this.schema, this.f0101z2);
        } else {
            Fe841005 fe8410052 = new Fe841005();
            fe8410052.setScflag(flag);
            fe8410052.setScukid(new BigDecimal(this.ukid));
            this.rqC001ServiceImpl.updateFe841005(fe8410052);
            this.logger.info("结束");
        }

        Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
        this.fe8Log01ServiceImpl.saveFe8Log01("Response", an8, dataType.getText(), responseXml, logType, funcType, msg.getText(), "0");
    }
}
