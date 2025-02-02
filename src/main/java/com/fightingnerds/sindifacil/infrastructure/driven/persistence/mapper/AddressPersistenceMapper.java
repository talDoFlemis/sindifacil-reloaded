package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AddressPersistenceMapper {
	AddressEntity toEntity(Address address);
	Address toDomain(AddressEntity addressEntity);
}
