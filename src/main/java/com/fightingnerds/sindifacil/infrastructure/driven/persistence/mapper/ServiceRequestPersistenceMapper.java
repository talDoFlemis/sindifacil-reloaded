package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceRequestEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceRequestPersistenceMapper extends PersistenceMapper<ServiceRequestEntity, ServiceRequest> {
}
