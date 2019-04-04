package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaClientApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApp2Application.class, args);
	}
	

	@GetMapping("/")
	public String welcome(){
		return "<b>HELLO FROM EUREKA CLIENT 2</b>";
	}
	
	@GetMapping("/callClient1")
	public String invokeClient1App(){
		return "HELLO FROM EUREKA CLIENT 1";
	}
}
