package com.wp.cloud.wangpai.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class WangpaiZipkinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangpaiZipkinServiceApplication.class, args);
	}
}
