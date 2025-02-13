package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.property;

import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.address.CreateAddressRequest;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UpdatePropertyRequest {
	@NotNull
	private CreateAddressRequest address;
}
