package com.el.test;

import com.el.cmic.callmdm.domain.RqE001InputSublineB;
import com.el.cmic.ws.domain.RePhXml;
import com.el.cmic.ws.domain.RePhXmlHeader;
import com.el.utils.JAXBListUtil;

/**
 * Created by king_ on 2016/9/22.
 */
public class TestRe {
    public static void main(String []args){
        RePhXmlHeader rePhXmlHeader = new RePhXmlHeader();
        rePhXmlHeader.setDatatype("E03");
        rePhXmlHeader.setFunctype("ADD");
        rePhXmlHeader.setDirection("TOMDM");
        rePhXmlHeader.setErrcode("SUCCESS");
        rePhXmlHeader.setMsg("接收成功");

        RePhXml rePhXml = new RePhXml();
        rePhXml.setRePhXmlHeader(rePhXmlHeader);

        JAXBListUtil jaxbListUtil=new JAXBListUtil(RePhXml.class,JAXBListUtil.CollectionWrapper.class);
        String retXml =jaxbListUtil.toXml(rePhXml,"utf-8");
        System.out.println(retXml);
    }
}
