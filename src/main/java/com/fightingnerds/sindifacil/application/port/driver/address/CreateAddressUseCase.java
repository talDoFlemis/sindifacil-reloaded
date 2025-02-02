package com.fightingnerds.sindifacil.application.port.driver.address;

import com.fightingnerds.sindifacil.domain.model.address.Address;

public interface CreateAddressUseCase {
	Address createAddress(Address address);
}
