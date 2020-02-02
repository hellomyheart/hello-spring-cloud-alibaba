package com.demo.spring.cloud.alibaba.consumer.controller;

import com.demo.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/feign/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }
@GetMapping(value = "/lb")
    public String lb(){
        return echoService.lb();
    }
}


