package com.el.utils;

import com.el.dev.emp.domain.Dept;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

/**
 * java 对象与xml互转
 * Tjava对象
 * Created by Vincent on 2016/9/14.
 */
public class JAXBUtil<T> {
    /**
     * xml转成java对象
     *
     * @param c   java对象class
     * @param xml xml字符�??
     * @return
     * @throws JAXBException
     */
    public T unMarshal(Class c, String xml) throws JAXBException {
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        T obj = (T) unmarshaller.unmarshal(new StringReader(xml));
        return obj;

    }

    /**
     * java 对象转换成xml字符�??
     *
     * @param element java对象
     * @return
     * @throws JAXBException
     * @throws IOException
     */
    public String marshal(T element) throws JAXBException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(element.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(element, printStream);


            String xml = byteArrayOutputStream.toString();


          //  System.out.println(byteArrayOutputStream.toString());
            return xml;
        } finally {
            byteArrayOutputStream.close();
            printStream.close();
        }
    }

    public static void main(String[] args) {

        //java 对象转换 xml测试，其中java对象要有xml注解
        JAXBUtil<Dept> jaxbUtil = new JAXBUtil<Dept>();
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("中文aa ~来了");
        dept.setLoc("loc");

        try {
            String xml = jaxbUtil.marshal(dept);
            System.out.println(xml);

            //xml转换成java对象
            Dept dept1 = jaxbUtil.unMarshal(Dept.class, xml);
            System.out.println(dept1.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
