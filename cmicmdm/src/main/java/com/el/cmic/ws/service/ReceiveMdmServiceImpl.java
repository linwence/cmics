package com.el.cmic.ws.service;

import com.el.cmic.ws.domain.*;
import com.el.utils.JAXBListUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.Iterator;
import org.apache.log4j.Logger;
/**
 * Created by Vincent on 2016/9/13.
 */
@WebService(endpointInterface = "com.el.cmic.ws.service.ReceiveMdmService", serviceName = "receive")
public class ReceiveMdmServiceImpl implements ReceiveMdmService {
    Logger logger = Logger.getLogger(ReceiveMdmServiceImpl.class);
    @Autowired
    AddE01ToERPService addE01ToERPServiceImpl;
    @Autowired
    AddE02ToERPService addE02ToERPServiceImpl;
    @Autowired
    AddE03ToERPService addE03ToERPServiceImpl;
    @Autowired
    AddE04ToERPService addE04ToERPServiceImpl;
    @Autowired
    AddC01ToERPService addC01ToERPServiceImpl;
    @Autowired
    ModE0ESToERPService modE0ESToERPServiceImpl;
    @Autowired
    ModC0ESToERPService modC0ESToERPServiceImpl;
    @Autowired
    AddM01ToERPService addM01ToERPServiceImpl;
    @Autowired
    ModM0ESToERPService modM0ESToERPServiceImpl;
    @Autowired
    Log02Service log02ServiceImpl;

    @Autowired
    SELToERPService selToERPServiceImpl;
    @Autowired
    MegToERPService megToERPServiceImpl;
    @Autowired
    UmegToERPService umegToERPServiceImpl;

    private String co = "";

