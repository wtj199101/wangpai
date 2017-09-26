package com.wp.cloud.wangpai.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by wtjun on 2017/9/26.
 */
@Component
public class HiServiceHystric implements FeignHelloService {
    @Override
    public String SayHiFromClientOne(String name) {
        return "#########sorry"+name;
    }
}
