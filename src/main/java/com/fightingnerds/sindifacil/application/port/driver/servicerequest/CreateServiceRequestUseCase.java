package com.fightingnerds.sindifacil.application.port.driver.servicerequest;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

public interface CreateServiceRequestUseCase {
    ServiceRequest createServiceRequest(ServiceRequest request);
}
