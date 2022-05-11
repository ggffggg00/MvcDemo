package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public void saveEmployee(Employee e) {
        if (Objects.isNull(e)) {
            throw new RuntimeException(" HUYNA");
        }

        repo.save();
    }

    MVC

}
