package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.bankslip.BankSliperStorer;
import com.fightingnerds.sindifacil.application.port.driver.bankslip.CreateBankSliper;
import com.fightingnerds.sindifacil.application.port.driver.bankslip.GetAllBankSlipsByJointOwner;
import com.fightingnerds.sindifacil.application.port.driver.bankslip.GetAllBankSlipsByJointOwnerAndStatus;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankSlipService implements GetAllBankSlipsByJointOwner, GetAllBankSlipsByJointOwnerAndStatus, CreateBankSliper {
	private final BankSliperStorer bankSliperStorer;

	@Override
	public List<BankSlip> getAllByJointOwner(JointOwner jointOwner) {
		return List.of();
	}

	@Override
	public List<BankSlip> getAllByJointOwnerAndStatus(JointOwner jointOwner, BankSlipStatus status) {
		return List.of();
	}

	@Override
	public BankSlip create(@Valid BankSlip bankSlip, @Valid JointOwner jointOwner) {
		return null;
	}
}
