package com.example.demo.secondary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "SCHEMA_NAME", name="TEST_ENTITY_2")
public class SecondTestEntity {
    @Id
    @Column(name="ID")
    private String id;

    @Column(name="COLUMN")
    private String column;
}
