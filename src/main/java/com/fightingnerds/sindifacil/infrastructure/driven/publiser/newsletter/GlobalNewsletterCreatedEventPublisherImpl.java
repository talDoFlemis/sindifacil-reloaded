package com.fightingnerds.sindifacil.infrastructure.driven.publiser.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.EventManager;
import com.fightingnerds.sindifacil.application.port.driven.newsletter.GlobalNewsletterEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class GlobalNewsletterCreatedEventPublisherImpl extends GlobalNewsletterEventPublisher {
	protected GlobalNewsletterCreatedEventPublisherImpl(EventManager eventManager) {
		super(eventManager);
	}
}
