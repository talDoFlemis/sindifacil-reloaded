package com.fightingnerds.sindifacil.domain.model.address;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private Long id;
	@NotBlank(message = "Street is required")
	private String street;
	@NotBlank(message = "City is required")
	private String city;
	@BrazilZipCode
	private String zipCode;
	private String complement;
	@NotBlank(message = "Neighborhood is required")
	private String neighborhood;
}
