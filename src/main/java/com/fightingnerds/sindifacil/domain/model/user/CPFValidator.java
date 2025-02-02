package com.fightingnerds.sindifacil.domain.model.user;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CPFValidator implements ConstraintValidator<CPF, String> {

	@Override
	public void initialize(CPF constraintAnnotation) {
	}

	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {
		if (cpf == null || cpf.trim().isEmpty()) {
			return false;
		}
		return isValidCPF(cpf);
	}

	private boolean isValidCPF(String cpf) {
		cpf = cpf.replaceAll("[^0-9]", ""); // Remove non-numeric characters

		if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
			return false; // Invalid length or repeated digits
		}

		return isValidCPFChecksum(cpf);
	}

	private boolean isValidCPFChecksum(String cpf) {
		int[] weights1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] weights2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

		int digit1 = calculateCPFChecksum(cpf.substring(0, 9), weights1);
		int digit2 = calculateCPFChecksum(cpf.substring(0, 9) + digit1, weights2);

		return cpf.equals(cpf.substring(0, 9) + digit1 + digit2);
	}

	private int calculateCPFChecksum(String str, int[] weights) {
		int sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += Character.getNumericValue(str.charAt(i)) * weights[i];
		}
		int remainder = sum % 11;
		return (remainder < 2) ? 0 : (11 - remainder);
	}
}
