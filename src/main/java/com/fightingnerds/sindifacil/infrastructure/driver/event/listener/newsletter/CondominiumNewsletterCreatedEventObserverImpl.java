package com.fightingnerds.sindifacil.infrastructure.driver.event.listener.newsletter;

import com.fightingnerds.sindifacil.application.port.driver.newsletter.CondominiumNewsletterCreateEventObserver;
import com.fightingnerds.sindifacil.domain.event.newsletter.CondominiumNewsletterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CondominiumNewsletterCreatedEventObserverImpl extends CondominiumNewsletterCreateEventObserver {
	@Override
	public void update(CondominiumNewsletterEvent event) {

	}
}
