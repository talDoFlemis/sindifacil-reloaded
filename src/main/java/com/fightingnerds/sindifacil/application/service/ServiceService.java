package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.service.ServiceCategoryStorer;
import com.fightingnerds.sindifacil.application.port.driven.service.ServiceStorer;
import com.fightingnerds.sindifacil.application.port.driver.service.*;
import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceService implements 
	ListAllServicesUseCase, 
	ListServicesByCategoryUseCase, 
	ListAllServiceCategoriesUseCase, 
	AddServiceUseCase, 
	EditServiceUseCase, 
	AddServiceCategoryUseCase, 
	EditServiceCategoryUseCase {
	private final ServiceStorer serviceStorer;
	private final ServiceCategoryStorer serviceCategoryStorer;

    @Override
    public ServiceCategory editServiceCategory(ServiceCategory category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editServiceCategory'");
    }
    @Override
    public ServiceCategory addServiceCategory(ServiceCategory category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addServiceCategory'");
    }
    @Override
    public com.fightingnerds.sindifacil.domain.model.service.Service editService(
            com.fightingnerds.sindifacil.domain.model.service.Service service) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editService'");
    }
    @Override
    public com.fightingnerds.sindifacil.domain.model.service.Service addService(
            com.fightingnerds.sindifacil.domain.model.service.Service Service) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addService'");
    }
    @Override
    public List<ServiceCategory> listAllServiceCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAllServiceCategories'");
    }
    @Override
    public List<com.fightingnerds.sindifacil.domain.model.service.Service> listServicesByCategory(
            ServiceCategory category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listServicesByCategory'");
    }
    @Override
    public List<com.fightingnerds.sindifacil.domain.model.service.Service> listAllServices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAllServices'");
    }
}
