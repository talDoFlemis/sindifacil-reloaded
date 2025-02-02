package com.fightingnerds.sindifacil.application.port.driven;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class EventPublisher<E extends ApplicationEvent> {
	private final EventManager eventManager;

	public void notify(E event) {
		eventManager.publishEvent(event);
	}
}
