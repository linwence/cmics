package com.el.cfg;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.springframework.stereotype.Component;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.apache.ibatis.type.JdbcType.CHAR;
import static org.apache.ibatis.type.JdbcType.NCHAR;

/**
 * Created by Vincent on 2016/10/13.
 */
@Component("purifyStringTypeHandler")
@MappedJdbcTypes({NCHAR, CHAR})
public class PurifyStringTypeHandler extends MyBatisBaseTypeHandler<String> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String parameter, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, parameter);
    }

    @Override
    public String getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return nullToBlank(resultSet.getString(columnName));
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return nullToBlank(resultSet.getString(columnIndex));
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return nullToBlank(callableStatement.getString(columnIndex));
    }

    private static String nullToBlank(String value) {
        return value == null ? "" : value.trim();
    }
}
