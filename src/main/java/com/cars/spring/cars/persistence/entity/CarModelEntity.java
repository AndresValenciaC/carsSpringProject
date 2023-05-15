package com.cars.spring.cars.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * Entity Car Model
 * */
@Entity
@Table(name = "car_model")
public class CarModelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcar_model")
    private Integer id;
    private String description;


}
