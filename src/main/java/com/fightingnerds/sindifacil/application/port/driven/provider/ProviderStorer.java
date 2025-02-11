package com.fightingnerds.sindifacil.application.port.driven.provider;

import com.fightingnerds.sindifacil.application.port.driven.Storer;
import com.fightingnerds.sindifacil.domain.model.provider.Provider;

import java.util.UUID;

public interface ProviderStorer extends Storer<Provider, UUID> {
}