    public String receive(String info) {
        logger.info("---------------------------------------------------------------------------------------------------");
        logger.info("WebService开始接受数据：");
        logger.info(info);
        logger.info("---------------------------------------------------------------------------------------------------");
        System.out.println(info);

        Document doc = null;
        String datatype = "";
        String functype = "";
        String no ="";
        String reqno = "";
        PhE001OutHeader phE001OutHeader = new PhE001OutHeader();
        try{
            logger.info("校验Xml格式是否合法");
            doc = DocumentHelper.parseText(info); // 将字符串转为XML


            logger.info("开始解析Xml");
            Element rootElt = doc.getRootElement(); // 获取根节点
            Iterator headeriter = rootElt.elementIterator("header"); // 获取根节点下的子节点header

            if (headeriter.hasNext()) {
                Element headerEle = (Element) headeriter.next();
                datatype = headerEle.elementTextTrim("datatype");
                functype = headerEle.elementTextTrim("functype");
                //System.out.println(headerEle.asXML());

                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutHeader.class, JAXBListUtil.CollectionWrapper.class);
                phE001OutHeader = jaxbListUtil.fromXml(headerEle.asXML());
                logger.info("解析BillInfo");
                if (functype.equals("ADD")||functype.equals("MOD")) {
                    String[] str1 = phE001OutHeader.getSubmitbillinfo().split(";");
                    String[] str2 = str1[0].split("-");
                    no = str2[1];
                    if (str1.length >= 2) {
                        String[] str3 = str1[1].split("-");
                        if(str3[0].equals("REQNO")){
                            reqno = str3[1];
                        }
                        if(str3[0].equals("CO")){
                            co=str3[1];
                        }
                    }
                    if(str1.length == 3){
                        String[] str4 = str1[2].split("-");
                        if(str4[0].equals("CO")){
                            co=str4[1];
                        }
                        if(str4[0].equals("REQNO")){
                            reqno = str4[1];
                        }
                    }
                    logger.info("BillInfo信息：NO："+no+"REQNO:"+reqno+"CO:"+co);
                    //phE001OutHeader=jaxbListUtil.fromXml(headerEle.asXML());
                    //System.out.println( phE001OutHeader.toString());
                }
            }

//------------------------------------ADD--------------------------------------------------------------------------------
            /*if(functype.equals("ADD")) {*/
            if(functype.equals("MOD")||functype.equals("ADD")) {
                if (phE001OutHeader.getErrcode().equals("SUCCESS")) {
                    Iterator contentiter = rootElt.elementIterator("content");
                    if (contentiter.hasNext()) {
                        Element contentEle = (Element) contentiter.next();
                        //System.out.println(contentEle.asXML());
                        //String count = contentEle.elementTextTrim("count");
                        Iterator detailiter = contentEle.elementIterator("detail");
                        while (detailiter.hasNext()) {                        //detail解析 循环执行
                            Element detailEle = (Element) detailiter.next();//detail节点
                            Iterator mainiter = detailEle.elementIterator("main");
                            if (mainiter.hasNext()) {
                                Element mainEle = (Element) mainiter.next();
                                if (datatype.equals("E01")) {
                                    logger.info("信息为E01");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhE001OutMain phE001OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    PhE001OutsublineB phE001OutsublineB = new PhE001OutsublineB();
                                    //System.out.println(phE001OutMain);

                                    Iterator subiter = detailEle.elementIterator("sub");
                                    if (subiter.hasNext()) {
                                        Element subEle = (Element) subiter.next();
                                        Iterator sublineiter = subEle.elementIterator("subline");

                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhE001OutsublineB.class, JAXBListUtil.CollectionWrapper.class);
                                            phE001OutsublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                            //System.out.println(phE001OutsublineB);
                                        }

                                    }
                                    addE01ToERPServiceImpl.AddE01ToERP(phE001OutHeader, phE001OutMain, phE001OutsublineB, no,co,reqno);
                                }

                                if (datatype.equals("E02")) {
                                    logger.info("信息为E02");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE002OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhE002OutMain phE002OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    //System.out.println(phE002OutMain);
                                    PhE001OutsublineB phE001OutsublineB = new PhE001OutsublineB();

                                    Iterator subiter = detailEle.elementIterator("sub");
                                    if (subiter.hasNext()) {
                                        Element subEle = (Element) subiter.next();
                                        Iterator sublineiter = subEle.elementIterator("subline");

                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhE001OutsublineB.class, JAXBListUtil.CollectionWrapper.class);
                                            phE001OutsublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                            //System.out.println(phE001OutsublineB);
                                        }

                                    }
                                    addE02ToERPServiceImpl.addE02ToERP(phE001OutHeader, phE002OutMain,phE001OutsublineB, no,co);

                                }

                                if (datatype.equals("E03")) {
                                    logger.info("信息为E03");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE003OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhE003OutMain phE003OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    //System.out.println(phE003OutMain);
                                    PhE001OutsublineB phE001OutsublineB = new PhE001OutsublineB();

                                    Iterator subiter = detailEle.elementIterator("sub");
                                    if (subiter.hasNext()) {
                                        Element subEle = (Element) subiter.next();
                                        Iterator sublineiter = subEle.elementIterator("subline");

                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhE001OutsublineB.class, JAXBListUtil.CollectionWrapper.class);
                                            phE001OutsublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                            //System.out.println(phE001OutsublineB);
                                        }

                                    }
                                    addE03ToERPServiceImpl.addE03ToERP(phE001OutHeader, phE003OutMain, phE001OutsublineB,no,co,reqno);
                                }
                                if (datatype.equals("E04")) {
                                    logger.info("信息为E04");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE004OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhE004OutMain phE004OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    System.out.println(phE004OutMain);
                                    addE04ToERPServiceImpl.addE04ToERP(phE001OutHeader, phE004OutMain, no);

                                }

