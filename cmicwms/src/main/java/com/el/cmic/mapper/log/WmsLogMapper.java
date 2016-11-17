package com.el.cmic.mapper.log;

import com.el.cmic.domain.log.Fe8wmslg;
import com.el.cmic.mapper.ckback.CkBackMapper;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.jdbc.SQL;

import java.math.BigDecimal;

/**
 * Created by Vincent on 2016/11/6.
 */
public interface WmsLogMapper {
    final class SqlProvider extends SQL {

        public String insertFe8wmslg(Fe8wmslg fe8wmslg) {
            INSERT_INTO("Fe8wmslg");
            VALUES("LSUKID", "#{lsukid}");
            if (fe8wmslg.getLskcoo() != null) {
                VALUES("Lskcoo", "#{lskcoo}");
            }
            if (fe8wmslg.getLsdcto() != null) {
                VALUES("LSDCTO", "#{lsdcto}");
            }
            if (fe8wmslg.getLsdoco() != null) {
                VALUES("LSDOCO", "#{lsdoco}");
            }
            if (fe8wmslg.getLsdl01() != null) {
                VALUES("Lsdl01", "#{lsdl01}");
            }
            if (fe8wmslg.getLsdl02() != null) {
                VALUES("Lsdl02", "#{lsdl02}");
            }
            if (fe8wmslg.getLsdl03() != null) {
                VALUES("Lsdl03", "#{lsdl03}");
            }
            if (fe8wmslg.getLsvar1() != null) {
                VALUES("Lsvar1", "#{lsvar1}");
            }
            return toString();
        }

    }

    @InsertProvider(type = SqlProvider.class, method = "insertFe8wmslg")
    @SelectKey(statement = "select FE8WMSLG_SEQ.NEXTVAL FROM DUAL", keyProperty = "lsukid", resultType = BigDecimal.class, before = true)
    int insertFe8wmslg(Fe8wmslg fe8wmslg);
}
