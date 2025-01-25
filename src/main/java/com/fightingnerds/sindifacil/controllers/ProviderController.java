package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ProviderForm;
import com.fightingnerds.sindifacil.forms.ServiceProviderForm;
import com.fightingnerds.sindifacil.models.Provider;
import com.fightingnerds.sindifacil.models.Service;
import com.fightingnerds.sindifacil.models.ServiceProvider;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProviderController {
	public List<Provider> listAllProviders() {
		return null;
	}

	public void addProvider(ProviderForm providerForm) {
	}

	public void editProvider(Provider provider, ProviderForm providerForm) {
	}
}
