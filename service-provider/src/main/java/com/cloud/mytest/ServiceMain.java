package com.cloud.mytest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceMain.class).web(true).run(args);
    }
}
