package com.fightingnerds.sindifacil.domain.model.attachment;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public abstract class Attachment {
	private String key;
	private String fileName;
	private String mimeType;
	private Long byteSize;
	private Date createdAt;
	private String checksum;
}
