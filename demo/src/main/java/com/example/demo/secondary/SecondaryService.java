package com.example.demo.secondary;

import java.util.List;

import com.example.demo.secondary.model.SecondTestEntity;
import com.example.demo.secondary.repository.SecondTestEntityQueryDslRepository;

import org.springframework.stereotype.Service;

@Service
public class SecondaryService {

    private final SecondTestEntityQueryDslRepository repo;
    public SecondaryService(SecondTestEntityQueryDslRepository repo){
        this.repo = repo;
    }
    public List<SecondTestEntity> findAll(){
        return repo.findAll();
    }
}
