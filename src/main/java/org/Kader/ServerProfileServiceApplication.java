package org.Kader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages="org.great.ServerModelClassExample.entities")
@EnableResourceServer
public class ServerProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProfileServiceApplication.class, args);
	}

}
