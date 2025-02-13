package com.fightingnerds.sindifacil.domain.model.ticket;

import com.fightingnerds.sindifacil.domain.model.attachment.Attachment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class TicketAttachment extends Attachment {
	private Ticket ticket;
}
