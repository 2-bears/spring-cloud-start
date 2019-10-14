package com.cloud.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    IFeignClient feignClient;
    
    @GetMapping("/hello")
    public String hello(@RequestParam String name){  	
        return feignClient.testService(name);
    }    
}
