package com.jwat.week8_tranminhnguyen.connection.controller;

import com.jwat.week8_tranminhnguyen.model.Employee;

public interface IController {
    void addEmployee(Employee e);

    void removeEmployee(String id);

    void getEmployee();

    void updateEmployee(Employee e);
}
