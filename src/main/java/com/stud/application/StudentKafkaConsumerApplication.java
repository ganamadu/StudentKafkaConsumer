package com.stud.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.stud")
public class StudentKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentKafkaConsumerApplication.class, args);
	}

}
