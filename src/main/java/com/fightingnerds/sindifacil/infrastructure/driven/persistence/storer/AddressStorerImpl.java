package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.address.AddressStorer;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.AddressEntity;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.AddressJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.AddressPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class AddressStorerImpl implements AddressStorer {
	private final AddressJpaRepository addressRepository;
	private final AddressPersistenceMapper addressPersistenceMapper;

	@Override
	public Address storeAddress(final Address address) {
		try {
			AddressEntity addressEntity = addressPersistenceMapper.toEntity(address);
			addressEntity = addressRepository.save(addressEntity);
			return addressPersistenceMapper.toDomain(addressEntity);
		} catch (Exception e) {
			log.error("Error storing address: {}", e.getMessage());
			throw e;
		}
	}

	@Override
	public Optional<Address> getAddress(final Long id) {
		return addressRepository.findById(id)
			.map(addressPersistenceMapper::toDomain);
	}
}
