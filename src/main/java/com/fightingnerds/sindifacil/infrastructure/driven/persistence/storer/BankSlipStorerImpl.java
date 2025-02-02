package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.bankslip.BankSliperStorer;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.BankSlipJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.BankSlipPersistenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankSlipStorerImpl implements BankSliperStorer {
	private final BankSlipJpaRepository bankSlipJpaRepository;
	private final BankSlipPersistenceMapper bankSlipPersistenceMapper;

	@Override
	public List<BankSlip> getAllByJointOwner(JointOwner jointOwner) {
		return List.of();
	}

	@Override
	public List<BankSlip> getAllByJointOwnerAndStatus(JointOwner jointOwner, BankSlipStatus status) {
		return List.of();
	}

	@Override
	public BankSlip store(BankSlip data) {
		return null;
	}

	@Override
	public Optional<BankSlip> getById(Long id) {
		return Optional.empty();
	}
}
