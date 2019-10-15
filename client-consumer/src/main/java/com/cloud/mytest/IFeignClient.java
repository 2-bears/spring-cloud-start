package com.cloud.mytest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign接口类，方法与provider提供的保持一致
 * @author my
 *
 */
@Component
@FeignClient(name="EUREKA-SERVICE-PROVIDER", fallback=ClientFallBack.class)
public interface IFeignClient {
	   @GetMapping("/hello")
	   public String testService(@RequestParam("name") String name);
}
