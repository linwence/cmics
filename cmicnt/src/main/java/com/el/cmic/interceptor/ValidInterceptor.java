package com.el.cmic.interceptor;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.NtRequestParam;
import com.el.cmic.common.NtResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Vincent on 2017/2/22.
 */
@Component
public class ValidInterceptor implements HandlerInterceptor {
    Logger logger=Logger.getLogger(ValidInterceptor.class);
    @Value("${nt.userCode}")
    private String ntUserCode;
    @Value("${nt.pwd}")
    private String ntPwd;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      /* Map<String,String[]> stringMap= request.getParameterMap();
      Iterator iterator= stringMap.entrySet().iterator();
        StringBuilder stringBuilder=new StringBuilder();
        while (iterator.hasNext()){
            Map.Entry<String,String[]> entry=(Map.Entry)iterator.next();
            Object key=entry.getKey().toString();
            Object[] value=(String[])entry.getValue();
            stringBuilder.append("["+key+"]="+value[0]);


        }
        logger.info("[参数]"+stringBuilder.toString());

        String userCode = request.getParameter("userCode");
        String pwd = request.getParameter("pwd");
        NtResult ntResult = new NtResult();
        if (!ntUserCode.equals(userCode) || !ntPwd.equals(pwd)) {
            ntResult.setResultCode("-1");
            ntResult.setResultMsg("用户名或者密码不正确，请检查");
            String result = JSON.toJSONString(ntResult);
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(result);
            return false;
        }*/

      /*boolean  flag=true;
        NtResult ntResult = new NtResult();
        ntResult.setResultCode("-1");
        StringBuffer json = new StringBuffer();
        String line = null;
        BufferedReader reader = request.getReader();
        try {
            while((line = reader.readLine()) != null) {
                json.append(line);
            }
        }
        catch(Exception e) {
            flag=false;
          logger.error("获取参数失败,失败原因:"+e.getMessage());
            ntResult.setData("获取参数失败,失败原因:"+e.getMessage());
        }

        if(json==null||json.toString()==""){
            flag=false;
            ntResult.setData("参数为空");
        }

       String jsonString=json.toString();
        NtRequestParam ntRequestParam=JSON.parseObject(jsonString,NtRequestParam.class);
        if (!ntUserCode.equals(ntRequestParam.getUserCode()) || !ntPwd.equals(ntRequestParam.getPwd())) {
            flag=false;
            ntResult.setResultMsg("用户名或者密码不正确，请检查");
        }

        if(flag==false){
            String result = JSON.toJSONString(ntResult);
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(result);
            return false;
        }*/

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
