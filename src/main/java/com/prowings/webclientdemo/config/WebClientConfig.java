package com.prowings.webclientdemo.config;

import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	
	@Bean
	public WebClient webClient()
	{
		WebClient webClient = WebClient.create("http://localhost:8080");
		return webClient;
	}

//	@Bean
//	public InMemoryHttpExchangeRepository createTraceRepository() {
//	  return new InMemoryHttpExchangeRepository();
//	}
}
