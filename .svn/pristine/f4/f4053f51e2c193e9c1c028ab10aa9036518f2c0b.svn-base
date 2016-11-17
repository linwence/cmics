package com.el.cmic.domain.inbound;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"货品编号","批号","灭菌批号","库存类型","数量","缺损数量","货品名称","生产日期","有效期至","备注"})
public class InboundPushComponent implements Serializable {

    /**
     *  null
     */
    @JSONField (name="货品编号")
    private String id;

    /**
     *  null
     */
    @JSONField (name="批号")
    private String lot1;

    /**
     *  null
     */
    @JSONField (name="灭菌批号")
    private String lot2;

    /**
     *  null
     */
    @JSONField (name="库存类型")
    private BigDecimal type;

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
    @JSONField (name="货品名称")
    private String name;

    /**
     *  null
     */
    @JSONField (name="生产日期", format="yyyy-MM-dd")
    private Date prdj;

    /**
     *  null
     */
    @JSONField (name="有效期至", format="yyyy-MM-dd")
    private Date exdj;

    /**
     *  null
     */
    @JSONField (name="备注")
    private String remark;

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
	 * @return the type
	 */
	public BigDecimal getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(BigDecimal type) {
		this.type = type;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
        sb.append(", type=").append(type);
        sb.append(", uorg=").append(uorg);
        sb.append(", defq=").append(defq);
        sb.append(", name=").append(name);
        sb.append(", prdj=").append(prdj);
        sb.append(", exdj=").append(exdj);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}