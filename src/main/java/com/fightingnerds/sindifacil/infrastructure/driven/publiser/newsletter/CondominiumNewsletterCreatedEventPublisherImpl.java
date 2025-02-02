package com.fightingnerds.sindifacil.infrastructure.driven.publiser.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.newsletter.CondominiumNewsletterEventPublisher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CondominiumNewsletterCreatedEventPublisherImpl extends CondominiumNewsletterEventPublisher {
	public CondominiumNewsletterCreatedEventPublisherImpl(ApplicationEventPublisher applicationEventPublisher) {
		super(applicationEventPublisher);
	}
}
