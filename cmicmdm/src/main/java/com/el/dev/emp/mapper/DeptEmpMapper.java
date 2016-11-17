package com.el.dev.emp.mapper;


import com.el.dev.emp.domain.DeptEmp;
import com.el.dev.emp.domain.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Vincent on 2016/7/21.
 */
public interface DeptEmpMapper {

    @SelectProvider(type = DeptEmpSqlProvider.class, method = DeptEmpSqlProvider.sql)
    @Results({@Result(column = "deptno", property = "deptno"), @Result(column = "dname", property = "dname"), @Result(column = "loc", property = "loc"),
            @Result(property = "empList", column = "deptno", javaType = List.class, many = @Many(select = "selectEmpList"))
    })
    public List<DeptEmp> findDempEmpByID(@Param("deptname") String deptname);

    @Select("select * from emp where deptno=#{deptno}")
    @Results(value = {@Result(column = "empno", property = "empno"),
            @Result(column = "ename", property = "ename"),
            @Result(column = "job", property = "job"),
            @Result(column = "mgr", property = "mgr"),
            @Result(column = "hiredate", property = "hiredate"),
            @Result(column = "sal", property = "sal"),
            @Result(column = "comm", property = "comm"),
            @Result(column = "deptno", property = "deptno")})
    public List<Emp> selectEmpList(int deptno);
}
