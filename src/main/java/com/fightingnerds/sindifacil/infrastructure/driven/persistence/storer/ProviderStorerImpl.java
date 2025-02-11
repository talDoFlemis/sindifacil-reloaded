package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.provider.ProviderStorer;
import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ProviderJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ProviderPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProviderStorerImpl implements ProviderStorer {
	private final ProviderPersistenceMapper providerPersistenceMapper;
	private final ProviderJpaRepository providerJpaRepository;
	@Override
	public Provider store(Provider data) {
		return null;
	}

	@Override
	public Optional<Provider> getById(UUID id) {
		return Optional.empty();
	}
}
