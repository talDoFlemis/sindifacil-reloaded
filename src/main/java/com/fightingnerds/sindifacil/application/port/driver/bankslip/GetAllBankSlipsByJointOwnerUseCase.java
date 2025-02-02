package com.fightingnerds.sindifacil.application.port.driver.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.user.JointOwner;

import java.util.List;

public interface GetAllBankSlipsByJointOwnerUseCase {
	List<BankSlip> getAllByJointOwner(JointOwner jointOwner);
}
