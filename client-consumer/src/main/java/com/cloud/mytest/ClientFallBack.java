package com.cloud.mytest;

import org.springframework.stereotype.Component;

/**
 * 访问服务失败调用方法。
 * Feign整合了hystrix
 * @author my
 *
 */
@Component
public class ClientFallBack implements IFeignClient {

	/**
	 * 回退方法
	 */
	@Override
	public String testService(String name) {
		// TODO Auto-generated method stub
		return "the service is unavaiable";
	}

}
