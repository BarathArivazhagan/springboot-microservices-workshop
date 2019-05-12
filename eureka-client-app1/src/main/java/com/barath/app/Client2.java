package com.barath.app;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-client-app2",fallback=Client2Fallback.class)
public interface Client2 {
	
	@GetMapping("/")
	public String welcome();
}
