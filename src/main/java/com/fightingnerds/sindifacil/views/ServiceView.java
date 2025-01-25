package com.fightingnerds.sindifacil.views;

import com.fightingnerds.sindifacil.controllers.ServiceController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceView {
	private final ServiceController serviceController;

	public void listAllServices() {
		serviceController.listAllServices();
	}

	public void listServicesByCategory() {
		serviceController.listServicesByCategory(null);
	}
}
