package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CondominiumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondominiumJpaRepository extends JpaRepository<CondominiumEntity, Long> {
}
