package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.servicerequest;

import lombok.Data;

@Data
public class UpdateServiceRequestRequest {
	private Long requestId;
	private String status;
}
