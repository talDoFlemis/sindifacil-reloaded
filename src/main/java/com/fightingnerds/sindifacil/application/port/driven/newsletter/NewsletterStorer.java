package com.fightingnerds.sindifacil.application.port.driven.newsletter;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;

public interface NewsletterStorer extends Storer<Newsletter, Long> {
}
