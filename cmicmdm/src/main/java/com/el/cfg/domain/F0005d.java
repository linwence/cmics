package com.el.cfg.domain;

import java.io.Serializable;

public class F0005d implements Serializable {
    /**
     *  null - F0005D.DRSY
     */
    private String drsy;

    /**
     *  null - F0005D.DRRT
     */
    private String drrt;

    /**
     *  null - F0005D.DRKY
     */
    private String drky;

    /**
     *  null - F0005D.DRLNGP
     */
    private String drlngp;

    /**
     *  null - F0005D.DRDL01
     */
    private String drdl01;

    /**
     *  null - F0005D.DRDL02
     */
    private String drdl02;

    private static final long serialVersionUID = 1L;

    public String getDrsy() {
        return drsy;
    }

    public void setDrsy(String drsy) {
        this.drsy = drsy;
    }

    public String getDrrt() {
        return drrt;
    }

    public void setDrrt(String drrt) {
        this.drrt = drrt;
    }

    public String getDrky() {
        return drky;
    }

    public void setDrky(String drky) {
        this.drky = drky;
    }

    public String getDrlngp() {
        return drlngp;
    }

    public void setDrlngp(String drlngp) {
        this.drlngp = drlngp;
    }

    public String getDrdl01() {
        return drdl01;
    }

    public void setDrdl01(String drdl01) {
        this.drdl01 = drdl01;
    }

    public String getDrdl02() {
        return drdl02;
    }

    public void setDrdl02(String drdl02) {
        this.drdl02 = drdl02;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drsy=").append(drsy);
        sb.append(", drrt=").append(drrt);
        sb.append(", drky=").append(drky);
        sb.append(", drlngp=").append(drlngp);
        sb.append(", drdl01=").append(drdl01);
        sb.append(", drdl02=").append(drdl02);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}