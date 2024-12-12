package com.study.mvc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@MapperScan(basePackages = "com.study.mvc.model.dao")
public class DBConfig {
	// memberDao가 context에 등록됨
}
