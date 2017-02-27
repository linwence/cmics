//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.service;

import com.el.cfg.domain.F0101;
import com.el.cfg.domain.F0101z2;
import com.el.cfg.domain.Fe80101;
import com.el.cfg.domain.Fe841003;
import com.el.cmic.callmdm.domain.RqC001InputBC01;
import com.el.cmic.callmdm.domain.RqC001InputCsc;
import com.el.cmic.callmdm.domain.RqC001InputCustomC01;
import com.el.cmic.callmdm.domain.RqC001InputGR;
import com.el.cmic.callmdm.domain.RqC001InputJXS;
import com.el.cmic.callmdm.domain.RqC001InputJks;
import com.el.cmic.callmdm.domain.RqC001InputQT;
import com.el.cmic.callmdm.domain.RqC001InputSubLineB;
import com.el.cmic.callmdm.domain.RqC001InputSubLineCsc;
import com.el.cmic.callmdm.domain.RqC001InputSubLineGR;
import com.el.cmic.callmdm.domain.RqC001InputSubLineJKS;
import com.el.cmic.callmdm.domain.RqC001InputSubLineJXS;
import com.el.cmic.callmdm.domain.RqC001InputSubLineJcyljg;
import com.el.cmic.callmdm.domain.RqC001InputSubLineQT;
import com.el.cmic.callmdm.domain.RqC001InputSubLineYY;
import com.el.cmic.callmdm.domain.RqC001InputYYOrJcyljg;
import com.el.cmic.callmdm.domain.RqE001InputAttachment;
import com.el.cmic.callmdm.domain.RqE001InputSubLineA;
import com.el.cmic.callmdm.domain.RqInputHeader;
import com.el.cmic.callmdm.mapper.CustomerMapper;
import com.el.cmic.callmdm.service.CallMdmService;
import com.el.cmic.callmdm.service.Fe8Log01Service;
import com.el.cmic.callmdm.service.RqC001Service;
import com.el.cmic.common.domain.MdmFuncType;
import com.el.cmic.ws.mapper.F0005Mapper;
import com.el.utils.JAXBListUtil;
import com.el.utils.JAXBListUtil.CollectionWrapper;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.itf.mdm.ws.custom.QxmdmCusService;
import nc.itf.mdm.ws.custom.QxmdmCusServicePortType;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("rqCCallMdmServiceImpl")
public class RqCCallMdmServiceImpl implements CallMdmService {
    Logger logger = Logger.getLogger(RqCCallMdmServiceImpl.class);
    @Value("${schema}")
    private String schema;
    @Value("${ctlSchema}")
    private String ctlSchema;
    @Value("${mdm.username}")
    private String mdmUserName;
    @Value("${mdm.password}")
    private String mdmPassword;
    @Value("${QxmdmCusService_Url}")
    private String QxmdmCusService_Url;
    private String doco = "0";
    private F0101z2 f0101z2 = new F0101z2();
    @Autowired
    private F0005Mapper f0005Mapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private Fe8Log01Service fe8Log01ServiceImpl;
    @Autowired
    private RqC001Service rqC001ServiceImpl;

    public RqCCallMdmServiceImpl() {
    }

    public void addCallWS() {
        try {
            this.callWs("ADD");
        } catch (Exception var2) {
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("调用客商新增接口失败：" + var2.getMessage());
            this.logger.error("----------------------------------------------------------------------------------------------");
        }

    }

    public void updateCallWS() {
        try {
            this.callWs("MOD");
        } catch (Exception var2) {
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("调用客商变更接口失败：" + var2.getMessage());
            this.logger.error("----------------------------------------------------------------------------------------------");
        }

    }

