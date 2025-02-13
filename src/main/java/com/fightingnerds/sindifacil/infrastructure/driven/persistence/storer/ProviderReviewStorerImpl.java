package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.provider.ProviderReviewStorer;
import com.fightingnerds.sindifacil.domain.model.provider.ProviderReview;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.ProviderReviewJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.ProviderReviewPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProviderReviewStorerImpl implements ProviderReviewStorer {
	private final ProviderReviewJpaRepository providerReviewJpaRepository;
	private final ProviderReviewPersistenceMapper providerReviewPersistenceMapper;

	@Override
	public ProviderReview store(ProviderReview data) {
		return null;
	}

	@Override
	public Optional<ProviderReview> getById(Long id) {
		return Optional.empty();
	}
}
