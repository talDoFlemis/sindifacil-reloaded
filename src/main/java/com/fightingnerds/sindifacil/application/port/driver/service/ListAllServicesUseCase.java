package com.fightingnerds.sindifacil.application.port.driver.service;

import java.util.List;

import com.fightingnerds.sindifacil.domain.model.service.Service;

public interface ListAllServicesUseCase {
	List<Service> listAllServices();
}
