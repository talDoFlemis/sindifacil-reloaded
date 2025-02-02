package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.AddressService;
import com.fightingnerds.sindifacil.domain.model.address.Address;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.address.CreateAddressRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.address.AddressResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.AddressRestMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/address/")
@RequiredArgsConstructor
public class AddressRestController {
	private final AddressService addressService;
	private final AddressRestMapper addressRestMapper;

	@PostMapping
	public ResponseEntity<AddressResponse> createAddress(@RequestBody @Valid final CreateAddressRequest createAddressRequest) {
		Address address = this.addressRestMapper.toDomain(createAddressRequest);
		address = addressService.createAddress(address);
		return new ResponseEntity<>(this.addressRestMapper.toCreateAddressResponse(address), org.springframework.http.HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<AddressResponse> getAddress(@PathVariable final Long id) {
		Address address = addressService.getAddress(id);
		return new ResponseEntity<>(this.addressRestMapper.toCreateAddressResponse(address), org.springframework.http.HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<AddressResponse> updateAddress(@PathVariable final Long id, @RequestBody @Valid final CreateAddressRequest createAddressRequest) {
		Address address = this.addressRestMapper.toDomain(createAddressRequest);
		address.setId(id);
		address = addressService.updateAddress(address);
		return new ResponseEntity<>(this.addressRestMapper.toCreateAddressResponse(address), org.springframework.http.HttpStatus.OK);
	}
}
