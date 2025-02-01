package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class CommentAttachment extends Attachment {
	@ManyToOne(fetch = FetchType.LAZY)
	private Comment comment;
}
