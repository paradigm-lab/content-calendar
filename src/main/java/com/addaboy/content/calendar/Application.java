package com.addaboy.content.calendar;

import com.addaboy.content.calendar.model.Content;
import com.addaboy.content.calendar.model.Status;
import com.addaboy.content.calendar.model.Type;
import com.addaboy.content.calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
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
	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert same data into the database
			Content content = new Content(null,
					"Hello Chat GPT",
					"All about Chat GPT",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					""
			);
			repository.save(content);
		};
	}
}