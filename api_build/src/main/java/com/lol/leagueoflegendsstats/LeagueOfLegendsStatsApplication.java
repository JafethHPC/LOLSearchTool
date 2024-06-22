package com.lol.leagueoflegendsstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LeagueOfLegendsStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueOfLegendsStatsApplication.class, args);
	}

}
