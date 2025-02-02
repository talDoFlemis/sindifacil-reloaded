package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.jointowner.JointOwnerStorer;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.JointOwnerJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.JointOwnerPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class JointOwnerStoreImpl implements JointOwnerStorer {
	private final JointOwnerPersistenceMapper jointOwnerPersistenceMapper;
	private final JointOwnerJpaRepository jointOwnerJpaRepository;

	@Override
	public JointOwner update(JointOwner jointOwner) {
		return null;
	}

	@Override
	public List<JointOwner> getAll() {
		return List.of();
	}

	@Override
	public JointOwner store(JointOwner data) {
		return null;
	}

	@Override
	public Optional<JointOwner> getById(UUID id) {
		return Optional.empty();
	}
}
