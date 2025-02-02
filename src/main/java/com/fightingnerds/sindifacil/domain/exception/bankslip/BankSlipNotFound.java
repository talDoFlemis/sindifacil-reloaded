package com.fightingnerds.sindifacil.domain.exception.bankslip;

public class BankSlipNotFound extends RuntimeException{
	public BankSlipNotFound(Long id){
		super("Bank slip not found with id: " + id);
	}
}
