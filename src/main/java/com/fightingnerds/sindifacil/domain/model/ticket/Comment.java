package com.fightingnerds.sindifacil.domain.model.ticket;

import com.fightingnerds.sindifacil.domain.model.user.User;

import lombok.Data;

import java.util.List;

@Data
public class Comment {
	private Long id;
	private User creator;
	private String richText;
	private List<CommentAttachment> attachments;
	private Long likeAmount;
	private List<CommentReply> replies;
}
