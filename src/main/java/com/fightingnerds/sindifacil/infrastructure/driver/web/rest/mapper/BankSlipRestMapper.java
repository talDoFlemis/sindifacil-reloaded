package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlip;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.bankslip.CreateBankSlipRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.bankslip.BankSlipResponse;
import org.mapstruct.Mapper;

@Mapper
public interface BankSlipRestMapper {
	BankSlip toDomain(CreateBankSlipRequest createBankSlipRequest);
	BankSlipResponse toBankSlipResponse(BankSlip bankSlip);
}
