package com.el.cmic.callmdm.service;

import com.el.cfg.domain.F4101;
import com.el.cfg.domain.Fe841001;
import com.el.cfg.domain.Fe84101;
import com.el.cfg.domain.Fe84101z;
import com.el.cmic.callmdm.domain.RqInputHeader;
import com.el.cmic.callmdm.mapper.RqE001Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vincent on 2016/10/9.
 */
@Service("rqE001ServiceImpl")
public class RqE001ServiceImpl implements RqE001Service {
    @Autowired
    private RqE001Mapper rqE001Mapper;

    @Transactional
    public int updateFe84101(Fe84101 fe84101) {

        return rqE001Mapper.updateFe84101(fe84101);
    }

    @Transactional
    public int updateF4101(F4101 f4101) {
        return rqE001Mapper.updateF4101(f4101);
    }

    @Transactional
    public int updateFe84101Z(Fe84101z fe84101z) {
        if(fe84101z.getZzco()!=null) {
            return rqE001Mapper.updateFe84101z(fe84101z);
        }else{
            return 0;
        }
    }

    @Override
    public int updateFe841001(Fe841001 fe841001) {
        return rqE001Mapper.updateFe841001(fe841001);
    }

    @Override
    public int selectP( String zzlitm, String schema) {
        return rqE001Mapper.selectcountP(zzlitm,schema);
    }
}
