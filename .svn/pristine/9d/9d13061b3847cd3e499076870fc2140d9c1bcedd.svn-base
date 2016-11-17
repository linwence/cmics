package com.el.cmic.domain.inbound;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"子件编号","子件批号","子件灭菌批号","子件供应商","客户类型","序列号","数量","缺损数量","子件有效期至","子件生产日期"})
public class InboundPushComponentUnique implements Serializable {

    /**
     *  null
     */
    @JSONField (name="子件编号")
    private String id;

    /**
     *  null
     */
    @JSONField (name="子件批号")
    private String lot1;

    /**
     *  null
     */
    @JSONField (name="子件灭菌批号")
    private String lot2;

    /**
     *  null
     */
    @JSONField (name="子件供应商")
    private String supp;

    /**
     *  null
     */
    @JSONField (name="客户类型")
    private String type;
    
    /**
     *  null
     */
    @JSONField (name="序列号")
    private String serial;

    /**
     *  null
     */
    @JSONField (name="数量")
    private BigDecimal uorg;

    /**
     *  null
     */
    @JSONField (name="缺损数量")
    private BigDecimal defq;

    /**
     *  null
     */
    @JSONField (name="子件有效期至", format="yyyy-MM-dd")
    private Date exdj;

    /**
     *  null
     */
    @JSONField (name="子件生产日期", format="yyyy-MM-dd")
    private Date prdj;

    private static final long serialVersionUID = 1L;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the lot1
	 */
	public String getLot1() {
		return lot1;
	}

	/**
	 * @param lot1 the lot1 to set
	 */
	public void setLot1(String lot1) {
		this.lot1 = lot1;
	}

	/**
	 * @return the lot2
	 */
	public String getLot2() {
		return lot2;
	}

	/**
	 * @param lot2 the lot2 to set
	 */
	public void setLot2(String lot2) {
		this.lot2 = lot2;
	}

	/**
	 * @return the supp
	 */
	public String getSupp() {
		return supp;
	}

	/**
	 * @param supp the supp to set
	 */
	public void setSupp(String supp) {
		this.supp = supp;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return the uorg
	 */
	public BigDecimal getUorg() {
		return uorg;
	}

	/**
	 * @param uorg the uorg to set
	 */
	public void setUorg(BigDecimal uorg) {
		this.uorg = uorg;
	}

	/**
	 * @return the defq
	 */
	public BigDecimal getDefq() {
		return defq;
	}

	/**
	 * @param defq the defq to set
	 */
	public void setDefq(BigDecimal defq) {
		this.defq = defq;
	}

	/**
	 * @return the exdj
	 */
	public Date getExdj() {
		return exdj;
	}

	/**
	 * @param exdj the exdj to set
	 */
	public void setExdj(Date exdj) {
		this.exdj = exdj;
	}

	/**
	 * @return the prdj
	 */
	public Date getPrdj() {
		return prdj;
	}

	/**
	 * @param prdj the prdj to set
	 */
	public void setPrdj(Date prdj) {
		this.prdj = prdj;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lot1=").append(lot1);
        sb.append(", lot2=").append(lot2);
        sb.append(", supp=").append(supp);
        sb.append(", type=").append(type);
        sb.append(", serial=").append(serial);
        sb.append(", uorg=").append(uorg);
        sb.append(", defq=").append(defq);
        sb.append(", exdj=").append(exdj);
        sb.append(", prdj=").append(prdj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}