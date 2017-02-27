package com.el.cfg.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class F00022 implements Serializable {
    /**
     *  null - CRPDTA.F00022.UKOBNM
     */
    private String ukobnm;

    /**
     *  null - CRPDTA.F00022.UKUKID
     */
    private BigDecimal ukukid;

    private static final long serialVersionUID = 1L;

    public String getUkobnm() {
        return ukobnm;
    }

    public void setUkobnm(String ukobnm) {
        this.ukobnm = ukobnm;
    }

    public BigDecimal getUkukid() {
        return ukukid;
    }

    public void setUkukid(BigDecimal ukukid) {
        this.ukukid = ukukid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ukobnm=").append(ukobnm);
        sb.append(", ukukid=").append(ukukid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}