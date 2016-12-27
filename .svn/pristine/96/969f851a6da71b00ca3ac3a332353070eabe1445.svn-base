package com.el.test;

import com.el.cmic.ws.domain.*;
import com.el.utils.JAXBListUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;

/**
 * Created by king_ on 2016/9/21.
 */
public class TestPhC001 {
    public static void main(String[] args){
        String xml = "<?xml version='1.0' encoding='UTF-8'?>\n" +
                "<xml>\n" +
                "\t<header>\n" +
                "\t\t<datatype>M01</datatype>\n" +
                "\t\t<functype>ADD</functype> \n" +
                "\t\t<direction>TOERP</direction >\n" +
                "\t\t<errcode>SUCCESS</errcode>\n" +
                "\t\t<msg>审批通过</msg>\n" +
                "\t<submitbillinfo>JDE00001</submitbillinfo>\n" +
                "\t<codeinfo>\n" +
                "\t<code>\n" +
                "\t\t\t<codetype>0</codetype>\n" +
                "\t\t\t<codevalue>TE2016062900001</codevalue>\n" +
                "\t</code>\n" +
                "\t<code>\n" +
                "\t\t\t<codetype>1</codetype>\n" +
                "\t\t\t<codevalue>E0000000001</codevalue>\n" +
                "\t</code>\n" +
                "\t</codeinfo>\n" +
                "\t</header>\n" +
                "\t<content>\t\n" +
                "\t\t<count>1</count>\n" +
                "\t\t<detail>\n" +
                "\t\t\t<main>\n" +
                "\t\t\t\t<mfcd>生产厂家编码</mfcd>\n" +
                "\t\t\t\t<mfname>生产厂家名称</mfname>\n" +
                "\t\t\t\t<mfbrand>厂牌</mfbrand> --输入产品名称\n" +
                "\t\t\t\t<mflicense>生产许可证号</mflicense>\n" +
                "\t\t\t</main>\n" +
                "\t\t</detail>\n" +
                "\t</content>\t\n" +
                "</xml>";
        Document doc = null;
        try{
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            String datatype = new String();

            Element rootElt = doc.getRootElement(); // 获取根节点
            Iterator headeriter = rootElt.elementIterator("header"); // 获取根节点下的子节点header

            if (headeriter.hasNext()){
                Element headerEle = (Element) headeriter.next();
                datatype = headerEle.elementTextTrim("datatype");
                //System.out.println(headerEle.asXML());

                JAXBListUtil jaxbListUtil=new JAXBListUtil(PhE001OutHeader.class,JAXBListUtil.CollectionWrapper.class);
                PhE001OutHeader phE001OutHeader=jaxbListUtil.fromXml(headerEle.asXML());
                System.out.println( phE001OutHeader.toString());
            }



            Iterator contentiter = rootElt.elementIterator("content");
            if (contentiter.hasNext()){
                Element contentEle = (Element) contentiter.next();
                //System.out.println(contentEle.asXML());
                String count = contentEle.elementTextTrim("count");

                Iterator detailiter = contentEle.elementIterator("detail");
                while(detailiter.hasNext()){                        //detail解析 循环执行
                    Element detailEle = (Element) detailiter.next();//detail节点
                    Iterator mainiter =detailEle.elementIterator("main");
                    if (mainiter.hasNext()){
                        Element mainEle = (Element) mainiter.next();
                        if(datatype.equals("E01")) {
                            JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutMain.class, JAXBListUtil.CollectionWrapper.class);
                            PhE001OutMain phE001OutMain = jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phE001OutMain);
                        }
                        if(datatype.equals("E02")){
                            JAXBListUtil jaxbListUtil=new JAXBListUtil(PhE002OutMain.class,JAXBListUtil.CollectionWrapper.class);
                            PhE002OutMain phE002OutMain=jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phE002OutMain);
                        }
                        if(datatype.equals("E03")){
                            JAXBListUtil jaxbListUtil=new JAXBListUtil(PhE003OutMain.class,JAXBListUtil.CollectionWrapper.class);
                            PhE003OutMain phE003OutMain=jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phE003OutMain);
                        }
                        if(datatype.equals("E04")){
                            JAXBListUtil jaxbListUtil=new JAXBListUtil(PhE004OutMain.class,JAXBListUtil.CollectionWrapper.class);
                            PhE004OutMain phE004OutMain=jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phE004OutMain);
                        }

                        if(datatype.equals("C01")){
                            JAXBListUtil jaxbListUtil=new JAXBListUtil(PhC001OutMain.class,JAXBListUtil.CollectionWrapper.class);
                            PhC001OutMain phC001OutMain=jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phC001OutMain);
                        }
                        if(datatype.equals("M01")){
                            JAXBListUtil jaxbListUtil=new JAXBListUtil(PhM001OutMain.class,JAXBListUtil.CollectionWrapper.class);
                            PhM001OutMain phM001OutMain=jaxbListUtil.fromXml(mainEle.asXML());
                            System.out.println(phM001OutMain);
                        }
                    }
                    Iterator subiter = detailEle.elementIterator("sub");
                    if (subiter.hasNext()){
                        Element subEle =(Element) subiter.next();
                        Iterator sublineiter = subEle.elementIterator("subline");
                        if(datatype.equals("E01")) {
                            if (sublineiter.hasNext()) {
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutsublineB.class, JAXBListUtil.CollectionWrapper.class);
                                PhE001OutsublineB phE001OutsublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phE001OutsublineB);
                            }
                        }
                        if(datatype.equals("E01") ||datatype.equals("E02") ||datatype.equals("E03") ) {
                            if (sublineiter.hasNext()) {
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhE001OutsublineA.class, JAXBListUtil.CollectionWrapper.class);
                                PhE001OutsublineA phE001OutsublineA = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phE001OutsublineA);
                            }
                        }

                        if(datatype.equals("C01")){
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineB.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineB phC001OutSublineB = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineB);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineCSC.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineCSC phC001OutSublineCSC = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineCSC);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineJXS.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineJXS phC001OutSublineJXS = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineJXS);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineJKS.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineJKS phC001OutSublineJKS = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineJKS);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineYY.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineYY phC001OutSublineYY = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineYY);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineJCYLJG.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineJCYLJG phC001OutSublineJCYLJG = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineJCYLJG);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineGR.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineGR phC001OutSublineGR = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineGR);
                            }
                            if(sublineiter.hasNext()){
                                Element sublineEle = (Element) sublineiter.next();
                                JAXBListUtil jaxbListUtil = new JAXBListUtil(PhC001OutSublineQT.class, JAXBListUtil.CollectionWrapper.class);
                                PhC001OutSublineQT phC001OutSublineQT = jaxbListUtil.fromXml(sublineEle.asXML());
                                System.out.println(phC001OutSublineQT);
                            }
                        }
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
