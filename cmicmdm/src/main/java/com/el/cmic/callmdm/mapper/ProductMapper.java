//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.mapper;

import com.el.cfg.domain.F4101z1;
import com.el.cmic.callmdm.domain.RqE001InputAttachment;
import com.el.cmic.callmdm.domain.RqE001InputBE01;
import com.el.cmic.callmdm.domain.RqE001InputProductE01;
import com.el.cmic.callmdm.domain.RqE001InputProductE02;
import com.el.cmic.callmdm.domain.RqE001InputProductE03;
import com.el.cmic.callmdm.domain.RqE001InputProductE04;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

public interface ProductMapper {
    @UpdateProvider(
            type = ProductMapper.SqlProvider.class,
            method = "updatef4101z1"
    )
    int updatef4101z1(@Param("schema") String var1, @Param("record") F4101z1 var2);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productE01Qry"
    )
    List<RqE001InputProductE01> productE01QryInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("dataType") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productE02Qry"
    )
    List<RqE001InputProductE02> productE02QryInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("dataType") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productE03Qry"
    )
    List<RqE001InputProductE03> productE03QryInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("dataType") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productE04Qry"
    )
    List<RqE001InputProductE04> productE04QryInfo(@Param("schema") String var1, @Param("dataType") String var2, @Param("funcType") String var3);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productQryBInfo"
    )
    List<RqE001InputBE01> productQryBInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("litm") String var3);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productModQryBInfo"
    )
    List<RqE001InputBE01> productModQryBInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("ukidp") String var3, @Param("co") String var4);

    @SelectProvider(
            type = ProductMapper.SqlProvider.class,
            method = "productAddQryAInfo"
    )
    List<RqE001InputAttachment> productAddQryAInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("gdtxky") String var3);

    public static final class SqlProvider extends SQL {
        private static final String PRODUCT_E01_QRY = "productE01Qry";
        private static final String PRODUCT_E02_QRY = "productE02Qry";
        private static final String PRODUCT_E03_QRY = "productE03Qry";
        private static final String PRODUCT_E04_QRY = "productE04Qry";
        private static final String PRODUCT_QRY_B_INFO = "productQryBInfo";
        private static final String PRODUCT_MOD_QRY_B_INFO = "productModQryBInfo";

        public SqlProvider() {
        }

        public String productE01Qry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("dataType") String dataType, @Param("funcType") String funcType) {
            String strSchema = schema + ".";
            String strCtlSchema = ctlSchema + ".";
            return funcType.equals("ADD")?this.productE01AddQry(strSchema, strCtlSchema, dataType):this.productE01ModQry(strSchema, strCtlSchema, dataType);
        }

        public String productE01AddQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("dataType") String dataType) {
            this.SELECT("B.IMLITM as litm");
            this.SELECT("\'\' as productcode");
            this.SELECT("a.spe8name as productname");
            this.SELECT("a.spe8dsc2 as producttype");
            this.SELECT("E.KSE8KSTYM as pk_mfname");
            this.SELECT("a.Sporig as pk_mfcountry");
            this.SELECT("nvl((select drdl01 from " + ctlSchema + " f0005  where drsy=\'E8\' AND DRRT=\'JX\' and (TRIM(drky) = TRIM(A.Spe8jx) OR  (drky) = (A.Spe8jx))),\'.\') AS form");
            this.SELECT("b.Imdsc1 as sync");
            this.SELECT("a.Spe8pzwh as fileno");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005D WHERE drsy=\'00\' AND DRRT=\'UM\' AND trim(DRKY)=trim(b.Imuom1)) as pk_weight");
            this.SELECT("(select c.kse8scxkz from " + schema + "FE80101 c where a.span8 = C.KSAN8 and rownum = 1) as licenseno");
            this.SELECT("F.Ivcitm as Hibcode");
            this.SELECT("G.Ivcitm as gmdncode");
            this.SELECT("H.IVCITM as gs1code");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 where drsy=\'E8\' AND DRRT=\'BR\' and TRIM(drky)=TRIM(e.kse8cp)) As pk_label ");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'14\' and trim(drky)=trim(A.SPE8CPDL)) as pk_productclass");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'15\' and trim(drky)=trim(a.SPE8TSFL)) as pk_yltsfl");
            this.SELECT("a.Spe8yyks AS pk_department");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) =trim(m.sztorg)) as creator");
            this.SELECT("(case when m.szurdt > 0 then TRIM(TO_CHAR(to_date(trunc(m.szurdt / 1000) + 1900 || '-01-01','yyyy-MM-dd') + mod(m.szurdt, 1000) - 1,'yyyy-MM-dd')) else '2016-12-31' end) as creationtime");
            this.SELECT("(case when m.sztorg is not null then (select trim(to_char(abmcu)) from PRODDTA.f0101 where trim(aban8) = trim(m.sztorg)) else '000000'  end) as kcoo");
            this.SELECT("M.SZEDUS");
            this.SELECT("M.SZEDBT");
            this.SELECT("M.SZEDTN");
            this.SELECT("M.SZEDLN");
            this.FROM(schema + "FE84101 a");
            this.INNER_JOIN(schema + "F4101 b on A.SPLITM = B.IMLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON A.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "FE80101 E ON A.SPAN8=E.KSAN8");
            this.LEFT_OUTER_JOIN(schema + "F4104 F ON A.SPLITM=F.IVLITM AND F.Ivxrt=\'HB\'");
            this.LEFT_OUTER_JOIN(schema + "F4104 g ON A.SPLITM=g.IVLITM AND g.Ivxrt=\'GD\'");
            this.LEFT_OUTER_JOIN(schema + "F4104 H ON A.SPLITM=H.IVLITM AND H.Ivxrt=\'GS\'");
            this.LEFT_OUTER_JOIN("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN  from (select max(szedbt) as szedbt,szlitm from " + schema + "f4101z1 i where trim(i.szedct)=\'GS\' and trim(i.szedsp)=\'Y\' and trim(i.sztnac) = \'A\' and trim(i.szitbr) = 1  group by szlitm) j left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN  from " + schema + "f4101z1 k  where trim(szedct)=\'GS\' and trim(szedsp)=\'Y\' and trim(sztnac) = \'A\' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) ) m on trim(a.splitm)=trim(m.szlitm)");
            this.WHERE("A.spflag=\'P\'");
            this.WHERE("Trim(A.SPE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE01ModQry(String schema, String ctlSchema, @Param("dataType") String dataType) {
            this.SELECT("a.SQUKIDP as doco");
            this.SELECT("a.sqev01 as ev01");
            this.SELECT("a.sqlitm as litm");
            this.SELECT("a.sqkcoo as kcoo");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) = trim(a.sqpa8) ) as creator");
            this.SELECT("TO_CHAR(to_date(trunc(a.squrdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( a.squrdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("a.Sqaitm as productcode");
            this.SELECT("a.sqdsc2 as producttype");
            this.SELECT("a.sqe8name as productname");
            this.SELECT("E.KSE8KSTYM as pk_mfname");
            this.SELECT("a.sqorig as pk_mfcountry");
            this.SELECT("nvl((select drdl01 from " + ctlSchema + " f0005  where drsy=\'E8\' AND DRRT=\'JX\' and (TRIM(drky) = TRIM(A.sqe8jx) OR  (drky) = (A.sqe8jx))),\'.\') AS form");
            this.SELECT("a.sqdsc1 as sync");
            this.SELECT("a.sqe8pzwh as fileno");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005D WHERE drsy=\'00\' AND DRRT=\'UM\' AND trim(DRKY)=trim(a.squom1)) as pk_weight");
            this.SELECT("a.sqdf01 as modcause");
            this.SELECT("a.sqe8scxkz  as licenseno");
            this.SELECT("F.Ivcitm as Hibcode");
            this.SELECT("G.Ivcitm as gmdncode");
            this.SELECT("H.IVCITM as gs1code");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 where drsy=\'E8\' AND DRRT=\'BR\' and TRIM(drky)=TRIM(e.kse8cp)) As pk_label ");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'14\' and trim(drky)=trim(a.sqE8CPDL)) as pk_productclass");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'15\' and trim(drky)=trim(a.sqE8TSFL)) as pk_yltsfl");
            this.SELECT("a.sqe8yyks AS pk_department");
            this.FROM(schema + "FE841001 a");
            this.LEFT_OUTER_JOIN(schema + "FE84101 b on A.SQLITM = B.SPLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON b.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "FE80101 E ON A.SQAN8=E.KSAN8");
            this.LEFT_OUTER_JOIN(schema + "F4104 F ON A.SQLITM=F.IVLITM AND F.Ivxrt=\'HB\'");
            this.LEFT_OUTER_JOIN(schema + "F4104 g ON A.SQLITM=g.IVLITM AND g.Ivxrt=\'GD\'");
            this.LEFT_OUTER_JOIN(schema + "F4104 H ON A.SQLITM=H.IVLITM AND H.Ivxrt=\'GS\'");
            this.WHERE("A.sqflag=\'P\'");
            this.WHERE("Trim(A.SqE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE02Qry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("dataType") String dataType, @Param("funcType") String funcType) {
            String strSchema = schema + ".";
            String strCtlSchema = ctlSchema + ".";
            return funcType.equals("ADD")?this.productE02AddQry(strSchema, strCtlSchema, dataType):this.productE02ModQry(strSchema, strCtlSchema, dataType);
        }

        public String productE02AddQry(String schema, String ctlSchema, @Param("dataType") String dataType) {
            this.SELECT("b.IMLITM as litm");
            this.SELECT("\'\' as productcode");
            this.SELECT("a.spe8name as productname");
            this.SELECT("a.spe8dsc2 as producttype");
            this.SELECT("E.KSE8KSTYM as mfname");
            this.SELECT("a.Sporig as pk_mfcountry");
            this.SELECT("nvl((select drdl01 from " + ctlSchema + " f0005  where drsy=\'E8\' AND   DRRT=\'JX\' and (TRIM(drky) = TRIM(A.Spe8jx) OR  (drky) = (A.Spe8jx))),\'.\') AS form");
            this.SELECT("b.Imdsc1 as sync");
            this.SELECT("a.Spe8pzwh as fileno");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005D WHERE drsy=\'00\' AND DRRT=\'UM\' AND trim(DRKY)=trim(b.Imuom1)) as pk_weight");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'29\' AND trim(DRKY)=trim(A.SPE8ZDYL)) as pk_zdypdl");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'21\' AND trim(DRKY)=trim(A.SPE8JHG)) as pk_jhg");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'32\' and trim(drky)=trim(a.SPE8ZTW)) as pk_ztw");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'33\' and trim(drky)=trim(a.SPE8GFG)) as pk_fgjyw");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'34\' and trim(drky)=trim(a.SPE8PTYP)) as pk_ptyp");
            this.SELECT(" \'\' AS basecode");
            this.SELECT(" \'\' AS customscode");
            this.SELECT(" \'\' AS atccode");
            this.SELECT(" \'\' AS atcname");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'30\' AND trim(DRKY)=trim(A.SPE8ATCDL)) as pk_atcdl");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'31\' AND trim(DRKY)=trim(A.SPE8ATCXL)) as pk_atcxl");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) =trim(m.sztorg)) as creator");
            this.SELECT("(case when m.szurdt > 0 then TRIM(TO_CHAR(to_date(trunc(m.szurdt / 1000) + 1900 || '-01-01','yyyy-MM-dd') + mod(m.szurdt, 1000) - 1,'yyyy-MM-dd')) else '2016-12-31' end) as creationtime");
            this.SELECT("(case when m.sztorg is not null then (select trim(to_char(abmcu)) from PRODDTA.f0101 where trim(aban8) = trim(m.sztorg)) else '000000'  end) as kcoo");
            this.SELECT("M.SZEDUS");
            this.SELECT("M.SZEDBT");
            this.SELECT("M.SZEDTN");
            this.SELECT("M.SZEDLN");
            this.FROM(schema + "FE84101 a");
            this.INNER_JOIN(schema + "F4101 b on A.SPLITM = B.IMLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON A.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "FE80101 E ON A.SPAN8=E.KSAN8");
            this.LEFT_OUTER_JOIN("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN  from(select max(szedbt) as szedbt,szlitm from " + schema + "f4101z1 i where trim(i.szedct)=\'GS\' and trim(i.szedsp)=\'Y\' and trim(i.sztnac) = \'A\' and trim(i.szitbr) = 1  group by szlitm) j left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN  from " + schema + "f4101z1 k  where trim(szedct)=\'GS\' and trim(szedsp)=\'Y\' and trim(sztnac) = \'A\' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) ) m on trim(a.splitm)=trim(m.szlitm)");
            this.WHERE("A.spflag=\'P\'");
            this.WHERE("Trim(A.SPE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE02ModQry(String schema, String ctlSchema, @Param("dataType") String dataType) {
            this.SELECT("a.SQUKIDP as doco");
            this.SELECT("a.sqev01 as ev01");
            this.SELECT("a.SQLITM as litm");
            this.SELECT("a.sqkcoo as kcoo");
            this.SELECT("a.sqaitm as productcode");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) = trim(a.sqpa8) ) as creator ");
            this.SELECT("TO_CHAR(to_date(trunc(a.squrdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( a.squrdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("a.sqe8name as productname");
            this.SELECT("a.sqdsc2 as producttype");
            this.SELECT("E.KSE8KSTYM as mfname");
            this.SELECT("a.sqorig as pk_mfcountry");
            this.SELECT("nvl((select drdl01 from " + ctlSchema + " f0005  where drsy=\'E8\' AND   DRRT=\'JX\' and (TRIM(drky) = TRIM(A.sqe8jx) OR  (drky) = (A.sqe8jx))),\'.\') AS form");
            this.SELECT("a.sqdsc1 as sync");
            this.SELECT("a.sqe8pzwh as fileno");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005D WHERE drsy=\'00\' AND DRRT=\'UM\' AND trim(DRKY)=trim(a.squom1)) as pk_weight");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'29\' AND trim(DRKY)=trim(A.sqe8zdyl)) as pk_zdypdl");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'21\' AND trim(DRKY)=trim(A.sqe8jhg)) as pk_jhg");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'32\' and trim(drky)=trim(a.sqe8ztw)) as pk_ztw");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'33\' and trim(drky)=trim(a.sqe8gfg)) as pk_fgjyw");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'34\' and trim(drky)=trim(a.sqe8ptyp)) as pk_ptyp");
            this.SELECT(" \'\' AS basecode");
            this.SELECT(" \'\' AS customscode");
            this.SELECT(" \'\' AS atccode");
            this.SELECT(" \'\' AS atcname");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'30\' AND trim(DRKY)=trim(A.sqe8atcdl)) as pk_atcdl");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'31\' AND trim(DRKY)=trim(A.sqe8atcxl)) as pk_atcxl");
            this.SELECT("a.sqdf01 as modcause");
            this.FROM(schema + "FE841001 a");
            this.INNER_JOIN(schema + "FE84101 b on A.SQLITM = B.SPLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON b.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "FE80101 E ON A.SQAN8=E.KSAN8");
            this.WHERE("a.sqflag=\'P\'");
            this.WHERE("Trim(a.SqE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE03Qry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("dataType") String dataType, @Param("funcType") String funcType) {
            String strSchema = schema + ".";
            String strCtlSchema = ctlSchema + ".";
            return funcType.equals("ADD")?this.productE03AddQry(strSchema, strCtlSchema, dataType):this.productE03ModQry(strSchema, strCtlSchema, dataType);
        }

        public String productE03AddQry(String schema, String strCtlSchema, @Param("dataType") String dataType) {
            this.SELECT("b.IMLITM as litm");
            this.SELECT("\'\' as productcode");
            this.SELECT("a.spe8name as productname");
            this.SELECT("a.spe8dsc2 as producttype");
            this.SELECT("F.KSE8KSTYM as mfname");
            this.SELECT("a.Sporig as pk_mfcountry");
            this.SELECT("b.Imdsc1 as sync");
            this.SELECT("(SELECT DRDL01 FROM " + strCtlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'21\' AND trim(DRKY)=trim(A.SPE8JHG)) as pk_jhg");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'32\' and trim(drky)=trim(a.SPE8ZTW)) as pk_ztw");
            this.SELECT(" E.IVCITM AS interbarcode");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'14\' and trim(drky)=trim(A.SPE8CPDL)) as pk_productclass");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'15\' and trim(drky)=trim(A.SPE8TSFL )) as pk_yltsfl");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) =trim(m.sztorg)) as creator");
            this.SELECT("(case when m.szurdt > 0 then TRIM(TO_CHAR(to_date(trunc(m.szurdt / 1000) + 1900 || '-01-01','yyyy-MM-dd') + mod(m.szurdt, 1000) - 1,'yyyy-MM-dd')) else '2016-12-31' end) as creationtime");
            this.SELECT("(case when m.sztorg is not null then (select trim(to_char(abmcu)) from PRODDTA.f0101 where trim(aban8) = trim(m.sztorg)) else '000000'  end) as kcoo");
            this.SELECT("M.SZEDUS");
            this.SELECT("M.SZEDBT");
            this.SELECT("M.SZEDTN");
            this.SELECT("M.SZEDLN");
            this.FROM(schema + "FE84101 a");
            this.INNER_JOIN(schema + "F4101 b on A.SPLITM = B.IMLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON A.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "F4104 E ON E.IVLITM=B.IMLITM AND TRIM(IVXRT)=\'IC\'");
            this.LEFT_OUTER_JOIN(schema + "FE80101 F ON A.SPAN8=F.KSAN8");
            this.LEFT_OUTER_JOIN("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN  from(select max(szedbt) as szedbt,szlitm from " + schema + "f4101z1 i where trim(i.szedct)=\'GS\' and trim(i.szedsp)=\'Y\' and trim(i.sztnac) = \'A\' and trim(i.szitbr) = 1  group by szlitm) j left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN  from " + schema + "f4101z1 k  where trim(szedct)=\'GS\' and trim(szedsp)=\'Y\' and trim(sztnac) = \'A\' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) ) m on trim(a.splitm)=trim(m.szlitm)");
            this.WHERE("A.spflag=\'P\'");
            this.WHERE("Trim(A.SPE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE03ModQry(String schema, String ctlSchema, @Param("dataType") String dataType) {
            this.SELECT("a.SQUKIDP as doco");
            this.SELECT("a.sqev01 as ev01");
            this.SELECT("a.sqlitm as litm");
            this.SELECT("a.sqkcoo as kcoo");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) = trim(a.sqpa8) ) as creator ");
            this.SELECT("TO_CHAR(to_date(trunc(a.squrdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( a.squrdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("a.sqaitm as productcode");
            this.SELECT("a.sqe8name as productname");
            this.SELECT("a.sqdsc2 as producttype");
            this.SELECT("F.KSE8KSTYM as mfname");
            this.SELECT("a.sqorig as pk_mfcountry");
            this.SELECT("a.sqdsc1 as sync");
            this.SELECT("(SELECT DRDL01 FROM " + ctlSchema + "f0005 WHERE drsy=\'E8\' AND DRRT=\'21\' AND trim(DRKY)=trim(A.sqe8jhg)) as pk_jhg");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'32\' and trim(drky)=trim(a.sqe8ztw)) as pk_ztw");
            this.SELECT(" E.IVCITM AS interbarcode");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'14\' and trim(drky)=trim(a.SQE8CPDL)) as pk_productclass");
            this.SELECT(" (select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'15\' and trim(drky)=trim(a.sqE8TSFL )) as pk_yltsfl");
            this.SELECT("a.sqdf01 as modcause");
            this.FROM(schema + "FE841001 a");
            this.INNER_JOIN(schema + "FE84101 b on A.SQLITM = B.SPLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON b.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN(schema + "F4104 E ON E.IVLITM=B.SPLITM AND TRIM(IVXRT)=\'IC\'");
            this.LEFT_OUTER_JOIN(schema + "FE80101 F ON A.SqAN8=F.KSAN8");
            this.WHERE("A.sqflag=\'P\'");
            this.WHERE("Trim(A.SqE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE04Qry(@Param("schema") String schema, @Param("dataType") String dataType, @Param("funcType") String funcType) {
            String strSchema = schema + ".";
            return funcType.equals("ADD")?this.productE04AddQry(strSchema, dataType):this.productE04ModQry(strSchema, dataType);
        }

        public String productE04AddQry(String schema, @Param("dataType") String dataType) {
            this.SELECT("b.IMLITM as litm");
            this.SELECT("\'\' as productcode");
            this.SELECT("a.spe8name as servicename");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) =trim(m.sztorg)) as creator");
            this.SELECT("(case when m.szurdt > 0 then TRIM(TO_CHAR(to_date(trunc(m.szurdt / 1000) + 1900 || '-01-01','yyyy-MM-dd') + mod(m.szurdt, 1000) - 1,'yyyy-MM-dd')) else '2016-12-31' end) as creationtime");
            this.SELECT("(case when m.sztorg is not null then (select trim(to_char(abmcu)) from PRODDTA.f0101 where trim(aban8) = trim(m.sztorg)) else '000000'  end) as kcoo");
            this.SELECT("M.SZEDUS");
            this.SELECT("M.SZEDBT");
            this.SELECT("M.SZEDTN");
            this.SELECT("M.SZEDLN");
            this.FROM(schema + "FE84101 a");
            this.INNER_JOIN(schema + "F4101 b on A.SPLITM = B.IMLITM");
            this.LEFT_OUTER_JOIN(schema + "F0101 D ON A.SPAN8 = d.aban8");
            this.LEFT_OUTER_JOIN("(select l.sztorg,l.szlitm,l.szedbt,l.szurdt,l.SZEDUS,  l.SZEDTN, l.SZEDLN  from(select max(szedbt) as szedbt,szlitm from " + schema + "f4101z1 i where trim(i.szedct)=\'GS\' and trim(i.szedsp)=\'Y\' and trim(i.sztnac) = \'A\' and trim(i.szitbr) = 1  group by szlitm) j left join (select distinct sztorg,szlitm,szedbt,szurdt,SZEDUS,  SZEDTN, SZEDLN  from " + schema + "f4101z1 k  where trim(szedct)=\'GS\' and trim(szedsp)=\'Y\' and trim(sztnac) = \'A\' and trim(szitbr) = 1) l on trim(j.szlitm) = trim(l.szlitm) and trim(j.szedbt) = trim(l.szedbt) ) m on trim(a.splitm)=trim(m.szlitm)");
            this.WHERE("A.spflag=\'P\'");
            this.WHERE("Trim(A.SPE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productE04ModQry(String schema, @Param("dataType") String dataType) {
            this.SELECT("a.SQUKIDP as doco");
            this.SELECT("a.sqev01 as ev01");
            this.SELECT("a.sqLITM as litm");
            this.SELECT("a.sqkcoo as kcoo");
            this.SELECT("a.sqaitm as productcode");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) = trim(a.sqpa8) ) as creator");
            this.SELECT("TO_CHAR(to_date(trunc(a.squrdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( a.squrdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("a.sqe8name as servicename");
            this.SELECT("a.sqdf01 as modcause");
            this.FROM(schema + "FE841001 a");
            this.WHERE("A.sqflag=\'P\'");
            this.WHERE("Trim(A.SqE8SPXZ)=#{dataType}");
            return this.toString();
        }

        public String productQryBInfo(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("litm") String litm) {
            String strSchema = schema + ".";
            String strCtlSchema = ctlSchema + ".";
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'28\' and trim(drky)=trim(a.ZZE8ZZLXA )) as pk_licensetype");
            this.SELECT("A.ZZE8ZZBM AS licenseno");
            this.SELECT("TO_CHAR(to_date(trunc(ZZEXDJ/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( ZZEXDJ, 1000)-1,\'yyyy-MM-dd\') AS todate");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'18\' and trim(drky)=trim(b.SPE8FXDJ )) as fxdj");
            this.SELECT("\'N\' AS iscqyx");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'19\' and trim(drky)=trim(b.SPE8CCTJ )) as cctj");
            this.SELECT("B.SPE8QTCC AS qtcctj");
            this.SELECT("B.SPE8CPFL AS pk_productclass");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'35\' and trim(drky)=trim(b.SPE8JGG )) as pk_jgg");
            this.SELECT("A.ZZCO as co");
            this.FROM(strSchema + "FE84101Z A");
            this.INNER_JOIN(strSchema + "FE84101 B  ON A.ZZLITM = B.SPLITM");
            this.WHERE("TRIM(A.ZZLITM) =#{litm}");
            return this.toString();
        }

        public String productModQryBInfo(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("ukidp") String ukidp, @Param("co") String co) {
            String strSchema = schema + ".";
            String strCtlSchema = ctlSchema + ".";
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'28\' and trim(drky)=trim(a.ZZE8ZZLXA )) as pk_licensetype");
            this.SELECT("A.ZZE8ZZBM AS licenseno");
            this.SELECT("TO_CHAR(to_date(trunc(ZZEXDJ/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( ZZEXDJ, 1000)-1,\'yyyy-MM-dd\') AS todate");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'18\' and trim(drky)=trim(b.SqE8FXDJ )) as fxdj");
            this.SELECT("\'N\' AS iscqyx");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'19\' and trim(drky)=trim(b.SQE8CCTJ )) as cctj");
            this.SELECT("B.SqE8QTCC AS qtcctj");
            this.SELECT("B.SqE8CPFL AS pk_productclass");
            this.SELECT(" (select drdl01 from " + strCtlSchema + "f0005  where drsy=\'E8\' AND DRRT=\'35\' and trim(drky)=trim(b.SQE8JGG )) as pk_jgg");
            this.SELECT("a.zzco as co");
            this.FROM(strSchema + "FE841002 A");
            this.INNER_JOIN(strSchema + "FE841001 B  ON A.ZZUKIDP = B.SQUKIDP");
            this.WHERE("TRIM(A.ZZUKIDP) =#{ukidp}");
            this.WHERE(" a.zzev02=\'Y\'");
            this.WHERE("Trim(a.zzco) = #{co}");
            return this.toString();
        }

        public String productAddQryAInfo(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("gdtxky") String gdtxky) {
            this.SELECT("GDGTITNM as filename2");
            this.SELECT("GDGTFILENM as filepath");
            this.FROM(schema + ".F00165");
            this.WHERE("Trim(GDGTMOTYPE) = 5");
            this.WHERE("Trim(GDOBNM) = \'GTE842016\'");
            this.WHERE("Trim(GDTXKY) = #{gdtxky}");
            return this.toString();
        }

        public String updatef4101z1(@Param("schema") String schema, @Param("record") F4101z1 record) {
            this.UPDATE(schema + ".F4101z1");
            this.SET("SZIFLA = #{record.szifla}");
            this.WHERE("trim(SZEDUS) = #{record.szedus}");
            this.WHERE("trim(SZEDBT) = #{record.szedbt}");
            this.WHERE("trim(SZEDTN) = #{record.szedtn}");
            this.WHERE("trim(SZEDLN) = #{record.szedln}");
            return this.toString();
        }
    }
}
