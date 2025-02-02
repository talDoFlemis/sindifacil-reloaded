package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.application.port.driver.property.RegisterProperty;
import com.fightingnerds.sindifacil.domain.model.property.Property;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property.FindAllPropertiesByCondominiumResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property.FindAllPropertiesByJointOwnerResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property.FindAllPropertiesResponse;
import org.mapstruct.Mapper;

@Mapper
public interface PropertyRestMapper {
	Property toDomain(RegisterProperty propertyRestMapper);
	FindAllPropertiesResponse toResponse(Property property);
	FindAllPropertiesByCondominiumResponse toResponseByCondominium(Property property);
	FindAllPropertiesByJointOwnerResponse toResponseByJointOwner(Property property);
}