    private void callWs(String funcType) {
        List rqC001InputCustomC01List = this.customerMapper.customQry(this.schema, this.ctlSchema, funcType);
        Iterator var3 = rqC001InputCustomC01List.iterator();

        while(var3.hasNext()) {
            RqC001InputCustomC01 rqC001InputCustomC01 = (RqC001InputCustomC01)var3.next();

            try {
                String e = rqC001InputCustomC01.getAn8();
                String ev01 = rqC001InputCustomC01.getEv01();
                String data = this.genDataXml(rqC001InputCustomC01, funcType);
                this.logger.info("----------------------------------------------------------------------------------------------");
                this.logger.info("准备调用客商接口，发送xml字符串：");
                this.logger.info(data);
                this.logger.info("----------------------------------------------------------------------------------------------");
                Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
                this.fe8Log01ServiceImpl.saveFe8Log01("Request", e, "C01", data, "INFO", funcType, "", this.doco);
                String responseXml = this.callQxmdmCusService(data, ev01, funcType);
                this.afterResponse(responseXml, e, funcType);
            } catch (Exception var9) {
                var9.printStackTrace();
                this.logger.error("----------------------------------------------------------------------------------------------");
                this.logger.error("调用客商变更接口失败：" + var9.getMessage());
                this.logger.error("----------------------------------------------------------------------------------------------");
            }
        }

    }

