package com.wp.cloud.wangpai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Enable
public class WangpaiApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.run(WangpaiApplication.class,args);
	}
}
