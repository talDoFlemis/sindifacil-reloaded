package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceCategoryStorer;
import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ServiceCategoryJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ServiceCategoryPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ServiceCategoryStorerImpl implements ServiceCategoryStorer {
	private final ServiceCategoryJpaRepository serviceCategoryJpaRepository;
	private final ServiceCategoryPersistenceMapper serviceCategoryPersistenceMapper;

	@Override
	public ServiceCategory store(ServiceCategory data) {
		return null;
	}

	@Override
	public Optional<ServiceCategory> getById(Long id) {
		return Optional.empty();
	}
}
