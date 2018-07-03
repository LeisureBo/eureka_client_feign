package com.bo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 注册到服务中心
@EnableFeignClients // 开启Feign的功能(如果启动类不在根路径则必须使用basePackages指定扫描路径)
@EnableHystrix // 开启断路器Hystrix
@EnableHystrixDashboard // 开启断路器仪表盘HystrixDashboard
public class EurekaClientFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientFeignApplication.class, args);
	}
}
