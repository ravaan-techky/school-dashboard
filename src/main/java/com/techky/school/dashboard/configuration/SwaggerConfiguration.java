/**
 * @#SwaggerConfiguration.java June 06, 2020
 */
package com.techky.school.dashboard.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * The Class SwaggerConfiguration.
 */
@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.techky.school.dashboard.rest.controller")).build();
	}
}
