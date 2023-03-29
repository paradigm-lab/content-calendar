package com.addaboy.content.calendar;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		/*
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");

		System.out.println(context.getBeanDefinitionCount());
		System.out.println(restTemplate);
		 */
	}

}
