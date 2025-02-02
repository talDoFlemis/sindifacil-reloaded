package com.fightingnerds.sindifacil.domain.model.bankslip;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankSlip {
	private Long id;

	@NotBlank
	private String code;
	@NotNull
	private Date dueDate;
	@PastOrPresent
	private Date emissionDate;

	@NotNull
	private BankSlipStatus status;

	@NotNull
	private JointOwner jointOwner;
}
