package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.address;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {
	@NotEmpty(message = "Street is required")
	private String street;

	@NotEmpty(message = "City is required")
	private String city;

	@NotEmpty(message = "Zip code is required")
	private String zipCode;

	private String complement;

	@NotEmpty(message = "Neighborhood is required")
	private String neighborhood;
}
