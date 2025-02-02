package com.fightingnerds.sindifacil.application.port.driver.jointowner;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

public interface RemovePropertyFromJointOwnerUseCase {
	JointOwner removePropertyFromJointOwner(Long jointOwnerId, Long propertyId);
}
