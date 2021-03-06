package com.el.cfg;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/20.
 */
public class MdmServletContextListener implements ServletContextListener {
    private TimerTask mdmTimeTask;

    private Timer timer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
        mdmTimeTask = (TimerTask) webApplicationContext.getBean("mdmTimeTask");

        MdmConfigInfo mdmConfigInfo= (MdmConfigInfo) webApplicationContext.getBean("mdmConfigInfo");
        String mdmTimer=mdmConfigInfo.getMdmTimer();
        if(StringUtils.isEmpty(mdmTimer)){
            mdmTimer="300";
        }
        int internalTime = Integer.parseInt(mdmTimer);
        timer = new Timer(true);
        timer.schedule(mdmTimeTask, 1 * 1000,internalTime * 1000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
