package com.el.dev.emp.mapper;


import com.el.dev.emp.domain.Emp;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Vincent on 2016/7/15.
 */

public interface EmpMapper {

    @Select("select * from emp")
    @Results(value = {@Result(column = "empno", property = "empno"),
            @Result(column = "ename", property = "ename"),
            @Result(column = "job", property = "job"),
            @Result(column = "mgr", property = "mgr"),
            @Result(column = "hiredate", property = "hiredate"),
            @Result(column = "sal", property = "sal"),
            @Result(column = "comm", property = "comm"),
            @Result(column = "deptno", property = "deptno")}
    )
    public List<Emp> findEmpByAll();


    @Select("select * from emp where empno=#{id}")

    @Results(value = {@Result(column = "empno", property = "empno"),
            @Result(column = "ename", property = "ename"),
            @Result(column = "job", property = "job"),
            @Result(column = "mgr", property = "mgr"),
            @Result(column = "hiredate", property = "hiredate"),
            @Result(column = "sal", property = "sal"),
            @Result(column = "comm", property = "comm"),
            @Result(column = "deptno", property = "deptno")}
    )
    public List<Emp> findEmpByid(int id);
    @Update("UPDATE EMP SET COMM=#{comm} where deptno=#{deptno}")
    public void updateEmpById(Emp emp);

}
