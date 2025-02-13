package com.fightingnerds.sindifacil.forms;

import lombok.Getter;

import java.util.Date;
import java.util.List;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequestAttachment;

@Getter
public class ServiceRequestForm {
	private Long hoursWorked;

	private Date startedAt;

	private Date finishedAt;

	private List<ServiceRequestAttachment> attachments;
}
