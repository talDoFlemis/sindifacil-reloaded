package com.fightingnerds.sindifacil.domain.model.address;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BrazilZipCodeValidator implements ConstraintValidator<BrazilZipCode, String> {

	private static final String BRASIL_ZIP_CODE_REGEX = "^\\d{5}-\\d{3}$";

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.isEmpty()) {
			return true; // Consider using @NotNull if null values should be invalid
		}
		return value.matches(BRASIL_ZIP_CODE_REGEX);
	}
}
