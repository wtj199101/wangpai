package com.wp.cloud.wangpia.rabbon.service;

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

    public String hiService(String name){
        return  restTemplate.getForObject("http://clinet-hi/hi?name="+name,String.class);
    }
}
