package com.cars.spring.cars.persistence.repository;

import com.cars.spring.cars.persistence.entity.CarModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarModelCrudRepository extends JpaRepository<CarModelEntity,Integer> {
}
