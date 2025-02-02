package com.fightingnerds.sindifacil.application.port.driver.jointowner;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

public interface CreateJointOwnerUseCase {
	JointOwner create(JointOwner jointOwner);
}
