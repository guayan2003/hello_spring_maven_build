package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo1Application extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo1Application.class);
	}
	
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo1Application.class);
//        app.setDefaultProperties(Collections
//          .singletonMap("server.port", "8150"));
        app.run(args);		
	}

}
