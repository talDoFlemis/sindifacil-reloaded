package com.fightingnerds.sindifacil.domain.event.newsletter;

import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class GlobalNewsletterEvent extends ApplicationEvent {
	private Newsletter newsletter;

	public GlobalNewsletterEvent(Object source, Newsletter newsletter) {
		super(source);
		this.newsletter = newsletter;
	}
}
