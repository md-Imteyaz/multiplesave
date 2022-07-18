package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:queries.xml")
//@Profile("local")
public class MultipleSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleSaveApplication.class, args);

	}

}
