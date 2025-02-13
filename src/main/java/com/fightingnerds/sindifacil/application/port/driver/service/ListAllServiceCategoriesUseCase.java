package com.fightingnerds.sindifacil.application.port.driver.service;

import java.util.List;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;

public interface ListAllServiceCategoriesUseCase {
	List<ServiceCategory> listAllServiceCategories();
}
