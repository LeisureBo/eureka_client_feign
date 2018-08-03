package com.bo.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 定义Feign接口
 * 
 * 注: Feign自带熔断器，在D版本的SpringCloud没有默认打开
 * 在配置文件中打开熔断器：feign.hystrix.enabled=true
 * 
 * @Author 王博
 * @Version 2018年6月23日　下午2:40:58
 * @码云 https://gitee.com/LeisureBo
 */
// 通过@FeignClient注解来指定调用哪个服务(服务名称不能包含下划线)
// 在@FeignClient注解中添加fallback参数指定熔断类
@FeignClient(value = "${feign.invoke.service-id}", fallback = EurekaFeignServiceHystrix.class)
public interface EurekaFeignService {
	
	// @RequestMapping指定调用服务的哪个接口
	// 如果有@PathVariable注解必须使用value属性指定路径模板参数名
	@RequestMapping("/test/say")
	public String saySomethingFromClientOne(@RequestParam("str") String content);
}
