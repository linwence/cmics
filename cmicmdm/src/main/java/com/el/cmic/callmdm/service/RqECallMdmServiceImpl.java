//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.F4101z1;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import com.el.cmic.callmdm.domain.RqE001InputAttachment;
import com.el.cmic.callmdm.domain.RqE001InputBE01;
import com.el.cmic.callmdm.domain.RqE001InputProductE01;
import com.el.cmic.callmdm.domain.RqE001InputProductE02;
import com.el.cmic.callmdm.domain.RqE001InputProductE03;
import com.el.cmic.callmdm.domain.RqE001InputProductE04;
import com.el.cmic.callmdm.domain.RqE001InputSubLineA;
import com.el.cmic.callmdm.domain.RqE001InputSublineB;
import com.el.cmic.callmdm.domain.RqInputHeader;
import com.el.cmic.callmdm.mapper.ProductMapper;
import com.el.cmic.callmdm.service.CallMdmService;
import com.el.cmic.callmdm.service.Fe8Log01Service;
import com.el.cmic.callmdm.service.RqE001Service;
import com.el.cmic.common.domain.MdmFuncType;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.utils.JAXBListUtil;
import com.el.utils.JAXBListUtil.CollectionWrapper;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import nc.itf.mdm.ws.eq.QxmdmEquService;
import nc.itf.mdm.ws.eq.QxmdmEquServicePortType;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("rqECallMdmServiceImpl")
public class RqECallMdmServiceImpl implements CallMdmService {
    Logger logger = Logger.getLogger(RqECallMdmServiceImpl.class);
    @Value("${schema}")
    private String schema;
    @Value("${ctlSchema}")
    private String ctlSchema;
    @Value("${mdm.username}")
    private String mdmUserName;
    @Value("${mdm.password}")
    private String mdmPassword;
    @Value("${QxmdmEquService_Url}")
    private String QxmdmEquService_Url;
    private String doco = "0";
    private String co;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private F0005Mapper f0005Mapper;
    @Resource(
            name = "fe8Log01ServiceImpl"
    )
    private Fe8Log01Service fe8Log01ServiceImpl;
    @Resource(
            name = "rqE001ServiceImpl"
    )
    private RqE001Service rqE001Service;
    private F4101z1 f4101z1 = new F4101z1();

    public RqECallMdmServiceImpl() {
    }

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void addCallWS() {
        try {
            this.dealE01("ADD");
            this.dealE02("ADD");
            this.deal03("ADD");
            this.dealE04("ADD");
        } catch (Exception var2) {
            var2.printStackTrace();
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("调用商品新增接口失败：" + var2.getMessage());
            this.logger.error("----------------------------------------------------------------------------------------------");
        }

    }

    public void updateCallWS() {
        try {
            this.dealE01("MOD");
            this.dealE02("MOD");
            this.deal03("MOD");
            this.dealE04("MOD");
        } catch (Exception var2) {
            var2.printStackTrace();
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("调用商品变更接口失败：" + var2.getMessage());
            this.logger.error("----------------------------------------------------------------------------------------------");
        }

    }

