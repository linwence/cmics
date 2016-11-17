package com.el.cfg;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpdServletContextListener implements ServletContextListener {
	   private TimerTask spdTimeTask;
	    private Timer timer;

	    @Override
	    public void contextInitialized(ServletContextEvent sce) {
	        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
	        spdTimeTask = (TimerTask) webApplicationContext.getBean("spdTimeTask");
	        SpdConfigInfo spdConfigInfo = (SpdConfigInfo) webApplicationContext.getBean("spdConfigInfo");
	        String spdTimer = spdConfigInfo.getSpdTimer();
	        if (StringUtils.isEmpty(spdTimer)) {
	        	spdTimer = "300";
	        }
	        int internalTime = Integer.parseInt(spdTimer);
	        timer = new Timer(true);
	        timer.schedule(spdTimeTask, internalTime * 1000,internalTime * 1000);

	    }

	    @Override
	    public void contextDestroyed(ServletContextEvent sce) {

	    }
}
