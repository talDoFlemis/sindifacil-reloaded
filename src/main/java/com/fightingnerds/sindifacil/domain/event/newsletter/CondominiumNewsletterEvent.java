package com.fightingnerds.sindifacil.domain.event.newsletter;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class CondominiumNewsletterEvent extends ApplicationEvent {
	private Condominium condominium;
	private Newsletter newsletter;

	public CondominiumNewsletterEvent(Object source, Condominium condominium, Newsletter newsletter) {
		super(source);
		this.condominium = condominium;
		this.newsletter = newsletter;
	}
}
