package edu.bj.reservation.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
@Controller
public class TesteEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteEurekaServerApplication.class, args);
	}
	
	
	@RequestMapping("/messagex")
	String message() {
		return "tatata";
	}	
}
