package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "user_cpf", nullable = false)
	private User creator;

	private String richText;

	@OneToMany
	private List<Attachment> attachments;

	private Long likes;

	@OneToMany
	private List<CommentReply> replies;
}
