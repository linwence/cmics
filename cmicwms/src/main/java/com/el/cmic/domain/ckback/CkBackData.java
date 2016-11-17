package com.el.cmic.domain.ckback;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Vincent on 2016/10/26.
 */
public class CkBackData {
    @JSONField(name = "接口数据")
    private CkBackOrder ckBackOrder;

    public CkBackOrder getCkBackOrder() {
        return ckBackOrder;
    }

    public void setCkBackOrder(CkBackOrder ckBackOrder) {
        this.ckBackOrder = ckBackOrder;
    }
}
