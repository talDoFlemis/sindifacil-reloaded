package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ServiceRequestForm;
import com.fightingnerds.sindifacil.models.Provider;
import com.fightingnerds.sindifacil.models.ServiceRequest;
import com.fightingnerds.sindifacil.models.Ticket;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ServiceRequestController {
	public List<ServiceRequest> listAllServiceRequests() {
		return null;
	}

	public List<ServiceRequest> listAllServiceRequestByProvider(Provider provider) {
		return null;
	}

	public List<ServiceRequest> listAllServiceRequestsByTicket(Ticket ticket) {
		return null;
	}

	public void addServiceRequestToATicket(Ticket ticket, Provider Provider, ServiceRequestForm serviceRequestForm) {
	}

	public void registerHoursWorked(ServiceRequest serviceRequest, Long hoursWorked) {
	}

	public void editServiceRequest(ServiceRequest serviceRequest, ServiceRequestForm serviceRequestForm) {
	}
}
