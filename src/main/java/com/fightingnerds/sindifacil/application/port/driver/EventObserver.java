package com.fightingnerds.sindifacil.application.port.driver;

import jakarta.validation.constraints.NotNull;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public abstract class EventObserver<E extends ApplicationEvent> implements ApplicationListener<E> {
	public abstract void update(E event);

	@Override
	public void onApplicationEvent(@NotNull E event) {
		update(event);
	}
}
