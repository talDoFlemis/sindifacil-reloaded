package com.fightingnerds.sindifacil.infrastructure.driver.event.manager;

import com.fightingnerds.sindifacil.application.port.driven.EventManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
@Slf4j
public class DistributedEventManager implements EventManager {
	private final ApplicationEventPublisher publisher;

	@Override
	public void publishEvent(Object event) {
		log.debug("Publishing event: {}", event);

	}
}
