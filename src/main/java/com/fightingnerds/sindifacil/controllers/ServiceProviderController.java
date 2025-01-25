package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ServiceProviderForm;
import com.fightingnerds.sindifacil.models.Provider;
import com.fightingnerds.sindifacil.models.Service;
import com.fightingnerds.sindifacil.models.ServiceProvider;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ServiceProviderController {
	public List<ServiceProvider> listAllServiceProviders() {
		return null;
	}

	public List<ServiceProvider> listAllProvidersByService(Service service) {
		return null;
	}

	public List<ServiceProvider> listAllServicesByProvider(Provider provider) {
		return null;
	}

	public void addServiceToProvider(Provider provider, Service service, ServiceProviderForm serviceProviderForm) {
	}

	public void removeServiceFromProvider(ServiceProvider serviceProvider) {
	}

	public void editServiceForProvider(ServiceProvider serviceProvider, ServiceProviderForm serviceProviderForm) {
	}
}
