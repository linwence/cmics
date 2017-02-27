package com.el.cmic.service.goods;

import com.el.cmic.domain.goods.Fe8nt001;

import java.util.Date;

/**
 * Created by Vincent on 2017/2/14.
 */
public interface ProductService {
    public int insertFe8nt001(String tableSchema, Fe8nt001 fe8nt001);

    public boolean callNtInterface(Date timeBegin, Date timeEnd);

    public void callNtInterface();

    public boolean callNtInterface(String code);
}
