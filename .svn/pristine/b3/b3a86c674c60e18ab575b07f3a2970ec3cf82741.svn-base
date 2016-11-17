package com.el.utils;

import com.el.cfg.JdeConfigInfo;
import com.jdedwards.system.connector.dynamic.Connector;
import com.jdedwards.system.connector.dynamic.SystemException;
import com.jdedwards.system.connector.dynamic.callmethod.BSFNExecutionWarning;
import com.jdedwards.system.connector.dynamic.callmethod.ExecutableMethod;
import com.jdedwards.system.connector.dynamic.spec.source.BSFNSpecSource;
import com.jdedwards.system.connector.dynamic.spec.source.OneworldBSFNSpecSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Vincent on 2016/8/29.
 * 用来调用jde函数的
 */
@Component
public class JdeBsfn {
    Logger logger = LoggerFactory.getLogger(JdeBsfn.class);
    @Autowired
    private JdeConfigInfo jdeConfigInfo;//jde的配置信息

    public Map call(String methodName, Map params) throws Exception {
        Map result = null;
        //参数类型转换
        for (Object key : params.keySet()) {
            Object o = params.get(key);
            if (o instanceof Integer || o instanceof Long || o instanceof
                    Double) {
                params.put(key, o.toString());
            } else if (o instanceof Date) {
                Date d = (Date) o;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String dateVal = sdf.format(d);
                params.put(key, dateVal);
            }
        }
        //调用BSFN
        try {
            result = callTheFunc(methodName, params);

        } catch (SystemException e) {
            e.printStackTrace();
            logger.error("调用JDE函数失败", e);
        }

        return result;

    }

    /**
     * 从别的项目移植过来，调用JDE函数
     *
     * @param methodName
     * @param params
     * @return
     * @throws SystemException
     */
    private Map callTheFunc(String methodName, Map params) throws
            SystemException {
        Connector connector = Connector.getInstance();

        String userName = jdeConfigInfo.getJdeUserName();
        String password = jdeConfigInfo.getJdePassword();
        String jdeEnv = jdeConfigInfo.getJdeEnv();
        String jdeRole = jdeConfigInfo.getJdeRole();

        int sessionIdInt = connector.login(userName.toUpperCase(), password,
                jdeEnv, jdeRole);

        BSFNSpecSource specSource = new
                OneworldBSFNSpecSource(sessionIdInt);
        ExecutableMethod method = specSource.getBSFNMethod(methodName)
                .createExecutable();
        method.resetValues();
        method.setValues(params);
        BSFNExecutionWarning warning = null;
        try {
            warning = method.execute(sessionIdInt);
        } catch (Exception ex) {
            ex.printStackTrace();
            connector.logoff(sessionIdInt);
            Map result = method.getValues();
            connector.logoff(sessionIdInt);
            logger.error("调用jde函数失败:", ex);
            return result;
        }
        Map result = method.getValues();
        connector.logoff(sessionIdInt);
        return result;
    }
}
