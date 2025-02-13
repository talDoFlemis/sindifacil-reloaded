package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

@Entity(name = "comment_replies")
public class CommentReplyEntity {
	@Id
	@Column(name = "comment_id")
	private Long commentId;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comment_id", nullable = false)
	private CommentEntity comment;

	@ManyToOne(fetch = FetchType.LAZY)
	private CommentEntity commentReplied;
}
