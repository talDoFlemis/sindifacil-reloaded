package com.fightingnerds.sindifacil.infrastructure.driven.security.zitadel;

import com.fightingnerds.sindifacil.application.port.driven.user.UserStorer;
import com.fightingnerds.sindifacil.domain.model.user.User;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ZitadelOAuth2UserService extends DefaultOAuth2UserService {
	private final UserStorer userStorer;

	@Override
	@SneakyThrows
	public OAuth2User loadUser(OAuth2UserRequest oAuth2UserRequest) {
		log.trace("Load user {}", oAuth2UserRequest);
		OAuth2User oAuth2User = super.loadUser(oAuth2UserRequest);
		return processOAuth2User(oAuth2UserRequest, oAuth2User);
	}

	private OAuth2User processOAuth2User(OAuth2UserRequest oAuth2UserRequest, OAuth2User oAuth2User) {
		OAuth2UserInfoRequest userInfoDto = OAuth2UserInfoRequest
			.builder()
			.name(oAuth2User.getAttributes().get("name").toString())
			.id(oAuth2User.getAttributes().get("sub").toString())
			.email(oAuth2User.getAttributes().get("email").toString())
			.picture(oAuth2User.getAttributes().get("picture").toString())
			.build();

		log.trace("User info is {}", userInfoDto);
		Optional<User> userOptional = userStorer.getByUsername(userInfoDto.getEmail());
		log.trace("User is {}", userOptional);
		User user = userOptional
			.map(existingUser -> updateExistingUser(existingUser, userInfoDto))
			.orElseGet(() -> registerNewUser(oAuth2UserRequest, userInfoDto));
		return OAuth2UserPrincipal.create(user, oAuth2User.getAttributes());
	}

	private User registerNewUser(OAuth2UserRequest oAuth2UserRequest, OAuth2UserInfoRequest userInfoDto) {
		User user = new User();
		user.setProvider(oAuth2UserRequest.getClientRegistration().getRegistrationId());
		user.setProviderId(userInfoDto.getId());
		user.setName(userInfoDto.getName());
		user.setUsername(userInfoDto.getEmail());
		user.setPicture(userInfoDto.getPicture());
		user.setId(UUID.randomUUID());
		return userStorer.store(user);
	}

	private User updateExistingUser(User existingUser, OAuth2UserInfoRequest userInfoDto) {
		existingUser.setName(userInfoDto.getName());
		existingUser.setPicture(userInfoDto.getPicture());
		return userStorer.store(existingUser);
	}
}
