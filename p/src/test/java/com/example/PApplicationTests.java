package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.helloservice1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PApplicationTests {
    @Reference
    helloservice1 helloservice;
    @Test
    public void aa(){
        helloservice.aa ();
    }

}
