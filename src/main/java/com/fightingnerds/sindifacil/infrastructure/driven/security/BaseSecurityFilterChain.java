package com.fightingnerds.sindifacil.infrastructure.driven.security;


import com.fightingnerds.sindifacil.infrastructure.driven.security.zitadel.ZitadelGrantedAuthoritiesMapper;
import com.fightingnerds.sindifacil.infrastructure.driven.security.zitadel.ZitadelOAuth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class BaseSecurityFilterChain {
	private final ClientRegistrationRepository clientRegistrationRepository;
	private final ZitadelOAuth2UserService zitadelOAuth2UserService;

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.cors(withDefaults());
		http.csrf(AbstractHttpConfigurer::disable);

		// Requests
		http.authorizeHttpRequests(authorizeConfig -> {
			authorizeConfig.requestMatchers("/webjars/**", "/resources/**", "/css/**").permitAll();
			authorizeConfig.anyRequest().fullyAuthenticated();
		});

		// OAuth2
		http
			.oauth2Login(login -> login
				.userInfoEndpoint(userInfo -> userInfo.userAuthoritiesMapper(this.userAuthoritiesMapper()).userService(zitadelOAuth2UserService)))
			.oauth2ResourceServer(conf -> conf.jwt(withDefaults()))
			.logout(logout -> logout.logoutSuccessHandler(this.oidcLogoutSuccessHandler()));

		// Filters
		http.addFilterBefore(new LoggingFilter(), AbstractPreAuthenticatedProcessingFilter.class);


		return http.build();
	}

	private GrantedAuthoritiesMapper userAuthoritiesMapper() {
		return new ZitadelGrantedAuthoritiesMapper();
	}

	private LogoutSuccessHandler oidcLogoutSuccessHandler() {
		OidcClientInitiatedLogoutSuccessHandler oidcLogoutSuccessHandler = new OidcClientInitiatedLogoutSuccessHandler(
			this.clientRegistrationRepository);
		oidcLogoutSuccessHandler.setPostLogoutRedirectUri("{baseUrl}");

		return oidcLogoutSuccessHandler;
	}
}
