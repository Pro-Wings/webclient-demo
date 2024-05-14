package com.prowings.webclientdemo.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.webclientdemo.service.MyWebClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {
	
	@Autowired
	MyWebClientService service;
	
	@GetMapping("/webclient_hello")
	public Mono<String> getHello() throws InterruptedException, ExecutionException
	{
		return service.getHelloCall();
	}

	@GetMapping("/webclient_hello_list")
	public Flux<String> getHello_list()
	{
		return service.getHelloListCall();
	}

}
