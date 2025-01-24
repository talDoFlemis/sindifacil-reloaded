package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Comment extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "user_cpf", nullable = false)
	private User creator;

	private String richText;

	@OneToMany(
		mappedBy = "comment",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<CommentAttachment> attachments;

	private Long likeAmount;

	@OneToMany(
		mappedBy = "repliedComment",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<CommentReply> replies;
}
