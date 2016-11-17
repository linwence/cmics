package com.el.utils;

import com.el.cmic.callmdm.domain.RqE001InputBE01;
import com.el.cmic.callmdm.domain.RqE001InputSublineB;
import com.el.dev.emp.domain.Dept;
import org.apache.cxf.common.util.StringUtils;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.namespace.QName;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * java 对象与xml互转
 * Tjava对象
 * Created by Vincent on 2016/9/14.
 */
/**
 * 使用Jaxb2.0实现XML<->Java Object的Binder.
 *
 * 特别支持Root对象是List的情形.
 *
 * @author
 */
public class JAXBListUtil {
    // 多线程安全的Context.
    private JAXBContext jaxbContext;

    /**
     * @param types
     *            所有需要序列化的Root对象的类型.
     */
    public JAXBListUtil(Class<?>... types) {
        try {
            jaxbContext = JAXBContext.newInstance(types);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Java Object->Xml.
     */
    public String toXml(Object root, String encoding) {
        try {
            StringWriter writer = new StringWriter();
            createMarshaller(encoding).marshal(root, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Java Object->Xml, 特别支持对Root Element是Collection的情形.
     */
    @SuppressWarnings("unchecked")
    public String toXml(Collection root, String rootName, String encoding) {
        try {
            CollectionWrapper wrapper = new CollectionWrapper();
            wrapper.collection = root;

            JAXBElement<CollectionWrapper> wrapperElement = new JAXBElement<CollectionWrapper>(
                    new QName(rootName), CollectionWrapper.class, wrapper);

            StringWriter writer = new StringWriter();
            createMarshaller(encoding).marshal(wrapperElement, writer);

            return writer.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Xml->Java Object.
     */
    @SuppressWarnings("unchecked")
    public <T> T fromXml(String xml) {
        try {
            StringReader reader = new StringReader(xml);
            return (T) createUnmarshaller().unmarshal(reader);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Xml->Java Object, 支持大小写敏感或不敏感.
     */
    @SuppressWarnings("unchecked")
    public <T> T fromXml(String xml, boolean caseSensitive) {
        try {
            String fromXml = xml;
            if (!caseSensitive)
                fromXml = xml.toLowerCase();
            StringReader reader = new StringReader(fromXml);
            return (T) createUnmarshaller().unmarshal(reader);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建Marshaller, 设定encoding(可为Null).
     */
    public Marshaller createMarshaller(String encoding) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT,Boolean.TRUE);
            if (StringUtils.isEmpty(encoding)) {
                marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            }
            return marshaller;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建UnMarshaller.
     */
    public Unmarshaller createUnmarshaller() {
        try {
            return jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 封装Root Element 是 Collection的情况.
     */
    public static class CollectionWrapper {
        @SuppressWarnings("unchecked")
        @XmlAnyElement
        protected Collection collection;
    }

    public static void main(String[] args) {
        JAXBListUtil jaxbListUtil=new JAXBListUtil(RqE001InputSublineB.class,CollectionWrapper.class);

        RqE001InputBE01 rqE001InputBE01=new RqE001InputBE01();
        rqE001InputBE01.setPk_licensetype("名");
        rqE001InputBE01.setLicenseno("证照编号");
        rqE001InputBE01.setTodate("todate");
        rqE001InputBE01.setFxdj("风险等级");
        rqE001InputBE01.setIscqyx("是否长期有效");
        rqE001InputBE01.setCctj("存储条件");
        rqE001InputBE01.setQtcctj("其他存储条件");
        rqE001InputBE01.setPk_productclass("产品分类");
        rqE001InputBE01.setPk_jgg("进口");

        RqE001InputBE01 rqE001InputBE012=new RqE001InputBE01();
        rqE001InputBE012.setPk_licensetype("证照类型");
        rqE001InputBE012.setLicenseno("证照编号");
        rqE001InputBE012.setTodate("todate");
        rqE001InputBE012.setFxdj("风险等级");
        rqE001InputBE012.setIscqyx("是否长期有效");
        rqE001InputBE012.setCctj("存储条件");
        rqE001InputBE012.setQtcctj("其他存储条件");
        rqE001InputBE012.setPk_productclass("产品分类");
        rqE001InputBE012.setPk_jgg("进口");
        List<RqE001InputBE01> rqE001InputBE01List=new ArrayList<RqE001InputBE01>();
        rqE001InputBE01List.add(rqE001InputBE01);
        rqE001InputBE01List.add(rqE001InputBE012);

        RqE001InputSublineB rqE001InputSublineB=new RqE001InputSublineB();
        rqE001InputSublineB.setSubname("b");
        rqE001InputSublineB.setRqE001InputBE01List(rqE001InputBE01List);

        String retXml =jaxbListUtil.toXml(rqE001InputSublineB,"utf-8");
        System.out.println(retXml);


        RqE001InputSublineB rqE001InputSublineB1=jaxbListUtil.fromXml(retXml);
        System.out.println( rqE001InputSublineB1.toString());


    }
}