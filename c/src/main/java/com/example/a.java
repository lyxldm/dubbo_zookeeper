package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;
import com.example.service.helloservice1;

@Service
public class a{
    @Reference
    helloservice1 hellosercie1;

    String aa(){
        return hellosercie1.aa ()                                ;
    }
}
