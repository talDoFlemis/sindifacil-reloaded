package com.fightingnerds.sindifacil.domain.model.service;

import com.fightingnerds.sindifacil.domain.model.provider.Provider;

import lombok.Data;

@Data
public class ServiceProvider {
	private Service service;
	private Provider provider;
	private String billingRatePerHour;
	private String description;
	private Long experienceInMonths;
}
