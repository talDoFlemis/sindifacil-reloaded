package com.fightingnerds.sindifacil;

import org.springframework.boot.SpringApplication;

public class TestSindifacilApplication {

	public static void main(String[] args) {
		SpringApplication.from(SindifacilApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
