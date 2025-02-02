package com.fightingnerds.sindifacil.infrastructure.config;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "spring.security")
@Validated
@Data
public class SecurityConfig {
	@NotNull
	private Oauth2 oauth2;

	@Data
	public static class Oauth2 {

		@NotNull
		private Client client;

		@NotNull
		private Resourceserver resourceserver;

		@Data
		public static class Client {

			@NotEmpty
			@Size(min = 1)
			private Map<String, Registration> registration;

			@NotNull
			@NotEmpty
			@Size(min = 1)
			private Map<String, Provider> provider;

			@Data
			public static class Registration {
				@NotNull
				private String clientAuthenticationMethod;

				@NotNull
				private String clientId;

				@NotNull
				private String clientSecret;

				@NotEmpty
				private String[] scope;

				@NotEmpty
				private String authorizationGrantType;

				@NotEmpty
				private String redirectUri;
			}

			@Data
			public static class Provider {
				@NotNull
				@URL
				private String issuerUri;

				@NotNull
				@NotBlank
				private String userNameAttribute;
			}
		}

		@Data
		public static class Resourceserver {

			@NotNull
			private Jwt jwt;

			@Data
			public static class Jwt {

				@NotNull
				@URL
				private String issuerUri;
			}
		}
	}
}