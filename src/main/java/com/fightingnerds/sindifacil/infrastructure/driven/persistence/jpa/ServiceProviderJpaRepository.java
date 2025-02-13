package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceProviderEntity;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceProviderEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ServiceProviderJpaRepository extends JpaRepository<ServiceProviderEntity, ServiceProviderEntityId> {
}
