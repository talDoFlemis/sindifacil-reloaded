package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.newsletter.CondominiumNewsletterEventPublisher;
import com.fightingnerds.sindifacil.application.port.driven.newsletter.GlobalNewsletterEventPublisher;
import com.fightingnerds.sindifacil.application.port.driven.newsletter.NewsletterStorer;
import com.fightingnerds.sindifacil.application.port.driver.newsletter.*;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import com.fightingnerds.sindifacil.domain.model.newsletter.NewsletterCategory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class NewsletterService implements  GetAllNewsletterByCondominium, GetAllNewsletterByCategory, CreateNewsletterUseCase {
	private final GlobalNewsletterEventPublisher globalNewsletterEventPublisher;
	private final CondominiumNewsletterEventPublisher condominiumNewsletterEventPublisher;
	private final NewsletterStorer newsletterStorer;

	@Override
	public Newsletter create(Newsletter newsletter) {
		return null;
	}

	@Override
	public List<Newsletter> getAllNewsletterByCategory(NewsletterCategory newsletterCategory) {
		return List.of();
	}

	@Override
	public List<Newsletter> getAllNewsletterByCondominium(Condominium condominium) {
		return List.of();
	}
}
