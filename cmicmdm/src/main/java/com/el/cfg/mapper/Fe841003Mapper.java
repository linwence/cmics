package com.el.cfg.mapper;

import com.el.cfg.domain.Fe841003;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Fe841003Mapper {
    @Select({
        "select",
        "SQUKID, SQAN8, SQALPH, SQE8NAME, SQEV01, SQALKY, SQFML, SQCTR, SQADDS, SQCTY1, ",
        "SQCOUN, SQE8SCS, SQE8JXS, SQE8JKS, SQE8YY, SQE8YLJG, SQE8GR, SQE8QT, SQE8DL, ",
        "SQE8XL, SQE8YYYL, SQE8YYGL, SQE8YYSB, SQE8YYGS, SQE8YLJB, SQE8TGYF, SQE8DWXZ, ",
        "SQE8YYNSR, SQE8SFZ, SQETAFI, SQACD01, SQACD02, SQAA25, SQAAFE, SQA101, SQA102, ",
        "SQA103, SQA104, SQA105, SQA106, SQA107, SQACD03, SQACD04, SQA108, SQA109, SQA110, ",
        "SQACD05, SQACD06, SQA111, SQACD07, SQAAFC, SQAA18, SQE8JYCS, SQE8CKDZ, SQE8FR, ",
        "SQE8QYFZR, SQE8YWLXR, SQA427, SQE8TYM, SQCNEM, SQCNICL, SQCNYP, SQKCOO, SQE8SPLX, ",
        "SQTRDJ, SQA202, SQPP01, SQA203, SQABST, SQURCD, SQURDT, SQURAT, SQURAB, SQEV02, ",
        "SQURRF, SQEV03, SQDL01, SQEV04, SQEV05, SQDL02, SQDL03, SQDL011, SQDL010, SQUSER, ",
        "SQPID, SQJOBN, SQUPMJ, SQUPMT, SQIDATE, SQDF01, SQRDATE, SQDF02, SQSTATUS, SQFLAG, ",
        "SQPA8, SQE8CP, SQE8KPDZ",
        "from FE841003",
        "where SQUKID = #{squkid,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="SQUKID", property="squkid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SQAN8", property="sqan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQALPH", property="sqalph", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8NAME", property="sqe8name", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV01", property="sqev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQALKY", property="sqalky", jdbcType=JdbcType.NCHAR),
        @Result(column="SQFML", property="sqfml", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCTR", property="sqctr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQADDS", property="sqadds", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCTY1", property="sqcty1", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCOUN", property="sqcoun", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8SCS", property="sqe8scs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JXS", property="sqe8jxs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JKS", property="sqe8jks", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YY", property="sqe8yy", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YLJG", property="sqe8yljg", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8GR", property="sqe8gr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8QT", property="sqe8qt", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8DL", property="sqe8dl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8XL", property="sqe8xl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYYL", property="sqe8yyyl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYGL", property="sqe8yygl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYSB", property="sqe8yysb", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYGS", property="sqe8yygs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YLJB", property="sqe8yljb", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8TGYF", property="sqe8tgyf", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8DWXZ", property="sqe8dwxz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYNSR", property="sqe8yynsr", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQE8SFZ", property="sqe8sfz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQETAFI", property="sqetafi", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD01", property="sqacd01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD02", property="sqacd02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAA25", property="sqaa25", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAAFE", property="sqaafe", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA101", property="sqa101", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA102", property="sqa102", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA103", property="sqa103", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA104", property="sqa104", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA105", property="sqa105", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA106", property="sqa106", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA107", property="sqa107", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD03", property="sqacd03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD04", property="sqacd04", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA108", property="sqa108", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA109", property="sqa109", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA110", property="sqa110", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD05", property="sqacd05", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD06", property="sqacd06", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA111", property="sqa111", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD07", property="sqacd07", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAAFC", property="sqaafc", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQAA18", property="sqaa18", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JYCS", property="sqe8jycs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8CKDZ", property="sqe8ckdz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8FR", property="sqe8fr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8QYFZR", property="sqe8qyfzr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YWLXR", property="sqe8ywlxr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA427", property="sqa427", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8TYM", property="sqe8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNEM", property="sqcnem", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNICL", property="sqcnicl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNYP", property="sqcnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="SQKCOO", property="sqkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8SPLX", property="sqe8splx", jdbcType=JdbcType.NCHAR),
        @Result(column="SQTRDJ", property="sqtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQA202", property="sqa202", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPP01", property="sqpp01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA203", property="sqa203", jdbcType=JdbcType.NCHAR),
        @Result(column="SQABST", property="sqabst", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURCD", property="squrcd", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURDT", property="squrdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQURAT", property="squrat", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQURAB", property="squrab", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQEV02", property="sqev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURRF", property="squrrf", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV03", property="sqev03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL01", property="sqdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV04", property="sqev04", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV05", property="sqev05", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL02", property="sqdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL03", property="sqdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL011", property="sqdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL010", property="sqdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="SQUSER", property="squser", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPID", property="sqpid", jdbcType=JdbcType.NCHAR),
        @Result(column="SQJOBN", property="sqjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="SQUPMJ", property="squpmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQUPMT", property="squpmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQIDATE", property="sqidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQDF01", property="sqdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQRDATE", property="sqrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQDF02", property="sqdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQSTATUS", property="sqstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SQFLAG", property="sqflag", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPA8", property="sqpa8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQE8CP", property="sqe8cp", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8KPDZ", property="sqe8kpdz", jdbcType=JdbcType.NCHAR)
    })
    Fe841003 selectByPrimaryKey(BigDecimal squkid);

    @Select({
        "select",
        "SQUKID, SQAN8, SQALPH, SQE8NAME, SQEV01, SQALKY, SQFML, SQCTR, SQADDS, SQCTY1, ",
        "SQCOUN, SQE8SCS, SQE8JXS, SQE8JKS, SQE8YY, SQE8YLJG, SQE8GR, SQE8QT, SQE8DL, ",
        "SQE8XL, SQE8YYYL, SQE8YYGL, SQE8YYSB, SQE8YYGS, SQE8YLJB, SQE8TGYF, SQE8DWXZ, ",
        "SQE8YYNSR, SQE8SFZ, SQETAFI, SQACD01, SQACD02, SQAA25, SQAAFE, SQA101, SQA102, ",
        "SQA103, SQA104, SQA105, SQA106, SQA107, SQACD03, SQACD04, SQA108, SQA109, SQA110, ",
        "SQACD05, SQACD06, SQA111, SQACD07, SQAAFC, SQAA18, SQE8JYCS, SQE8CKDZ, SQE8FR, ",
        "SQE8QYFZR, SQE8YWLXR, SQA427, SQE8TYM, SQCNEM, SQCNICL, SQCNYP, SQKCOO, SQE8SPLX, ",
        "SQTRDJ, SQA202, SQPP01, SQA203, SQABST, SQURCD, SQURDT, SQURAT, SQURAB, SQEV02, ",
        "SQURRF, SQEV03, SQDL01, SQEV04, SQEV05, SQDL02, SQDL03, SQDL011, SQDL010, SQUSER, ",
        "SQPID, SQJOBN, SQUPMJ, SQUPMT, SQIDATE, SQDF01, SQRDATE, SQDF02, SQSTATUS, SQFLAG, ",
        "SQPA8, SQE8CP, SQE8KPDZ",
        "from FE841003"
    })
    @Results({
        @Result(column="SQUKID", property="squkid", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SQAN8", property="sqan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQALPH", property="sqalph", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8NAME", property="sqe8name", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV01", property="sqev01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQALKY", property="sqalky", jdbcType=JdbcType.NCHAR),
        @Result(column="SQFML", property="sqfml", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCTR", property="sqctr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQADDS", property="sqadds", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCTY1", property="sqcty1", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCOUN", property="sqcoun", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8SCS", property="sqe8scs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JXS", property="sqe8jxs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JKS", property="sqe8jks", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YY", property="sqe8yy", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YLJG", property="sqe8yljg", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8GR", property="sqe8gr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8QT", property="sqe8qt", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8DL", property="sqe8dl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8XL", property="sqe8xl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYYL", property="sqe8yyyl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYGL", property="sqe8yygl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYSB", property="sqe8yysb", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYGS", property="sqe8yygs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YLJB", property="sqe8yljb", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8TGYF", property="sqe8tgyf", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8DWXZ", property="sqe8dwxz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YYNSR", property="sqe8yynsr", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQE8SFZ", property="sqe8sfz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQETAFI", property="sqetafi", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD01", property="sqacd01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD02", property="sqacd02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAA25", property="sqaa25", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAAFE", property="sqaafe", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA101", property="sqa101", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA102", property="sqa102", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA103", property="sqa103", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA104", property="sqa104", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA105", property="sqa105", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA106", property="sqa106", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA107", property="sqa107", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD03", property="sqacd03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD04", property="sqacd04", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA108", property="sqa108", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA109", property="sqa109", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA110", property="sqa110", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD05", property="sqacd05", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD06", property="sqacd06", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA111", property="sqa111", jdbcType=JdbcType.NCHAR),
        @Result(column="SQACD07", property="sqacd07", jdbcType=JdbcType.NCHAR),
        @Result(column="SQAAFC", property="sqaafc", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQAA18", property="sqaa18", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8JYCS", property="sqe8jycs", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8CKDZ", property="sqe8ckdz", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8FR", property="sqe8fr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8QYFZR", property="sqe8qyfzr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8YWLXR", property="sqe8ywlxr", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA427", property="sqa427", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8TYM", property="sqe8tym", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNEM", property="sqcnem", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNICL", property="sqcnicl", jdbcType=JdbcType.NCHAR),
        @Result(column="SQCNYP", property="sqcnyp", jdbcType=JdbcType.NCHAR),
        @Result(column="SQKCOO", property="sqkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8SPLX", property="sqe8splx", jdbcType=JdbcType.NCHAR),
        @Result(column="SQTRDJ", property="sqtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQA202", property="sqa202", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPP01", property="sqpp01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQA203", property="sqa203", jdbcType=JdbcType.NCHAR),
        @Result(column="SQABST", property="sqabst", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURCD", property="squrcd", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURDT", property="squrdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQURAT", property="squrat", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQURAB", property="squrab", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQEV02", property="sqev02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQURRF", property="squrrf", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV03", property="sqev03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL01", property="sqdl01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV04", property="sqev04", jdbcType=JdbcType.NCHAR),
        @Result(column="SQEV05", property="sqev05", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL02", property="sqdl02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL03", property="sqdl03", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL011", property="sqdl011", jdbcType=JdbcType.NCHAR),
        @Result(column="SQDL010", property="sqdl010", jdbcType=JdbcType.NCHAR),
        @Result(column="SQUSER", property="squser", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPID", property="sqpid", jdbcType=JdbcType.NCHAR),
        @Result(column="SQJOBN", property="sqjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="SQUPMJ", property="squpmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQUPMT", property="squpmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQIDATE", property="sqidate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQDF01", property="sqdf01", jdbcType=JdbcType.NCHAR),
        @Result(column="SQRDATE", property="sqrdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQDF02", property="sqdf02", jdbcType=JdbcType.NCHAR),
        @Result(column="SQSTATUS", property="sqstatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SQFLAG", property="sqflag", jdbcType=JdbcType.NCHAR),
        @Result(column="SQPA8", property="sqpa8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SQE8CP", property="sqe8cp", jdbcType=JdbcType.NCHAR),
        @Result(column="SQE8KPDZ", property="sqe8kpdz", jdbcType=JdbcType.NCHAR)
    })
    List<Fe841003> selectAll();
}