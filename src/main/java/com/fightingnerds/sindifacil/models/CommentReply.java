package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class CommentReply extends DateAudit {
	@Id
	@Column(name = "comment_id")
	private Long commentId;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comment_id", nullable = false)
	private Comment comment;

	@ManyToOne(fetch = FetchType.LAZY)
	private Comment commentReplied;
}
