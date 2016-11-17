package com.el.dev.emp.domain;

/**
 * Created by Vincent on 2016/7/14.
 */
public class F4101 {
    private long imitm;
    private String imlitm;
    private String imdsc1;
    private String imdsc2;
    private String imuom1;

    public long getImitm() {
        return imitm;
    }

    public void setImitm(long imitm) {
        this.imitm = imitm;
    }

    public String getImlitm() {
        return imlitm;
    }

    public void setImlitm(String imlitm) {
        this.imlitm = imlitm;
    }

    public String getImdsc1() {
        return imdsc1;
    }

    public void setImdsc1(String imdsc1) {
        this.imdsc1 = imdsc1;
    }

    public String getImdsc2() {
        return imdsc2;
    }

    public void setImdsc2(String imdsc2) {
        this.imdsc2 = imdsc2;
    }

    public String getImuom1() {
        return imuom1;
    }

    public void setImuom1(String imuom1) {
        this.imuom1 = imuom1;
    }

    @Override
    public String toString() {
        return "F4101{" +
                "imitm=" + imitm +
                ", imlitm='" + imlitm + '\'' +
                ", imdsc1='" + imdsc1 + '\'' +
                ", imdsc2='" + imdsc2 + '\'' +
                ", imuom1='" + imuom1 + '\'' +
                '}';
    }
}
