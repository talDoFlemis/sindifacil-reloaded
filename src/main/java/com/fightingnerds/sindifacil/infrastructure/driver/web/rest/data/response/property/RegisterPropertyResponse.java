package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property;

import com.fightingnerds.sindifacil.domain.model.Condominium;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RegisterPropertyResponse {
	private Long id;

	@NotNull
	private Address address;

	@NotNull
	private Condominium condominium;

	@NotNull
	private JointOwner.JointOwner jointOwner;
}
