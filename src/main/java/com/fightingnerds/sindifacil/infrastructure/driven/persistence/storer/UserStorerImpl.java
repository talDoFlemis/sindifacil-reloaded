package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.user.UserStorer;
import com.fightingnerds.sindifacil.domain.model.user.User;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.UserJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.UserPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserStorerImpl implements UserStorer {
	private final UserJpaRepository userJpaRepository;
	private final UserPersistenceMapper userPersistenceMapper;

	@Override
	public User store(User user) {
		return null;
	}

	@Override
	public Optional<User> getById(UUID id) {
		return Optional.empty();
	}

	@Override
	public Optional<User> getByEmail(String email) {
		return Optional.empty();
	}

	@Override
	public Optional<User> getByUsername(String username) {
		return Optional.empty();
	}
}
