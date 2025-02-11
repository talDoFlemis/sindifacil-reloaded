package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider.CreateProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider.UpdateProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.provider.ProviderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderRestMapper {
	Provider toDomain(CreateProviderRequest createProviderRequest);
	Provider toDomain(UpdateProviderRequest updateProviderRequest);
	ProviderResponse toResponse(Provider provider);
}
