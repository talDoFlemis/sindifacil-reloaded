package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ProviderReviewForm;
import com.fightingnerds.sindifacil.models.JointOwner;
import com.fightingnerds.sindifacil.models.Provider;
import com.fightingnerds.sindifacil.models.ProviderReview;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReviewController {
	public List<ProviderReview> listProviderReviews(Provider provider) {
		return null;
	}

	public void addProviderReview(JointOwner owner, ProviderReviewForm providerReviewForm) {
	}

	public void editProviderReview(JointOwner owner, ProviderReviewForm providerReviewForm) {
	}
}
