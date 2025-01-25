package com.fightingnerds.sindifacil.controllers;

import com.fightingnerds.sindifacil.forms.PropertyForm;
import com.fightingnerds.sindifacil.models.Condominium;
import com.fightingnerds.sindifacil.models.JointOwner;
import com.fightingnerds.sindifacil.models.Property;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PropertyController {
	public List<Property> listAllProperties() {
		return null;
	}

	public List<Property> listPropertiesByCondominium(Condominium condominium) {
		return null;
	}

	public void registerProperty(Condominium condominium, PropertyForm propertyForm) {
	}

	public void editProperty(Property property, PropertyForm propertyForm) {
	}

	public void changePropertyOwner(Property property, JointOwner jointOwner) {
	}
}
