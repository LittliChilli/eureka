package com.nobodyiam.spring.in.action.reservation.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication 
public class EurekaServiceApplication {
public static void main(String[] args) {
new SpringApplicationBuilder(EurekaServiceApplication.class).web(true).run(args);
}}
