package com.fightingnerds.sindifacil.domain.model.ticket;

import com.fightingnerds.sindifacil.domain.model.comment.Comment;
import com.fightingnerds.sindifacil.domain.model.user.User;
import com.fightingnerds.sindifacil.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class Ticket {
	private User creator;

	private String title;

	private String description;

	private List<Comment> comments;

	private TicketStatus status;

	private List<TicketAttachment> attachments;
}
