package com.cars.spring.cars.domain.service;

import com.cars.spring.cars.domain.pojo.CarModelPojo;
import com.cars.spring.cars.domain.repository.ICarModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CarModelService implements ICarModelService {

    private final ICarModelRepository iCarModelRepository;

    @Override
    public List<CarModelPojo> getAll() {
        return iCarModelRepository.getAll();
    }

    @Override
    public Optional<CarModelPojo> getCarModel(Integer id) {
        return iCarModelRepository.getCarModel(id);
    }

    @Override
    public CarModelPojo save(CarModelPojo newCarModel) {
        return iCarModelRepository.save(newCarModel);
    }

    @Override
    public boolean delete(Integer idCarModel) {
        try {
            iCarModelRepository.delete(idCarModel);
            return true;
        } catch (Exception e) {

            return false;
        }
    }
}
