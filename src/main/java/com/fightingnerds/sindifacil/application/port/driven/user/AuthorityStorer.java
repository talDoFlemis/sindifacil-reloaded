package com.fightingnerds.sindifacil.application.port.driven.user;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.user.Authority;

import java.util.Optional;
import java.util.UUID;

public interface AuthorityStorer extends Storer<Authority, UUID> {
	Optional<Authority> getByAuthority(String authority);
}
