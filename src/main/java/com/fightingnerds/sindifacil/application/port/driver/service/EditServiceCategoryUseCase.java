package com.fightingnerds.sindifacil.application.port.driver.service;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;

public interface EditServiceCategoryUseCase {
	ServiceCategory editServiceCategory(ServiceCategory category);
}
