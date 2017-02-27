//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.el.cmic.ws.mapper;

import com.el.cfg.domain.Fe84202B;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

@Repository("fE84202BMapperC2")
public interface FE84202BMapperC2 {
    @InsertProvider(
            type = FE84202BMapperC2.SqlProvider.class,
            method = "insertSelective"
    )
    int insertSelective(@Param("schema") String var1, @Param("record") Fe84202B var2);

    public static final class SqlProvider extends SQL {
        public SqlProvider() {
        }

        public String insertSelective(@Param("schema") String schema, @Param("record") Fe84202B record) {
            this.INSERT_INTO(schema + ".Fe84202B");
            this.VALUES("ALUKIDP", "#{record.alukidp}");
            if(record.getAlukid() != null) {
                this.VALUES("ALUKID", "#{record.alukid}");
            }

            if(record.getAlkcoo() != null) {
                this.VALUES("ALKCOO", " #{record.alkcoo}");
            }

            if(record.getAle8splx() != null) {
                this.VALUES("ALE8SPLX", " #{record.ale8splx}");
            }

            if(record.getAlan8() != null) {
                this.VALUES("ALAN8", "#{record.alan8}");
            }

            if(record.getAle8spyj() != null) {
                this.VALUES("ALE8SPYJ", "#{record.ale8spyj}");
            }

            if(record.getAlaa02() != null) {
                this.VALUES("ALAA02", "#{record.alaa02}");
            }

            if(record.getAld1() != null) {
                this.VALUES("ALD1", "#{record.ald1}");
            }

            if(record.getAlupmt() != null) {
                this.VALUES("ALUPMT", "#{record.alupmt}");
            }

            if(record.getAluser() != null) {
                this.VALUES("ALUSER", "#{record.aluser}");
            }

            if(record.getAlpid() != null) {
                this.VALUES("ALPID", "#{record.alpid}");
            }

            if(record.getAlupmj() != null) {
                this.VALUES("ALUPMJ", "#{record.alupmj}");
            }

            if(record.getAltday() != null) {
                this.VALUES("ALTDAY", "#{record.altday}");
            }

            if(record.getAlukid() != null) {
                this.VALUES("ALDL01", "' '");
                this.VALUES("ALD2", "0");
                this.VALUES("ALD3", "0");
                this.VALUES("ALD4", "0");
                this.VALUES("ALD5", "0");
                this.VALUES("ALD6", "0");
                this.VALUES("ALECV1", "0");
                this.VALUES("ALECV2", "0");
                this.VALUES("ALECV3", "0");
                this.VALUES("ALECV4", "0");
                this.VALUES("ALECV5", "0");
                this.VALUES("ALDL02", "' '");
                this.VALUES("ALDL03", "' '");
                this.VALUES("ALDL04", "' '");
                this.VALUES("ALDL05", "' '");
                this.VALUES("ALDL06", "' '");
                this.VALUES("ALDL07", "' '");
                this.VALUES("ALAB01", "0");
                this.VALUES("ALAB02", "0");
                this.VALUES("ALTRATE01", "0");
                this.VALUES("ALTRATE02", "0");
                this.VALUES("ALBN01", "0");
                this.VALUES("ALBN02", "0");
                this.VALUES("ALBN03", "0");
            }

            return this.toString();
        }
    }
}
