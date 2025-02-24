package com.fightingnerds.sindifacil.application.port.driver.condominium;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.SyndicEntity;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;

public interface ChangeCondominiumSyndicUseCase {
	Condominium changeSyndic(Condominium condominium, SyndicEntity syndic);
}
