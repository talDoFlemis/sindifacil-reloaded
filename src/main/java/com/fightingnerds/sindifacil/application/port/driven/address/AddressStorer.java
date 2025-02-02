package com.fightingnerds.sindifacil.application.port.driven.address;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.address.Address;

import java.util.Optional;

public interface AddressStorer extends Storer<Address, Long> {
}
