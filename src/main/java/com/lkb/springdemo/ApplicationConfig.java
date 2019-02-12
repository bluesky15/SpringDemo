package com.lkb.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Triangle getTriangel() {
		return new Triangle();
	}
}
