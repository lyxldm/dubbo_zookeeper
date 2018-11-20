package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfigBinding;
import com.example.service.helloservice1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@DubboComponentScan(basePackages = "com.example.service")
@SpringBootApplication
public class PApplication {
	public static void main(String[] args) {
		SpringApplication.run(PApplication.class, args);
	}
}
