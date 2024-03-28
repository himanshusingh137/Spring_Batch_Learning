package com.springboot.SpringBatch_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.springboot"})
public class SpringBatchLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchLearningApplication.class, args);
	}

}
