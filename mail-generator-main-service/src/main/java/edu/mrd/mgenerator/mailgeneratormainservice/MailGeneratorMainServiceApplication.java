package edu.mrd.mgenerator.mailgeneratormainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MailGeneratorMainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGeneratorMainServiceApplication.class, args);
	}

}

