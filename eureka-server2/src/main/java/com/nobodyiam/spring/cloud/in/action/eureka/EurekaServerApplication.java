package com.nobodyiam.spring.cloud.in.action.eureka;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Jason on 5/4/16.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication{ 
	public static void main(String[] args) { 
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args); 
		} 
	}
