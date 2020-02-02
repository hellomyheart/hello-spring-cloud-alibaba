package com.demo.spring.cloud.alibaba.consumer.service.fallback;

import com.demo.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;
//代表一个组件，用Service注解一样
@Component
public class EchoServiceFailback implements EchoService {
    @Override
    public String echo(String string) {
        return "网络故障，请等待";
    }

    @Override
    public String lb() {
        return "请等待！！！！！";
    }
}
