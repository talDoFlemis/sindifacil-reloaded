package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.servicerequest;

import lombok.Data;

@Data
public class ServiceRequestResponse {
	private Long requestId;
	private String status;
	private int hours;
}
