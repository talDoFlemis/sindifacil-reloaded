package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.enums.TicketStatus;
import com.fightingnerds.sindifacil.forms.TicketCommentForm;
import com.fightingnerds.sindifacil.forms.TicketForm;
import com.fightingnerds.sindifacil.models.Ticket;
import com.fightingnerds.sindifacil.models.User;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {
	public List<Ticket> listAllTickets() {
		return null;
	}

	public List<Ticket> listTicketByStatus(TicketStatus status) {
		return null;
	}

	public void addTicket(User user, TicketForm ticketForm) {
	}

	public void editTicket(User user, Long ticketId, TicketForm ticketForm) {
	}

	public void addCommentToTicket(User user, TicketCommentForm ticketCommentForm) {
	}

	public void editTicketComment(User user, Long ticketCommentId, TicketCommentForm ticketCommentForm) {
	}

	public void likeTicketComment(User user, Long ticketCommentId) {
	}

	public void replyToTicketComment(User user, Long ticketCommentId, TicketCommentForm ticketCommentForm) {
	}

	public void ArchiveTicket(User user, Long ticketId) {
	}
}
