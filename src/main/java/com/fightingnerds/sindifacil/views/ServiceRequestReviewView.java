package com.fightingnerds.sindifacil.views;

import com.fightingnerds.sindifacil.controllers.ReviewController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceRequestReviewView {
	private final ReviewController reviewController;

	public void listReviews() {
		reviewController.listAllServiceRequestReviews();
	}
}
