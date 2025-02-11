package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.provider.ProviderStorer;
import com.fightingnerds.sindifacil.application.port.driver.provider.CreateProvider;
import com.fightingnerds.sindifacil.application.port.driver.provider.GetAllProviders;
import com.fightingnerds.sindifacil.application.port.driver.provider.UpdateProvider;
import com.fightingnerds.sindifacil.domain.model.provider.Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProviderService implements CreateProvider, GetAllProviders, UpdateProvider {
	private final ProviderStorer providerStorer;

	@Override
	public Provider createProvider(Provider provider) {
		return null;
	}

	@Override
	public List<Provider> getAllProviders() {
		return List.of();
	}

	@Override
	public Provider updateProvider(Provider provider) {
		return null;
	}
}
