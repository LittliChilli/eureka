package com.nobodyiam.spring.in.action.reservation.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscoveryController {

	@Autowired
	private DiscoveryClient discoveryClient;
	@Value("${server.port}")
	private String port;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/client")
	public String client() {
		String services = "Services: " + discoveryClient.getServices()
				+ " port :" + port;
		List<ServiceInstance> serviceList = discoveryClient.getInstances("eureka-service");
		System.out.println(services);
		return services;
	}
	
	@GetMapping(value="/ribbon")
    public String helloConsumer() {
		System.out.println("Services: " + discoveryClient.getServices() + " port :" + port);
        return restTemplate.getForEntity("http://EUREKA-SERVICE/dc", String.class).getBody();
    }

}
