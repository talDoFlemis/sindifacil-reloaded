package com.fightingnerds.sindifacil.application.port.driven.bankslip;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.JointOwner;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;

import java.util.List;

public interface BankSliperStorer extends Storer<BankSlip, Long> {
	List<BankSlip> getAllByJointOwner(JointOwner jointOwner);
	List<BankSlip> getAllByJointOwnerAndStatus(JointOwner jointOwner, BankSlipStatus status);
}
