package com.demo.retobcp.api;

import com.demo.retobcp.api.config.properties.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableConfigurationProperties(AppProperties.class)
@ComponentScan(basePackages = "com.demo.retobcp")
//@EntityScan("com.demo.retobcp.domain")
//@EnableJpaRepositories("com.demo.retobcp.repository")
@SpringBootApplication
public class DemoretobcpApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoretobcpApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoretobcpApplication.class, args);
	}

}
