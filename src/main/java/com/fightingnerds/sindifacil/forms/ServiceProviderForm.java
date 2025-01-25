package com.fightingnerds.sindifacil.forms;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class ServiceProviderForm {
	private String billingRatePerHour;

	private String description;

	private Long experienceInMonths;
}
