package com.fightingnerds.sindifacil.infrastructure.driven.security.zitadel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OAuth2UserInfoRequest {
	private String name;
	private String email;
	private String picture;
	private String id;
}
