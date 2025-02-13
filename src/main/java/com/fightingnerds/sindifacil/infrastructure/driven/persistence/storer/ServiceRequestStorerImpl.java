package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceRequestStorer;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceRequestEntity;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ServiceRequestJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ServiceRequestPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ServiceRequestStorerImpl implements ServiceRequestStorer {
	private final ServiceRequestJpaRepository serviceRequestJpaRepository;
	private final ServiceRequestPersistenceMapper serviceRequestPersistenceMapper;

	@Override
	public com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest store(com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest data) {
		ServiceRequestEntity entity = serviceRequestPersistenceMapper.toEntity(data);
		entity = serviceRequestJpaRepository.save(entity);
		return serviceRequestPersistenceMapper.toDomain(entity);
	}

	@Override
	public Optional<com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest> getById(Long id) {
		return serviceRequestJpaRepository.findById(id)
			.map(serviceRequestPersistenceMapper::toDomain);
	}
}
