//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.callmdm.mapper;

import com.el.cfg.domain.F0101z2;
import com.el.cmic.callmdm.domain.RqC001InputBC01;
import com.el.cmic.callmdm.domain.RqC001InputCsc;
import com.el.cmic.callmdm.domain.RqC001InputCustomC01;
import com.el.cmic.callmdm.domain.RqC001InputGR;
import com.el.cmic.callmdm.domain.RqC001InputJXS;
import com.el.cmic.callmdm.domain.RqC001InputJks;
import com.el.cmic.callmdm.domain.RqC001InputQT;
import com.el.cmic.callmdm.domain.RqC001InputYYOrJcyljg;
import com.el.cmic.callmdm.domain.RqE001InputAttachment;
import com.el.utils.ReadPropertiesUtil;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

public interface CustomerMapper {
    String schema = ReadPropertiesUtil.getPropertyValue("/config/db.properties", "schema");

    @UpdateProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "updatef0101z2"
    )
    int updatef0101z2(@Param("schema") String var1, @Param("record") F0101z2 var2);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customAddQryAInfo"
    )
    List<RqE001InputAttachment> customAddQryAInfo(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("gdtxky") String var3);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customQry"
    )
    List<RqC001InputCustomC01> customQry(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("funcType") String var3);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customBQry"
    )
    List<RqC001InputBC01> customBQry(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("an8") String var3, @Param("funcType") String var4, @Param("doco") String var5);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customCscQry"
    )
    RqC001InputCsc customCscQry(@Param("an8") String var1, @Param("schema") String var2, @Param("ctlSchema") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customJxsQry"
    )
    RqC001InputJXS customJXSQry(@Param("an8") String var1, @Param("schema") String var2, @Param("ctlSchema") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customJksQry"
    )
    RqC001InputJks customJksQry(@Param("an8") String var1, @Param("schema") String var2, @Param("ctlSchema") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customYyOrJcyljgQry"
    )
    RqC001InputYYOrJcyljg customYyOrJcyljgQry(@Param("schema") String var1, @Param("ctlSchema") String var2, @Param("an8") String var3, @Param("funcType") String var4);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customGrQry"
    )
    RqC001InputGR customGr(@Param("an8") String var1, @Param("schema") String var2, @Param("funcType") String var3);

    @SelectProvider(
            type = CustomerMapper.SqlProvider.class,
            method = "customQtQry"
    )
    RqC001InputQT customQt(@Param("schema") String var1, @Param("an8") String var2, @Param("ctlSchema") String var3, @Param("funcType") String var4);

    public static final class SqlProvider extends SQL {
        final String issczcz001;
        final String isbapz002;
        final String isylqxjyxkz003;
        final String isbapz004;
        final String isbgz005;
        final String isqyba006;
        final String isyljgz007;
        final String ISYYZZ008;
        final String ISZZJGDM009;
        final String ISSWDJZ010;
        final String ISXBYYZZ011;
        static final String CUSTOM_QRY = "customQry";
        static final String CUSTOM_B_QRY = "customBQry";
        static final String CUSTOM_CSC_QRY = "customCscQry";
        static final String CUSTOM_JXS_QRY = "customJxsQry";
        static final String CUSTOM_JKS_QRY = "customJksQry";
        static final String CUSTOM_YyOrJcyljg_QRY = "customYyOrJcyljgQry";
        static final String CUSTOM_GR_QRY = "customGrQry";
        static final String CUSTOM_QT_QRY = "customQtQry";

        public SqlProvider() {
            this.issczcz001 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'001\', \'001-1\', \'001-2\')and a.zzan8 = #{an8}) when 0 then \'N\'else \'Y\' end as Issczcz";
            this.isbapz002 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'002\')  and a.zzan8 = #{an8})  when 0 then    \'N\'   else    \'Y\'  end as isbapz";
            this.isylqxjyxkz003 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'003\', \'003-1\', \'003-2\') and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\'end as isylqxjyxkz";
            this.isbapz004 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'004\') and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\' end as isbapz";
            this.isbgz005 = " case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'005\') and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\' end as isbgz";
            this.isqyba006 = "case (select count(1)  from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'006\') and a.zzan8 =  #{an8}) when 0 then  \'N\' else \'Y\' end as isqyba";
            this.isyljgz007 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'007\') and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\'end as isyljgz";
            this.ISYYZZ008 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'008\') and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\'end as isyyzz";
            this.ISZZJGDM009 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'009\')and a.zzan8 = #{an8}) when 0 then \'N\'else \'Y\' end as iszzjgdm";
            this.ISSWDJZ010 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'010\')and a.zzan8 = #{an8}) when 0 then \'N\' else \'Y\' end as isswdjz";
            this.ISXBYYZZ011 = "case (select count(1) from " + CustomerMapper.schema + ".FE80101Z a where a.zze8zzlxa in (\'011\') and a.zzan8 = #{an8}) when 0 then  \'N\' else \'Y\'end as Isxbyyzz";
        }

        public String customQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddQry(schema, ctlSchema):this.customModQry(schema, ctlSchema);
        }

        private String customAddQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("a.ksan8 as an8");
            this.SELECT("\'\' as custcode");
            this.SELECT("a.kse8name as custname");
            this.SELECT("b.alctr as pk_country");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'00\' AND   A.DRRT=\'S\' and TRIM(a.drky)=TRIM(b.Aladds)) as pk_szq");
            this.SELECT("b.alcty1 as pk_counties");
            this.SELECT("b.alcoun as pk_cities");
            this.SELECT("b.aladd1 || b.aladd2 || b.aladd3 || b.aladd4 as address");
            this.SELECT("\'\' as gycode");
            this.SELECT("a.kse8scs as isscs");
            this.SELECT("a.kse8jxs as isjxs");
            this.SELECT("a.kse8jks as isjks");
            this.SELECT("a.kse8yy as isyy");
            this.SELECT("a.kse8yljg as isjcyljg");
            this.SELECT("a.kse8gr as isgr");
            this.SELECT("a.kse8qt as isqt");
            this.SELECT("c.abmcu as kcoo");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8)=trim(E.szurat/100)) as creator");
            this.SELECT("TO_CHAR(to_date(trunc(e.szurdt/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( e.szurdt, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("SZEDUS");
            this.SELECT("SZEDBT");
            this.SELECT("SZEDTN");
            this.SELECT("SZEDLN");
            this.FROM(schema + "FE80101 a");
            this.LEFT_OUTER_JOIN(schema + "f0116 b ON a.ksan8 = b.alan8");
            this.LEFT_OUTER_JOIN(schema + "f0101 c ON a.ksan8 = c.aban8");
            this.LEFT_OUTER_JOIN(schema + "f0101z2 e ON a.ksan8 = e.szan8 and e.szedsp=\'Y\' and e.sztnac=\'A\'");
            this.WHERE("a.ksflag = \'P\' and (trim(c.abat1)=\'C\' or trim(c.abat1)=\'V\')");
            return this.toString();
        }

        private String customModQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("a.squkid as ukid");
            this.SELECT("a.sqev01 as ev01");
            this.SELECT("a.sqan8 as an8");
            this.SELECT("a.sqkcoo as kcoo");
            this.SELECT(" a.SQALKY as custcode");
            this.SELECT("(select abalph from " + schema + "f0101 where trim(aban8) = trim(a.sqpa8) ) as creator");
            this.SELECT("TO_CHAR(to_date(trunc(a.sqtrdj/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( a.sqtrdj, 1000)-1,\'yyyy-MM-dd\') as creationtime");
            this.SELECT("a.sqe8name as custname");
            this.SELECT("a.sqctr as pk_country");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'00\' AND   A.DRRT=\'S\' and TRIM(a.drky)=TRIM(a.sqadds)) as pk_szq");
            this.SELECT("a.sqcty1 as pk_counties");
            this.SELECT("a.sqcoun as pk_cities");
            this.SELECT("a.SQFML as address");
            this.SELECT("\'\' as gycode");
            this.SELECT("a.sqe8scs as isscs");
            this.SELECT("a.sqe8jxs as isjxs");
            this.SELECT("a.sqe8jks as isjks");
            this.SELECT("a.sqe8yy as isyy");
            this.SELECT("a.sqe8yljg as isjcyljg");
            this.SELECT("a.sqe8gr as isgr");
            this.SELECT("a.sqe8qt as isqt");
            this.SELECT("a.sqdf01 as modcause");
            this.FROM(schema + "FE841003 a");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customBQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("an8") String an8, @Param("funcType") String funcType, @Param("doco") String doco) {
            return funcType.equals("ADD")?this.customAddBQry(schema, ctlSchema, an8):this.customModBQry(schema, ctlSchema, an8, doco);
        }

        public String customAddBQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("an8") String an8) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005  where drsy=\'E8\' AND   DRRT=\'10\' and TRIM(drky)=TRIM(zze8zzlxa)) as pk_lictype");
            this.SELECT("a.zze8zzbm as licno");
            this.SELECT("a.zze8jyfw as licfw");
            this.SELECT("TO_CHAR(to_date(trunc(zzexdj/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( zzexdj, 1000)-1,\'yyyy-MM-dd\') AS lictodate");
            this.SELECT("\'N\' as islong");
            this.SELECT("Zzfil2 as def3");
            this.SELECT("a.zze8jyfw2 as licfwt");
            this.SELECT("a.zze8jyfw3 as licfws");
            this.FROM(schema + "FE80101Z a");
            this.WHERE("a.zzan8=#{an8}");
            return this.toString();
        }

        public String customModBQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("an8") String an8, @Param("doco") String doco) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'10\' and TRIM(a.drky)=TRIM(a.zze8zzlxa)) as pk_lictype");
            this.SELECT("a.zze8zzbm as licno");
            this.SELECT("a.zze8jyfw as licfw");
            this.SELECT("TO_CHAR(to_date(trunc(zzexdj/1000)  +1900||\'-01-01\',\'yyyy-MM-dd\')+mod( zzexdj, 1000)-1,\'yyyy-MM-dd\') AS lictodate");
            this.SELECT("\'N\' as islong");
            this.SELECT("a.zzfil2 as def3");
            this.SELECT("a.zze8jyfw2 as licfwt");
            this.SELECT("a.zze8jyfw3 as licfws");
            this.FROM(schema + "FE841004 a");
            this.WHERE("a.zzan8=#{an8}");
            this.WHERE("a.zzev02=\'Y\'");
            this.WHERE("a.zzukidp = #{doco}");
            return this.toString();
        }

        public String customCscQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddCscQry(an8, schema, ctlSchema):this.customModCscQry(an8, schema, ctlSchema);
        }

        public String customAddCscQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.issczcz001);
            this.SELECT(this.isbapz002);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.Kse8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModCscQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.issczcz001);
            this.SELECT(this.isbapz002);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.sqe8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE841003 a");
            this.WHERE(" a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customJxsQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddJxsQry(an8, schema, ctlSchema):this.customModJxsQry(an8, schema, ctlSchema);
        }

        public String customAddJxsQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.isylqxjyxkz003);
            this.SELECT(this.isbapz004);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.Kse8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModJxsQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.isylqxjyxkz003);
            this.SELECT(this.isbapz004);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.sqe8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE841003 a");
            this.WHERE(" a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customJksQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddJksQry(an8, schema, ctlSchema):this.customModJksQry(an8, schema, ctlSchema);
        }

        public String customAddJksQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.isbgz005);
            this.SELECT(this.isqyba006);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.Kse8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModJksQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema) {
            this.SELECT(this.isbgz005);
            this.SELECT(this.isqyba006);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            ctlSchema = ctlSchema + ".";
            schema = schema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.sqe8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE841003 a");
            this.WHERE(" a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customYyOrJcyljgQry(@Param("an8") String an8, @Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddYyOrJcyljgQry(schema, ctlSchema, an8):this.customModYyOrJcyljgQry(schema, ctlSchema, an8);
        }

        public String customAddYyOrJcyljgQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("an8") String an8) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("a.kse8yyyl as isyl");
            this.SELECT("a.Kse8yygl as isgl");
            this.SELECT("a.Kse8yysb as Issbdd");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'25\' and TRIM(a.drky)=TRIM(a.Kse8yygs)) as pk_yygs");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'26\' and TRIM(a.drky)=TRIM(a.Kse8yljb)) as pk_yljb");
            this.SELECT("a.Kse8tgyf as Istgyf");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'11\' and TRIM(a.drky)=TRIM(a.Kse8dl)) as pk_yydl");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'12\' and TRIM(a.drky)=TRIM(a.Kse8xl)) as pk_yyxl");
            this.SELECT("a.Kse8yynsr as yynsr");
            this.SELECT(this.isyljgz007);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModYyOrJcyljgQry(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("an8") String an8) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("a.sqe8yyyl as isyl");
            this.SELECT("a.sqe8yygl as isgl");
            this.SELECT("a.sqe8yysb as Issbdd");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'25\' and TRIM(a.drky)=TRIM(a.sqe8yygs)) as pk_yygs");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'26\' and TRIM(a.drky)=TRIM(a.sqe8yljb)) as pk_yljb");
            this.SELECT("a.sqe8tgyf as Istgyf");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'11\' and TRIM(a.drky)=TRIM(a.sqe8dl)) as pk_yydl");
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   A.DRRT=\'12\' and TRIM(a.drky)=TRIM(a.sqe8xl)) as pk_yyxl");
            this.SELECT("a.sqe8yynsr as yynsr");
            this.SELECT(this.isyljgz007);
            this.SELECT(this.ISYYZZ008);
            this.SELECT(this.ISZZJGDM009);
            this.SELECT(this.ISSWDJZ010);
            this.SELECT(this.ISXBYYZZ011);
            this.FROM(schema + "FE841003 a");
            this.WHERE("a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customGrQry(@Param("an8") String an8, @Param("schema") String schema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddGrQry(an8, schema):this.customModGrQry(an8, schema);
        }

        public String customAddGrQry(@Param("an8") String an8, @Param("schema") String schema) {
            schema = schema + ".";
            this.SELECT("Kse8sfz as Idcard");
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModGrQry(@Param("an8") String an8, @Param("schema") String schema) {
            schema = schema + ".";
            this.SELECT("sqe8sfz as Idcard");
            this.FROM(schema + "FE841003 a");
            this.WHERE(" a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customQtQry(@Param("schema") String schema, @Param("an8") String an8, @Param("ctlSchema") String ctlSchema, @Param("funcType") String funcType) {
            return funcType.equals("ADD")?this.customAddQtQry(schema, an8, ctlSchema):this.customModQtQry(schema, an8, ctlSchema);
        }

        public String customAddQtQry(@Param("schema") String schema, @Param("an8") String an8, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.Kse8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE80101 a");
            this.WHERE(" a.ksan8=#{an8}");
            return this.toString();
        }

        public String customModQtQry(@Param("schema") String schema, @Param("an8") String an8, @Param("ctlSchema") String ctlSchema) {
            schema = schema + ".";
            ctlSchema = ctlSchema + ".";
            this.SELECT("(select drdl01 from " + ctlSchema + "f0005 a where a.drsy=\'E8\' AND   a.DRRT=\'24\' and TRIM(a.drky)=TRIM(a.sqe8dwxz)) as pk_dwxz");
            this.FROM(schema + "FE841003 a");
            this.WHERE(" a.sqan8=#{an8}");
            this.WHERE("a.sqflag = \'P\'");
            return this.toString();
        }

        public String customAddQryAInfo(@Param("schema") String schema, @Param("ctlSchema") String ctlSchema, @Param("gdtxky") String gdtxky) {
            this.SELECT("GDGTITNM as filename2");
            this.SELECT("GDGTFILENM as filepath");
            this.FROM(schema + ".F00165");
            this.WHERE("Trim(GDGTMOTYPE) = 5");
            this.WHERE("Trim(GDOBNM) = \'GTE842005\'");
            this.WHERE("Trim(GDTXKY) = #{gdtxky}");
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
