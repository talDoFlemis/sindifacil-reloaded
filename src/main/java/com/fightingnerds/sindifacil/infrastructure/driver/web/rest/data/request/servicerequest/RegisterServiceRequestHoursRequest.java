package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.servicerequest;

import lombok.Data;

@Data
public class RegisterServiceRequestHoursRequest {
	private Long requestId;
	private int hours;
}
