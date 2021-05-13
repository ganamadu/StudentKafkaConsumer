package com.stud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.core.Student;

@Service
public class StudentKafkaConsumerService {

	private final Logger logger 
	= LoggerFactory.getLogger(StudentKafkaConsumerService.class);

	/*
	 * @KafkaListener(topics = "${general.topic.name}", groupId =
	 * "${general.topic.group.id}") public void consume(String message) {
	 * logger.info(String.format("Message recieved -> %s", message)); }
	 */
	@KafkaListener(topics = "${stud.topic.name}", 
			groupId = "${stud.topic.group-id}",
			containerFactory = "userKafkaListenerContainerFactory")
	public void consume(Student student) {
		logger.info(String.format("Kafka Consumer Student created -> %s", student.getSname()));
	}
	
	@KafkaListener(topics = "${emp.topic.name}", 
			groupId = "${emp.topic.group-id}",
			containerFactory = "empKafkaListenerContainerFactory")
	public void consumeEmp(String empJson) {
		logger.info(String.format("Kafka Consumer Student created -> %s", empJson));
	}

}
