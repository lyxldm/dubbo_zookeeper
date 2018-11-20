package com.example.ticket;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.ticket.service.helloservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aa {
    @Reference
    helloservice helloservice;
@RequestMapping("/")
    String aa(){
    return "aa";
}

}
