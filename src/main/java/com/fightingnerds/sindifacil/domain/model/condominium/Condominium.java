package com.fightingnerds.sindifacil.domain.model.condominium;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.SyndicEntity;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.domain.model.property.Property;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class Condominium {
	private Long id;
	@NotBlank
	private String name;
	private List<Property> properties;
	private SyndicEntity syndic;
	@NotBlank
	private Address address;
}
