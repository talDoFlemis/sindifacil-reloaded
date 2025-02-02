package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.property;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ChangePropertyJointOwnerRequest {
	private Long jointOwnerId;
}
