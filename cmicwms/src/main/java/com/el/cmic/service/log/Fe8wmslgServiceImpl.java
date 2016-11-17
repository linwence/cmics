package com.el.cmic.service.log;

import com.el.cmic.domain.log.Fe8wmslg;
import com.el.cmic.mapper.log.WmsLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vincent on 2016/11/6.
 */
@Service
public class Fe8wmslgServiceImpl implements Fe8wmslgService {
    @Autowired
    private WmsLogMapper wmsLogMapper;

    @Transactional
    @Override
    public int insertFe8wmslg(Fe8wmslg fe8wmslg) {

        return wmsLogMapper.insertFe8wmslg(fe8wmslg);
    }
}
