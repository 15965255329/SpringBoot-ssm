package com.fzj.springboot_ssm.mapper;

import com.fzj.springboot_ssm.pojo.testPojo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface testMapper {

    @Select("select * from user")
    List<testPojo> findAll() throws Exception;
}
