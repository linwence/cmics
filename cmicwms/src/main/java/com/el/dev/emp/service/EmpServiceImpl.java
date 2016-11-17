package com.el.dev.emp.service;

import com.el.dev.emp.domain.Emp;
import com.el.dev.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vincent on 2016/8/19.
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Transactional
    public List<Emp> queryEmp() {

        return empMapper.findEmpByAll();
    }
}
