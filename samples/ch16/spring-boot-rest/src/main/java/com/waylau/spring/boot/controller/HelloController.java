package com.waylau.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller.
 * 
 * @since 1.0.0 2019年2月13日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit waylau.com!";
	}

}
