package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "comment_attachments")
public class CommentAttachmentEntity extends AttachmentEntity {
	@ManyToOne
	@JoinColumn(name = "comment_id", nullable = false)
	private CommentEntity comment;
}
