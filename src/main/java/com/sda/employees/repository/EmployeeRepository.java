package com.sda.employees.repository;

import com.sda.employees.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    void add(Employee emp);
    List<Employee> findAll();
    List<Employee> findByLastName(String lastName);
}
