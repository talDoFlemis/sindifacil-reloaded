package com.fightingnerds.sindifacil.application.port.driver.jointowner;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;

public interface AddNewPropertyToJointOwnerUseCase {
	JointOwner addNewPropertyToJointOwner(JointOwner jointOwner, Property property);
}
