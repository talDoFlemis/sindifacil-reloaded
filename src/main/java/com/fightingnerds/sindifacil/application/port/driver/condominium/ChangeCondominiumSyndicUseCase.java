package com.fightingnerds.sindifacil.application.port.driver.condominium;

import com.fightingnerds.sindifacil.domain.model.Syndic;
import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;

public interface ChangeCondominiumSyndicUseCase {
	Condominium changeSyndic(Condominium condominium, Syndic syndic);
}
