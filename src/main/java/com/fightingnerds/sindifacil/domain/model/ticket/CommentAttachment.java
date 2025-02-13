package com.fightingnerds.sindifacil.domain.model.ticket;

import com.fightingnerds.sindifacil.domain.model.attachment.Attachment;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class CommentAttachment extends Attachment {
	private Comment comment;
}
