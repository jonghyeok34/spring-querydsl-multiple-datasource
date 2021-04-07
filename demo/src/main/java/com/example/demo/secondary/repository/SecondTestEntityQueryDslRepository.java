package com.example.demo.secondary.repository;

import java.util.List;

import com.example.demo.config.querydsl.SecondaryQuerydslRepositorySupport;
import com.example.demo.secondary.model.QSecondTestEntity;
import com.example.demo.secondary.model.SecondTestEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class SecondTestEntityQueryDslRepository extends SecondaryQuerydslRepositorySupport {

    private final JPAQueryFactory factory;

    public SecondTestEntityQueryDslRepository(@Qualifier("secondaryQueryFactory") JPAQueryFactory factory) {
        super(SecondTestEntity.class);
        this.factory = factory;
    }

    public List<SecondTestEntity> findAll(){
        QSecondTestEntity entity = QSecondTestEntity.secondTestEntity;
        
        return factory.select(Projections.fields(
            SecondTestEntity.class, 
            entity.id,
            entity.column
            ))
            .from(entity).fetch();
    }
    
}
