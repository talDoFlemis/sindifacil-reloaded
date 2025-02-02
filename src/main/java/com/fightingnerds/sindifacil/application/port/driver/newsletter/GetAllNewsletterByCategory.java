package com.fightingnerds.sindifacil.application.port.driver.newsletter;

import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import com.fightingnerds.sindifacil.domain.model.newsletter.NewsletterCategory;

import java.util.List;

public interface GetAllNewsletterByCategory {
	List<Newsletter> getAllNewsletterByCategory(NewsletterCategory newsletterCategory);
}
