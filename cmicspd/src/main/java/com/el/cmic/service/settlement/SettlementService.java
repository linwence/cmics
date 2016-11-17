/**
 * 
 */
package com.el.cmic.service.settlement;

import java.util.List;

import com.el.cmic.common.domain.SpdResult;
import com.el.cmic.domain.settlement.Settlement;

/**
 * @author ELSIAN
 *
 */
public interface SettlementService {

	List<Settlement> getSettlementList();

	List<Settlement> getSettlementListWithDetails();

	public SpdResult acceptData(String data);

}
