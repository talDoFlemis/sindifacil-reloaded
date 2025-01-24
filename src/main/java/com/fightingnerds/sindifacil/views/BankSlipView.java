package com.fightingnerds.sindifacil.views;

import com.fightingnerds.sindifacil.controllers.BankSlipController;
import com.fightingnerds.sindifacil.enums.BankSlipStatus;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BankSlipView {
	private final BankSlipController bankSlipController;

	public void showBankSlips() {
	}

	public void showBankSlipsByStatus(BankSlipStatus status) {
	}
}
