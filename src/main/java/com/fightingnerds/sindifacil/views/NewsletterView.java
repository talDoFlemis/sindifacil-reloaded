package com.fightingnerds.sindifacil.views;

import com.fightingnerds.sindifacil.controllers.NewsletterController;
import com.fightingnerds.sindifacil.models.NewsletterCategory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NewsletterView {
	private final NewsletterController newsletterController;

	public void showAllNewsletter() {};

	public void showNewsletterByCategory(NewsletterCategory newsletterCategory) {};
}
