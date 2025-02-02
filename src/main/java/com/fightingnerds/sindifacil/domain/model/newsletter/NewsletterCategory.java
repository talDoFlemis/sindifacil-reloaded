package com.fightingnerds.sindifacil.domain.model.newsletter;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NewsletterCategory {
	private Long id;

	@NotBlank
	private String name;
}
