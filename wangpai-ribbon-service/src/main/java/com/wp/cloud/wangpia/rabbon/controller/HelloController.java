package com.wp.cloud.wangpia.rabbon.controller;

import com.wp.cloud.wangpia.rabbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wtjun on 2017/9/25.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hihi")
    public String hi(@RequestParam String name){
        System.out.println("1111");
        return  helloService.hiService(name);
    }
//    @RequestMapping("/index")
//    public String index(){
//        System.out.println("122");
//        return  "index";
//    }
}
