package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.address;

import lombok.*;

@Builder
@AllArgsConstructor
@Data
public class AddressResponse {
	private Long id;
	private String street;
	private String city;
	private String zipCode;
	private String complement;
	private String neighborhood;
}
