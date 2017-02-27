package com.el.cmic.service.invoice;

import com.el.cmic.domain.invoice.InvoiceDomain;
import com.el.cmic.mapper.invoice.InvoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Vincent on 2017/2/21.
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Value("${schema}")
    private String tableSchema;

    @Override
    public List<InvoiceDomain> selectInvoiceByNtDoc( String ntdoc) {
        return invoiceMapper.selectInvoiceByNtDoc(tableSchema, ntdoc);
    }

    @Override
    public List<InvoiceDomain> selectInvoiceByTime(Date timeBegin, Date timeEnd) {
        return invoiceMapper.selectInvoiceByTime(tableSchema, timeBegin, timeEnd);
    }
}
