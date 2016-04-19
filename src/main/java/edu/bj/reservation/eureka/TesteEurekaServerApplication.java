package edu.bj.reservation.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaServer
public class TesteEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteEurekaServerApplication.class, args);
	}
	
	
	@RequestMapping("/messagex")
	String message() {
		return "tatata";
	}	
}