                                if (datatype.equals("C01")) {
                                    logger.info("信息为C01");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhC001OutMain phC001OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    System.out.println(phC001OutMain);
                                    Iterator subiter = detailEle.elementIterator("sub");
                                    if (subiter.hasNext()) {
                                        Element subEle = (Element) subiter.next();
                                        Iterator sublineiter = subEle.elementIterator("subline");

                                        PhC001OutSublineB phC001OutSublineB = new PhC001OutSublineB();
                                        PhC001OutSublineYY phC001OutSublineYY = new PhC001OutSublineYY();
                                        PhC001OutSublineJCYLJG phC001OutSublineJCYLJG = new PhC001OutSublineJCYLJG();
                                        PhC001OutSublineGR phC001OutSublineGR = new PhC001OutSublineGR();
                                        PhC001OutSublineQT phC001OutSublineQT = new PhC001OutSublineQT();
                                        PhC001OutSublineCSC phC001OutSublineCSC = new PhC001OutSublineCSC();
                                        PhC001OutSublineJXS phC001OutSublineJXS = new PhC001OutSublineJXS();
                                        PhC001OutSublineJKS phC001OutSublineJKS = new PhC001OutSublineJKS();




                                        while(sublineiter.hasNext()){
                                            Element sublineEle = (Element) sublineiter.next();
                                            String subname = sublineEle.elementTextTrim("subname");
                                            if(subname.equals("b")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineB.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineB);
                                            }

                                            if(subname.equals("csc")){

                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineCSC.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineCSC = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineCSC);
                                            }
                                            if(subname.equals("jxs")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineJXS.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineJXS = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineJXS);
                                            }
                                            if(subname.equals("jks")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineJKS.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineJKS = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineJKS);
                                            }

                                            if(subname.equals("yy")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineYY.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineYY = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineYY);
                                            }

                                            if(subname.equals("jcyljg")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineJCYLJG.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineJCYLJG = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineJCYLJG);
                                            }

                                            if(subname.equals("gr")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineGR.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineGR = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineGR);
                                            }
                                            if(subname.equals("qt")){
                                                jaxbListUtil = new JAXBListUtil(PhC001OutSublineQT.class, JAXBListUtil.CollectionWrapper.class);
                                                phC001OutSublineQT = jaxbListUtil.fromXml(sublineEle.asXML());
                                                System.out.println(phC001OutSublineQT);
                                            }
                                        }
                                    /*    if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            //String count = contentEle.elementTextTrim("count");
                                            jaxbListUtil = new JAXBListUtil(PhC001OutSublineB.class, JAXBListUtil.CollectionWrapper.class);
                                            phC001OutSublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                            System.out.println(phC001OutSublineB);
                                        }

                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhC001OutSublineYY.class, JAXBListUtil.CollectionWrapper.class);
                                            phC001OutSublineYY = jaxbListUtil.fromXml(sublineEle.asXML());
                                            System.out.println(phC001OutSublineYY);
                                        }
                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhC001OutSublineJCYLJG.class, JAXBListUtil.CollectionWrapper.class);
                                            phC001OutSublineJCYLJG = jaxbListUtil.fromXml(sublineEle.asXML());
                                            System.out.println(phC001OutSublineJCYLJG);
                                        }
                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhC001OutSublineGR.class, JAXBListUtil.CollectionWrapper.class);
                                            phC001OutSublineGR = jaxbListUtil.fromXml(sublineEle.asXML());
                                            System.out.println(phC001OutSublineGR);
                                        }
                                        if (sublineiter.hasNext()) {
                                            Element sublineEle = (Element) sublineiter.next();
                                            jaxbListUtil = new JAXBListUtil(PhC001OutSublineQT.class, JAXBListUtil.CollectionWrapper.class);
                                            phC001OutSublineQT = jaxbListUtil.fromXml(sublineEle.asXML());
                                            System.out.println(phC001OutSublineQT);
                                        }*/
                                        addC01ToERPServiceImpl.addC01ToERP(phE001OutHeader, phC001OutMain, phC001OutSublineYY,
                                                phC001OutSublineJCYLJG, phC001OutSublineGR, phC001OutSublineQT, phC001OutSublineB,
                                                phC001OutSublineJXS,phC001OutSublineJKS,phC001OutSublineCSC, no,reqno);
                                    }

                                }
                                if (datatype.equals("M01")) {
                                    logger.info("信息为M01");
                                    JAXBListUtil jaxbListUtil = new JAXBListUtil(PhM001OutMain.class, JAXBListUtil.CollectionWrapper.class);
                                    PhM001OutMain phM001OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                                    addM01ToERPServiceImpl.addM01ToERP(phE001OutHeader, phM001OutMain, no);
                                    System.out.println(phM001OutMain);
                                }
                            }
                            Iterator subiter = detailEle.elementIterator("sub");
                            if (subiter.hasNext()) {
                                Element subEle = (Element) subiter.next();
                                Iterator sublineiter = subEle.elementIterator("subline");
                                if (datatype.equals("E01")) {
                                    if (sublineiter.hasNext()) {
                                        Element sublineEle = (Element) sublineiter.next();
                                        JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutsublineB.class, JAXBListUtil.CollectionWrapper.class);
                                        PhE001OutsublineB phE001OutsublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                        System.out.println(phE001OutsublineB);
                                    }
                                }
                                if (datatype.equals("E01") || datatype.equals("E02") || datatype.equals("E03")) {
                                    if (sublineiter.hasNext()) {
                                        Element sublineEle = (Element) sublineiter.next();
                                        JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutsublineA.class, JAXBListUtil.CollectionWrapper.class);
                                        PhE001OutsublineA phE001OutsublineA = jaxbListUtil.fromXml(sublineEle.asXML());
                                        System.out.println(phE001OutsublineA);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(functype.equals("MOD")){
                logger.info("接收变更信息：");
                if(datatype.equals("E01")||datatype.equals("E02")||datatype.equals("E03")||datatype.equals("E04")) {
                    if (phE001OutHeader.getErrcode().equals("ERR011")) {
                        BigDecimal bigDecimal = new BigDecimal(reqno);
                        modE0ESToERPServiceImpl.updateModE(bigDecimal,"R",no,phE001OutHeader);
                    }
                    if (phE001OutHeader.getErrcode().equals("SUCCESS")) {
                        if (!reqno.equals(null)) {
                            BigDecimal bigDecimal = new BigDecimal(reqno);
                            modE0ESToERPServiceImpl.updateModE(bigDecimal,"S",no,phE001OutHeader);
                        }
                    }
                }
                if(datatype.equals("C01")){
                    logger.info("接受信息为客商信息");
                    if (phE001OutHeader.getErrcode().equals("ERR011")) {
                        BigDecimal bigDecimal = new BigDecimal(reqno);
                        BigDecimal bd= new BigDecimal(no);
                        modC0ESToERPServiceImpl.updateModC(bigDecimal,"R",bd,phE001OutHeader);
                    }
                    if (phE001OutHeader.getErrcode().equals("SUCCESS")) {
                       // if (!reqno.equals(null)) {
                            BigDecimal bd= new BigDecimal(no);
                            BigDecimal bigDecimal = new BigDecimal(reqno);
                            modC0ESToERPServiceImpl.updateModC(bigDecimal,"S",bd,phE001OutHeader);

                        //}
                    }
                }
                if(datatype.equals("M01")){
                    logger.info("接受信息为厂家信息");
                    if (phE001OutHeader.getErrcode().equals("ERR011")) {
                        BigDecimal bigDecimal = new BigDecimal(reqno);
                        modM0ESToERPServiceImpl.updateFE841005(bigDecimal,"E");
                    }
                    if (phE001OutHeader.getErrcode().equals("SUCCESS")) {
                        if (!reqno.equals(null)) {
                            BigDecimal bigDecimal = new BigDecimal(reqno);
                            modM0ESToERPServiceImpl.updateFE841005(bigDecimal,"S");
                        }
                    }

                }
            }
            if(functype.equals("MEG")){
                megToERPServiceImpl.MegToERP(phE001OutHeader);
            }
            if(functype.equals("UMEG")){
                umegToERPServiceImpl.UmegToERP(phE001OutHeader);
            }
            if(functype.equals("SEL")){
                selToERPServiceImpl.SELToERP(phE001OutHeader,"Y");
            }
            if(functype.equals("USEL")){
                selToERPServiceImpl.SELToERP(phE001OutHeader,"N");
            }
            if(!(functype.equals("ADD") || functype.equals("MOD")|| functype.equals("MEG")|| functype.equals("UMEG")|| functype.equals("SEL") || functype.equals("USEL"))){
                phE001OutHeader.getErrcode().equals("");
                phE001OutHeader.getSubmitbillinfo().equals("");
            }
            log02ServiceImpl.writelog02(phE001OutHeader,no,info,null,reqno);


            //if add }
//----------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------MOD----------------------------------------------------------------

            logger.info("------------------------------------------------------------------------------------------");
            logger.info("最终接收成功");
            logger.info("------------------------------------------------------------------------------------------");
            RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
            rePhXmlHeader.setDatatype(datatype);
            rePhXmlHeader.setFunctype(functype);
            rePhXmlHeader.setDirection("TOMDM");
            rePhXmlHeader.setErrcode("SUCCESS");
            rePhXmlHeader.setMsg("接收成功");

            RePhXml rePhXml = new RePhXml();
            rePhXml.setRePhXmlHeader(rePhXmlHeader);

            JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
            String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
            System.out.println(retXml);
            return retXml;
        }catch (Exception e){
            e.printStackTrace();
            if(e.getClass().toString().equals("class org.dom4j.DocumentException")){

                RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR013");
                rePhXmlHeader.setMsg("ERP消息接收失败格式不正确");

                log02ServiceImpl.writelog02(phE001OutHeader,no,info,"ERP消息接收失败格式不正确",reqno);

                RePhXml rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);

                JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
                String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
                System.out.println(retXml);
                e.printStackTrace();
                logger.error("------------------------------------------------------------------------------------------");
                logger.error("接收的XML格式不正确"+e.getMessage());
                logger.error("------------------------------------------------------------------------------------------");
                return retXml;

            }
            if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")){

                RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERROR");
                rePhXmlHeader.setMsg("submitbillinfo不能为空");

                log02ServiceImpl.writelog02(phE001OutHeader,no,info,"submitbillinfo不能为空",reqno);

                RePhXml rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);

                JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
                String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
                System.out.println(retXml);
                e.printStackTrace();
                logger.error("------------------------------------------------------------------------------------------");
                logger.error("submitbillinfo不能为空"+e.getMessage());
                logger.error("------------------------------------------------------------------------------------------");
                return retXml;

            }
            if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
                RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR001");
                rePhXmlHeader.setMsg("传递参数缺失无申请单号");

                log02ServiceImpl.writelog02(phE001OutHeader,no,info,"传递参数缺失无申请单号",reqno);

                RePhXml rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);

                JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
                String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
                System.out.println(retXml);
                e.printStackTrace();
                logger.error("------------------------------------------------------------------------------------------");
                logger.error("将空转化为数字或传入的BILLINFO有误"+e.getMessage());
                logger.error("------------------------------------------------------------------------------------------");
                return retXml;

            }
            if(e.getClass().toString().equals("class java.lang.NullPointerException")){
                RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR001");
                rePhXmlHeader.setMsg("传递参数缺失");


                log02ServiceImpl.writelog02(phE001OutHeader,no,info,"传递参数缺失",reqno);

                RePhXml rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);

                JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
                String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
                System.out.println(retXml);
                e.printStackTrace();
                logger.error("------------------------------------------------------------------------------------------");
                logger.error("传递参数缺失"+e.getMessage());
                logger.error("------------------------------------------------------------------------------------------");
                return retXml;

            }
            else{
                RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR");
                rePhXmlHeader.setMsg("错误");

                log02ServiceImpl.writelog02(phE001OutHeader,no,info,"其他错误",reqno);

                RePhXml rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);

                JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
                String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
                System.out.println(retXml);
                e.printStackTrace();
                logger.error("------------------------------------------------------------------------------------------");
                logger.error("发生其他错误"+e.getMessage());
                logger.error("------------------------------------------------------------------------------------------");
                return retXml;

            }

        }

    }
}
