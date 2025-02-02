package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.address.CreateAddressRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.address.CreateAddressResponse;
import org.mapstruct.Mapper;

@Mapper
public interface AddressRestMapper {
	Address toDomain(CreateAddressRequest createAddressRequest);
	CreateAddressResponse toCreateAddressResponse(Address address);
}
