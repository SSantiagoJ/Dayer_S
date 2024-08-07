package com.springboot.clienteapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootClienteappApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootClienteappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pass1 = "user";
		String pass2 = "admin";

		System.out.println(passwordEncoder.encode(pass1));
		System.out.println(passwordEncoder.encode(pass2));
	}

}
