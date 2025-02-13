package com.fightingnerds.sindifacil.domain.model.servicerequest;

import com.fightingnerds.sindifacil.domain.model.attachment.Attachment;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class ServiceRequestAttachment extends Attachment {
	private ServiceRequest serviceRequest;
}
