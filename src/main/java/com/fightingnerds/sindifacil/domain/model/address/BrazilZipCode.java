package com.fightingnerds.sindifacil.domain.model.address;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = BrazilZipCodeValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface BrazilZipCode {
	String message() default "Invalid Brazilian ZIP code. It should follow the pattern 00000-000.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}