package de.schaefer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homm3ProjectApplication {
	
	public static final String PATHNAME_APPLICATION = "/homm3";

	public static void main(String[] args) {
		SpringApplication.run(Homm3ProjectApplication.class, args);
	}

}

