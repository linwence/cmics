package com.el.cmic.timetask;

import com.el.cmic.callmdm.service.CallMdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

/**
 * Created by Vincent on 2016/10/20.
 */
@Component
public class MdmTimeTask extends TimerTask {
    @Autowired
    private CallMdmService rqECallMdmServiceImpl;
    @Autowired
    private CallMdmService rqCCallMdmServiceImpl;
    @Autowired
    private CallMdmService rqMCallMdmServiceImpl;

    @Override
    public void run() {
        rqMCallMdmServiceImpl.addCallWS();
        rqMCallMdmServiceImpl.updateCallWS();

        rqCCallMdmServiceImpl.addCallWS();
        rqCCallMdmServiceImpl.updateCallWS();

        rqECallMdmServiceImpl.addCallWS();
        rqECallMdmServiceImpl.updateCallWS();


    }
}
