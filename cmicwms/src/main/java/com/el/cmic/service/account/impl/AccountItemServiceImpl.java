package com.el.cmic.service.account.impl;

import com.el.cfg.domain.FE8WMS14;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.el.cmic.common.domain.WmsResult;
import com.el.cmic.domain.account.Account;
import com.el.cmic.domain.account.AccountItem;
import com.el.cmic.mapper.account.AccountItemMapper;
import com.el.cmic.service.account.AccountItemService;

/**
 * 对账推送
 */
@Service
public class AccountItemServiceImpl implements AccountItemService {

    @Autowired
    private AccountItemMapper accountItemMapper;

    @Override
    public Integer insertAccount(AccountItem accountItem) {
        return accountItemMapper.insertAccount(accountItem);
    }


    @Override
    @Transactional
    public WmsResult callInsertAccount(String data) {
        WmsResult wmsResult = new WmsResult(true, "0000", "成功");
        Account account = JSON.parseObject(data, Account.class);
        if (account != null) {
            for (AccountItem accountItem : account.getAcountItem()) {
                System.out.println(accountItem);
                String mcu = accountItem.getDzmcu();
                String co = accountItem.getDzco();
                String litm = accountItem.getDzlitm();
                String lot1 = accountItem.getDzlot1();
                FE8WMS14 fe8WMS14 = accountItemMapper.selectFe8wms14ByPrimary(mcu, co, litm, lot1);
                if (fe8WMS14 != null) {
                    accountItemMapper.deleteFe8wms14ByPrimary(mcu, co, litm, lot1);
                }
                this.insertAccount(accountItem);
            }
        }
        return wmsResult;
    }

}
