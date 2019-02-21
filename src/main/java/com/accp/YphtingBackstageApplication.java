package com.accp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class YphtingBackstageApplication {
	public static void main(String[] args) {
		SpringApplication.run(YphtingBackstageApplication.class, args);
		//SpringApplication springApplication = new SpringApplication(YphtingBackstageApplication.class);        
		//ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);        
		//SysMessageSocketHanlder.ac=configurableApplicationContext;//非常重要
	}
}

