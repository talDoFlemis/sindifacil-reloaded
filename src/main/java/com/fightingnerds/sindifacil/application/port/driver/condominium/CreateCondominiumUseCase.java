package com.fightingnerds.sindifacil.application.port.driver.condominium;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;

public interface CreateCondominiumUseCase {
	Condominium create(Condominium condominium);
}
