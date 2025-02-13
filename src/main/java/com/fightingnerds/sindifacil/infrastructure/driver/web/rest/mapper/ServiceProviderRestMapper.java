package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.UpdateServiceProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceProviderResponse;

import org.mapstruct.Mapper;

@Mapper
public interface ServiceProviderRestMapper {
	ServiceProvider toDomain(CreateServiceProviderRequest createServiceProviderRequest);
	ServiceProvider toDomain(UpdateServiceProviderRequest updateServiceProviderRequest);
	ServiceProviderResponse toResponse(ServiceProvider serviceProvider);
}
