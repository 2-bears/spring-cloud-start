package com.cloud.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心类，通过注册中心访问
 * @author my
 * @since
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterMain {
	
	public static void main(String []args) {
		SpringApplication.run(RegisterMain.class, args);
	}

}
