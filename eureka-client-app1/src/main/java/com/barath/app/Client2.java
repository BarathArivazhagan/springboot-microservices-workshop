package com.barath.app;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-client-app2")
public interface Client2 {
	
	@GetMapping("/")
	public String welcome();
}
