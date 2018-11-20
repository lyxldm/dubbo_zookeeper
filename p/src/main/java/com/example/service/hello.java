package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Service()
@Component
public class hello implements helloservice1 {
    @Override
    public String aa() {

        return "fdasfads";
    }
}
