package uk.co.cetinkaya.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringColudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringColudConfigServerApplication.class, args);
	}

}
