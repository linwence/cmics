package com.el.cmic.mapper.invoice;

import com.el.cmic.domain.invoice.InvoiceDomain;
import com.el.cmic.mapper.goods.ProductMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * 发票信息Mapper
 * Created by Vincent on 2017/2/21.
 */
public interface InvoiceMapper {

    final public class SqlProvider extends SQL {


        public String selectInvoiceByTime(@Param("tableSchema") String tableSchema, @Param("timeBegin") Date timeBegin, @Param("timeEnd") Date timeEnd) {
            SELECT("doc");
            SELECT("ntdoc");
            SELECT("invnum");
            SELECT("dl01");
            SELECT("dl02");
            SELECT("indate");
            SELECT("redate");
            FROM(tableSchema + ".ve8ntinvoice");
            if (timeBegin == null && timeEnd == null) {
                WHERE("ROWNUM<=5000");
            }
            if (timeBegin != null && timeEnd != null) {
                WHERE("redate between #{timeBegin} and #{timeEnd}");
            }
            return toString();
        }

        public String selectInvoiceByNtDoc(@Param("tableSchema") String tableSchema, @Param("ntdoc") String ntdoc) {
            SELECT("doc");
            SELECT("ntdoc");
            SELECT("invnum");
            SELECT("dl01");
            SELECT("dl02");
            SELECT("indate");
            SELECT("redate");
            FROM(tableSchema + ".ve8ntinvoice");
            if (StringUtils.isEmpty(ntdoc)) {
                WHERE("ROWNUM<=5000");
            } else {
                WHERE("ntdoc=#{ntdoc}");
            }
            return toString();
        }


    }

    @SelectProvider(type = SqlProvider.class, method = "selectInvoiceByTime")
    public List<InvoiceDomain> selectInvoiceByTime(@Param("tableSchema") String tableSchema, @Param("timeBegin") Date timeBegin, @Param("timeEnd") Date timeEnd);

    @SelectProvider(type = SqlProvider.class, method = "selectInvoiceByNtDoc")
    public List<InvoiceDomain> selectInvoiceByNtDoc(@Param("tableSchema") String tableSchema, @Param("ntdoc") String ntdoc);
}
