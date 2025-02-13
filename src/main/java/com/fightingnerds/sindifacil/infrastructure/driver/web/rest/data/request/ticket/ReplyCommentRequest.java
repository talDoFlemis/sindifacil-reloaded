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
public class ReplyCommentRequest {
    @NotEmpty(message = "Rich text is required")
    private String richText;

    @NotEmpty(message = "Comment ID is required")
    private Long commentId;
}
