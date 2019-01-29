package edu.mrd.mgenerator.mailgeneratoreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MailGeneratorEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGeneratorEurekaServerApplication.class, args);
	}

}

