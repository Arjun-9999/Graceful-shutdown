package com.gracefulshutdown;

import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class GracefulShutdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(GracefulShutdownApplication.class, args);
		
		
	}

}
