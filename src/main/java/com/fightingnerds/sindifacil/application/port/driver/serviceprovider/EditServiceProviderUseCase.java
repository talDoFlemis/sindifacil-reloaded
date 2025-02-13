package com.fightingnerds.sindifacil.application.port.driver.serviceprovider;

import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;

public interface EditServiceProviderUseCase {
    ServiceProvider editServiceProvider(ServiceProvider serviceProvider);
}
