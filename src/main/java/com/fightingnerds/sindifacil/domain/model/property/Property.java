package com.fightingnerds.sindifacil.domain.model.property;

import com.fightingnerds.sindifacil.domain.model.Condominium;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Property {
	private Long id;

	@NotNull
	private Address address;

	@NotNull
	private Condominium condominium;

	@NotNull
	private JointOwner jointOwner;
}
