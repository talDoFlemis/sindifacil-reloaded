package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.BankSlipEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BankSlipJpaRepository extends JpaRepository<BankSlipEntity, Long> {
	List<BankSlipEntity> findAllByJointOwnerId(String jointOwnerId);
	List<BankSlipEntity> findAllByJointOwnerIdAndStatus(String jointOwnerId, BankSlipStatus status);
}
