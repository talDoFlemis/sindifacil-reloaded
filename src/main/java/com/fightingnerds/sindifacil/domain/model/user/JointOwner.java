package com.fightingnerds.sindifacil.domain.model.user;

import com.fightingnerds.sindifacil.domain.model.property.Property;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class JointOwner extends User {
	private List<Property> properties;
}