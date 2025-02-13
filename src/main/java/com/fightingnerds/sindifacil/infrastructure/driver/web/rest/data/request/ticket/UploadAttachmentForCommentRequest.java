package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.ticket;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadAttachmentForCommentRequest {
    @NotEmpty(message = "Comment ID is required")
    private Long commentId;

    @NotEmpty(message = "Attachment data is required")
    private String attachmentData;
}
