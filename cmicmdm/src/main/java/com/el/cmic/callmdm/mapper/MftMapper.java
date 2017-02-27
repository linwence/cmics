//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.mapper;

import com.el.cfg.domain.F0101z2;
import com.el.cmic.callmdm.domain.RqM001InputMfr;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

public interface MftMapper {
    @UpdateProvider(
            type = MftMapper.SqlProvider.class,
            method = "updatef0101z2"
    )
    int updatef0101z2(@Param("schema") String var1, @Param("record") F0101z2 var2);

    @SelectProvider(
            type = MftMapper.SqlProvider.class,
            method = "mfrQry"
    )
    List<RqM001InputMfr> mfrQry(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("funcType") String var3);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String mfrQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.mfrAddQry(schema, ctlSchema):this.mfrModQry(schema, ctlSchema);
        }

        private String mfrAddQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("A.KSE8NAME AS mfname");
            this.SELECT("KSAN8 AS an8");
            this.SELECT("KSE8SCXKZ AS mflicense");
            this.SELECT("(select abmcu from " + schema + "f0101 where trim(aban8)=trim(e.szpa8)) as kcoo");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8)=trim(e.szpa8)) as creator");
            this.SELECT("TO_CHAR(to_date(trunc(e.szurdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( e.szurdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("SZEDUS");
            this.SELECT("SZEDBT");
            this.SELECT("SZEDTN");
            this.SELECT("SZEDLN");
            this.FROM(schema + "FE80101 A");
            this.INNER_JOIN(schema + "F0101 B ON A.KSAN8=B.ABAN8");
            this.LEFT_OUTER_JOIN(schema + "f0101z2 e ON a.ksan8 = e.szan8 and e.szedsp=\'Y\' and e.sztnac=\'A\'");
            this.WHERE("trim(A.KSFLAG)=\'P\'");
            this.WHERE("trim(B.abat1)=\'MF\' ");
            return this.toString();
        }

        private String mfrModQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("SCUKID AS ukid");
            this.SELECT("SCAN8 AS an8");
            this.SELECT("SCALPH AS mfname");
            this.SELECT("Scalky AS mfcd");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'19\' and trim(drky)=trim(a.sce8cp )) as mfbrand");
            this.SELECT("SCE8SCXKZ AS mflicense");
            this.FROM(schema + "FE841005 A");
            this.WHERE("trim(A.SCFLAG)=\'P\'");
            return this.toString();
        }

        public String updatef0101z2(@Param("schema") String schema, @Param("record") F0101z2 record) {
            this.UPDATE(schema + ".F0101Z2");
            this.SET("SZURRF = #{record.szurrf}");
            this.WHERE("trim(SZEDUS) = #{record.szedus}");
            this.WHERE("trim(SZEDBT) = #{record.szedbt}");
            this.WHERE("trim(SZEDTN) = #{record.szedtn}");
            this.WHERE("trim(SZEDLN) = #{record.szedln}");
            return this.toString();
        }
    }
}
