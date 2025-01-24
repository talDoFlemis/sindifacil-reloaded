package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.enums.BankSlipStatus;
import com.fightingnerds.sindifacil.models.BankSlip;
import com.fightingnerds.sindifacil.models.JointOwner;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankSlipController {
	public List<BankSlip> listAllBankSlips(JointOwner jointOwner) {
		return null;
	}

	public List<BankSlip> listBankSlipsByStatus(JointOwner jointOwner, BankSlipStatus status) {
		return null;
	}
}
