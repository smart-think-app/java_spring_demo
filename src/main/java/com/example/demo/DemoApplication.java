package com.example.demo;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
                SpringApplication app = new SpringApplication(DemoApplication.class);
                app.setDefaultProperties(Collections.singletonMap("server.port", "3000"));
                app.run(args);
	}

}
