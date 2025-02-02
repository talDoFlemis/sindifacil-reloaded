package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.BankSlipEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BankSlipPersistenceMapper extends PersistenceMapper<BankSlipEntity, BankSlip> {
}
