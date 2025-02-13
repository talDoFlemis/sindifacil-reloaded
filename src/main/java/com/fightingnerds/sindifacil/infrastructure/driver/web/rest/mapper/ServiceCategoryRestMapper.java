package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceCategoryRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.UpdateServiceCategoryRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceCategoryResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceCategoryRestMapper {
	ServiceCategory toDomain(CreateServiceCategoryRequest createServiceCategoryRequest);
	ServiceCategory toDomain(UpdateServiceCategoryRequest updateServiceCategoryRequest);
	ServiceCategoryResponse toResponse(ServiceCategory serviceCategory);
}
