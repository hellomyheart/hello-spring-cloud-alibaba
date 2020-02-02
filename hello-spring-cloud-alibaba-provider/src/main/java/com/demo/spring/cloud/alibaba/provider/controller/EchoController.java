package com.demo.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;

    //路径参数，动态路由
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string){
        return "Hello Nacos Provider"+string;
    }
@GetMapping(value = "/lb")
    public String lb(){
        return "Hello nacos Provider I am from prot:"+port;
    }
}
