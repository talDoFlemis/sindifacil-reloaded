package com.fightingnerds.sindifacil.application.port.driver.ticket;

public interface UploadAttachmentForCommentUseCase {
    void uploadAttachmentForComment(Long commentId, String attachmentData);
}
