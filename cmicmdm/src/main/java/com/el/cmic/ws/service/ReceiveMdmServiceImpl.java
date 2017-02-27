//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.service;

import com.el.cmic.ws.domain.PhC001OutMain;
import com.el.cmic.ws.domain.PhC001OutSublineB;
import com.el.cmic.ws.domain.PhC001OutSublineCSC;
import com.el.cmic.ws.domain.PhC001OutSublineGR;
import com.el.cmic.ws.domain.PhC001OutSublineJCYLJG;
import com.el.cmic.ws.domain.PhC001OutSublineJKS;
import com.el.cmic.ws.domain.PhC001OutSublineJXS;
import com.el.cmic.ws.domain.PhC001OutSublineQT;
import com.el.cmic.ws.domain.PhC001OutSublineYY;
import com.el.cmic.ws.domain.PhE001OutHeader;
import com.el.cmic.ws.domain.PhE001OutMain;
import com.el.cmic.ws.domain.PhE001OutsublineA;
import com.el.cmic.ws.domain.PhE001OutsublineB;
import com.el.cmic.ws.domain.PhE002OutMain;
import com.el.cmic.ws.domain.PhE003OutMain;
import com.el.cmic.ws.domain.PhE004OutMain;
import com.el.cmic.ws.domain.PhM001OutMain;
import com.el.cmic.ws.domain.RePhXml;
import com.el.cmic.ws.domain.RePhXmlHeader;
import com.el.cmic.ws.service.AddC01ToERPService;
import com.el.cmic.ws.service.AddE01ToERPService;
import com.el.cmic.ws.service.AddE02ToERPService;
import com.el.cmic.ws.service.AddE03ToERPService;
import com.el.cmic.ws.service.AddE04ToERPService;
import com.el.cmic.ws.service.AddM01ToERPService;
import com.el.cmic.ws.service.Log02Service;
import com.el.cmic.ws.service.MegToERPService;
import com.el.cmic.ws.service.ModC0ESToERPService;
import com.el.cmic.ws.service.ModE0ESToERPService;
import com.el.cmic.ws.service.ModM0ESToERPService;
import com.el.cmic.ws.service.ReceiveMdmService;
import com.el.cmic.ws.service.SELToERPService;
import com.el.cmic.ws.service.UmegToERPService;
import com.el.utils.JAXBListUtil;
import com.el.utils.JAXBListUtil.CollectionWrapper;
import java.math.BigDecimal;
import java.util.Iterator;
import javax.jws.WebService;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(
        endpointInterface = "com.el.cmic.ws.service.ReceiveMdmService",
        serviceName = "receive"
)
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

    public ReceiveMdmServiceImpl() {
    }

    public String receive(String info) {
        this.logger.info("---------------------------------------------------------------------------------------------------");
        this.logger.info("WebService开始接受数据：");
        this.logger.info(info);
        this.logger.info("---------------------------------------------------------------------------------------------------");
        System.out.println(info);
        Document doc = null;
        String datatype = "";
        String functype = "";
        String no = "";
        String reqno = "";
        PhE001OutHeader phE001OutHeader = new PhE001OutHeader();

        JAXBListUtil jaxbListUtil;
        try {
            this.logger.info("校验Xml格式是否合法");
            doc = DocumentHelper.parseText(info);
            this.logger.info("开始解析Xml");
            Element e = doc.getRootElement();
            Iterator rePhXmlHeader1 = e.elementIterator("header");
            if(rePhXmlHeader1.hasNext()) {
                Element rePhXml1 = (Element)rePhXmlHeader1.next();
                datatype = rePhXml1.elementTextTrim("datatype");
                functype = rePhXml1.elementTextTrim("functype");
                jaxbListUtil = new JAXBListUtil(new Class[]{PhE001OutHeader.class, CollectionWrapper.class});
                phE001OutHeader = (PhE001OutHeader)jaxbListUtil.fromXml(rePhXml1.asXML());
                this.logger.info("解析BillInfo");
                if(functype.equals("ADD") || functype.equals("MOD")) {
                    String[] retXml3 = phE001OutHeader.getSubmitbillinfo().split(";");
                    String[] retXml1 = retXml3[0].split("-");
                    no = retXml1[1];
                    String[] mainiter;
                    if(retXml3.length >= 2) {
                        mainiter = retXml3[1].split("-");
                        if(mainiter[0].equals("REQNO")) {
                            reqno = mainiter[1];
                        }

                        if(mainiter[0].equals("CO")) {
                            this.co = mainiter[1];
                        }
                    }

                    if(retXml3.length == 3) {
                        mainiter = retXml3[2].split("-");
                        if(mainiter[0].equals("CO")) {
                            this.co = mainiter[1];
                        }

                        if(mainiter[0].equals("REQNO")) {
                            reqno = mainiter[1];
                        }
                    }

                    this.logger.info("BillInfo信息：NO：" + no + "REQNO:" + reqno + "CO:" + this.co);
                }
            }

            if((functype.equals("MOD") || functype.equals("ADD")) && phE001OutHeader.getErrcode().equals("SUCCESS")) {
                Iterator rePhXml2 = e.elementIterator("content");
                if(rePhXml2.hasNext()) {
                    Element jaxbListUtil2 = (Element)rePhXml2.next();
                    Iterator retXml5 = jaxbListUtil2.elementIterator("detail");

                    label248:
                    while(true) {
                        Iterator sublineiter6;
                        JAXBListUtil jaxbListUtil6;
                        Element sublineEle3;
                        do {
                            Iterator subiter1;
                            do {
                                if(!retXml5.hasNext()) {
                                    break label248;
                                }

                                Element retXml2 = (Element)retXml5.next();
                                Iterator mainiter1 = retXml2.elementIterator("main");
                                if(mainiter1.hasNext()) {
                                    Element subiter = (Element)mainiter1.next();
                                    JAXBListUtil subEle;
                                    PhE001OutsublineB sublineEle;
                                    Iterator jaxbListUtil1;
                                    Element phE001OutsublineA;
                                    Iterator phC001OutSublineB;
                                    Element phC001OutSublineYY;
                                    if(datatype.equals("E01")) {
                                        this.logger.info("信息为E01");
                                        subEle = new JAXBListUtil(new Class[]{PhE001OutMain.class, CollectionWrapper.class});
                                        PhE001OutMain sublineiter = (PhE001OutMain)subEle.fromXml(subiter.asXML());
                                        sublineEle = new PhE001OutsublineB();
                                        jaxbListUtil1 = retXml2.elementIterator("sub");
                                        if(jaxbListUtil1.hasNext()) {
                                            phE001OutsublineA = (Element)jaxbListUtil1.next();
                                            phC001OutSublineB = phE001OutsublineA.elementIterator("subline");
                                            if(phC001OutSublineB.hasNext()) {
                                                phC001OutSublineYY = (Element)phC001OutSublineB.next();
                                                subEle = new JAXBListUtil(new Class[]{PhE001OutsublineB.class, CollectionWrapper.class});
                                                sublineEle = (PhE001OutsublineB)subEle.fromXml(phC001OutSublineYY.asXML());
                                            }
                                        }

                                        this.addE01ToERPServiceImpl.AddE01ToERP(phE001OutHeader, sublineiter, sublineEle, no, this.co, reqno);
                                    }

                                    if(datatype.equals("E02")) {
                                        this.logger.info("信息为E02");
                                        subEle = new JAXBListUtil(new Class[]{PhE002OutMain.class, CollectionWrapper.class});
                                        PhE002OutMain sublineiter1 = (PhE002OutMain)subEle.fromXml(subiter.asXML());
                                        sublineEle = new PhE001OutsublineB();
                                        jaxbListUtil1 = retXml2.elementIterator("sub");
                                        if(jaxbListUtil1.hasNext()) {
                                            phE001OutsublineA = (Element)jaxbListUtil1.next();
                                            phC001OutSublineB = phE001OutsublineA.elementIterator("subline");
                                            if(phC001OutSublineB.hasNext()) {
                                                phC001OutSublineYY = (Element)phC001OutSublineB.next();
                                                subEle = new JAXBListUtil(new Class[]{PhE001OutsublineB.class, CollectionWrapper.class});
                                                sublineEle = (PhE001OutsublineB)subEle.fromXml(phC001OutSublineYY.asXML());
                                            }
                                        }

                                        this.addE02ToERPServiceImpl.addE02ToERP(phE001OutHeader, sublineiter1, sublineEle, no, this.co);
                                    }

                                    if(datatype.equals("E03")) {
                                        this.logger.info("信息为E03");
                                        subEle = new JAXBListUtil(new Class[]{PhE003OutMain.class, CollectionWrapper.class});
                                        PhE003OutMain sublineiter2 = (PhE003OutMain)subEle.fromXml(subiter.asXML());
                                        sublineEle = new PhE001OutsublineB();
                                        jaxbListUtil1 = retXml2.elementIterator("sub");
                                        if(jaxbListUtil1.hasNext()) {
                                            phE001OutsublineA = (Element)jaxbListUtil1.next();
                                            phC001OutSublineB = phE001OutsublineA.elementIterator("subline");
                                            if(phC001OutSublineB.hasNext()) {
                                                phC001OutSublineYY = (Element)phC001OutSublineB.next();
                                                subEle = new JAXBListUtil(new Class[]{PhE001OutsublineB.class, CollectionWrapper.class});
                                                sublineEle = (PhE001OutsublineB)subEle.fromXml(phC001OutSublineYY.asXML());
                                            }
                                        }

                                        this.addE03ToERPServiceImpl.addE03ToERP(phE001OutHeader, sublineiter2, sublineEle, no, this.co, reqno);
                                    }

                                    if(datatype.equals("E04")) {
                                        this.logger.info("信息为E04");
                                        subEle = new JAXBListUtil(new Class[]{PhE004OutMain.class, CollectionWrapper.class});
                                        PhE004OutMain sublineiter3 = (PhE004OutMain)subEle.fromXml(subiter.asXML());
                                        System.out.println(sublineiter3);
                                        this.addE04ToERPServiceImpl.addE04ToERP(phE001OutHeader, sublineiter3, no);
                                    }

                                    if(datatype.equals("C01")) {
                                        this.logger.info("信息为C01");
                                        subEle = new JAXBListUtil(new Class[]{PhC001OutMain.class, CollectionWrapper.class});
                                        PhC001OutMain sublineiter4 = (PhC001OutMain)subEle.fromXml(subiter.asXML());
                                        System.out.println(sublineiter4);
                                        Iterator sublineEle2 = retXml2.elementIterator("sub");
                                        if(sublineEle2.hasNext()) {
                                            Element jaxbListUtil5 = (Element)sublineEle2.next();
                                            Iterator phE001OutsublineA1 = jaxbListUtil5.elementIterator("subline");
                                            PhC001OutSublineB phC001OutSublineB1 = new PhC001OutSublineB();
                                            PhC001OutSublineYY phC001OutSublineYY1 = new PhC001OutSublineYY();
                                            PhC001OutSublineJCYLJG phC001OutSublineJCYLJG = new PhC001OutSublineJCYLJG();
                                            PhC001OutSublineGR phC001OutSublineGR = new PhC001OutSublineGR();
                                            PhC001OutSublineQT phC001OutSublineQT = new PhC001OutSublineQT();
                                            PhC001OutSublineCSC phC001OutSublineCSC = new PhC001OutSublineCSC();
                                            PhC001OutSublineJXS phC001OutSublineJXS = new PhC001OutSublineJXS();
                                            PhC001OutSublineJKS phC001OutSublineJKS = new PhC001OutSublineJKS();

                                            while(phE001OutsublineA1.hasNext()) {
                                                Element sublineEle1 = (Element)phE001OutsublineA1.next();
                                                String subname = sublineEle1.elementTextTrim("subname");
                                                if(subname.equals("b")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineB.class, CollectionWrapper.class});
                                                    phC001OutSublineB1 = (PhC001OutSublineB)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineB1);
                                                }

                                                if(subname.equals("csc")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineCSC.class, CollectionWrapper.class});
                                                    phC001OutSublineCSC = (PhC001OutSublineCSC)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineCSC);
                                                }

                                                if(subname.equals("jxs")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineJXS.class, CollectionWrapper.class});
                                                    phC001OutSublineJXS = (PhC001OutSublineJXS)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineJXS);
                                                }

                                                if(subname.equals("jks")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineJKS.class, CollectionWrapper.class});
                                                    phC001OutSublineJKS = (PhC001OutSublineJKS)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineJKS);
                                                }

                                                if(subname.equals("yy")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineYY.class, CollectionWrapper.class});
                                                    phC001OutSublineYY1 = (PhC001OutSublineYY)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineYY1);
                                                }

                                                if(subname.equals("jcyljg")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineJCYLJG.class, CollectionWrapper.class});
                                                    phC001OutSublineJCYLJG = (PhC001OutSublineJCYLJG)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineJCYLJG);
                                                }

                                                if(subname.equals("gr")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineGR.class, CollectionWrapper.class});
                                                    phC001OutSublineGR = (PhC001OutSublineGR)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineGR);
                                                }

                                                if(subname.equals("qt")) {
                                                    subEle = new JAXBListUtil(new Class[]{PhC001OutSublineQT.class, CollectionWrapper.class});
                                                    phC001OutSublineQT = (PhC001OutSublineQT)subEle.fromXml(sublineEle1.asXML());
                                                    System.out.println(phC001OutSublineQT);
                                                }
                                            }

                                            this.addC01ToERPServiceImpl.addC01ToERP(phE001OutHeader, sublineiter4, phC001OutSublineYY1, phC001OutSublineJCYLJG, phC001OutSublineGR, phC001OutSublineQT, phC001OutSublineB1, phC001OutSublineJXS, phC001OutSublineJKS, phC001OutSublineCSC, no, reqno);
                                        }
                                    }

                                    if(datatype.equals("M01")) {
                                        this.logger.info("信息为M01");
                                        subEle = new JAXBListUtil(new Class[]{PhM001OutMain.class, CollectionWrapper.class});
                                        PhM001OutMain sublineiter5 = (PhM001OutMain)subEle.fromXml(subiter.asXML());
                                        this.addM01ToERPServiceImpl.addM01ToERP(phE001OutHeader, sublineiter5, no);
                                        System.out.println(sublineiter5);
                                    }
                                }

                                subiter1 = retXml2.elementIterator("sub");
                            } while(!subiter1.hasNext());

                            Element subEle1 = (Element)subiter1.next();
                            sublineiter6 = subEle1.elementIterator("subline");
                            if(datatype.equals("E01") && sublineiter6.hasNext()) {
                                sublineEle3 = (Element)sublineiter6.next();
                                jaxbListUtil6 = new JAXBListUtil(new Class[]{PhE001OutsublineB.class, CollectionWrapper.class});
                                PhE001OutsublineB phE001OutsublineA2 = (PhE001OutsublineB)jaxbListUtil6.fromXml(sublineEle3.asXML());
                                System.out.println(phE001OutsublineA2);
                            }
                        } while(!datatype.equals("E01") && !datatype.equals("E02") && !datatype.equals("E03"));

                        if(sublineiter6.hasNext()) {
                            sublineEle3 = (Element)sublineiter6.next();
                            jaxbListUtil6 = new JAXBListUtil(new Class[]{PhE001OutsublineA.class, CollectionWrapper.class});
                            PhE001OutsublineA phE001OutsublineA3 = (PhE001OutsublineA)jaxbListUtil6.fromXml(sublineEle3.asXML());
                            System.out.println(phE001OutsublineA3);
                        }
                    }
                }
            }

            if(functype.equals("MOD")) {
                this.logger.info("接收变更信息：");
                BigDecimal rePhXml3;
                if(datatype.equals("E01") || datatype.equals("E02") || datatype.equals("E03") || datatype.equals("E04")) {
                    if(phE001OutHeader.getErrcode().equals("ERR011")) {
                        rePhXml3 = new BigDecimal(reqno);
                        this.modE0ESToERPServiceImpl.updateModE(rePhXml3, "R", no, phE001OutHeader);
                    }

                    if(phE001OutHeader.getErrcode().equals("SUCCESS") && !reqno.equals((Object)null)) {
                        rePhXml3 = new BigDecimal(reqno);
                        this.modE0ESToERPServiceImpl.updateModE(rePhXml3, "S", no, phE001OutHeader);
                    }
                }

                if(datatype.equals("C01")) {
                    this.logger.info("接受信息为客商信息");
                    BigDecimal jaxbListUtil3;
                    if(phE001OutHeader.getErrcode().equals("ERR011")) {
                        rePhXml3 = new BigDecimal(reqno);
                        jaxbListUtil3 = new BigDecimal(no);
                        this.modC0ESToERPServiceImpl.updateModC(rePhXml3, "R", jaxbListUtil3, phE001OutHeader);
                    }

                    if(phE001OutHeader.getErrcode().equals("SUCCESS")) {
                        rePhXml3 = new BigDecimal(no);
                        jaxbListUtil3 = new BigDecimal(reqno);
                        this.modC0ESToERPServiceImpl.updateModC(jaxbListUtil3, "S", rePhXml3, phE001OutHeader);
                    }
                }

                if(datatype.equals("M01")) {
                    this.logger.info("接受信息为厂家信息");
                    if(phE001OutHeader.getErrcode().equals("ERR011")) {
                        rePhXml3 = new BigDecimal(reqno);
                        this.modM0ESToERPServiceImpl.updateFE841005(rePhXml3, "E");
                    }

                    if(phE001OutHeader.getErrcode().equals("SUCCESS") && !reqno.equals((Object)null)) {
                        rePhXml3 = new BigDecimal(reqno);
                        this.modM0ESToERPServiceImpl.updateFE841005(rePhXml3, "S");
                    }
                }
            }

            if(functype.equals("MEG")) {
                this.megToERPServiceImpl.MegToERP(phE001OutHeader);
            }

            if(functype.equals("UMEG")) {
                this.umegToERPServiceImpl.UmegToERP(phE001OutHeader);
            }

            if(functype.equals("SEL")) {
                this.selToERPServiceImpl.SELToERP(phE001OutHeader, "Y");
            }

            if(functype.equals("USEL")) {
                this.selToERPServiceImpl.SELToERP(phE001OutHeader, "N");
            }

            if(!functype.equals("ADD") && !functype.equals("MOD") && !functype.equals("MEG") && !functype.equals("UMEG") && !functype.equals("SEL") && !functype.equals("USEL")) {
                phE001OutHeader.getErrcode().equals("");
                phE001OutHeader.getSubmitbillinfo().equals("");
            }

            this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, (String)null, reqno);
            this.logger.info("------------------------------------------------------------------------------------------");
            this.logger.info("最终接收成功");
            this.logger.info("------------------------------------------------------------------------------------------");
            RePhXmlHeader rePhXml4 = new RePhXmlHeader();
            rePhXml4.setDatatype(datatype);
            rePhXml4.setFunctype(functype);
            rePhXml4.setDirection("TOMDM");
            rePhXml4.setErrcode("SUCCESS");
            rePhXml4.setMsg("接收成功");
            RePhXml jaxbListUtil4 = new RePhXml();
            jaxbListUtil4.setRePhXmlHeader(rePhXml4);
            JAXBListUtil retXml6 = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
            String retXml4 = retXml6.toXml(jaxbListUtil4, "utf-8");
            System.out.println(retXml4);
            return retXml4;
        } catch (Exception var31) {
            var31.printStackTrace();
            RePhXmlHeader rePhXmlHeader;
            RePhXml rePhXml;
            String retXml;
            if(var31.getClass().toString().equals("class org.dom4j.DocumentException")) {
                rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR013");
                rePhXmlHeader.setMsg("ERP消息接收失败格式不正确");
                this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, "ERP消息接收失败格式不正确", reqno);
                rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);
                jaxbListUtil = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
                retXml = jaxbListUtil.toXml(rePhXml, "utf-8");
                System.out.println(retXml);
                var31.printStackTrace();
                this.logger.error("------------------------------------------------------------------------------------------");
                this.logger.error("接收的XML格式不正确" + var31.getMessage());
                this.logger.error("------------------------------------------------------------------------------------------");
                return retXml;
            } else if(var31.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")) {
                rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERROR");
                rePhXmlHeader.setMsg("submitbillinfo不能为空");
                this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, "submitbillinfo不能为空", reqno);
                rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);
                jaxbListUtil = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
                retXml = jaxbListUtil.toXml(rePhXml, "utf-8");
                System.out.println(retXml);
                var31.printStackTrace();
                this.logger.error("------------------------------------------------------------------------------------------");
                this.logger.error("submitbillinfo不能为空" + var31.getMessage());
                this.logger.error("------------------------------------------------------------------------------------------");
                return retXml;
            } else if(var31.getClass().toString().equals("class java.lang.NumberFormatException")) {
                rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR001");
                rePhXmlHeader.setMsg("传递参数缺失无申请单号");
                this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, "传递参数缺失无申请单号", reqno);
                rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);
                jaxbListUtil = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
                retXml = jaxbListUtil.toXml(rePhXml, "utf-8");
                System.out.println(retXml);
                var31.printStackTrace();
                this.logger.error("------------------------------------------------------------------------------------------");
                this.logger.error("将空转化为数字或传入的BILLINFO有误" + var31.getMessage());
                this.logger.error("------------------------------------------------------------------------------------------");
                return retXml;
            } else if(var31.getClass().toString().equals("class java.lang.NullPointerException")) {
                rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR001");
                rePhXmlHeader.setMsg("传递参数缺失");
                this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, "传递参数缺失", reqno);
                rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);
                jaxbListUtil = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
                retXml = jaxbListUtil.toXml(rePhXml, "utf-8");
                System.out.println(retXml);
                var31.printStackTrace();
                this.logger.error("------------------------------------------------------------------------------------------");
                this.logger.error("传递参数缺失" + var31.getMessage());
                this.logger.error("------------------------------------------------------------------------------------------");
                return retXml;
            } else {
                rePhXmlHeader = new RePhXmlHeader();
                rePhXmlHeader.setDatatype(datatype);
                rePhXmlHeader.setFunctype(functype);
                rePhXmlHeader.setDirection("TOMDM");
                rePhXmlHeader.setErrcode("ERR");
                rePhXmlHeader.setMsg("错误");
                this.log02ServiceImpl.writelog02(phE001OutHeader, no, info, "其他错误", reqno);
                rePhXml = new RePhXml();
                rePhXml.setRePhXmlHeader(rePhXmlHeader);
                jaxbListUtil = new JAXBListUtil(new Class[]{RePhXml.class, CollectionWrapper.class});
                retXml = jaxbListUtil.toXml(rePhXml, "utf-8");
                System.out.println(retXml);
                var31.printStackTrace();
                this.logger.error("------------------------------------------------------------------------------------------");
                this.logger.error("发生其他错误" + var31.getMessage());
                this.logger.error("------------------------------------------------------------------------------------------");
                return retXml;
            }
        }
    }
}
