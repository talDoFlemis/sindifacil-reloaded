package com.fightingnerds.sindifacil.application.port.driver.servicerequest;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

public interface UpdateServiceRequestUseCase {
    ServiceRequest updateServiceRequest(Long id, ServiceRequest request);
}
