package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AddressPersistenceMapper extends PersistenceMapper<AddressEntity, Address> {
}
