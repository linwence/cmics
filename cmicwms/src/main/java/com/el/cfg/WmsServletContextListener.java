package com.el.cfg;

import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/31.
 * 定时任务，调用wms接口
 */
public class WmsServletContextListener implements ServletContextListener {

    private TimerTask wmsTimeTask;
    private Timer timer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
        wmsTimeTask = (TimerTask) webApplicationContext.getBean("wmsTimeTask");
        WmsConfigInfo wmsConfigInfo = (WmsConfigInfo) webApplicationContext.getBean("wmsConfigInfo");
        String wmsTimer = wmsConfigInfo.getWmsTimer();
        if (StringUtils.isEmpty(wmsTimer)) {
            wmsTimer = "300";
        }
        int internalTime = Integer.parseInt(wmsTimer);
        timer = new Timer(true);
        timer.schedule(wmsTimeTask,internalTime * 1000, internalTime * 1000);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
