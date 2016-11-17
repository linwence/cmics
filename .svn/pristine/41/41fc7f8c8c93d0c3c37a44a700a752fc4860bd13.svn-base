package com.el.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Vincent on 2016/8/29.
 * jde 连接的配置文件信息
 */
@Component
public class JdeConfigInfo {
    @Value("${jde.username}")
    private String jdeUserName;
    @Value("${jde.password}")
    private String jdePassword;
    @Value("${jde.env}")
    private String jdeEnv;
    @Value("${jde.role}")
    private String jdeRole;

    public String getJdeUserName() {
        return jdeUserName;
    }

    public void setJdeUserName(String jdeUserName) {
        this.jdeUserName = jdeUserName;
    }

    public String getJdePassword() {
        return jdePassword;
    }

    public void setJdePassword(String jdePassword) {
        this.jdePassword = jdePassword;
    }

    public String getJdeEnv() {
        return jdeEnv;
    }

    public void setJdeEnv(String jdeEnv) {
        this.jdeEnv = jdeEnv;
    }

    public String getJdeRole() {
        return jdeRole;
    }

    public void setJdeRole(String jdeRole) {
        this.jdeRole = jdeRole;
    }
}
