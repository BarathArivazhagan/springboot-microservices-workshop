package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApp1Application.class, args);
	}
	
	@GetMapping("/")
	public String welcome(){
		return "HELLO FROM EUREKA CLIENT 1";
	}
	
	@GetMapping("/callClient2")
	public String invokeClient2App(){
		return "HELLO FROM EUREKA CLIENT 1";
	}
}
