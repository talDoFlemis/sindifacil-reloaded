package com.fightingnerds.sindifacil.domain.model.user;

import com.fightingnerds.sindifacil.domain.model.address.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
	private UUID id;

	private Set<Authority> authorities;

	@NotBlank
	private String password;

	@CPF
	private String cpf;

	@Email
	private String email;

	@NotBlank
	private Address address;

	private String cellphone;

	private String name;

	private String picture;

	private String username;

	private boolean accountNonExpired;

	private boolean accountNonLocked;

	private boolean credentialsNonExpired;

	private String provider;

	private String providerId;

	private boolean enabled;
}
