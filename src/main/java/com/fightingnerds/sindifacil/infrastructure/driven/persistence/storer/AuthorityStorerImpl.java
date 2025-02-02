package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.user.AuthorityStorer;
import com.fightingnerds.sindifacil.domain.model.user.Authority;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.AuthorityJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.AuthorityPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorityStorerImpl implements AuthorityStorer {
	private final AuthorityJpaRepository authorityJpaRepository;
	private final AuthorityPersistenceMapper authorityPersistenceMapper;

	@Override
	public Optional<Authority> getByAuthority(String authority) {
		return Optional.empty();
	}

	@Override
	public Authority store(Authority data) {
		return null;
	}

	@Override
	public Optional<Authority> getById(UUID id) {
		return Optional.empty();
	}
}
