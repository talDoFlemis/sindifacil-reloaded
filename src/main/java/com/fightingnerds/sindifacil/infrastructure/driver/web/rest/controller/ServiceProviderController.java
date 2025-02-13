package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.domain.model.service.ServiceProvider;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.UpdateServiceProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.ServiceProviderRestMapper;
import com.fightingnerds.sindifacil.application.port.driver.serviceprovider.*;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/v1/serviceprovider/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class ServiceProviderController {
	private final ServiceProviderRestMapper serviceProviderRestMapper;
	private final ListAllServiceProvidersUseCase listAllServiceProvidersUseCase;
	private final AddServiceProviderUseCase addServiceProviderUseCase;
	private final EditServiceProviderUseCase editServiceProviderUseCase;
	private final RemoveServiceProviderUseCase removeServiceProviderUseCase;

	@GetMapping
	public List<ServiceProvider> listAllServiceProviders() {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Not implemented yet");
	}

	@PostMapping
	public ServiceProvider addServiceProvider(CreateServiceProviderRequest createServiceProviderRequest) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Not implemented yet");
	}

	@PostMapping("/{id}")
	public ServiceProvider editServiceProvider(UpdateServiceProviderRequest updateServiceProviderRequest) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Not implemented yet");
	}

	@DeleteMapping("/{id}")
	public void removeServiceProvider(@PathVariable Long id) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Not implemented yet");
	}
}
