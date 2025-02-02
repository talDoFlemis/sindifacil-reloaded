package com.fightingnerds.sindifacil.domain.model.newsletter;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Newsletter {
	private Long id;

	@NotNull
	private Condominium condominium;

	@NotBlank
	private String richText;

	@NotNull
	private NewsletterCategory category;
}
