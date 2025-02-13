package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.service.Service;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.UpdaterServiceRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceRestMapper {
	Service toDomain(CreateServiceRequest createServiceRequest);
	Service toDomain(UpdaterServiceRequest updaterServiceRequest);
	ServiceResponse toResponse(ServiceResponse serviceResponse);
}
