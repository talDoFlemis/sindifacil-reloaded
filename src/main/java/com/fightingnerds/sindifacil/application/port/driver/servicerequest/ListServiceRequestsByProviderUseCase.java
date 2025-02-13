package com.fightingnerds.sindifacil.application.port.driver.servicerequest;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

import java.util.List;

public interface ListServiceRequestsByProviderUseCase {
    List<ServiceRequest> listServiceRequestsByProvider(ServiceRequest request);
}
