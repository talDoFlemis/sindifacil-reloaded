package com.fightingnerds.sindifacil.domain.model;

import com.fightingnerds.sindifacil.enums.BankSlipStatus;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BankSlip {
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
	private JointOwner jointOwner;
}
