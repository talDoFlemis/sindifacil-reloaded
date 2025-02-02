package com.fightingnerds.sindifacil.application.port.driven.user;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.user.User;

import java.util.Optional;
import java.util.UUID;

public interface UserStorer extends Storer<User, UUID> {
	Optional<User> getByEmail(String email);
	Optional<User> getByUsername(String username);
}
