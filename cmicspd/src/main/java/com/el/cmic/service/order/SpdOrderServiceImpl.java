/**
 *
 */
package com.el.cmic.service.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.order.SpdOrder;
import com.el.cmic.domain.order.SpdOrderDetail;
import com.el.cmic.mapper.order.SpdOrderDetailMapper;
import com.el.cmic.mapper.order.SpdOrderMapper;

/**
 * @author ELSIAN
 */
@Service
public class SpdOrderServiceImpl implements SpdOrderService {

	Logger logger = Logger.getLogger(SpdOrderServiceImpl.class);

	@Autowired
	protected SpdOrderMapper spdOrderMapper;

	@Autowired
	protected SpdOrderDetailMapper spdOrderDetailMapper;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.el.cmic.service.order.SpdOrderService#getSpdOrderList()
	 */
	public List<SpdOrder> getSpdOrderList() {
		List<SpdOrder> list = spdOrderMapper.selectAll();
		if (list != null && !list.isEmpty()) {
			for (SpdOrder row : list) {
				List<SpdOrderDetail> details = spdOrderDetailMapper.selectAll();
				row.setDetails(details);
			}
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.el.cmic.service.order.SpdOrderService#getSpdOrderListWithDetails( )
	 */
	public List<SpdOrder> getSpdOrderListWithDetails() {
		List<SpdOrder> list = new ArrayList<SpdOrder>();// =
														// SpdOrderMapper.selectAllWithDetails();
		return list;
	}

	@Override
	@Transactional
	public SpdResult acceptData(String data) {
		SpdResult SpdResult = new SpdResult(true, "0000", "成功");

		SpdOrder SpdOrder = JSON.parseObject(data, SpdOrder.class);

		// SPD订单
		if (SpdOrder != null) {
			spdOrderMapper.insertFE8SPD10(SpdOrder);
			int i = 0;
			for (SpdOrderDetail detail : SpdOrder.getDetails()) {
				i += 1;
				detail.setPhrlln(new BigDecimal(i));
				spdOrderDetailMapper.insertFE8SPD11(SpdOrder, detail);
			}
		}
		return SpdResult;

	}

}
