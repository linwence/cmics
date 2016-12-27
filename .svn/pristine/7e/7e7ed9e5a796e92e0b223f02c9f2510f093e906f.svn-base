package com.el.cmic.service.spdlog;

import com.el.cmic.common.domain.Fe8spdlg;
import com.el.cmic.common.mapper.Fe8spdlgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vincent on 2016/11/26.
 */
@Service
public class SpdLogServiceImpl implements SpdLogService {
    @Autowired
    private Fe8spdlgMapper fe8spdlgMapper;

    @Override
    @Transactional
    public int insertFe8spdlg(Fe8spdlg fe8spdlg) {
        return fe8spdlgMapper.insertFe8spdlg(fe8spdlg);
    }
}
