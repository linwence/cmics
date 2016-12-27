package com.el.cmic.domain.account;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 对账推送 实体
 * @author zhanhao
 *
 */
@Component
@JSONType(orders={"物流中心","货主","货品编号","货品名称","批号","数量"})
public class AccountItem {
	
	 /**
     *  物流中心 - FE8WMS14.DZMCU
     */
	@JSONField(name="物流中心")
    private String dzmcu;
    
    /**
     *  货主 - FE8WMS14.DZCO
     */
	@JSONField(name="货主")
    private String dzco;

    /**
     *  货品编号 - FE8WMS14.DZLITM
     */
	@JSONField(name="货品编号")
    private String dzlitm;
    
    /**
     *  货品名称 - FE8WMS14.DZE8NAME
     */
	@JSONField(name="货品名称")
    private String dze8name;
    
    /**
     *  批号 - FE8WMS14.DZLOT1
     */
	@JSONField(name="批号")
    private String dzlot1;
    
    /**
     *  数量 - FE8WMS14.DZUORG
     */
	@JSONField(name="数量")
    private BigDecimal dzuorg;

	public String getDzmcu() {
		return dzmcu;
	}

	public void setDzmcu(String dzmcu) {
		this.dzmcu = dzmcu;
	}

	public String getDzco() {
		return dzco;
	}

	public void setDzco(String dzco) {
		this.dzco = dzco;
	}

	public String getDzlitm() {
		return dzlitm;
	}

	public void setDzlitm(String dzlitm) {
		this.dzlitm = dzlitm;
	}

	public String getDze8name() {
		return dze8name;
	}

	public void setDze8name(String dze8name) {
		this.dze8name = dze8name;
	}

	public String getDzlot1() {
		return dzlot1;
	}

	public void setDzlot1(String dzlot1) {
		this.dzlot1 = dzlot1;
	}

	public BigDecimal getDzuorg() {
		return dzuorg;
	}

	public void setDzuorg(BigDecimal dzuorg) {
		this.dzuorg = dzuorg;
	}

	@Override
	public String toString() {
		return "AccountItem [dzmcu=" + dzmcu + ", dzco=" + dzco + ", dzlitm="
				+ dzlitm + ", dze8name=" + dze8name + ", dzlot1=" + dzlot1
				+ ", dzuorg=" + dzuorg + "]";
	}
}
