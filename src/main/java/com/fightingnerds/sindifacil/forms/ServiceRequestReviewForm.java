package com.fightingnerds.sindifacil.forms;

import lombok.Getter;

@Getter
public class ServiceRequestReviewForm {
	private Long serviceRequestId;

	private Long rating;

	private String review;
}
