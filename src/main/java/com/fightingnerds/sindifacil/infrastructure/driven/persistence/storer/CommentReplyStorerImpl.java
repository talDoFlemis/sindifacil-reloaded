package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.ticket.CommentReplyStorer;
import com.fightingnerds.sindifacil.domain.model.ticket.CommentReply;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.CommentReplyJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.CommentReplyPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentReplyStorerImpl implements CommentReplyStorer {
	private final CommentReplyJpaRepository commentReplyJpaRepository;
	private final CommentReplyPersistenceMapper commentReplyPersistenceMapper;

	@Override
	public CommentReply store(CommentReply data) {
		// ...implementation code...
		return null;
	}

	@Override
	public Optional<CommentReply> getById(Long id) {
		// ...implementation code...
		return Optional.empty();
	}
}
