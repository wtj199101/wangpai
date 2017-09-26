package com.wp.cloud.wangpai.feign.controller;

import com.wp.cloud.wangpai.feign.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wtjun on 2017/9/26.
 */
@RestController
public class Hicontroller {
    @Autowired
    private FeignHelloService feignHelloService;
    @RequestMapping(value = "/hi")
    public  String index(@RequestParam String name){
        return  this.feignHelloService.SayHiFromClientOne(name);
    }
}
