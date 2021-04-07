package com.example.demo.secondary.repository;


import com.example.demo.secondary.model.SecondTestEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondTestEntityRepository extends CrudRepository<SecondTestEntity, String>{
    
}
