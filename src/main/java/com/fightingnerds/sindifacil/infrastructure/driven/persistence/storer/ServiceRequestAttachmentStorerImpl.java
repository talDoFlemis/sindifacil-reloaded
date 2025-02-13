package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.servicerequest.ServiceRequestAttachmentStorer;
import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequestAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ServiceRequestAttachmentJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ServiceRequestAttachmentPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceRequestAttachmentStorerImpl implements ServiceRequestAttachmentStorer {
	private final ServiceRequestAttachmentJpaRepository serviceRequestAttachmentJpaRepository;
	private final ServiceRequestAttachmentPersistenceMapper serviceRequestAttachmentPersistenceMapper;

	@Override
	public ServiceRequestAttachment store(ServiceRequestAttachment data) {
		// ...implementation...
		return null;
	}

	@Override
	public Optional<ServiceRequestAttachment> getById(Long id) {
		// ...implementation...
		return Optional.empty();
	}
}
