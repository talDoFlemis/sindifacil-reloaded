package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.bankslip;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@AllArgsConstructor
@Data
public class BankSlipResponse {
	private Long id;
	private String code;
	private Date dueDate;
	private Date emissionDate;
	private BankSlipStatus status;
}
