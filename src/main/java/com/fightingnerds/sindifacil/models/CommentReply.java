package com.fightingnerds.sindifacil.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CommentReply {
	// TODO: change this to use same comment id
	@Id
	private Long id;

	@OneToOne
	@JoinColumn(name = "comment_id")
	private Comment comment;

	@OneToOne
	@JoinColumn(name = "comment_replied_id")
	private Comment commentReplied;
}
