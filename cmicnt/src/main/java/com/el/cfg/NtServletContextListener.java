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
 * 定时任务，调用nt接口
 */
public class NtServletContextListener implements ServletContextListener {

    private TimerTask ntTimeTask;
    private Timer timer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
        ntTimeTask = (TimerTask) webApplicationContext.getBean("ntTimeTask");
        NtConfigInfo ntConfigInfo = (NtConfigInfo) webApplicationContext.getBean("ntConfigInfo");
        String ntTimer = ntConfigInfo.getNtTimer();
        if (StringUtils.isEmpty(ntTimer)) {
            ntTimer = "300";
        }
        int internalTime = Integer.parseInt(ntTimer);
        timer = new Timer(true);
        timer.schedule(ntTimeTask, internalTime * 1000, internalTime * 1000);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
