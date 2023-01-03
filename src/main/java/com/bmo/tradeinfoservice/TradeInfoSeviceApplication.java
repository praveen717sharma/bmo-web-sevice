package com.bmo.tradeinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.bmo.bmomodel.model"})
public class TradeInfoSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeInfoSeviceApplication.class, args);
	}

}
