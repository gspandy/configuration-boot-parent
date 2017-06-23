package com.janita;

import com.janita.config.PropertiesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PropertiesConfig.class)
public class StaticPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaticPropertiesApplication.class, args);
	}
}
