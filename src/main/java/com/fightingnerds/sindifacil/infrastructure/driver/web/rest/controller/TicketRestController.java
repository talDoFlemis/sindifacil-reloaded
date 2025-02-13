package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.TicketService;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.CreateTicketRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.ReplyCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.UpdateCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.UploadAttachmentForCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.CommentResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.TicketResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.CommentRestMapper;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.TicketRestMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.fightingnerds.sindifacil.application.port.driver.ticket.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/ticket/")
public class TicketRestController {
    private final TicketRestMapper ticketRestMapper;
    private final CommentRestMapper commentRestMapper; 
    private final CreateTicketUseCase createTicketUseCase;
    private final GetTicketUseCase getTicketByIdUseCase;
    private final GetAllTicketsByStatusUseCase getTicketsByStatusUseCase;
    private final UpdateTicketUseCase updateTicketUseCase;
    private final AddCommentUseCase addCommentUseCase;
    private final UpdateCommentUseCase updateCommentUseCase;
    private final ReplyCommentUseCase replyToCommentUseCase;
    private final UploadAttachmentForCommentUseCase uploadAttachmentForCommentUseCase;
    private final GetAllTickets getAllTicketsUseCase;

    @PostMapping
    public ResponseEntity<TicketResponse> createTicket(CreateTicketRequest createTicketRequest) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketResponse> getTicketById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{ticketStatus}")
    public ResponseEntity<List<TicketResponse>> getTicketsByStatus(@PathVariable TicketStatus ticketStatus) {
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<TicketResponse> updateTicket(@PathVariable Long id, @RequestBody @Valid CreateTicketRequest createTicketRequest) {
        return null;
    }

    @PostMapping("/{ticketId}/comments")
    public ResponseEntity<CommentResponse> addComment(@PathVariable Long ticketId, @RequestBody @Valid UpdateCommentRequest updateCommentRequest) {
        return null;
    }

    @PutMapping("/comments/{commentId}")
    public ResponseEntity<CommentResponse> updateComment(@PathVariable Long commentId, @RequestBody @Valid UpdateCommentRequest updateCommentRequest) {
        return null;
    }

    @PostMapping("/comments/{commentId}/replies")
    public ResponseEntity<CommentResponse> replyToComment(@PathVariable Long commentId, @RequestBody @Valid ReplyCommentRequest replyCommentRequest) {
        return null;
    }

    @PostMapping("/comments/{commentId}/attachments")
    public ResponseEntity<Void> uploadAttachmentForComment(@PathVariable Long commentId, @RequestBody @Valid UploadAttachmentForCommentRequest uploadAttachmentForCommentRequest) {
        return null;
    }
}
