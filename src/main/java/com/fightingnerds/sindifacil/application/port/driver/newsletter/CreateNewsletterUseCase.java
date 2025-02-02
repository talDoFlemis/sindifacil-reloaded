package com.fightingnerds.sindifacil.application.port.driver.newsletter;

import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;

public interface CreateNewsletterUseCase {
	Newsletter create(Newsletter newsletter);
}
