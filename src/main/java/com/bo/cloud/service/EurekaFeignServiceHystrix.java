package com.bo.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description Feign熔断器类
 * @Author 王博
 * @Version 2018年6月23日　下午3:45:38
 * @码云 https://gitee.com/LeisureBo
 */
// 需要注入到spring容器
@Component
public class EurekaFeignServiceHystrix implements EurekaFeignService {

	@Override
	public String saySomethingFromClientOne(String content) {
		return "sorry, service error! [from Feign Hystrix]";
	}

}
