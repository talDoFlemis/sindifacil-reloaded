package com.fightingnerds.sindifacil.infrastructure.driven.security.zitadel;


import com.fightingnerds.sindifacil.domain.model.user.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.*;

@Data
public class OAuth2UserPrincipal implements OAuth2User, UserDetails {
	private UUID id;
	private String username;
	private String password;
	private String name;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private String provider;
	private String providerId;
	private boolean enabled;
	private Collection<? extends GrantedAuthority> authorities;
	private Map<String, Object> attributes;

	public OAuth2UserPrincipal(UUID id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public static OAuth2UserPrincipal create(User user) {
		List<GrantedAuthority> authorities = Collections.
			singletonList(new SimpleGrantedAuthority("ROLE_USER"));

		return new OAuth2UserPrincipal(
			user.getId(),
			user.getUsername(),
			user.getPassword(),
			authorities
		);
	}

	public static OAuth2UserPrincipal create(User user, Map<String, Object> attributes) {
		OAuth2UserPrincipal userPrincipal = OAuth2UserPrincipal.create(user);
		userPrincipal.setAttributes(attributes);
		return userPrincipal;
	}

}
