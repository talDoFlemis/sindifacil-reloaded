package com.fightingnerds.sindifacil.infrastructure.driven.publiser.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.EventManager;
import com.fightingnerds.sindifacil.application.port.driven.newsletter.CondominiumNewsletterEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CondominiumNewsletterCreatedEventPublisherImpl extends CondominiumNewsletterEventPublisher {
	public CondominiumNewsletterCreatedEventPublisherImpl(EventManager eventManager) {
		super(eventManager);
	}
}
