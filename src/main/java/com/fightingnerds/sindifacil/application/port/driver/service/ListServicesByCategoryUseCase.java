package com.fightingnerds.sindifacil.application.port.driver.service;
import java.util.List;

import com.fightingnerds.sindifacil.domain.model.service.Service;
import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;

public interface ListServicesByCategoryUseCase {
	List<Service> listServicesByCategory(ServiceCategory category);
}
