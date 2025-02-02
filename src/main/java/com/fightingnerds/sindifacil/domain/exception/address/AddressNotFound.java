package com.fightingnerds.sindifacil.domain.exception.address;

public class AddressNotFound extends RuntimeException {
	public AddressNotFound(Long id) {
		super("Address not found for id " + id);
	}
}
