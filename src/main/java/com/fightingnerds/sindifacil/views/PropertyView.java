package com.fightingnerds.sindifacil.views;

import com.fightingnerds.sindifacil.controllers.PropertyController;
import com.fightingnerds.sindifacil.domain.model.Condominium;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PropertyView {
	private final PropertyController propertyController;

	public void listAllProperties() {
	}

	public void listPropertiesByCondominium(Condominium condominium) {
	}
}
