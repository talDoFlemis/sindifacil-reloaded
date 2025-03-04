package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdatePropertyResponse {
	private Long id;

	@NotNull
	private Address address;

	@NotNull
	private Condominium condominium;

	@NotNull
	private JointOwner jointOwner;
}
