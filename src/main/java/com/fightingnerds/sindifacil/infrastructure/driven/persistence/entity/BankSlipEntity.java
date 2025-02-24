package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import com.fightingnerds.sindifacil.domain.model.bankslip.BankSlipStatus;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "bank_slips")
public class BankSlipEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String code;

	@Column(name = "due_date")
	private Date dueDate;

	@Column(name = "emission_date")
	private Date emissionDate;

	private BankSlipStatus status;

	@OneToOne
	@JoinColumn(name = "joint_owner_id", nullable = false)
	private JointOwnerEntity jointOwner;
}
