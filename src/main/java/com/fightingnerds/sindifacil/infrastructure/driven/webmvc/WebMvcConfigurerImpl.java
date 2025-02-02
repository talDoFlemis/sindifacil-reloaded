package com.fightingnerds.sindifacil.infrastructure.driven.webmvc;

import com.fightingnerds.sindifacil.infrastructure.config.ServerConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@RequiredArgsConstructor
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	private final ServerConfig serverConfig;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		ServerConfig.Cors cors = serverConfig.getCors();

		registry.addMapping(serverConfig.getServlet().getContextPath() + "/**")
			.allowedOrigins(cors.getAllowedOrigins().toArray(new String[0]))
			.allowedMethods(cors.getAllowedMethods().toArray(new String[0]))
			.allowedHeaders(cors.getAllowedHeaders().toArray(new String[0]));
	}
}
