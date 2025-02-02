package com.fightingnerds.sindifacil.infrastructure.driven.persistence.mapper;

public interface PersistenceMapper<E, D> {
	E toEntity(D domain);

	D toDomain(E entity);
}
