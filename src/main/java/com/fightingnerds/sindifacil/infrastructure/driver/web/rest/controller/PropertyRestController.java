package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.PropertyService;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.property.RegisterPropertyRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.property.UpdatePropertyRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.property.*;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.PropertyRestMapper;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/v1/property/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class PropertyRestController {
	private final PropertyService propertyService;
	private final PropertyRestMapper propertyRestMapper;

	@PostMapping
	public ResponseEntity<RegisterPropertyResponse> registerProperty(@RequestBody @Valid final RegisterPropertyRequest registerPropertyRequest) {
		return null;
	}

	@GetMapping
	public ResponseEntity<List<FindAllPropertiesResponse>> findAllProperties() {
		return null;
	}

	@PutMapping("/{id}/owner")
	public ResponseEntity<UpdatePropertyResponse> updateOwner(@PathVariable final Long id, @RequestBody @Valid final UpdatePropertyRequest updatePropertyRequest) {
		return null;
	}

	@GetMapping("/condominium/{condominiumId}")
	public ResponseEntity<List<FindAllPropertiesByCondominiumResponse>> findAllPropertiesByCondominium(@PathVariable final Long condominiumId) {
		return null;
	}

	@GetMapping("/joint-owner/{jointOwnerId}")
	public ResponseEntity<List<FindAllPropertiesByJointOwnerResponse>> findAllPropertiesByJointOwner(@PathVariable final Long jointOwnerId) {
		return null;
	}
}
