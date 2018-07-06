package com.nobodyiam.spring.in.action.reservation.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/dc")
	public String client() {
		String res = "我是service,我的port :" + port;
		return res;
	}

}
