package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceProviderStorer;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ServiceProviderJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ServiceProviderPersistenceMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ServiceProviderStorerImpl implements ServiceProviderStorer {
	private final ServiceProviderJpaRepository serviceProviderJpaRepository;
	private final ServiceProviderPersistenceMapper serviceProviderPersistenceMapper;

	@Override
	public com.fightingnerds.sindifacil.domain.model.service.ServiceProvider store(
			com.fightingnerds.sindifacil.domain.model.service.ServiceProvider data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'store'");
	}

	@Override
	public Optional<com.fightingnerds.sindifacil.domain.model.service.ServiceProvider> getById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getById'");
	}
}
