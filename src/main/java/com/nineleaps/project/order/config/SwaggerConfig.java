package com.nineleaps.project.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	// Swagger Metadata: http://localhost:8080/v2/api-docs
	// Swagger UI URL: http://localhost:8080/swagger-ui.html
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.nineleaps.project.order"))
				.paths(PathSelectors.any())
				.build();
	}
	
	 private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()              
	                .title("Nineleaps Order Management Service")
	                .description("This page lists all API's of Order Service") 
	                .version("2.0")
	                .contact(new Contact("Garima Pruthi", "https://nineleaps.com", "garima.pruthi@nineleaps.com"))
	                .license("License 2.0")
					.licenseUrl("https://nineleaps.com/license.html")
	                .build();
	    }
	 
}
