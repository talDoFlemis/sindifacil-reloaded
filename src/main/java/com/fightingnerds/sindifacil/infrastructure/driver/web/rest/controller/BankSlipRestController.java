package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.BankSlipService;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import com.fightingnerds.sindifacil.domain.model.user.Role;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.bankslip.CreateBankSlipRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.bankslip.BankSlipResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.BankSlipRestMapper;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/v1/bankslip/")
@RequiredArgsConstructor
@RolesAllowed(Role.Fields.JOINT_OWNER)
public class BankSlipRestController {
	private final BankSlipService bankSlipService;
	private final BankSlipRestMapper bankSlipRestMapper;

	@PostMapping
	public ResponseEntity<BankSlipResponse> createBankSlip(@RequestBody @Valid final CreateBankSlipRequest createBankSlipRequest) {
		return null;
	}

	@GetMapping
	public ResponseEntity<List<BankSlipResponse>> getAllBankSlips(@AuthenticationPrincipal OidcUser user, @RequestParam BankSlipStatus status) {
		return null;
	}
}
