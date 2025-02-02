package com.fightingnerds.sindifacil.application.port.driver.newsletter;

import com.fightingnerds.sindifacil.domain.model.condominium.Condominium;
import com.fightingnerds.sindifacil.domain.model.newsletter.Newsletter;

import java.util.List;

public interface GetAllNewsletterByCondominium {
	List<Newsletter> getAllNewsletterByCondominium(Condominium condominium);
}
