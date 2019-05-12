package com.barath.app;

import org.springframework.stereotype.Component;

@Component
public class Client2Fallback implements Client2 {

	@Override
	public String welcome() {
		
		return "Something went wrong, wait for sometime";
	}
   
}
