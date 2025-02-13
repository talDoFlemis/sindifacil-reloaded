package com.fightingnerds.sindifacil.application.port.driven.service;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

public interface ServiceRequestStorer extends Storer<ServiceRequest, Long> {
}
