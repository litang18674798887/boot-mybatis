package com.pagoda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = { "com.pagoda.dao" })
public class Boot05MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot05MybatisApplication.class, args);
	}
}
