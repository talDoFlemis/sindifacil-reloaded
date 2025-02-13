package com.fightingnerds.sindifacil.infrastructure.driven.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity.NewsletterEntity;

@Repository
public interface NewsletterJpaRepository extends JpaRepository<NewsletterEntity, Long> {
    
}
