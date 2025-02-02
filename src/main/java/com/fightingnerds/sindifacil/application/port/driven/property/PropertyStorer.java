package com.fightingnerds.sindifacil.application.port.driven.property;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.Condominium;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;

import java.util.List;

public interface PropertyStorer extends Storer<Property, Long> {
	List<Property> getAllProperties();
	List<Property> getPropertiesByCondominium(Condominium condominium);
	List<Property> getPropertiesByJointOwner(JointOwner jointOwner);
	Property updateProperty(Property property);
}
