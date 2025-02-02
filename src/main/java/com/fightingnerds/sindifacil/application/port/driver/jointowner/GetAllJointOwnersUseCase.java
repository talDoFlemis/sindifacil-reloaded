package com.fightingnerds.sindifacil.application.port.driver.jointowner;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

import java.util.List;

public interface GetAllJointOwnersUseCase {
	List<JointOwner> getAllJointOwners();
}
