package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.port.driver.service.*;
import com.fightingnerds.sindifacil.application.service.ServiceService;
import com.fightingnerds.sindifacil.domain.model.service.Service;
import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceCategoryRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.CreateServiceRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service.UpdateServiceCategoryRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceCategoryResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.service.ServiceResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.ServiceRestMapper;
import com.fightingnerds.sindifacil.forms.ServiceForm;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/service/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class ServiceController {
	private final ServiceRestMapper serviceRestMapper;
	private final ServiceService serviceService;
	private final ListAllServicesUseCase listAllServicesUseCase;
	private final ListServicesByCategoryUseCase listServicesByCategoryUseCase;
	private final ListAllServiceCategoriesUseCase listAllServiceCategoriesUseCase;
	private final AddServiceUseCase addServiceUseCase;
	private final EditServiceUseCase editServiceUseCase;
	private final AddServiceCategoryUseCase addServiceCategoryUseCase;
	private final EditServiceCategoryUseCase editServiceCategoryUseCase;

	@GetMapping
	public List<Service> listAllServices() {
		return listAllServicesUseCase.listAllServices();
	}

	@GetMapping("/category/{id}")
	public List<Service> listServicesByCategory(@PathVariable Long id) {
        return null;
	}

	@GetMapping("/categories")
	public List<ServiceCategoryResponse> listAllServiceCategories() {
        return null;
	}

	@PostMapping
	public Service addService(CreateServiceRequest createServiceRequest) {
        return null;
	}

	@PostMapping("/{id}")
	public Service editService(UpdateServiceCategoryRequest updateServiceCategoryRequest) {
        return null;
	}

	@PostMapping("/category")
	public ServiceCategoryResponse addServiceCategory(CreateServiceCategoryRequest createServiceCategoryRequest) {
        return null;
	}

	@PostMapping("/category/{id}")
	public ServiceCategory editServiceCategory(ServiceCategoryResponse serviceCategoryResponse) {
        return null;
	}
}
