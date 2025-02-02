package com.fightingnerds.sindifacil.application.port.driver.condominium;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;

import java.util.List;

public interface GetAllCondominiumUseCase {
	List<Condominium> getAll();
}
