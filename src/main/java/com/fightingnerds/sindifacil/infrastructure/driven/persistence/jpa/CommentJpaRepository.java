package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentJpaRepository extends JpaRepository<CommentEntity, Long> {
}
