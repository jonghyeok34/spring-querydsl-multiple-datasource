package com.example.demo.primary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "SCHEMA_NAME", name="TEST_ENTITY")
public class TestEntity {
    @Id
    @Column(name="ID")
    private String id;

    @Column(name="COLUMN")
    private String column;
}
