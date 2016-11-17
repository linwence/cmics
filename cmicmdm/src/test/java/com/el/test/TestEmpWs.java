package com.el.test;





import com.el.client.Emp;
import com.el.client.EmpWsService;
import com.el.client.EmpWsServiceImplService;

import java.util.List;

/**
 * Created by Vincent on 2016/8/31.
 */
public class TestEmpWs {
    public static void main(String[] args) {
        EmpWsServiceImplService empWsServiceImplService = new EmpWsServiceImplService();
        EmpWsService empWsService = empWsServiceImplService.getEmpWsServiceImplPort();
        List<Emp> empList = empWsService.reqEmps();
        String xml=empWsService.reqEmpString("111111");
        System.out.println(xml);
        for (Emp e : empList
                ) {
            System.out.println("调用webservice成功：empno" + e.getEmpno() + ";ename:" + e.getEname());

        }
    }
}
