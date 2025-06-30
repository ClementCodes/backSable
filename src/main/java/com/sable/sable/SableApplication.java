package com.sable.sable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SableApplication.class, args);
		System.err.println("jenkins mise ne palce et maintenant cle token");
	}

}
