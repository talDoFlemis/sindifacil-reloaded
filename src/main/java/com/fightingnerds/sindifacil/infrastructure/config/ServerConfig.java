package com.fightingnerds.sindifacil.infrastructure.config;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "server")
@Validated
@Data
public class ServerConfig {
	@NotNull
	@Positive
	private Integer port;

	@NotNull
	private Servlet servlet;

	@NotNull
	private Cors cors;

	@Data
	public static class Servlet {

		@NotNull
		private Encoding encoding;

		@NotNull
		private String contextPath;

		@Data
		public static class Encoding {

			@NotNull
			private Boolean force;
		}
	}

	@Data
	public static class Cors {

		@NotNull
		@Size(min = 1)
		private List<String> allowedHeaders;

		@NotNull
		@Size(min = 1)
		private List<String> allowedOrigins;

		@NotNull
		@Size(min = 1)
		private List<String> allowedMethods;

		@NotNull
		private Boolean allowCredentials;
	}

}
