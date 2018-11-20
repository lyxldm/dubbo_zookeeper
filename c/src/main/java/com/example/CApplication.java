package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
@SpringBootApplication
@DubboComponentScan(basePackages = "com.example")
public class CApplication {
	public static void main(String[] args) {
		SpringApplication.run(CApplication.class, args);
	}
}
