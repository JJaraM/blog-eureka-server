package com.jjara.blog.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudApp {
	public static void main(String[] args) {
		SpringApplication.run(CloudApp.class, args);
	}
}

