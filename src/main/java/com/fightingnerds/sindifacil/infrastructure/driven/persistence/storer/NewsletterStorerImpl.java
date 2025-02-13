package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.newsletter.NewsletterStorer;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.NewsletterJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.NewsletterPersistenceMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NewsletterStorerImpl implements NewsletterStorer {
	private final NewsletterJpaRepository newsletterJpaRepository;
	private final NewsletterPersistenceMapper newsletterPersistenceMapper;

	@Override
	public Newsletter store(Newsletter data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'store'");
	}

	@Override
	public Optional<Newsletter> getById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getById'");
	}
}
