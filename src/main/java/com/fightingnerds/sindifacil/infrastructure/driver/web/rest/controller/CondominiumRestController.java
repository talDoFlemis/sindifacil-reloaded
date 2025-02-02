package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.CondominiumService;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.condominium.CreateCondominiumRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.condominium.UpdateCondominiumRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.condominium.CondominiumResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.CondominiumRestMapper;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/v1/condominium/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class CondominiumRestController {
	private final CondominiumService condominiumService;
	private final CondominiumRestMapper condominiumRestMapper;

	@PostMapping
	public ResponseEntity<CondominiumResponse> createCondominium(@RequestBody CreateCondominiumRequest createCondominiumRequest) {
		Condominium condominium = condominiumRestMapper.toDomain(createCondominiumRequest);
		return ResponseEntity.ok(null);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CondominiumResponse> updateCondominium(@PathVariable UUID id, @RequestBody UpdateCondominiumRequest updateCondominiumRequest) {
		return ResponseEntity.ok(null);
	}

	@GetMapping
	public ResponseEntity<List<CondominiumResponse>> getAllCondominiums() {
		return ResponseEntity.ok(null);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CondominiumResponse> getCondominiumById(@PathVariable UUID id) {
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCondominium(@PathVariable UUID id) {
		return ResponseEntity.noContent().build();
	}

}
