package com.el.cmic.domain.record;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 入库验收记录推送
 * @author zhanhao
 *
 */
public class InputCheck {
	
	@JSONField(name="明细")
	public List<InputCheckDetail>  inputCheckDetail;

	public List<InputCheckDetail> getInputCheckDetail() {
		return inputCheckDetail;
	}

	public void setInputCheckDetail(List<InputCheckDetail> inputCheckDetail) {
		this.inputCheckDetail = inputCheckDetail;
	}

	@Override
	public String toString() {
		return "InputCheck [inputCheckDetail=" + inputCheckDetail + "]";
	}

}
