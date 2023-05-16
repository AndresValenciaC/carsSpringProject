package com.cars.spring.cars.domain.repository;

import com.cars.spring.cars.domain.pojo.CarModelPojo;

import java.util.List;
import java.util.Optional;

public interface ICarModelRepository {

    List<CarModelPojo> getAll();

    Optional<CarModelPojo> getCarModel(Integer id);

    CarModelPojo save(CarModelPojo newCarModel);

    void delete(Integer idCarModel);

}
