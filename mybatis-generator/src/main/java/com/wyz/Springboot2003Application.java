package com.wyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyz.mapper")  //配置mapper扫描
public class Springboot2003Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2003Application.class, args);
	}

}
