package com.fightingnerds.sindifacil.infrastructure.driven.persistence.storer;

import com.fightingnerds.sindifacil.application.port.driven.ticket.CommentAttachmentStorer;
import com.fightingnerds.sindifacil.domain.model.ticket.CommentAttachment;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa.CommentAttachmentJpaRepository;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper.CommentAttachmentPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentAttachmentStorerImpl implements CommentAttachmentStorer {
	private final CommentAttachmentJpaRepository commentAttachmentJpaRepository;
	private final CommentAttachmentPersistenceMapper commentAttachmentPersistenceMapper;

	@Override
	public CommentAttachment store(CommentAttachment data) {
		// ...implementation code...
		return null;
	}

	@Override
	public Optional<CommentAttachment> getById(Long id) {
		// ...implementation code...
		return Optional.empty();
	}
}
