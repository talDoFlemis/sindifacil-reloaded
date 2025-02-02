package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.property.PropertyStorer;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.property.Property;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.PropertyJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.PropertyPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class PropertyStorerImpl implements PropertyStorer {
	private final PropertyJpaRepository propertyJpaRepository;
	private final PropertyPersistenceMapper propertyPersistenceMapper;

	@Override
	public List<Property> getAllProperties() {
		return List.of();
	}

	@Override
	public List<Property> getPropertiesByCondominium(Condominium condominium) {
		return List.of();
	}

	@Override
	public List<Property> getPropertiesByJointOwner(JointOwner jointOwner) {
		return List.of();
	}

	@Override
	public Property updateProperty(Property property) {
		return null;
	}

	@Override
	public Property store(Property data) {
		return null;
	}

	@Override
	public Optional<Property> getById(Long id) {
		return Optional.empty();
	}
}
