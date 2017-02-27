package com.el.cmic.service.ntcfg;

import com.el.cmic.domain.ntcfg.Fe8NtCfg;

/**
 * Created by Vincent on 2017/2/16.
 */
public interface NtCfgService {
    public Fe8NtCfg selectFe8NtCfgByInterfaceName(String interfaceName);

    public int updateFe8NtCfg(Fe8NtCfg fe8NtCfg);
}
