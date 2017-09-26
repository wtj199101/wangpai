package com.wp.cloud.wangpia.rabbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wtjun on 2017/9/25.
 */
@Service
public class HelloService {
    @Autowired
    private  RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return  restTemplate.getForObject("http://client-hi/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "#################hi,"+name+",,ok!";
    }
}
