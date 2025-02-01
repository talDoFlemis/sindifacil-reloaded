package com.fightingnerds.sindifacil.forms;

import com.fightingnerds.sindifacil.domain.model.ServiceRequestAttachment;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class ServiceRequestForm {
	private Long hoursWorked;

	private Date startedAt;

	private Date finishedAt;

	private List<ServiceRequestAttachment> attachments;
}
