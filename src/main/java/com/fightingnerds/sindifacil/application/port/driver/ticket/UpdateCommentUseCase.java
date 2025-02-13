package com.fightingnerds.sindifacil.application.port.driver.ticket;

import com.fightingnerds.sindifacil.domain.model.ticket.Comment;

public interface UpdateCommentUseCase {
    Comment updateComment(Comment comment);
}
