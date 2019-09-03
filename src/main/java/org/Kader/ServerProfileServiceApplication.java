package org.Kader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.great.ServerModelClassExample.entities")
public class ServerProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProfileServiceApplication.class, args);
	}

}
