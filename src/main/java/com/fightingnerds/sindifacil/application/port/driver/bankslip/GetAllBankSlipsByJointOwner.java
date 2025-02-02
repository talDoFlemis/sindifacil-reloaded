package com.fightingnerds.sindifacil.application.port.driver.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.JointOwner;

import java.util.List;

public interface GetAllBankSlipsByJointOwner {
	List<BankSlip> getAllByJointOwner(JointOwner jointOwner);
}
