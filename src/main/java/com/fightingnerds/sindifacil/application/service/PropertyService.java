package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.property.PropertyStorer;
import com.fightingnerds.sindifacil.application.port.driver.property.ChangePropertyJointOwner;
import com.fightingnerds.sindifacil.application.port.driver.property.GetAllProperties;
import com.fightingnerds.sindifacil.application.port.driver.property.GetPropertiesByCondominium;
import com.fightingnerds.sindifacil.application.port.driver.property.RegisterProperty;
import com.fightingnerds.sindifacil.domain.model.Condominium;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PropertyService implements GetPropertiesByCondominium, GetAllProperties, RegisterProperty, ChangePropertyJointOwner {
	private PropertyStorer propertyStorer;

	@Override
	public Property changePropertyJointOwner(Property property, JointOwner jointOwner) {
		return null;
	}

	@Override
	public List<Property> getAllProperties() {
		return List.of();
	}

	@Override
	public List<Property> getPropertiesByCondominium(Condominium condominium) {
		return List.of();
	}

	@Override
	public Property registerProperty(Property property, Long condominiumId) {
		return null;
	}
}
