package com.fightingnerds.sindifacil.application.port.driver.property;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;

import java.util.List;

public interface GetPropertiesByJointOwner {
	public List<Property> getPropertiesByJointOwner(JointOwner.JointOwner jointOwner);
}
