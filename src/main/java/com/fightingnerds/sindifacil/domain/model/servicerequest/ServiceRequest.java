package com.fightingnerds.sindifacil.domain.model.servicerequest;

import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ServiceRequest {
	private Long id;
	private Provider provider;
	private Ticket ticket;
	private Long hoursWorked;
	private Date startedAt;
	private Date finishedAt;
	private List<ServiceRequestAttachment> attachments;
}
