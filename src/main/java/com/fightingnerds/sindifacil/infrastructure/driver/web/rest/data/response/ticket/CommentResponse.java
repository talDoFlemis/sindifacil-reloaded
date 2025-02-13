package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.ticket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentResponse {
    private Long id;
    private String creatorName;
    private String richText;
    private List<String> attachmentUrls;
    private Long likeAmount;
    private List<CommentResponse> replies;
}
