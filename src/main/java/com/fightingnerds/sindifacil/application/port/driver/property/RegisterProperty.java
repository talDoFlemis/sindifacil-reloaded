package com.fightingnerds.sindifacil.application.port.driver.property;

import com.fightingnerds.sindifacil.domain.model.property.Property;

public interface RegisterProperty {
	public Property registerProperty(Property property, Long condominiumId);
}
