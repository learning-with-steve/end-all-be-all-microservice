package com.example

import groovy.util.logging.Slf4j
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Slf4j
@SpringBootApplication
class DemoApplication implements CommandLineRunner {

	static void main(String[] args) {
		SpringApplication.run DemoApplication, args
	}

	@Override
	void run(String... args) throws Exception {
		log.info 'Hello, world!'
	}
}
