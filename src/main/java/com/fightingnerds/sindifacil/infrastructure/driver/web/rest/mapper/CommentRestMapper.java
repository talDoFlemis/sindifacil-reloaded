package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.ticket.Comment;
import com.fightingnerds.sindifacil.domain.model.ticket.CommentAttachment;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.CreateCommentForTicketRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.ReplyCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.UpdateCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket.UploadAttachmentForCommentRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket.CommentResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CommentRestMapper {
    Comment toDomain(CreateCommentForTicketRequest request);
    Comment toDomain(ReplyCommentRequest request);
    Comment toDomain(UpdateCommentRequest request);
    CommentAttachment toDomain(UploadAttachmentForCommentRequest request);
    CommentResponse toResponse(Comment comment);
}
