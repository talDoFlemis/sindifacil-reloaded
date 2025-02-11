package com.fightingnerds.sindifacil.application.port.driven.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.EventManager;
import com.fightingnerds.sindifacil.application.port.driven.EventPublisher;
import com.fightingnerds.sindifacil.domain.event.newsletter.CondominiumNewsletterEvent;
import org.springframework.context.ApplicationEventPublisher;

public abstract class CondominiumNewsletterEventPublisher extends EventPublisher<CondominiumNewsletterEvent> {
	protected CondominiumNewsletterEventPublisher(EventManager eventManager) {
		super(eventManager);
	}
}
