package com.fzj.springboot_ssm.controller;

import com.fzj.springboot_ssm.pojo.testPojo;
import com.fzj.springboot_ssm.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/test_info")
public class testController {

    @Autowired
    public testService testService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<testPojo> findAll() throws Exception{
        List<testPojo> testPojos=testService.findll();
        return testPojos;
    }
}
