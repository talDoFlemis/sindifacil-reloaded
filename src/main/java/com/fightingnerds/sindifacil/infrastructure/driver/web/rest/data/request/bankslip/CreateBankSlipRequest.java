package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Builder
@Data
public class CreateBankSlipRequest {
	private String code;
	private Date dueDate;
	private Date emissionDate;
	private BankSlipStatus status;
	private UUID jointOwnerId;
}
