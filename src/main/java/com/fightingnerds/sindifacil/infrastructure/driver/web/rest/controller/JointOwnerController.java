package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.JointOwnerService;
import com.fightingnerds.sindifacil.application.service.PropertyService;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.jointowner.AddNewPropertyToJointOwnerRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.jointowner.CreateJointOwnerRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.jointowner.UpdateJointOwnerRequest;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/v1/joint-owner/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.MANAGER)
public class JointOwnerController {
	private final JointOwnerService jointOwnerService;
	private final PropertyService propertyService;


	@PostMapping
	public ResponseEntity<JointOwner> createJointOwner(@RequestBody CreateJointOwnerRequest createJointOwnerRequest) {
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<JointOwner> updateJointOwner(@PathVariable UUID id, @RequestBody UpdateJointOwnerRequest updateJointOwnerRequest) {
		return null;
	}

	@GetMapping
	public ResponseEntity<List<JointOwner>> getAllJointOwners() {
		return null;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removeJointOwner(@PathVariable UUID id) {
		return null;
	}

	@PostMapping("/{id}/property")
	public ResponseEntity<JointOwner> addPropertyToJointOwner(@PathVariable UUID id, @RequestBody AddNewPropertyToJointOwnerRequest addNewPropertyToJointOwnerRequest) {
		return null;
	}

	@DeleteMapping("/{id}/property/{propertyId}")
	public ResponseEntity<JointOwner> removePropertyFromJointOwner(@PathVariable UUID id, @PathVariable Long propertyId) {
		return null;
	}
}
