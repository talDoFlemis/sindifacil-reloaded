package com.fightingnerds.sindifacil.application.port.driver.address;

import com.fightingnerds.sindifacil.domain.model.address.Address;

public interface UpdateAddressUseCase {
	Address updateAddress(Address address);
}
