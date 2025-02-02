package com.fightingnerds.sindifacil.application.port.driver.jointowner;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

public interface GetJointOwnerUseCase {
	JointOwner getJointOwner(Long id);
}
