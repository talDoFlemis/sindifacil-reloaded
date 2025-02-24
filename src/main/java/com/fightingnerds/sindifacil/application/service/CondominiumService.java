package com.fightingnerds.sindifacil.application.service;

import com.fightingnerds.sindifacil.application.port.driven.condominium.CondominiumStorer;
import com.fightingnerds.sindifacil.application.port.driver.condominium.ChangeCondominiumSyndicUseCase;
import com.fightingnerds.sindifacil.application.port.driver.condominium.CreateCondominiumUseCase;
import com.fightingnerds.sindifacil.application.port.driver.condominium.GetAllCondominiumUseCase;
import com.fightingnerds.sindifacil.application.port.driver.condominium.UpdateCondominiumUseCase;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.SyndicEntity;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class CondominiumService implements ChangeCondominiumSyndicUseCase, CreateCondominiumUseCase, GetAllCondominiumUseCase, UpdateCondominiumUseCase {
	private final CondominiumStorer condominiumStorer;

	@Override
	public Condominium create(Condominium condominium) {
		return null;
	}

	@Override
	public List<Condominium> getAll() {
		return List.of();
	}

	@Override
	public Condominium update(Condominium condominium) {
		return null;
	}

	@Override
	public Condominium changeSyndic(Condominium condominium, SyndicEntity syndic) {
		return null;
	}
}
