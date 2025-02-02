package com.fightingnerds.sindifacil.application.port.driven.jointowner;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

import java.util.List;
import java.util.UUID;

public interface JointOwnerStorer extends Storer<JointOwner, UUID> {
	JointOwner update(JointOwner jointOwner);
	List<JointOwner> getAll();
}
