package com.fightingnerds.sindifacil.application.port.driven.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.EventManager;
import com.fightingnerds.sindifacil.application.port.driven.EventPublisher;
import com.fightingnerds.sindifacil.domain.event.newsletter.GlobalNewsletterEvent;
import org.springframework.context.ApplicationEventPublisher;

public abstract class GlobalNewsletterEventPublisher extends EventPublisher<GlobalNewsletterEvent> {
	protected GlobalNewsletterEventPublisher(EventManager eventManager) {
		super(eventManager);
	}
}
