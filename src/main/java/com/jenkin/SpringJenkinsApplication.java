package com.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication{

	static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	qqqd // forcefully build fail
	@PostConstruct
	public void init() {
		log.info("Application Started in main..........");
	}
	
	public static void main(String[] args) {
		log.info("Application executed............");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
		
	}

}
