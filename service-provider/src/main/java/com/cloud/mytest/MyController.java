package com.cloud.mytest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
    @Value("${server.port}")
    private String port;
    
    @RequestMapping("/hello")
    public String testService(@RequestParam String name) {
    	return "hi, " + name + ", i am from port " + port; 
    }
}
