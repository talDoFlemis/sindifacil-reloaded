package com.fightingnerds.sindifacil.infrastructure.config;

import com.fightingnerds.sindifacil.infrastructure.driver.event.manager.DistributedEventManager;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EventManagerConfig {

	@Primary
	@Bean
	public ApplicationEventPublisher getApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		return new DistributedEventManager(applicationEventPublisher);
	}
}
