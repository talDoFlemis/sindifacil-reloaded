package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.newsletter.NewsletterStorer;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NewsletterStorerImpl implements NewsletterStorer {
	private final NewsletterJpaRepository newsletterJpaRepository;
	private final

	@Override
	public Newsletter store(Newsletter data) {
		return null;
	}

	@Override
	public Optional<Newsletter> getById(Long id) {
		return Optional.empty();
	}
}
