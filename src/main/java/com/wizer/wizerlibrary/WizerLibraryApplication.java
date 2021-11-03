package com.wizer.wizerlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WizerLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WizerLibraryApplication.class, args);
	}

}
