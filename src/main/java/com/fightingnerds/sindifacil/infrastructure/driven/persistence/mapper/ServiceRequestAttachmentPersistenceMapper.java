package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequestAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.ServiceRequestAttachmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceRequestAttachmentPersistenceMapper extends PersistenceMapper<ServiceRequestAttachmentEntity, ServiceRequestAttachment> {
}
