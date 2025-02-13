package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.controller;

import com.fightingnerds.sindifacil.application.service.TicketService;
import com.fightingnerds.sindifacil.domain.model.ticket.Ticket;
import com.fightingnerds.sindifacil.enums.TicketStatus;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.CreateTicketRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.TicketResponse;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper.TicketRestMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/v1/ticket/")
public class TicketRestController {
    private final TicketService ticketService;
    private final TicketRestMapper ticketRestMapper;

    @PostMapping
    public ResponseEntity<TicketResponse> createTicket(CreateTicketRequest createTicketRequest) {
       Ticket ticket = this.ticketRestMapper.toDomain(createTicketRequest);
       ticket = ticketService.create(ticket);
       return new ResponseEntity<>(this.ticketRestMapper.toCreateTicketResponse(ticket), org.springframework.http.HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketResponse> getTicketById(@PathVariable Long id) {
        Ticket ticket = ticketService.getTicket(id);
        return new ResponseEntity<>(this.ticketRestMapper.toCreateTicketResponse(ticket), HttpStatus.OK);
    }

    @GetMapping("/{ticketStatus}")
    public ResponseEntity<List<TicketResponse>> getTicketsByStatus(@PathVariable TicketStatus ticketStatus) {
        List<Ticket> tickets = ticketService.getAllTicketByStatus(ticketStatus);
        List<TicketResponse> ticketsResponse = new ArrayList<>();
        for (Ticket ticket : tickets) {
            TicketResponse createTicketResponse = this
                    .ticketRestMapper.toCreateTicketResponse(ticket);
            ticketsResponse.add(createTicketResponse);
        }
        return new ResponseEntity<>(ticketsResponse, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<TicketResponse> updateTicket(@PathVariable Long id, @RequestBody @Valid CreateTicketRequest createTicketRequest) {
        Ticket ticket = this.ticketRestMapper.toDomain(createTicketRequest);
        ticket = ticketService.updateTicket(ticket);
        ticket.setId(id);
        return new ResponseEntity<>(this.ticketRestMapper.toCreateTicketResponse(ticket), HttpStatus.OK);
    }
}
