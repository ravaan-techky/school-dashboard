/**
 * @#DashboardApplication.java October 24, 2018
 */
package com.techky.school.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Class used to initialized spring boot application.
 *
 * @author Bhushan Patil
 */
@SpringBootApplication
@EnableSwagger2
public class DashboardApplication extends SpringBootServletInitializer {

	/**
	 * Method to configure Spring boot application.
	 *
	 * @param application SpringApplicationBuilder instance.
	 */
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(DashboardApplication.class);
	}

	/**
	 * Method to start Spring boot application.
	 *
	 * @param args string array instance.
	 */
	public static void main(final String[] args) throws Exception {
		SpringApplication.run(DashboardApplication.class, args);
	}

}