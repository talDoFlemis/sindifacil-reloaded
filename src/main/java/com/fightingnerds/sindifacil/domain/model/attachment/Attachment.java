package com.fightingnerds.sindifacil.domain.model.attachment;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public abstract class Attachment {
	private String key;
	private String fileName;
	private String mimeType;
	private Long byteSize;
	private Date createdAt;
	private String checksum;
}
