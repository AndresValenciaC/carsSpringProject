package com.cars.spring.cars.persistence.repository;

import com.cars.spring.cars.domain.pojo.CarModelPojo;
import com.cars.spring.cars.domain.repository.ICarModelRepository;
import com.cars.spring.cars.persistence.entity.CarModelEntity;
import com.cars.spring.cars.persistence.mapper.ICarModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class CarModelRepository implements ICarModelRepository {

    private final ICarModelCrudRepository iCarModelCrudRepository;
    private final ICarModelMapper iCarModelMapper;


    @Override
    public List<CarModelPojo> getAll() {
        return iCarModelMapper.toCarModelPojo(iCarModelCrudRepository.findAll());
    }

    @Override
    public Optional<CarModelPojo> getCarModel(Integer id) {
        return iCarModelCrudRepository.findById(id).map(iCarModelMapper::toCardModelPojo); // reference method
        //  return iCarModelCrudRepository.findById(id).map
        //  (CarModelEntity -> iCarModelMapper.toCardModelPojo(CarModelEntity )); Lambda
    }

    @Override
    public CarModelPojo save(CarModelPojo newCarModel) {
        CarModelEntity carModelEntity = iCarModelMapper.toCarModelEntity(newCarModel);
        return iCarModelMapper.toCardModelPojo(iCarModelCrudRepository.save(carModelEntity));
    }

    @Override
    public void delete(Integer idCarModel) {
        iCarModelCrudRepository.deleteById(idCarModel);

    }
}
