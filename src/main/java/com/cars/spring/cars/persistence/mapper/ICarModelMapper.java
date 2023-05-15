package com.cars.spring.cars.persistence.mapper;

import com.cars.spring.cars.domain.pojo.CarModelPojo;
import com.cars.spring.cars.persistence.entity.CarModelEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper that transform objects of CarModel to Pojo o Entities
 * */
@Mapper(componentModel = "spring")
public interface ICarModelMapper {

    /* Transform Entity to Pojo */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    CarModelPojo toCardModelPojo(CarModelEntity modelEntity);

    /* Transform Pojo to Entity */
    @InheritInverseConfiguration
    CarModelEntity toCarModelEntity(CarModelPojo modelPojo);

    List<CarModelPojo> toCarModelPojo (List<CarModelEntity> carModelsEntities);
}
