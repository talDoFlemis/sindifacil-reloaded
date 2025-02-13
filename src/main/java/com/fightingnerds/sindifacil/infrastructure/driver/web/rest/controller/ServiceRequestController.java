package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.servicerequest.*;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.servicerequest.ServiceRequestResponse;
import com.fightingnerds.sindifacil.application.port.driver.servicerequest.*;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/service-request/")
@RequiredArgsConstructor
public class ServiceRequestController {
    private final CreateServiceRequestUseCase createServiceRequestUseCase;
    private final UpdateServiceRequestUseCase updateServiceRequestUseCase;
    private final RegisterServiceRequestHoursUseCase registerServiceRequestHoursUseCase;
    private final ListServiceRequestsByTicketUseCase listServiceRequestsByTicketUseCase;
    private final ListServiceRequestsByProviderUseCase listServiceRequestsByProviderUseCase;

    @PostMapping
    public ServiceRequestResponse createServiceRequest(@RequestBody CreateServiceRequestRequest request) {
        // ...existing code...
        return null;
    }

    @PutMapping("/{id}")
    public ServiceRequestResponse updateServiceRequest(@PathVariable Long id, @RequestBody UpdateServiceRequestRequest request) {
        // ...existing code...
        return null;
    }

    @PostMapping("/register-hours")
    public ServiceRequestResponse registerServiceRequestHours(@RequestBody RegisterServiceRequestHoursRequest request) {
        // ...existing code...
        return null;
    }

    @GetMapping("/list-by-ticket")
    public List<ServiceRequestResponse> listServiceRequestsByTicket(@RequestBody ListServiceRequestByTicketRequest request) {
        // ...existing code...
        return null;
    }

    @GetMapping("/list-by-provider")
    public List<ServiceRequestResponse> listServiceRequestsByProvider(@RequestBody ListServiceRequestByProviderRequest request) {
        // ...existing code...
        return null;
    }
}
