package com.cic;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ApiDomainApplication {
	private static final Logger logger = Logger.getLogger(ApiDomainApplication.class);

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ApiDomainApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				logger.info("cors");
				registry.addMapping("/**").allowedMethods("GET", "POST").allowedOrigins("*"); //deploy xem
				
			}
		};
	}
}
