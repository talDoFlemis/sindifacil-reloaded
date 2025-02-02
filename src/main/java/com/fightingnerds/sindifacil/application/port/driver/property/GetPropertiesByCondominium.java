package com.fightingnerds.sindifacil.application.port.driver.property;

import com.fightingnerds.sindifacil.domain.model.Condominium;
import com.fightingnerds.sindifacil.domain.model.property.Property;

import java.util.List;

public interface GetPropertiesByCondominium {
	public List<Property> getPropertiesByCondominium(Condominium condominium);
}
