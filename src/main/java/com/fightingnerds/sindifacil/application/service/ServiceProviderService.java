package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceProviderStorer;
import com.fightingnerds.sindifacil.application.port.driver.serviceprovider.*;
import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceProviderService implements 
    ListAllServiceProvidersUseCase, 
    AddServiceProviderUseCase, 
    EditServiceProviderUseCase, 
    RemoveServiceProviderUseCase {
    private final ServiceProviderStorer serviceProviderStorer;

    // Inject necessary dependencies here
    // private final SomeDependency someDependency;

    @Override
    public List<ServiceProvider> listAllServiceProviders() {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'listAllServiceProviders'");
    }

    @Override
    public ServiceProvider addServiceProvider(ServiceProvider serviceProvider) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'addServiceProvider'");
    }

    @Override
    public ServiceProvider editServiceProvider(ServiceProvider serviceProvider) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'editServiceProvider'");
    }

    @Override
    public void removeServiceProvider(Long id) {
        // TODO: Implement the method
        throw new UnsupportedOperationException("Unimplemented method 'removeServiceProvider'");
    }
}
