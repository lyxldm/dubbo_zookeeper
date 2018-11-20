package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.helloservice1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aaaa {
    /*注解上
    版本
    class  no
    reference扫描

    *
    * */
    @Reference
    helloservice1 q;
    @RequestMapping("/")

    String aa(){
        return q.aa ();
    }
}
