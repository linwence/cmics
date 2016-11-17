package com.el.dev.emp.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Vincent on 2016/7/21.
 */
public class DeptEmpSqlProvider {
    public static final  String sql="Sql";

    public static  String Sql() {
        return new SQL() {
            {
                SELECT("*");
                FROM("dept");
                LEFT_OUTER_JOIN("emp ON dept.deptno=emp.deptno");
                WHERE("dname=#{deptname}");


            }
        }.toString();
    }
}
