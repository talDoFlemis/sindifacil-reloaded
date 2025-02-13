package com.fightingnerds.sindifacil.application.port.driver.service;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;

public interface AddServiceCategoryUseCase {
	ServiceCategory addServiceCategory(ServiceCategory category);
}
