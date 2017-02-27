package com.el.cmic.service.applydetail;

import com.el.cmic.domain.applydetail.Fe8nt006;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by king_ on 2017/2/21.
 */
public interface ApplyDetailService {
    int insertFe8nt006(String tableSchema, Fe8nt006 fe8nt006);
    boolean callNtInterface(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd);
    boolean callNtInterface(String code);
    void callNtInterface();
}
