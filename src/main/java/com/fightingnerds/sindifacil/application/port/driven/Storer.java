package com.fightingnerds.sindifacil.application.port.driven;

import java.util.Optional;

public interface Storer<D, I> {
	D store(D data);
	Optional<D> getById(I id);
}
