package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final CarService service;

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public Iterable<Car> getAllCars() {
        return service.getAllCars();
    }

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public Car saveCar(@RequestBody Car car) {
        return service.saveCar(car);
    }

}
