package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "comments")
public class CommentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "user_cpf", nullable = false)
	private UserEntity creator;

	private String richText;

	@OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CommentAttachmentEntity> attachments;

	private Long likeAmount;

	@OneToMany(mappedBy = "commentReplied", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CommentReplyEntity> replies;
}
