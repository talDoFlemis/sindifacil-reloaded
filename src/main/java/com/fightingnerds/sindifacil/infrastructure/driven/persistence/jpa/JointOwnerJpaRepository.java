package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.JointOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JointOwnerJpaRepository extends JpaRepository<JointOwnerEntity, UUID> {
}
