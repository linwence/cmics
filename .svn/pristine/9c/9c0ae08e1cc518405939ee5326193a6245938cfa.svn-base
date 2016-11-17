package com.el.cmic.mapper.orderback;

import com.el.cmic.domain.orderback.SpdOrderBack;
import com.el.cmic.domain.orderback.SpdOrderBackDetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by king_ on 2016/11/9.
 */
@Repository(value = "spdOrderBackMapper")
public interface SpdOrderBackMapper {
    final class SqlProvider extends SQL{
        public String selectAllVe8dd001(String schema){
            SELECT("e8spdid");
            SELECT(" '000003' as e8psdw");//测试使用
            //SELECT("e8psdw");
            SELECT("e8psdwn");
            SELECT("e8yhyye");
            SELECT("e8yhyyn");

            SELECT("e8yhkse");
            SELECT("e8yhksn");
            SELECT("e8shks");
            SELECT("e8shksn");
            SELECT("e8cgdd");

            SELECT("e8qglx");
            SELECT("(to_date(trunc(e8xtsj/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( e8xtsj, 1000)-1) AS e8xtsj");

            SELECT("e8ddzhs");

            SELECT("doco");
            SELECT("kcoo");
            SELECT("dcto");

            SELECT("'"+schema+"'as schema" );

            FROM(schema+".VE8DD001");
            return toString();
        }
        public String selectVe8dd002(@Param("kco") String kco,@Param("doc") BigDecimal doc,@Param("dct") String dct,@Param("schem")String schem){
            SELECT("lnid");
            SELECT("e8yljgd");
            SELECT("e8ksd");
            SELECT("doco");
            SELECT("e8fhdbh");

            SELECT("e8ydh");
            SELECT("trdj");
            SELECT("e8yyyce");
            SELECT("e8yyycn");
            SELECT("e8spdgg");

            SELECT("e8sccs");
            SELECT("e8spdcd");
            SELECT("e8spddw");
            SELECT("lot1");
            SELECT("lot2");

            SELECT("(to_date(trunc(mmej/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( mmej, 1000)-1) AS mmej");

            SELECT("(to_date(trunc(scrq/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( scrq, 1000)-1) AS scrq");

            SELECT("e8spdbz");
            SELECT("uorg");
            SELECT("uprc");

            SELECT("ckkq");
            SELECT("(to_date(trunc(addj/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( addj, 1000)-1) AS addj");

            SELECT("sm");
            SELECT("tm");
            SELECT("dlbz");

            SELECT("fph");
            SELECT("(to_date(trunc(fprq/1000)  +1900||'-01-01','yyyy-MM-dd')+mod( fprq, 1000)-1) AS fprq");

            SELECT("dcto");

            SELECT("kcoo");


            FROM(schem+".Ve8dd002");
            WHERE("kcoo = #{kco}");
            WHERE("dcto = #{dct}");
            WHERE("doco = #{doc}");
            return toString();
        }
        public String updateF4211(@Param("schema") String schema,@Param("status") String status,@Param("kcoo") String kcoo,
                                  @Param("dcto") String  dcto,@Param("doco") BigDecimal doco,@Param("lnid") BigDecimal lnid){
            UPDATE(schema+".F4211");
            SET("SDNXTR=#{status}");
            WHERE("trim(SDKCOO)=#{kcoo}");
            WHERE("trim(SDDCTO)=#{dcto}");
            WHERE("trim(SDDOCO)=#{doco}");
            WHERE("trim(SDLNID)=#{lnid}");
            return toString();
        }

    }
    @SelectProvider(type=SqlProvider.class, method="selectAllVe8dd001")
    @Results({
            @Result(column = "e8spdid",property = "e8spdid"),
            @Result(column = "e8psdw",property = "e8psdw"),
            @Result(column = "e8psdwn",property = "e8psdwn"),
            @Result(column = "e8yhyye",property = "e8yhyye"),
            @Result(column = "e8yhyyn",property = "e8yhyyn"),

            @Result(column = "e8yhkse",property = "e8yhkse"),
            @Result(column = "e8yhksn",property = "e8yhksn"),
            @Result(column = "e8shks",property = "e8shks"),
            @Result(column = "e8shksn",property = "e8shksn"),
            @Result(column = "e8cgdd",property = "e8cgdd"),

            @Result(column = "e8qglx",property = "e8qglx"),
            @Result(column = "e8xtsj",property = "e8xtsj"),
            @Result(column = "e8ddzhs",property = "e8ddzhs"),

            @Result(column = "doco",property = "doco"),
            @Result(column = "dcto",property = "dcto"),
            @Result(column = "kcoo",property = "kcoo"),

            @Result(property = "spdOrderBackDetailList", column = "{kco=KCOO,dct=DCTO,doc=DOCO,schem = schema}", javaType = List.class,
                    many = @Many(select = "selectVe8dd002"))
    })
    List<SpdOrderBack> selectAllVe8dd001(String schema);


    @SelectProvider(type=SqlProvider.class, method="selectVe8dd002")
    @Results({
            @Result(column = "lnid",property = "lnid"),
            @Result(column = "e8yljgd",property = "e8yljgd"),
            @Result(column = "e8ksd",property = "e8ksd"),
            @Result(column = "doco",property = "doco"),
            @Result(column = "e8fhdbh",property = "e8fhdbh"),


            @Result(column = "e8ydh",property = "e8ydh"),
            @Result(column = "trdj",property = "trdj"),
            @Result(column = "e8yyyce",property = "e8yyyce"),
            @Result(column = "e8yyycn",property = "e8yyycn"),
            @Result(column = "e8spdgg",property = "e8spdgg"),

            @Result(column = "e8sccs",property = "e8sccs"),
            @Result(column = "e8spdcd",property = "e8spdcd"),
            @Result(column = "e8spddw",property = "e8spddw"),
            @Result(column = "lot1",property = "lot1"),
            @Result(column = "lot2",property = "lot2"),

            @Result(column = "mmej",property = "mmej"),
            @Result(column = "scrq",property = "scrq"),
            @Result(column = "e8spdbz",property = "e8spdbz"),
            @Result(column = "uorg",property = "uorg"),
            @Result(column = "uprc",property = "uprc"),


            @Result(column = "ckkq",property = "ckkq"),
            @Result(column = "addj",property = "addj"),
            @Result(column = "sm",property = "sm"),
            @Result(column = "tm",property = "tm"),
            @Result(column = "dlbz",property = "dlbz"),

            @Result(column = "fph",property = "fph"),
            @Result(column = "fprq",property = "fprq"),

            @Result(column = "dcto",property = "dcto"),
            @Result(column = "kcoo",property = "kcoo")


    })
    List<SpdOrderBackDetail> selectVe8dd002(@Param("kco") String kco,@Param("doc") BigDecimal doc,@Param("dct") String dct,@Param("schem")String schem);

    @UpdateProvider(type=SqlProvider.class, method="selectVe8dd002")
    int updateF4211(@Param("schema") String schema,@Param("status") String status,@Param("kcoo") String kcoo,@Param("dcto") String  dcto,@Param("doco") BigDecimal doco,@Param("lnid") BigDecimal lnid);
}
