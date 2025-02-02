package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.condominium.CreateCondominiumRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.condominium.UpdateCondominiumRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.condominium.CondominiumResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CondominiumRestMapper {
	Condominium toDomain(CreateCondominiumRequest createCondominiumRequest);
	Condominium toDomain(UpdateCondominiumRequest updateCondominiumRequest);
	CondominiumResponse toResponse(Condominium condominium);
}
