package com.playground.springboot.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication (
//	scanBasePackages = {"com.playground.springboot.myApp",
//			"com.util"}
//)
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
