package com.example.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.ticket.service.helloservice;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {
	@Reference
	helloservice helloservice;


	@Test
	public void contextLoads() {

		System.out.println (helloservice.aa () );
		System.out.println (1 );
	}

}
