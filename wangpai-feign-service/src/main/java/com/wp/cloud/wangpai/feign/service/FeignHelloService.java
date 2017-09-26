package com.wp.cloud.wangpai.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wtjun on 2017/9/26.
 */
@FeignClient(value = "client-hi",fallback = HiServiceHystric.class)
public interface   FeignHelloService {
@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String SayHiFromClientOne(@RequestParam("name") String name);
}
