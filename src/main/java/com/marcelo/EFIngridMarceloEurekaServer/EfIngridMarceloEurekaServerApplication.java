package com.marcelo.EFIngridMarceloEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfIngridMarceloEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfIngridMarceloEurekaServerApplication.class, args);
	}

}
