package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.CondominiumForm;
import com.fightingnerds.sindifacil.models.Condominium;
import com.fightingnerds.sindifacil.models.Property;
import com.fightingnerds.sindifacil.models.Syndic;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CondominiumController {
	public List<Condominium> listAllCondominiums() {
		return null;
	}

	public void addCondominium(CondominiumForm condominiumRegistrationForm) {
	}

	public void editCondominium(Condominium condominium, CondominiumForm condominiumRegistrationForm) {
	}

	public void deleteCondominium(Condominium condominium) {
	}

	public void changeSyndic(Condominium condominium, Syndic syndic) {
	}
}
