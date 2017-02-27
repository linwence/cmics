//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe80101;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fe80101UpdateByPKMapper")
public interface FE80101UpdateByPKMapper {
    @UpdateProvider(
            type = FE80101UpdateByPKMapper.SqlProvider.class,
            method = "updateByPrimaryKeySelective"
    )
    int updateByPrimaryKeySelective(@Param("schema") String var1, @Param("record") Fe80101 var2, @Param("datatype") String var3);

    @UpdateProvider(
            type = FE80101UpdateByPKMapper.SqlProvider.class,
            method = "updatesametym"
    )
    int updatesametym(@Param("schema") String var1, @Param("e8lsm") String var2, @Param("e8tym") String var3);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String updateByPrimaryKeySelective(@Param("schema") String schema, @Param("record") Fe80101 record, @Param("datatype") String datatype) {
            this.UPDATE(schema + ".FE80101");
            if(datatype.equals("M01")) {
                this.SET("KSEV01 = #{record.ksev01}");
                this.SET("KSE8NAME = #{record.kse8name}");
                this.SET("KSE8SCXKZ = #{record.kse8scxkz}");
                if(record.getKse8kstym() != null) {
                    this.SET("KSE8KSTYM = #{record.kse8kstym}");
                }

                this.SET("KSDL011 = #{record.ksdl011}");
            }

            if(datatype.equals("E01")) {
                this.SET("KSE8SCXKZ = #{record.kse8scxkz}");
                if(record.getKse8cp() != null) {
                    this.SET("KSE8CP = #{record.kse8cp}");
                }
            }

            if(datatype.equals("C01")) {
                if(record.getKsev01() != null) {
                    this.SET("KSEV01 = #{record.ksev01}");
                }

                if(record.getKse8name() != null) {
                    this.SET("KSE8NAME = #{record.kse8name}");
                }

                if(record.getKse8scs() != null) {
                    this.SET("KSE8SCS = #{record.kse8scs}");
                }

                if(record.getKse8jxs() != null) {
                    this.SET("KSE8JXS = #{record.kse8jxs}");
                }

                if(record.getKse8jks() != null) {
                    this.SET("KSE8JKS = #{record.kse8jks}");
                }

                if(record.getKse8yy() != null) {
                    this.SET("KSE8YY = #{record.kse8yy}");
                }

                if(record.getKse8yljg() != null) {
                    this.SET("KSE8YLJG = #{record.kse8yljg}");
                }

                if(record.getKse8gr() != null) {
                    this.SET("KSE8GR = #{record.kse8gr}");
                }

                if(record.getKse8qt() != null) {
                    this.SET("KSE8QT = #{record.kse8qt}");
                }

                if(record.getKse8yyyl() != null) {
                    this.SET("KSE8YYYL = #{record.kse8yyyl}");
                }

                if(record.getKse8yygl() != null) {
                    this.SET("KSE8YYGL = #{record.kse8yygl}");
                }

                if(record.getKse8yysb() != null) {
                    this.SET("KSE8YYSB = #{record.kse8yysb}");
                }

                if(record.getKse8yygs() != null) {
                    this.SET("KSE8YYGS = #{record.kse8yygs}");
                }

                if(record.getKse8yljb() != null) {
                    this.SET("KSE8YLJB = #{record.kse8yljb}");
                }

                if(record.getKse8tgyf() != null) {
                    this.SET("KSE8TGYF = #{record.kse8tgyf}");
                }

                if(record.getKse8dl() != null) {
                    this.SET("KSE8DL = #{record.kse8dl}");
                }

                if(record.getKse8xl() != null) {
                    this.SET("KSE8XL = #{record.kse8xl}");
                }

                if(record.getKse8yynsr() != null) {
                    this.SET("KSE8YYNSR = #{record.kse8yynsr}");
                }

                if(record.getKse8sfz() != null) {
                    this.SET("KSE8SFZ = #{record.kse8sfz}");
                }

                if(record.getKse8dwxz() != null) {
                    this.SET("KSE8DWXZ = #{record.kse8dwxz}");
                }

                if(record.getKse8kstym() != null) {
                    this.SET("KSE8KSTYM = #{record.kse8kstym}");
                }

                if(record.getKsev02() != null) {
                    this.SET("KSEV02 = #{record.ksev02}");
                }
            }

            if(datatype.equals("C011")) {
                this.SET("KSE8JYCS = #{record.kse8jycs}");
                this.SET("KSE8CKDZ = #{record.kse8ckdz}");
                this.SET("KSE8FR = #{record.kse8fr}");
                this.SET("KSE8QYFZR = #{record.kse8qyfzr}");
                this.SET("KSE8YWLXR = #{record.kse8ywlxr}");
            }

            if(datatype.equals("MEGC")) {
                this.SET("KSe8str200 = concat(concat(trim(KSe8str200),';'),#{record.kse8str200})");
                this.SET("KSE8KSTYM = #{record.kse8kstym}");
            }

            if(datatype.equals("UMEGC")) {
                this.SET("KSe8str200 = #{record.kse8str200}");
                this.SET("KSE8KSTYM = #{record.kse8kstym}");
            }

            if(datatype.equals("SELC")) {
                this.SET("KSE8SFFC = #{record.kse8sffc}");
            }

            if(datatype.equals("S")) {
                this.SET("KSFLAG = #{record.ksflag}");
            }

            if(datatype.equals("N")) {
                this.SET("KSEV02 = #{record.ksev02}");
            }

            this.WHERE("Trim(KSAN8) = #{record.ksan8}");
            return this.toString();
        }

        public String updatesametym(@Param("schema") String schema, @Param("e8lsm") String e8lsm, @Param("e8tym") String e8tym) {
            this.UPDATE(schema + ".FE80101");
            this.SET("KSE8KSTYM = #{e8tym}");
            this.WHERE("Trim(KSE8KSTYM) = #{e8lsm}");
            return this.toString();
        }
    }
}
