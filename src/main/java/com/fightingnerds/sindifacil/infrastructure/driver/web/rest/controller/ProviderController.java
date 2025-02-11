package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.ProviderService;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider.CreateProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider.UpdateProviderRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.provider.ProviderResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.ProviderRestMapper;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/provider/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class ProviderController {
	private final ProviderRestMapper providerRestMapper;
	private final ProviderService providerService;

	@GetMapping
	public List<ProviderResponse> getAllProviders() {
		return null;
	}

	@PostMapping
	public ProviderResponse createProvider(CreateProviderRequest createProviderRequest) {
		return null;
	}

	@PostMapping("/{id}")
	public ProviderResponse updateProvider(UUID uuid, UpdateProviderRequest updateProviderRequest) {
		return null;
	}

}
