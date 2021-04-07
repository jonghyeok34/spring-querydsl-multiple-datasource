package com.example.demo.primary;

import java.util.List;

import com.example.demo.primary.model.TestEntity;
import com.example.demo.primary.repository.TestEntityQueryDslRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimaryService {

    @Autowired
    private TestEntityQueryDslRepository repo;

    public PrimaryService(TestEntityQueryDslRepository repo){
        this.repo = repo;
    }

    public List<TestEntity> findAll(){
        return repo.findAll();
    }
}
