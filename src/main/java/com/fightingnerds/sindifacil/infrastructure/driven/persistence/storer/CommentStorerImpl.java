package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.ticket.CommentStorer;
import com.fightingnerds.sindifacil.domain.model.ticket.Comment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.CommentJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.CommentPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentStorerImpl implements CommentStorer {
	private final CommentJpaRepository commentJpaRepository;
	private final CommentPersistenceMapper commentPersistenceMapper;

	@Override
	public Comment store(Comment data) {
		// ...implementation code...
		return null;
	}

	@Override
	public Optional<Comment> getById(Long id) {
		// ...implementation code...
		return Optional.empty();
	}
}
