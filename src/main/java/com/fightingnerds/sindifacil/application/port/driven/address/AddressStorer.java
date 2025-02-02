package com.fightingnerds.sindifacil.application.port.driven.address;

import com.fightingnerds.sindifacil.domain.model.address.Address;

import java.util.Optional;

public interface AddressStorer {
	Address storeAddress(Address address);
	Optional<Address> getAddress(Long id);
}
