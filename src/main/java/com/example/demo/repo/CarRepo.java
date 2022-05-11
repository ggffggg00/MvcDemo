package com.example.demo.repo;

import com.example.demo.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepo extends CrudRepository<Car, Integer> {

    Optional<Car> findCarByModel(String model);

}
