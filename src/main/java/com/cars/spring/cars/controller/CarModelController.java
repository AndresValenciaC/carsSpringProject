package com.cars.spring.cars.controller;
// Api

import com.cars.spring.cars.domain.pojo.CarModelPojo;
import com.cars.spring.cars.domain.service.ICarModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
@RequestMapping(path = "/Cars_Models")
public class CarModelController {
    private final ICarModelService iCarModelService;

    @GetMapping
    public ResponseEntity<List<CarModelPojo>> getAll() {
        //  return   ResponseEntity.status(HttpStatus.OK).body(iCarModelService.getAll());
        return new ResponseEntity<>(iCarModelService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CarModelPojo> getCarModel(@PathVariable Integer id) {
        return ResponseEntity.of(iCarModelService.getCarModel(id));
    }

    @PostMapping
    public ResponseEntity<CarModelPojo> save(@RequestBody CarModelPojo newCarModelPojo) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iCarModelService.save(newCarModelPojo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

    }

}
