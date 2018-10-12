package com.stackroute.movieserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieserviceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieserviceEurekaServerApplication.class, args);
	}
}
