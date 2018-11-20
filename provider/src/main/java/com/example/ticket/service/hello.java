package com.example.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class hello implements helloservice {
    @Override
    public String aa() {
        return "fdasfads";
    }
}
