package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JointOwnerJpaRepository extends JpaRepository<JointOwner, UUID> {
}
