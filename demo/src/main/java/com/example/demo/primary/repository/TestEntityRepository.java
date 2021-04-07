package com.example.demo.primary.repository;

import com.example.demo.primary.model.TestEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntityRepository extends CrudRepository<TestEntity, String>{
    
}
