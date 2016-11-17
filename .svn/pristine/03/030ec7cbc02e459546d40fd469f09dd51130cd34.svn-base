package com.el.cmic.domain.inbound;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"序列号","入出类型","数量","当前包装","盘点状态"})
public class InboundPushSerial implements Serializable {

    /**
     *  null
     */
    @JSONField (name="序列号")
    private String serial;

    /**
     *  null
     */
    @JSONField (name="入出类型")
    private String type;

    /**
     *  null
     */
    @JSONField (name="数量")
    private BigDecimal uorg;

    /**
     *  null
     */
    @JSONField (name="当前包装")
    private BigDecimal pack;

    /**
     *  null
     */
    @JSONField (name="盘点状态")
    private BigDecimal ists;

    private static final long serialVersionUID = 1L;

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
	 * @return the pack
	 */
	public BigDecimal getPack() {
		return pack;
	}

	/**
	 * @param pack the pack to set
	 */
	public void setPack(BigDecimal pack) {
		this.pack = pack;
	}

	/**
	 * @return the ists
	 */
	public BigDecimal getIsts() {
		return ists;
	}

	/**
	 * @param ists the ists to set
	 */
	public void setIsts(BigDecimal ists) {
		this.ists = ists;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serial=").append(serial);
        sb.append(", type=").append(type);
        sb.append(", uorg=").append(uorg);
        sb.append(", pack=").append(pack);
        sb.append(", ists=").append(ists);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}