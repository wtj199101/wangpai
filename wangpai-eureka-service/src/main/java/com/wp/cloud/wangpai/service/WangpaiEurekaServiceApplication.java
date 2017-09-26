package com.wp.cloud.wangpai.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WangpaiEurekaServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(WangpaiEurekaServiceApplication.class, args);
	}
}
