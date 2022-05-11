package com.example.demo.service;

import com.example.demo.entity.Car;

import com.example.demo.repo.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepo repo;

    public Iterable<Car> getAllCars() {
        return repo.findAll();
    }

    public Car saveCar(Car car) {

        if (car.getColor().length() < 2) {
            throw new RuntimeException("ZALUPA");
        }

        return repo.save(car);
    }

    @Transactional
    public Car updateCar(Car carDomain) {

        Car carInDb = repo.findCarByModel(carDomain.getModel())
                .orElseThrow(() -> new RuntimeException("car not found"));

        carInDb.setColor(carDomain.getColor());
        return carInDb;
    }


}
