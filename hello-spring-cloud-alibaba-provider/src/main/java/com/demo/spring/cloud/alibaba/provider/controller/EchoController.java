package com.demo.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    //路径参数，动态路由
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string){
        return "Hello Nacos Provider"+string;
    }
}
