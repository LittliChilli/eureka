package com.nobodyiam.spring.in.action.reservation.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {ExcudeAnnotation.class})})
@EnableDiscoveryClient
@SpringBootApplication
@Configuration
@RibbonClient(name="eureka-service", configuration=RibbonConfiguration.class)
public class ReservationClientApplication {
	
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ReservationClientApplication.class).web(
				true).run(args);
	}
}