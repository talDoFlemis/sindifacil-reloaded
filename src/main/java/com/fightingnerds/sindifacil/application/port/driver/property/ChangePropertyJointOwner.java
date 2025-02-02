package com.fightingnerds.sindifacil.application.port.driver.property;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;

public interface ChangePropertyJointOwner {
	public Property changePropertyJointOwner(Property property, JointOwner.JointOwner jointOwner);
}
