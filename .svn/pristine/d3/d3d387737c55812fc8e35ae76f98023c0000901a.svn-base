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
        for (Emp e : empList
                ) {
            System.out.println("empno" + e.getEmpno() + ";ename:" + e.getEname());

        }
    }
}
