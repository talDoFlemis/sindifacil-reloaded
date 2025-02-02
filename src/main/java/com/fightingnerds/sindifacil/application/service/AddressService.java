package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.address.AddressStorer;
import com.fightingnerds.sindifacil.application.port.driver.address.CreateAddressUseCase;
import com.fightingnerds.sindifacil.application.port.driver.address.GetAddressUseCase;
import com.fightingnerds.sindifacil.application.port.driver.address.UpdateAddressUseCase;
import com.fightingnerds.sindifacil.domain.exception.address.AddressNotFound;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressService implements CreateAddressUseCase, GetAddressUseCase, UpdateAddressUseCase {
	private final AddressStorer addressStorer;

	@Override
	public Address createAddress(@Valid Address address) {
		log.debug("Creating address: {}", address);

		address =  addressStorer.store(address);

		log.info("Address created: {}", address);
		return address;
	}

	@Override
	public Address getAddress(final Long id) {
		return addressStorer.getById(id).orElseThrow(() -> {
			log.info("Address not found for id {}", id);
			return new AddressNotFound(id);
		});
	}

	@Override
	@Transactional
	public Address updateAddress(@Valid Address address) {
		log.debug("Updating address: {}", address);

		Address addressUpdated = addressStorer.store(address);

		log.info("Address updated: {}", addressUpdated);
		return addressUpdated;
	}
}
