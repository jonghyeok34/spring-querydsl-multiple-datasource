package com.example.demo.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuerydslConfig {
    @PersistenceContext(unitName = "primaryEntityManager")
    EntityManager entityManager1;

    @PersistenceContext(unitName = "secondaryEntityManager")
    EntityManager entityManager2;

    @Bean
    public JPAQueryFactory primaryQueryFactory() {
        return new JPAQueryFactory(entityManager1);
    }

    @Bean(name="secondaryQueryFactory")
    public JPAQueryFactory secondaryQueryFactory() {
        return new JPAQueryFactory(entityManager2);
    }
}
