package com.fightingnerds.sindifacil.domain.model.user;

import lombok.experimental.FieldNameConstants;

@FieldNameConstants(onlyExplicitlyIncluded = true)
public enum Role {
	@FieldNameConstants.Include SYNDIC("SYNDIC"),
	@FieldNameConstants.Include JOINT_OWNER("JOINT OWNER"),
	@FieldNameConstants.Include MANAGER("MANAGER");

	private final String displayName;

	Role(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
