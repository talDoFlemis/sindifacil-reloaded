package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.property;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.address.CreateAddressRequest;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class RegisterPropertyRequest {
	@NotNull
	private CreateAddressRequest address;

	@NotNull
	private Long condominiumId;
}
