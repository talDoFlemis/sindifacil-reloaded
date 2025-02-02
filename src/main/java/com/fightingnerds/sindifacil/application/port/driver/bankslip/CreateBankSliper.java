package com.fightingnerds.sindifacil.application.port.driver.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.JointOwner;

public interface CreateBankSliper {
	BankSlip create(BankSlip bankSlip, JointOwner jointOwner);
}
