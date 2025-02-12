package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TicketResponse {
    private Long id;
    private String title;
    private String description;
    private String creator;
    private String comments;
    private String attachments;
}
