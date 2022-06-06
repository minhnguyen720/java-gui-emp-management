package com.jwat.week8_tranminhnguyen.connection.controller;

import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface IController {
    void addEmployee(Employee e);

    void removeEmployee(String id);

    void getEmployee();

    void updateEmployee();
}
