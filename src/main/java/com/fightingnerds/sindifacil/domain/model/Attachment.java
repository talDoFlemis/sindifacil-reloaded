package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Attachment {
	@Id
	private String key;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "mime_type")
	private String mimeType;

	@Column(name = "byte_size")
	private Long byteSize;

	@Column(name = "created_at", columnDefinition = "timestamp with time zone not null")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Column(name = "checksum")
	private String checksum;
}
