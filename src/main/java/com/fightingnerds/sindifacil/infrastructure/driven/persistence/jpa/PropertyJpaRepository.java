package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyJpaRepository extends JpaRepository<PropertyEntity, Long> {
}