    private void dealE04(String funcType) throws Exception {
        List rqE001InputProductE04List = this.productE04QryInfo(funcType);
        Iterator var3 = rqE001InputProductE04List.iterator();

        while(var3.hasNext()) {
            RqE001InputProductE04 rqE001InputProductE04 = (RqE001InputProductE04)var3.next();

            try {
                String e = rqE001InputProductE04.getLitm();
                String ev01 = rqE001InputProductE04.getEv01();
                String data = this.genDataXml(rqE001InputProductE04, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用E04接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.callReqEqutByTypeSrv("E04", data, e, ev01, funcType);
            } catch (Exception var8) {
                var8.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用E04接口失败：" + var8.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private void deal03(String funcType) throws Exception {
        List rqE001InputProductE03List = this.productE03QryInfo(funcType);
        Iterator var3 = rqE001InputProductE03List.iterator();

        while(var3.hasNext()) {
            RqE001InputProductE03 rqE001InputProductE03 = (RqE001InputProductE03)var3.next();

            try {
                if(funcType.equals("MOD")) {
                    this.co = rqE001InputProductE03.getKcoo();
                }

                String e = rqE001InputProductE03.getLitm();
                String ev01 = rqE001InputProductE03.getEv01();
                String data = this.genDataXml(rqE001InputProductE03, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用E03接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.callReqEqutByTypeSrv("E03", data, e, ev01, funcType);
            } catch (Exception var8) {
                var8.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用E03接口失败：" + var8.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private void dealE02(String funcType) throws Exception {
        List rqE001InputProductE02List = this.productE02QryInfo(funcType);
        Iterator var3 = rqE001InputProductE02List.iterator();

        while(var3.hasNext()) {
            RqE001InputProductE02 rqE001InputProductE02 = (RqE001InputProductE02)var3.next();

            try {
                if(funcType.equals("MOD")) {
                    this.co = rqE001InputProductE02.getKcoo();
                }

                String e = rqE001InputProductE02.getLitm();
                String ev01 = rqE001InputProductE02.getEv01();
                String data = this.genDataXml(rqE001InputProductE02, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用E02接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.callReqEqutByTypeSrv("E02", data, e, ev01, funcType);
            } catch (Exception var8) {
                var8.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用E02接口失败：" + var8.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private void dealE01(String funcType) throws Exception {
        List rqE001InputProductE01List = this.productE01QryInfo(funcType);
        Iterator var3 = rqE001InputProductE01List.iterator();

        while(var3.hasNext()) {
            RqE001InputProductE01 rqE001InputProductE01 = (RqE001InputProductE01)var3.next();

            try {
                if(funcType.equals("MOD")) {
                    this.co = rqE001InputProductE01.getKcoo();
                }

                String e = rqE001InputProductE01.getLitm();
                String ev01 = rqE001InputProductE01.getEv01();
                String data = this.genDataXml(rqE001InputProductE01, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用E01接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.callReqEqutByTypeSrv("E01", data, e, ev01, funcType);
            } catch (Exception var8) {
                var8.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用E01接口失败：" + var8.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private void callReqEqutByTypeSrv(String dataType, String data, String litm, String ev01Flag, String funcType) throws Exception {
        this.logger.info("正在记录日志");
        Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
        this.fe8Log01ServiceImpl.saveFe8Log01("Request", litm, dataType, data, "INFO", funcType, "", this.doco);
        String responseXml = this.callReqEqutByTypeSrv(dataType, data, ev01Flag, funcType);
        this.afterResponse(responseXml, litm, funcType);
    }

    private String callReqEqutByTypeSrv(String dataType, String data, String ev01Flag, String funcType) throws Exception {
        QxmdmEquService qxmdmEquService = new QxmdmEquService(new URL(this.QxmdmEquService_Url));
        QxmdmEquServicePortType qxmdmEquServicePortType = qxmdmEquService.getQxmdmEquServiceSOAP11PortHttp();
        String responseXml = "";
        if(StringUtils.isEmpty(ev01Flag)) {
            ev01Flag = "";
        }

        if(!funcType.equals("ADD") && (!funcType.equals("MOD") || ev01Flag.equals("Y"))) {
            this.logger.info("正在调用变更接口");
            responseXml = qxmdmEquServicePortType.reqModEquSrv(dataType, data, this.mdmUserName, this.mdmPassword);
        } else {
            this.logger.info("正在调用新增接口");
            responseXml = qxmdmEquServicePortType.reqEqutByTypeSrv(dataType, data, this.mdmUserName, this.mdmPassword);
        }

        return responseXml;
    }

    private String callReqModEqutByTypeSrv(String dataType, String data) throws Exception {
        QxmdmEquService qxmdmEquService = new QxmdmEquService();
        QxmdmEquServicePortType qxmdmEquServicePortType = qxmdmEquService.getQxmdmEquServiceSOAP11PortHttp();
        return qxmdmEquServicePortType.reqModEquSrv(dataType, data, this.mdmUserName, this.mdmPassword);
    }

    private void afterResponse(String responseXml, String litm, String funcType) throws DocumentException {
        String logType = "";
        String flag = "";
        String ev01 = null;
        String codeValue = "";
        String msg = "";
        String dataType = "";

        try {
            this.logger.info("正在接收返回数据");
            Document fe841001 = DocumentHelper.parseText(responseXml);
            Element fe84101z = fe841001.getRootElement();
            Element f4101 = fe84101z.element("header");
            Element errCode = f4101.element("errcode");
            Element dataTypeElement = f4101.element("datatype");
            Element msgElement = f4101.element("msg");
            dataType = dataTypeElement.getText();
            msg = msgElement.getText();
            String msgerr = "";
            Element codeinfo;
            if(!errCode.getText().equals("SUCCESS")) {
                logType = "ERROR";
                flag = "E";
                codeinfo = f4101.element("msg");
                msgerr = codeinfo.getText();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("MDM接口接收错误" + msgerr);
                this.logger.error("----------------------------------------------------------------------------------------------");
            } else {
                logType = "INFO";
                codeinfo = f4101.element("codeinfo");
                Element code = codeinfo.element("code");
                Element codevValueElement = code.element("codevalue");
                Element codetype = code.element("codetype");
                flag = "Y";
                if(codetype.getText().equals("0")) {
                    ev01 = "N";
                } else {
                    ev01 = "Y";
                }

                codeValue = codevValueElement.getText();
            }
        } catch (Exception var24) {
            logType = "Error";
            flag = "E";
            msg = var24.getMessage();
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("接收返回数据失败：");
            this.logger.error(var24);
            this.logger.error("----------------------------------------------------------------------------------------------");
        } finally {
            Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
            this.fe8Log01ServiceImpl.saveFe8Log01("Response", litm, dataType, responseXml, logType, funcType, msg, this.doco);
        }

        if(funcType.equals("ADD")) {
            Fe84101 fe8410011 = new Fe84101();
            fe8410011.setSplitm(litm);
            fe8410011.setSpflag(flag);
            fe8410011.setSpev01(ev01);
            Fe84101z fe84101z1 = new Fe84101z();
            fe84101z1.setZzco(this.co);
            fe84101z1.setZzlitm(litm);
            fe84101z1.setZzflag(flag);
            this.f4101z1.setSzifla(flag);
            this.productMapper.updatef4101z1(this.schema, this.f4101z1);
            if(flag.equals("Y")) {
                fe8410011.setSpe8sptym(codeValue);
            }

            fe8410011.setSpflag(flag);
            this.rqE001Service.updateFe84101(fe8410011);
            this.logger.info("结束");
            if(flag.equals("Y")) {
                F4101 f41011 = new F4101();
                f41011.setImlitm(litm);
                f41011.setImaitm(codeValue);
            }
        } else {
            Fe841001 fe8410012 = new Fe841001();
            fe8410012.setSqflag(flag);
            fe8410012.setSqukidp(new BigDecimal(this.doco));
            this.rqE001Service.updateFe841001(fe8410012);
            this.logger.info("结束");
        }

    }

    private List<RqE001InputProductE01> productE01QryInfo(String funcType) {
        return this.productMapper.productE01QryInfo(this.schema, this.ctlSchema, "01", funcType);
    }

    private List<RqE001InputProductE02> productE02QryInfo(String funcType) {
        return this.productMapper.productE02QryInfo(this.schema, this.ctlSchema, "02", funcType);
    }

    private List<RqE001InputProductE03> productE03QryInfo(String funcType) {
        return this.productMapper.productE03QryInfo(this.schema, this.ctlSchema, "03", funcType);
    }

    private List<RqE001InputProductE04> productE04QryInfo(String funcType) {
        return this.productMapper.productE04QryInfo(this.schema, "04", funcType);
    }

    private String genDataXml(RqE001InputProductE01 rqE001InputProductE01, String funcType) {
        String kcoo = "";
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        this.doco = rqE001InputProductE01.getDoco();
        String litm = rqE001InputProductE01.getLitm();
        kcoo = rqE001InputProductE01.getKcoo();
        jaxbListUtil = new JAXBListUtil(new Class[]{RqE001InputProductE01.class});
        rqE001InputProductE01.setDoco((String)null);
        rqE001InputProductE01.setEv01((String)null);
        rqE001InputProductE01.setLitm((String)null);
        rqE001InputProductE01.setKcoo((String)null);
        if(funcType.equals("ADD")) {
            this.f4101z1.setSzedus(rqE001InputProductE01.getSZEDUS());
            this.f4101z1.setSzedbt(rqE001InputProductE01.getSZEDBT());
            this.f4101z1.setSzedtn(rqE001InputProductE01.getSZEDTN());
            if(rqE001InputProductE01.getSZEDLN() != null) {
                this.f4101z1.setSzedln(new BigDecimal(rqE001InputProductE01.getSZEDLN()));
            }else{
                this.f4101z1.setSzedln(new BigDecimal(0));
            }

            rqE001InputProductE01.setModcause((String)null);
        }

        rqE001InputProductE01.setSZEDBT((String)null);
        rqE001InputProductE01.setSZEDLN((String)null);
        rqE001InputProductE01.setSZEDTN((String)null);
        rqE001InputProductE01.setSZEDUS((String)null);
        this.logger.info("生成E01MainXml");
        String productE01 = jaxbListUtil.toXml(rqE001InputProductE01, "utf-8");
        if(funcType.equals("MOD")) {
            this.co = kcoo.substring(2, 5);
        } else if(kcoo.length() > 3) {
            this.co = kcoo.substring(0, 3);
        } else {
            this.co = kcoo;
        }

        this.co = "00" + this.co;
        this.logger.info("寻找E01证照信息");
        String sub = this.getSubLineB(litm, funcType);
        this.logger.info("BillInfo信息：商品号：" + litm + "变更单号：" + this.doco + "公司号" + this.co);
        String billInfo = this.getBillInfo(litm, this.doco, this.co);
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("E01", billInfo, "TOMDM", funcType);
        if(funcType.equals("MOD")) {
            rqInputHeader.setCorp(kcoo.substring(2, 5));
        } else if(kcoo.length() > 3) {
            rqInputHeader.setCorp(kcoo.substring(0, 3));
        } else {
            rqInputHeader.setCorp(kcoo);
        }

        jaxbListUtil = new JAXBListUtil(new Class[]{RqInputHeader.class});
        String header = jaxbListUtil.toXml(rqInputHeader, "utf-8");
        System.out.println(header);
        this.logger.info("寻找E01证照附件");
        String subA = this.getSubLineA(litm, funcType);
        if(!StringUtils.isEmpty(sub)) {
            ;
        }

        String detail = "";
        if(sub.equals("") && subA.equals("")) {
            detail = "<detail>" + productE01 + "</detail>";
        } else {
            detail = "<detail>" + productE01 + "<sub>" + sub + subA + "</sub></detail>";
        }

        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }

    private String genDataXml(RqE001InputProductE02 rqE001InputProductE02, String funcType) {
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        this.doco = rqE001InputProductE02.getDoco();
        String litm = rqE001InputProductE02.getLitm();
        String kcoo = rqE001InputProductE02.getKcoo();
        jaxbListUtil = new JAXBListUtil(new Class[]{RqE001InputProductE02.class});
        rqE001InputProductE02.setDoco((String)null);
        rqE001InputProductE02.setEv01((String)null);
        rqE001InputProductE02.setLitm((String)null);
        rqE001InputProductE02.setKcoo((String)null);
        if(funcType.equals("ADD")) {
            this.f4101z1.setSzedus(rqE001InputProductE02.getSZEDUS());
            this.f4101z1.setSzedbt(rqE001InputProductE02.getSZEDBT());
            this.f4101z1.setSzedtn(rqE001InputProductE02.getSZEDTN());
            if(rqE001InputProductE02.getSZEDLN() != null) {
                this.f4101z1.setSzedln(new BigDecimal(rqE001InputProductE02.getSZEDLN()));
            }else{
                this.f4101z1.setSzedln(new BigDecimal(0));
            }
            rqE001InputProductE02.setModcause((String)null);
        }

        rqE001InputProductE02.setSZEDBT((String)null);
        rqE001InputProductE02.setSZEDLN((String)null);
        rqE001InputProductE02.setSZEDTN((String)null);
        rqE001InputProductE02.setSZEDUS((String)null);
        this.logger.info("生成E02MainXml");
        String productE02 = jaxbListUtil.toXml(rqE001InputProductE02, "utf-8");
        System.out.println(productE02);
        if(funcType.equals("MOD")) {
            this.co = kcoo.substring(2, 5);
        } else if(kcoo.length() > 3) {
            this.co = kcoo.substring(0, 3);
        } else {
            this.co = kcoo;
        }

        this.co = "00" + this.co;
        String sub = this.getSubLineB(litm, funcType);
        this.logger.info("BillInfo信息：商品号：" + litm + "变更单号：" + this.doco + "公司号" + this.co);
        String billInfo = this.getBillInfo(litm, this.doco, this.co);
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("E02", billInfo, "TOMDM", funcType);
        if(funcType.equals("MOD")) {
            rqInputHeader.setCorp(kcoo.substring(2, 5));
        } else if(kcoo.length() > 3) {
            rqInputHeader.setCorp(kcoo.substring(0, 3));
        } else {
            rqInputHeader.setCorp(kcoo);
        }

        jaxbListUtil = new JAXBListUtil(new Class[]{RqInputHeader.class});
        String header = jaxbListUtil.toXml(rqInputHeader, "utf-8");
        System.out.println(header);
        String subA = this.getSubLineA(litm, funcType);
        System.out.println(sub);
        String detail = "<detail>" + productE02 + "<sub>" + sub + subA + "</sub></detail>";
        System.out.println(detail);
        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }

    private String genDataXml(RqE001InputProductE03 rqE001InputProductE03, String funcType) {
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        this.doco = rqE001InputProductE03.getDoco();
        String litm = rqE001InputProductE03.getLitm();
        String kcoo = rqE001InputProductE03.getKcoo();
        jaxbListUtil = new JAXBListUtil(new Class[]{RqE001InputProductE03.class});
        rqE001InputProductE03.setDoco((String)null);
        rqE001InputProductE03.setEv01((String)null);
        rqE001InputProductE03.setLitm((String)null);
        rqE001InputProductE03.setKcoo((String)null);
        if(funcType.equals("ADD")) {
            this.f4101z1.setSzedus(rqE001InputProductE03.getSZEDUS());
            this.f4101z1.setSzedbt(rqE001InputProductE03.getSZEDBT());
            this.f4101z1.setSzedtn(rqE001InputProductE03.getSZEDTN());
            if(rqE001InputProductE03.getSZEDLN() != null) {
                this.f4101z1.setSzedln(new BigDecimal(rqE001InputProductE03.getSZEDLN()));
            }else{
                this.f4101z1.setSzedln(new BigDecimal(0));
            }
            rqE001InputProductE03.setModcause((String)null);
        }

        rqE001InputProductE03.setSZEDBT((String)null);
        rqE001InputProductE03.setSZEDLN((String)null);
        rqE001InputProductE03.setSZEDTN((String)null);
        rqE001InputProductE03.setSZEDUS((String)null);
        this.logger.info("生成E03MainXml");
        String productE03 = jaxbListUtil.toXml(rqE001InputProductE03, "utf-8");
        if(funcType.equals("MOD")) {
            this.co = kcoo.substring(2, 5);
        } else if(kcoo.length() > 3) {
            this.co = kcoo.substring(0, 3);
        } else {
            this.co = kcoo;
        }

        this.co = "00" + this.co;
        this.logger.info("查找E03证照信息");
        String sub = this.getSubLineB(litm, funcType);
        this.logger.info("BillInfo信息：商品号：" + litm + "变更单号：" + this.doco + "公司号" + this.co);
        String billInfo = this.getBillInfo(litm, this.doco, this.co);
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("E03", billInfo, "TOMDM", funcType);
        if(funcType.equals("MOD")) {
            rqInputHeader.setCorp(kcoo.substring(2, 5));
        } else if(kcoo.length() > 3) {
            rqInputHeader.setCorp(kcoo.substring(0, 3));
        } else {
            rqInputHeader.setCorp(kcoo);
        }

        jaxbListUtil = new JAXBListUtil(new Class[]{RqInputHeader.class});
        String header = jaxbListUtil.toXml(rqInputHeader, "utf-8");
        System.out.println(header);
        this.logger.info("获取E03附件信息");
        String subA = this.getSubLineA(litm, funcType);
        if(!StringUtils.isEmpty(sub)) {
            ;
        }

        System.out.println(sub);
        String detail = "<detail>" + productE03 + "<sub>" + sub + subA + "</sub></detail>";
        System.out.println(detail);
        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }

    private String getSubLineB(String litm, String funcType) {
        RqE001InputSublineB rqE001InputSublineB = new RqE001InputSublineB();
        String subLineB = "";
        ArrayList rqE001InputBE01ListWrite = new ArrayList();
        List rqE001InputBE01List;
        if(funcType.equals("ADD")) {
            rqE001InputBE01List = this.productMapper.productQryBInfo(this.schema, this.ctlSchema, litm);
        } else {
            rqE001InputBE01List = this.productMapper.productModQryBInfo(this.schema, this.ctlSchema, this.doco, this.co);
        }

        if(rqE001InputBE01List != null && rqE001InputBE01List.size() > 0) {
            if(funcType.equals("ADD")) {
                ;
            }

            Iterator var8 = rqE001InputBE01List.iterator();

            while(var8.hasNext()) {
                RqE001InputBE01 tmp = (RqE001InputBE01)var8.next();
                tmp.setCo((String)null);
                rqE001InputBE01ListWrite.add(tmp);
            }

            rqE001InputSublineB.setSubname("b");
            rqE001InputSublineB.setRqE001InputBE01List(rqE001InputBE01ListWrite);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqE001InputSublineB.class, CollectionWrapper.class});
            subLineB = jaxbListUtil.toXml(rqE001InputSublineB, "utf-8");
        }

        return !StringUtils.isEmpty(subLineB)?subLineB:"";
    }

    private String getSubLineA(String litm,String funcType){
        //  RqE001InputAttachment rqE001InputAttachment = new RqE001InputAttachment();
        RqE001InputSubLineA rqE001InputSubLineA = new RqE001InputSubLineA();
        JAXBListUtil jaxbListUtil;
        String SublineA = "";
        List<RqE001InputBE01> rqE001InputBE01List;
        List<RqE001InputAttachment> rqE001InputAttachmentList = new ArrayList<RqE001InputAttachment>();
        if(funcType.equals(MdmFuncType.FUNC_TYPE_ADD)) {
            rqE001InputBE01List = productMapper.productQryBInfo(schema, ctlSchema, litm);
            //-----------------------------------------------------------------------------------------------------------
            //2016.11.9if大括号位置，为了增加变更上传附件
        }else{
            rqE001InputBE01List = productMapper.productModQryBInfo(schema,ctlSchema,doco,co);
        }

        for(RqE001InputBE01 tmp :rqE001InputBE01List){
            if(tmp.getCo().equals(co)) {

                String gdtxky = litm + "|" + f0005Mapper.selectF0005(ctlSchema, "E8", "28", tmp.getPk_licensetype()) + "|" + tmp.getLicenseno() + "|" + co;

                List<RqE001InputAttachment> rqE001InputAttachmentListFirst = productMapper.productAddQryAInfo(schema, ctlSchema, gdtxky);
                //    /*rqE001InputAttachmentList=*/rqE001InputAttachmentList.addAll(productMapper.productAddQryAInfo(schema,ctlSchema,gdtxky));
                if (rqE001InputAttachmentListFirst != null && rqE001InputAttachmentListFirst.size() > 0) {
                    for (RqE001InputAttachment tmp1 : rqE001InputAttachmentListFirst) {
                        String[] filename = tmp1.getFilepath().split("\\\\");
                        if (filename.length >= 2) {
                            tmp1.setFilename(filename[filename.length - 1]);
                        }
                        String fileno = tmp.getPk_licensetype() + ";" + tmp.getLicenseno() + ";" + tmp.getTodate();
                        tmp1.setFileno(fileno);
                        tmp1.setFilepath("W:\\attachment");


                    }
                    rqE001InputAttachmentList.addAll(rqE001InputAttachmentListFirst);
                }

            }
        }
        if(rqE001InputAttachmentList.size()!=0) {
            rqE001InputSubLineA.setSubname("attachment");
            rqE001InputSubLineA.setRqE001InputAttachmentList(rqE001InputAttachmentList);

            jaxbListUtil = new JAXBListUtil(RqE001InputSubLineA.class, JAXBListUtil.CollectionWrapper.class);
            SublineA = jaxbListUtil.toXml(rqE001InputSubLineA, "utf-8");
        }


        return !StringUtils.isEmpty(SublineA) ? SublineA : "";
        //return "";
    }

    private String genDataXml(RqE001InputProductE04 rqE001InputProductE04, String funcType) {
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        String kcoo = rqE001InputProductE04.getKcoo();
        String litm = rqE001InputProductE04.getLitm();
        if(funcType.equals("MOD")) {
            this.co = kcoo.substring(2, 5);
        } else if(kcoo.length() > 3) {
            this.co = kcoo.substring(0, 3);
        } else {
            this.co = kcoo;
        }

        this.co = "00" + this.co;
        this.logger.info("BillInfo信息：商品号：" + litm + "变更单号：" + this.doco + "公司：" + this.co);
        String billInfo = this.getBillInfo(litm, rqE001InputProductE04.getDoco(), this.co);
        this.doco = rqE001InputProductE04.getDoco();
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("E04", billInfo, "TOMDM", funcType);
        if(funcType.equals("MOD")) {
            rqInputHeader.setCorp(kcoo.substring(2, 5));
        } else if(kcoo.length() > 3) {
            rqInputHeader.setCorp(kcoo.substring(0, 3));
        } else {
            rqInputHeader.setCorp(kcoo);
        }

        jaxbListUtil = new JAXBListUtil(new Class[]{RqInputHeader.class});
        String header = jaxbListUtil.toXml(rqInputHeader, "utf-8");
        System.out.println(header);
        jaxbListUtil = new JAXBListUtil(new Class[]{RqE001InputProductE04.class});
        rqE001InputProductE04.setDoco((String)null);
        rqE001InputProductE04.setEv01((String)null);
        rqE001InputProductE04.setLitm((String)null);
        if(funcType.equals("ADD")) {
            this.f4101z1.setSzedus(rqE001InputProductE04.getSZEDUS());
            this.f4101z1.setSzedbt(rqE001InputProductE04.getSZEDBT());
            this.f4101z1.setSzedtn(rqE001InputProductE04.getSZEDTN());
            if(rqE001InputProductE04.getSZEDLN() != null) {
                this.f4101z1.setSzedln(new BigDecimal(rqE001InputProductE04.getSZEDLN()));
            }else{
                this.f4101z1.setSzedln(new BigDecimal(0));
            }
            rqE001InputProductE04.setModcause((String)null);
        }

        rqE001InputProductE04.setSZEDBT((String)null);
        rqE001InputProductE04.setSZEDLN((String)null);
        rqE001InputProductE04.setSZEDTN((String)null);
        rqE001InputProductE04.setSZEDUS((String)null);
        String productE04 = jaxbListUtil.toXml(rqE001InputProductE04, "utf-8");
        System.out.println(productE04);
        String detail = "<detail>" + productE04 + "</detail>";
        System.out.println(detail);
        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }
}
