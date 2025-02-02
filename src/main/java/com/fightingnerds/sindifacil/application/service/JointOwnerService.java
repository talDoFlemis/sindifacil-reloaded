package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.jointowner.JointOwnerStorer;
import com.fightingnerds.sindifacil.application.port.driver.jointowner.*;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class JointOwnerService implements
	AddNewPropertyToJointOwnerUseCase,
	CreateJointOwnerUseCase,
	UpdateJointOwnerUseCase,
	RemovePropertyFromJointOwnerUseCase,
	GetAllJointOwnersUseCase,
	RemoveJointOwnerUseCase,
	GetJointOwnerUseCase
{
	private final JointOwnerStorer jointOwnerStorer;
	private final PropertyService propertyService;

	@Override
	public JointOwner addNewPropertyToJointOwner(JointOwner jointOwner, Property property) {
		return null;
	}

	@Override
	public JointOwner create(JointOwner jointOwner) {
		return null;
	}

	@Override
	public JointOwner removePropertyFromJointOwner(Long jointOwnerId, Long propertyId) {
		return null;
	}

	@Override
	public JointOwner update(JointOwner jointOwner) {
		return null;
	}

	@Override
	public List<JointOwner> getAllJointOwners() {
		return List.of();
	}

	@Override
	public void removeJointOwner(JointOwner jointOwner) {

	}

	@Override
	public JointOwner getJointOwner(Long id) {
		return null;
	}
}
