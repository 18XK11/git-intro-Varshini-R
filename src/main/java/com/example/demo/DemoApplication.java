package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.LogLevel;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int i=1;

		SpringApplication.run(DemoApplication.class, args);
	}
}
