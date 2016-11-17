
package com.el.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>emp complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="emp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comm" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="deptno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="empno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hiredate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mgr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emp", propOrder = {
    "comm",
    "deptno",
    "empno",
    "ename",
    "hiredate",
    "job",
    "mgr",
    "sal"
})
public class Emp {

    protected double comm;
    protected int deptno;
    protected int empno;
    protected String ename;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hiredate;
    protected String job;
    protected int mgr;
    protected double sal;

    /**
     * ��ȡcomm���Ե�ֵ��
     * 
     */
    public double getComm() {
        return comm;
    }

    /**
     * ����comm���Ե�ֵ��
     * 
     */
    public void setComm(double value) {
        this.comm = value;
    }

    /**
     * ��ȡdeptno���Ե�ֵ��
     * 
     */
    public int getDeptno() {
        return deptno;
    }

    /**
     * ����deptno���Ե�ֵ��
     * 
     */
    public void setDeptno(int value) {
        this.deptno = value;
    }

    /**
     * ��ȡempno���Ե�ֵ��
     * 
     */
    public int getEmpno() {
        return empno;
    }

    /**
     * ����empno���Ե�ֵ��
     * 
     */
    public void setEmpno(int value) {
        this.empno = value;
    }

    /**
     * ��ȡename���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEname() {
        return ename;
    }

    /**
     * ����ename���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEname(String value) {
        this.ename = value;
    }

    /**
     * ��ȡhiredate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHiredate() {
        return hiredate;
    }

    /**
     * ����hiredate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHiredate(XMLGregorianCalendar value) {
        this.hiredate = value;
    }

    /**
     * ��ȡjob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * ����job���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * ��ȡmgr���Ե�ֵ��
     * 
     */
    public int getMgr() {
        return mgr;
    }

    /**
     * ����mgr���Ե�ֵ��
     * 
     */
    public void setMgr(int value) {
        this.mgr = value;
    }

    /**
     * ��ȡsal���Ե�ֵ��
     * 
     */
    public double getSal() {
        return sal;
    }

    /**
     * ����sal���Ե�ֵ��
     * 
     */
    public void setSal(double value) {
        this.sal = value;
    }

}
