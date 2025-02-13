package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceStorer;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ServiceJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ServicePersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ServiceStorerImpl implements ServiceStorer {
	private final ServiceJpaRepository serviceJpaRepository;
	private final ServicePersistenceMapper servicePersistenceMapper;

	@Override
	public com.fightingnerds.sindifacil.domain.model.service.Service store(com.fightingnerds.sindifacil.domain.model.service.Service data) {
		return null;
	}

	@Override
	public Optional<com.fightingnerds.sindifacil.domain.model.service.Service> getById(Long id) {
		return Optional.empty();
	}
}
