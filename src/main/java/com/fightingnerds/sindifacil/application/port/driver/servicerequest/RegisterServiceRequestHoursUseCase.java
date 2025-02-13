package com.fightingnerds.sindifacil.application.port.driver.servicerequest;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

public interface RegisterServiceRequestHoursUseCase {
    ServiceRequest registerServiceRequestHours(ServiceRequest request);
}
