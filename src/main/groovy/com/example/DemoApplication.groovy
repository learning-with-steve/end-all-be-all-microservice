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
        log.info 'Go Speed Racer Go'
		log.debug "The time is now ${new Date()}"
        (100..0).each {
            log.info it
        }

		assert 'Steve Good'.reverse() == 'dooG evetS'
		print "Hello!".chars().sum()
	}
}
