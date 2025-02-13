package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.service.Service;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.*;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.servicerequest.*;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.servicerequest.ServiceRequestResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceRestMapper {
	Service toDomain(CreateServiceRequest createServiceRequest);
	Service toDomain(UpdaterServiceRequest updaterServiceRequest);
	ServiceResponse toResponse(ServiceResponse serviceResponse);
	Service toDomain(ListServiceRequestByProviderRequest listServiceByProviderRequest);
	Service toDomain(ListServiceRequestByTicketRequest listServiceByTicketRequest);
	ServiceResponse toResponse(ServiceRequestResponse serviceRequestResponse);
	Service toDomain(UpdateServiceRequestRequest updateServiceRequestRequest);
	Service toDomain(RegisterServiceRequestHoursRequest registerServiceRequestJoursRequest);
}
