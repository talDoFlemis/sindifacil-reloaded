package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class DateAudit implements Serializable {
	@CreatedDate
	@Column(name = "created_at", columnDefinition = "timestamp with time zone not null", updatable = false, nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@LastModifiedDate
	@Column(name = "updated_at", columnDefinition = "timestamp with time zone not null")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
}