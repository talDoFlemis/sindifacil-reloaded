package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class CommentReply {
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
