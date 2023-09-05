package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UploadCsvFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadCsvFileApplication.class, args);
		System.out.println("spring server started");
	}

}
