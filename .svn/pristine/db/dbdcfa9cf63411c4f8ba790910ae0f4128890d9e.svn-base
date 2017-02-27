package com.el.cmic.service.ntcfg;

import com.el.cmic.domain.ntcfg.Fe8NtCfg;
import com.el.cmic.mapper.ntcfg.Fe8NtCfgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vincent on 2017/2/16.
 */
@Service
public class NtCfgServiceImpl implements NtCfgService {

    @Autowired
    private Fe8NtCfgMapper fe8NtCfgMapper;

    @Override
    public Fe8NtCfg selectFe8NtCfgByInterfaceName(String interfaceName) {
        return fe8NtCfgMapper.selectFe8nttime(interfaceName);
    }

    @Override
    @Transactional
    public int updateFe8NtCfg(Fe8NtCfg fe8NtCfg) {
        return fe8NtCfgMapper.updateFe8nttime(fe8NtCfg);
    }
}
