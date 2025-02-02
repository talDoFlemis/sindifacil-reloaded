package com.fightingnerds.sindifacil.infrastructure.driver.event.listener.newsletter;

import com.fightingnerds.sindifacil.application.port.driver.newsletter.GlobalNewsletterCreatedEventObserver;
import com.fightingnerds.sindifacil.domain.event.newsletter.GlobalNewsletterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GlobalNewsletterCreatedEventObserverImpl extends GlobalNewsletterCreatedEventObserver {
	@Override
	public void update(GlobalNewsletterEvent event) {

	}
}
