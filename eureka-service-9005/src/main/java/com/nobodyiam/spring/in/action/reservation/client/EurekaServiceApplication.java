package com.nobodyiam.spring.in.action.reservation.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication 
public class EurekaServiceApplication {
public static void main(String[] args) {
new SpringApplicationBuilder(EurekaServiceApplication.class).web(true).run(args);
}}
