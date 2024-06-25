package com.lol.lolsearchtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LOLSearchToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(LOLSearchToolApplication.class, args);
	}

}
