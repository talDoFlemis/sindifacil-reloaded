package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.condominium.CondominiumStorer;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.SyndicEntity;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.CondominiumJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.CondominiumPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class CondominiumStorerImpl implements CondominiumStorer {
	private final CondominiumPersistenceMapper condominiumPersistenceMapper;
	private final CondominiumJpaRepository condominiumJpaRepository;

	@Override
	public List<Condominium> getAll() {
		return List.of();
	}

	@Override
	public Condominium update(Condominium condominium) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

	@Override
	public Condominium changeSyndic(Condominium condominium, SyndicEntity syndic) {
		return null;
	}

	@Override
	public Condominium store(Condominium data) {
		return null;
	}

	@Override
	public Optional<Condominium> getById(Long id) {
		return Optional.empty();
	}
}
