package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ServiceForm;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
public class ServiceController {
	public List<Service> listAllServices() {
		return null;
	}

	public List<Service> listServicesByCategory(ServiceCategory category) {
		return null;
	}

	public List<ServiceCategory> listAllServiceCategories() {
		return null;
	}

	public void addService(ServiceForm serviceForm) {
	}

	public void editService(Service service, ServiceForm serviceForm) {
	}

	public void addServiceCategory(String name) {
	}

	public void editServiceCategory(ServiceCategory category, String name) {
	}

}
