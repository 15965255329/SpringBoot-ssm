package com.fzj.springboot_ssm.service.impl;

import com.fzj.springboot_ssm.mapper.testMapper;
import com.fzj.springboot_ssm.pojo.testPojo;
import com.fzj.springboot_ssm.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {
    @Autowired
    public testMapper testMapper;

    @Override
    public List<testPojo> findll() throws Exception {
        return testMapper.findAll();
    }
}
