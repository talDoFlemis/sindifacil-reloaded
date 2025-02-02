package com.fightingnerds.sindifacil.application.port.driver.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;

import java.util.List;

public interface GetAllBankSlipsByJointOwnerAndStatus {
	List<BankSlip> getAllByJointOwnerAndStatus(JointOwner jointOwner, BankSlipStatus status);
}
