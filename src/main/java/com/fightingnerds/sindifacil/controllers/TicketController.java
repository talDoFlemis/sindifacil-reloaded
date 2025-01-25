package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.enums.TicketStatus;
import com.fightingnerds.sindifacil.forms.TicketCommentForm;
import com.fightingnerds.sindifacil.forms.TicketForm;
import com.fightingnerds.sindifacil.models.Comment;
import com.fightingnerds.sindifacil.models.Condominium;
import com.fightingnerds.sindifacil.models.Ticket;
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

	public List<Ticket> listTicketByCondominium(Condominium condominium) {
		return null;
	}

	public void addTicket(TicketForm ticketForm) {
	}

	public void editTicket(Ticket ticket, TicketForm ticketForm) {
	}

	public void addCommentToTicket(TicketCommentForm ticketCommentForm) {
	}

	public void editTicketComment(Comment comment, TicketCommentForm ticketCommentForm) {
	}

	public void likeTicketComment(Comment comment) {
	}

	public void replyToTicketComment(Comment comment, TicketCommentForm ticketCommentForm) {
	}

	public void archiveTicket(Ticket ticket) {
	}
}
