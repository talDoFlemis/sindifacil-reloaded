package com.fightingnerds.sindifacil.application.port.driven.condominium;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.SyndicEntity;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;

import java.util.List;

public interface CondominiumStorer extends Storer<Condominium, Long> {
	List<Condominium> getAll();
	Condominium update(Condominium condominium);
	void delete(Long id);
	Condominium changeSyndic(Condominium condominium, SyndicEntity syndic);
}
