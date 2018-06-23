package com.bo.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bo.cloud.service.EurekaFeignService;

/**
 * @Description 
 * @Author 王博
 * @Version 2018年6月23日　下午2:49:37
 * @码云 https://gitee.com/LeisureBo
 */
@RestController
public class EurekaFeignController {
	
	@Resource
	private EurekaFeignService feignService;
	
	@RequestMapping("/say/{content}")
	public String saySomething(@PathVariable("content") String content) {
		return feignService.saySomethingFromClientOne(content);
	}
}
