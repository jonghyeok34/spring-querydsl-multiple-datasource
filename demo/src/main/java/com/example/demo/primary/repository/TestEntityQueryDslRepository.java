package com.example.demo.primary.repository;

import java.util.List;

import com.example.demo.config.querydsl.PrimaryQuerydslRepositorySupport;
import com.example.demo.primary.model.QTestEntity;
import com.example.demo.primary.model.TestEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.stereotype.Repository;

@Repository
public class TestEntityQueryDslRepository extends PrimaryQuerydslRepositorySupport {

    // QuerydslConfig 생성한 빈 이름과 
    private final JPAQueryFactory primaryQueryFactory;

    public TestEntityQueryDslRepository( JPAQueryFactory primaryQueryFactory) {
       super(TestEntity.class);
       this.primaryQueryFactory = primaryQueryFactory;
    }
    
    public List<TestEntity> findAll(){
        QTestEntity testEntity = QTestEntity.testEntity;
        
        return primaryQueryFactory.select(Projections.fields(
            TestEntity.class, 
            testEntity.id,
            testEntity.column
            ))
            .from(testEntity).fetch();
    }
    
}
