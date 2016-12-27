package com.el.cmic.domain.record;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 运输记录推送
 * @author zhanhao
 *
 */
public class Transport {

	@JSONField(name="明细")
	private List<TransportDetail> transportDetail;

	public List<TransportDetail> getTransportDetail() {
		return transportDetail;
	}

	public void setTransportDetail(List<TransportDetail> transportDetail) {
		this.transportDetail = transportDetail;
	}

	@Override
	public String toString() {
		return "Transport [transportDetail=" + transportDetail
				+ ", getTransportDetail()=" + getTransportDetail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
