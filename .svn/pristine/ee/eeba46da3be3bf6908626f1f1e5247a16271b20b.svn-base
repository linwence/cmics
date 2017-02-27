package com.el.cmic.service.applyhead;

import com.el.cmic.domain.applyhead.Fe8nt005;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by king_ on 2017/2/21.
 */
public interface ApplyHeadService {
    int insertFe8nt005(String tableSchema, Fe8nt005 fe8nt005);
    void callNtInterface();
    boolean callNtInterface(@RequestParam("timeBegin") Date timeBegin, @RequestParam("timeEnd") Date timeEnd);
    boolean callNtInterface(String code);

}
