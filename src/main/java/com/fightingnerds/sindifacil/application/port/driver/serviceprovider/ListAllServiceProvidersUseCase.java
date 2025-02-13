package com.fightingnerds.sindifacil.application.port.driver.serviceprovider;

import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;
import java.util.List;

public interface ListAllServiceProvidersUseCase {
    List<ServiceProvider> listAllServiceProviders();
}
