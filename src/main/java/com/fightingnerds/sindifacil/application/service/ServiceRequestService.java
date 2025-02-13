package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driver.servicerequest.*;
import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceRequestService implements 
    CreateServiceRequestUseCase, 
    UpdateServiceRequestUseCase, 
    RegisterServiceRequestHoursUseCase, 
    ListServiceRequestsByTicketUseCase, 
    ListServiceRequestsByProviderUseCase {

    // Inject necessary dependencies here
    // private final SomeDependency someDependency;

    @Override
    public ServiceRequest createServiceRequest(ServiceRequest request) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'createServiceRequest'");
    }

    @Override
    public ServiceRequest updateServiceRequest(Long id, ServiceRequest request) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'updateServiceRequest'");
    }

    @Override
    public ServiceRequest registerServiceRequestHours(ServiceRequest request) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'registerServiceRequestHours'");
    }

    @Override
    public List<ServiceRequest> listServiceRequestsByTicket(ServiceRequest request) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'listServiceRequestsByTicket'");
    }

    @Override
    public List<ServiceRequest> listServiceRequestsByProvider(ServiceRequest request) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'listServiceRequestsByProvider'");
    }
}