    private String genDataXml(RqC001InputCustomC01 rqC001InputCustomC01, String funcType) {
        JAXBListUtil jaxbListUtil = null;
        String xml = "";
        this.doco = rqC001InputCustomC01.getUkid();
        String kcoo = rqC001InputCustomC01.getKcoo();
        String an8 = rqC001InputCustomC01.getAn8();
        if(StringUtils.isEmpty(an8)) {
            an8 = "0";
        }

        this.logger.info("BillInfo信息：An8：" + an8 + "变更单号：" + this.doco);
        String billInfo = this.getBillInfo(an8, this.doco, (String)null);
        RqInputHeader rqInputHeader = this.getRqE001InputHeader("C01", billInfo, "TOMDM", funcType);
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
        jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputCustomC01.class});
        if(!rqC001InputCustomC01.getPk_country().equals("CN")) {
            rqC001InputCustomC01.setPk_counties("");
            rqC001InputCustomC01.setPk_szq("");
            rqC001InputCustomC01.setPk_cities("");
        }

        rqC001InputCustomC01.setUkid((String)null);
        rqC001InputCustomC01.setEv01((String)null);
        rqC001InputCustomC01.setAn8((String)null);
        rqC001InputCustomC01.setKcoo((String)null);
        if(funcType.equals("ADD")) {
            rqC001InputCustomC01.setModcause((String)null);
            this.f0101z2.setSzedus(rqC001InputCustomC01.getSZEDUS());
            this.f0101z2.setSzedbt(rqC001InputCustomC01.getSZEDBT());
            this.f0101z2.setSzedtn(rqC001InputCustomC01.getSZEDTN());
            this.f0101z2.setSzedln(new BigDecimal(rqC001InputCustomC01.getSZEDLN()));
        }

        rqC001InputCustomC01.setSZEDUS((String)null);
        rqC001InputCustomC01.setSZEDTN((String)null);
        rqC001InputCustomC01.setSZEDLN((String)null);
        rqC001InputCustomC01.setSZEDBT((String)null);
        this.logger.info("生成客商MainXML");
        String rqCumstomXml = jaxbListUtil.toXml(rqC001InputCustomC01, "utf-8");
        System.out.println(rqCumstomXml);
        this.logger.info("获取证照信息");
        String subLineBXml = this.getSubLineB(an8, funcType, this.doco);
        String subA = this.getSubLineA(an8, funcType);
        String subLineCscXml = "";
        if(rqC001InputCustomC01.getIsscs().equals("Y")) {
            subLineCscXml = this.getSubLineCsc(an8, funcType);
        }

        String subLineJxsXml = "";
        if(rqC001InputCustomC01.getIsjxs().equals("Y")) {
            subLineJxsXml = this.getSubLineJxs(an8, funcType);
        }

        String subLineJksXml = "";
        if(rqC001InputCustomC01.getIsjks().equals("Y")) {
            subLineJksXml = this.getSubLineJks(an8, funcType);
        }

        String subLineYYXml = "";
        if(rqC001InputCustomC01.getIsyy().equals("Y")) {
            subLineYYXml = this.getSubLineYY(an8, funcType);
        }

        String subLineJcyljg = "";
        if(!StringUtils.isEmpty(rqC001InputCustomC01.getIsjcyljg()) && rqC001InputCustomC01.getIsjcyljg().equals("Y")) {
            subLineJcyljg = this.getSubLineJcyljg(an8, funcType);
        }

        String subLineGrXml = "";
        if(rqC001InputCustomC01.getIsgr().equals("Y")) {
            subLineGrXml = this.getSubLineGr(an8, funcType);
        }

        String subLineQtXml = "";
        if(rqC001InputCustomC01.getIsqt().equals("Y")) {
            subLineQtXml = this.getSubLineQt(an8, funcType);
        }

        StringBuilder subLineBuilder = new StringBuilder();
        subLineBuilder = subLineBuilder.append(subLineBXml).append(subLineCscXml).append(subLineJxsXml).append(subLineJksXml).append(subLineYYXml).append(subLineJcyljg).append(subLineGrXml).append(subLineQtXml).append(subA);
        if(subLineBuilder.length() > 0) {
            subLineBuilder.insert(0, "<sub>").append("</sub>");
        }

        String subLineXml = subLineBuilder.toString();
        String detail = "<detail>" + rqCumstomXml + subLineXml + "</detail>";
        System.out.println(detail);
        String content = "<content><count>1</count>" + detail + "</content>";
        xml = "<?xml version=\'1.0\' encoding=\'utf-8\'?><xml>" + header + content + "</xml>";
        System.out.println("===========================================");
        System.out.println(xml);
        return xml;
    }

    private String getSubLineB(String customCode, String funcType, String doco) {
        RqC001InputSubLineB rqC001InputSubLineB = new RqC001InputSubLineB();
        String subLineB = "";
        this.logger.info("查询客商证照");
        List rqC001InputBC01List = this.customerMapper.customBQry(this.schema, this.ctlSchema, customCode, funcType, doco);
        if(rqC001InputBC01List != null && rqC001InputBC01List.size() > 0) {
            rqC001InputSubLineB.setSubname("b");
            rqC001InputSubLineB.setRqC001InputBC01List(rqC001InputBC01List);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineB.class, CollectionWrapper.class});
            subLineB = jaxbListUtil.toXml(rqC001InputSubLineB, "utf-8");
        }

        return !StringUtils.isEmpty(subLineB)?subLineB:"";
    }

    private String getSubLineA(String customCode,String funcType){
        //  RqE001InputAttachment rqE001InputAttachment = new RqE001InputAttachment();
        RqE001InputSubLineA rqE001InputSubLineA = new RqE001InputSubLineA();
        JAXBListUtil jaxbListUtil;
        String SublineA = "";
        List<RqC001InputBC01> rqC001InputBC01List;
        List<RqE001InputAttachment> rqE001InputAttachmentList = new ArrayList<RqE001InputAttachment>();
        if(funcType.equals(MdmFuncType.FUNC_TYPE_ADD)) {
            rqC001InputBC01List = customerMapper.customBQry(schema, ctlSchema, customCode, funcType,doco);
        }else{
            //----------------------------------------------------------------------------------------------------------
            //2016-11-9修改大括号位置，增加变更上传附件
            rqC001InputBC01List =customerMapper.customBQry(schema,ctlSchema,customCode,funcType,doco);
        }
        for(RqC001InputBC01 tmp :rqC001InputBC01List){
            String gdtxky =customCode+"|"+f0005Mapper.selectF0005(ctlSchema, "E8", "10", tmp.getPk_lictype())+"|"+tmp.getLicno();

            List<RqE001InputAttachment> rqE001InputAttachmentListFirst = customerMapper.customAddQryAInfo(schema,ctlSchema,gdtxky);
            //    /*rqE001InputAttachmentList=*/rqE001InputAttachmentList.addAll(productMapper.productAddQryAInfo(schema,ctlSchema,gdtxky));
            if(rqE001InputAttachmentListFirst != null && rqE001InputAttachmentListFirst.size()>0) {
                for (RqE001InputAttachment tmp1 : rqE001InputAttachmentListFirst) {
                    String[] filename = tmp1.getFilepath().split("\\\\");
                    if (filename.length >= 2) {
                        tmp1.setFilename(filename[filename.length - 1]);
                    }
                    String fileno = tmp.getPk_lictype()+ ";" +tmp.getLicno() + ";" + tmp.getLictodate();
                    tmp1.setFileno(fileno);
                    tmp1.setFilepath("W:\\attachment");



                }
                rqE001InputAttachmentList.addAll(rqE001InputAttachmentListFirst);
            }


        }
        if(rqE001InputAttachmentList.size()>0) {
            rqE001InputSubLineA.setSubname("attachment");
            rqE001InputSubLineA.setRqE001InputAttachmentList(rqE001InputAttachmentList);

            jaxbListUtil = new JAXBListUtil(RqE001InputSubLineA.class, JAXBListUtil.CollectionWrapper.class);
            SublineA = jaxbListUtil.toXml(rqE001InputSubLineA, "utf-8");
        }


        return !StringUtils.isEmpty(SublineA) ? SublineA : "";

    }

    private String getSubLineCsc(String customCode, String funcType) {
        this.logger.info("获取生产商信息");
        RqC001InputSubLineCsc rqC001InputSubLineCsc = new RqC001InputSubLineCsc();
        String subLineCscXml = "";
        RqC001InputCsc rqC001InputCsc = this.customerMapper.customCscQry(customCode, this.schema, this.ctlSchema, funcType);
        if(rqC001InputCsc != null) {
            rqC001InputSubLineCsc.setSubname("csc");
            rqC001InputSubLineCsc.setRqC001InputCsc(rqC001InputCsc);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineCsc.class});
            subLineCscXml = jaxbListUtil.toXml(rqC001InputSubLineCsc, "utf-8");
        }

        return !StringUtils.isEmpty(subLineCscXml)?subLineCscXml:"";
    }

    private String getSubLineJxs(String customCode, String funcType) {
        this.logger.info("获取经销商信息");
        RqC001InputSubLineJXS rqC001InputSubLineJXS = new RqC001InputSubLineJXS();
        String subLineJxsXml = "";
        RqC001InputJXS rqC001InputJXS = this.customerMapper.customJXSQry(customCode, this.schema, this.ctlSchema, funcType);
        if(rqC001InputJXS != null) {
            rqC001InputSubLineJXS.setSubname("jxs");
            rqC001InputSubLineJXS.setRqC001InputJXS(rqC001InputJXS);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineJXS.class});
            subLineJxsXml = jaxbListUtil.toXml(rqC001InputSubLineJXS, "utf-8");
        }

        return !StringUtils.isEmpty(subLineJxsXml)?subLineJxsXml:"";
    }

    private String getSubLineJks(String customCode, String funcType) {
        this.logger.info("获取进口商信息");
        RqC001InputSubLineJKS rqC001InputSubLineJKS = new RqC001InputSubLineJKS();
        String subLineJksXml = "";
        RqC001InputJks rqC001InputJks = this.customerMapper.customJksQry(customCode, this.schema, this.ctlSchema, funcType);
        if(rqC001InputJks != null) {
            rqC001InputSubLineJKS.setSubname("jks");
            rqC001InputSubLineJKS.setRqC001InputJks(rqC001InputJks);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineJKS.class});
            subLineJksXml = jaxbListUtil.toXml(rqC001InputSubLineJKS, "utf-8");
        }

        return !StringUtils.isEmpty(subLineJksXml)?subLineJksXml:"";
    }

    private String getSubLineYY(String customCode, String funcType) {
        this.logger.info("获取医院信息");
        RqC001InputSubLineYY rqC001InputSubLineYY = new RqC001InputSubLineYY();
        String subLineYYXml = "";
        RqC001InputYYOrJcyljg rqC001InputYYOrJcyljg = this.customerMapper.customYyOrJcyljgQry(this.schema, this.ctlSchema, customCode, funcType);
        if(rqC001InputYYOrJcyljg.getYynsr() == null) {
            rqC001InputYYOrJcyljg.setYynsr("");
        } else {
            long l = Long.parseLong(rqC001InputYYOrJcyljg.getYynsr()) / 100L;
            rqC001InputYYOrJcyljg.setYynsr(String.valueOf(l));
        }

        if(rqC001InputYYOrJcyljg != null) {
            rqC001InputSubLineYY.setSubname("yy");
            rqC001InputSubLineYY.setRqC001InputYYOrJcyljg(rqC001InputYYOrJcyljg);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineYY.class});
            subLineYYXml = jaxbListUtil.toXml(rqC001InputSubLineYY, "utf-8");
        }

        return !StringUtils.isEmpty(subLineYYXml)?subLineYYXml:"";
    }

    private String getSubLineJcyljg(String customCode, String funcType) {
        this.logger.info("获取基层医疗机构信息");
        RqC001InputSubLineJcyljg rqC001InputSubLineJcyljg = new RqC001InputSubLineJcyljg();
        String subLineJcyljgXml = "";
        RqC001InputYYOrJcyljg rqC001InputJcyljg = this.customerMapper.customYyOrJcyljgQry(this.schema, this.ctlSchema, customCode, funcType);
        if(rqC001InputJcyljg.getYynsr() == null) {
            rqC001InputJcyljg.setYynsr("");
        } else {
            long l = Long.parseLong(rqC001InputJcyljg.getYynsr()) / 100L;
            rqC001InputJcyljg.setYynsr(String.valueOf(l));
        }

        if(rqC001InputJcyljg != null) {
            rqC001InputSubLineJcyljg.setSubname("jcyljg");
            rqC001InputSubLineJcyljg.setRqC001InputJcyljg(rqC001InputJcyljg);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineJcyljg.class});
            subLineJcyljgXml = jaxbListUtil.toXml(rqC001InputSubLineJcyljg, "utf-8");
        }

        return !StringUtils.isEmpty(subLineJcyljgXml)?subLineJcyljgXml:"";
    }

    private String getSubLineGr(String customCode, String funcType) {
        this.logger.info("获取个人信息");
        RqC001InputSubLineGR rqC001InputSubLineGR = new RqC001InputSubLineGR();
        String subLineGrXml = "";
        RqC001InputGR rqC001InputGR = this.customerMapper.customGr(customCode, this.schema, funcType);
        if(rqC001InputGR != null) {
            rqC001InputSubLineGR.setSubname("gr");
            rqC001InputSubLineGR.setRqC001InputGR(rqC001InputGR);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineGR.class});
            subLineGrXml = jaxbListUtil.toXml(rqC001InputSubLineGR, "utf-8");
        }

        return !StringUtils.isEmpty(subLineGrXml)?subLineGrXml:"";
    }

    private String getSubLineQt(String customCode, String funcType) {
        this.logger.info("获取其他信息");
        RqC001InputSubLineQT rqC001InputSubLineQT = new RqC001InputSubLineQT();
        String subLineQtXml = "";
        RqC001InputQT rqC001InputQT = this.customerMapper.customQt(this.schema, customCode, this.ctlSchema, funcType);
        if(rqC001InputQT != null) {
            rqC001InputSubLineQT.setSubname("qt");
            rqC001InputSubLineQT.setRqC001InputQT(rqC001InputQT);
            JAXBListUtil jaxbListUtil = new JAXBListUtil(new Class[]{RqC001InputSubLineQT.class});
            subLineQtXml = jaxbListUtil.toXml(rqC001InputSubLineQT, "utf-8");
        }

        return !StringUtils.isEmpty(subLineQtXml)?subLineQtXml:"";
    }

    private String callQxmdmCusService(String data, String ev01Flag, String funcType) throws Exception {
        QxmdmCusService qxmdmCusService = new QxmdmCusService(new URL(this.QxmdmCusService_Url));
        QxmdmCusServicePortType qxmdmCusServicePortType = qxmdmCusService.getQxmdmCusServiceSOAP11PortHttp();
        String responseXml = "";
        if(StringUtils.isEmpty(ev01Flag)) {
            ev01Flag = "";
        }

        if(!funcType.equals("ADD") && (!funcType.equals("MOD") || ev01Flag.equals("Y"))) {
            this.logger.info("调用客商变更接口");
            responseXml = qxmdmCusServicePortType.reqModCusSrv(data, this.mdmUserName, this.mdmPassword);
        } else {
            this.logger.info("调用客商新增接口");
            responseXml = qxmdmCusServicePortType.reqCusSrv(data, this.mdmUserName, this.mdmPassword);
        }

        return responseXml;
    }

    private void afterResponse(String responseXml, String an8, String funcType) throws DocumentException {
        this.logger.info("接收返回信息");
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
        String codetype = "";
        Element fe841003;
        if(!errCode.getText().equals("SUCCESS")) {
            fe841003 = headerElement.element("msg");
            msgerr = fe841003.getText();
            this.logger.error("----------------------------------------------------------------------------------------------");
            this.logger.error("MDM接口接收错误" + msgerr);
            this.logger.error("----------------------------------------------------------------------------------------------");
            logType = "ERROR";
            flag = "E";
        } else {
            logType = "INFO";
            fe841003 = headerElement.element("codeinfo");
            Element f0101 = fe841003.element("code");
            Element codeValueElement = f0101.element("codevalue");
            Element codetypeElement = f0101.element("codetype");
            flag = "Y";
            ev01 = "N";
            codeValue = codeValueElement.getText();
            codetype = codetypeElement.getText();
        }

        if(funcType.equals("ADD")) {
            Fe80101 fe8410031 = new Fe80101();
            fe8410031.setKsan8(an8Num);
            fe8410031.setKsflag(flag);
            fe8410031.setKsev01(ev01);
            this.f0101z2.setSzurrf(flag);
            this.customerMapper.updatef0101z2(this.schema, this.f0101z2);
            if(flag.equals("Y")) {
                fe8410031.setKse8kstym(codeValue);
                if(codetype.equals("1")) {
                    fe8410031.setKsflag("S");
                    fe8410031.setKsev01("Y");
                }
            }

            this.logger.info("结束");
            this.rqC001ServiceImpl.updateFE80101(fe8410031);
            if(flag.equals("Y")) {
                F0101 f01011 = new F0101();
                f01011.setAban8(an8Num);
                f01011.setAbalky(codeValue);
            }
        } else {
            Fe841003 fe8410032 = new Fe841003();
            fe8410032.setSqflag(flag);
            fe8410032.setSqukid(new BigDecimal(this.doco));
            this.rqC001ServiceImpl.updateFe841003(fe8410032);
            this.logger.info("结束");
        }

        Fe8Log01Service var10001 = this.fe8Log01ServiceImpl;
        this.fe8Log01ServiceImpl.saveFe8Log01("Response", an8, dataType.getText(), responseXml, logType, funcType, msg.getText(), this.doco);
    }
}
