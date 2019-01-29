package edu.mrd.mgenerator.mailgeneratortemplateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MailGeneratorTemplateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGeneratorTemplateServiceApplication.class, args);
	}

}

