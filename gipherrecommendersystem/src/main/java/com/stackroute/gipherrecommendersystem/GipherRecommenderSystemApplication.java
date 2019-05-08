package com.stackroute.gipherrecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GipherRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GipherRecommenderSystemApplication.class, args);
	}

}

