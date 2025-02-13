package com.fightingnerds.sindifacil.domain.model.ticket;

import lombok.Data;

@Data
public class CommentReply {
	private Long commentId;
	private Comment comment;
	private Comment commentReplied;
}
