package com.el.cmic.domain.record;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 出库复核记录推送   实体
 * @author zhanhao
 *
 */
@Component
public class OutCheck {
	
	@JSONField(name="明细")
	public List<OutCheckDetial> outCheckDetial;

	public List<OutCheckDetial> getOutCheckDetial() {
		return outCheckDetial;
	}

	public void setOutCheckDetial(List<OutCheckDetial> outCheckDetial) {
		this.outCheckDetial = outCheckDetial;
	}

	@Override
	public String toString() {
		return "OutCheck [outCheckDetial=" + outCheckDetial+ ", getOutCheckDetial()=" + getOutCheckDetial()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
