package com.nobodyiam.spring.in.action.reservation.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
@ExcudeAnnotation
public class RibbonConfiguration {

	@Autowired
	private IClientConfig ribbonClientConfig;
 
//	@Bean
//	public IPing ribbonPing(IClientConfig config) {
//		return new PingUrl(false, "/provider/");
//	}
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		// return new AvailabilityFilteringRule();
//		 return new RandomRule();//
		// return new BestAvailableRule();
		 return new RoundRobinRule();//轮询
		// return new WeightedResponseTimeRule();
//		 return new RetryRule();
		// return new ZoneAvoidanceRule();
	}

}
