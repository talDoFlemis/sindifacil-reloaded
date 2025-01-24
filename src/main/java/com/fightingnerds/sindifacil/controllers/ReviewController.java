package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.ProviderReviewForm;
import com.fightingnerds.sindifacil.forms.ServiceRequestReviewForm;
import com.fightingnerds.sindifacil.models.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReviewController {
	public List<ProviderReview> listAllProviderReviews() {
		return null;
	}

	public List<ProviderReview> listProviderReviewsByProvider(Provider provider) {
		return null;
	}

	public List<ServiceRequestReview> listAllServiceRequestReviews() {
		return null;
	}

	public List<ServiceRequestReview> listServiceRequestReviewsByServiceRequest(ServiceRequest serviceRequest) {
		return null;
	}

	public void addProviderReview(JointOwner owner, ProviderReviewForm providerReviewForm) {
	}

	public void editProviderReview(JointOwner owner, ProviderReviewForm providerReviewForm) {
	}

	public void addServiceRequestReview(JointOwner owner, ServiceRequestReviewForm serviceRequestReviewForm) {
	}

	public void editServiceRequestReview(JointOwner owner, ServiceRequestReviewForm serviceRequestReviewForm) {
	}
}
