package com.cars.spring.cars.domain.service;

import com.cars.spring.cars.domain.pojo.CarModelPojo;

import java.util.List;
import java.util.Optional;

public interface ICarModelService {
    List<CarModelPojo> getAll();

    Optional<CarModelPojo> getCarModel(Integer id);

    CarModelPojo save(CarModelPojo newCarModel);

    boolean delete(Integer idCarModel);

}
