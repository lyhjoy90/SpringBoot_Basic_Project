package com.basic.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MySpringBootAdminApplication.class);

		// 아래 줄을 주석 처리하거나 삭제합니다.
		// application.setWebApplicationType(WebApplicationType.SERVLET);

		application.run(args);
	}

	@Bean
	public String myBean() {
		return "Hello Bean";
	}
}