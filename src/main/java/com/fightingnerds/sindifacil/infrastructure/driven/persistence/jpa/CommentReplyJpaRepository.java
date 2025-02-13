package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.CommentReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentReplyJpaRepository extends JpaRepository<CommentReplyEntity, Long> {
}
