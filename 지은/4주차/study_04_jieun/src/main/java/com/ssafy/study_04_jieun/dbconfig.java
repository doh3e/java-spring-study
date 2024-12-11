package com.ssafy.study_04_jieun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.study_04_jieun.model.dao")
public class dbconfig {

}
