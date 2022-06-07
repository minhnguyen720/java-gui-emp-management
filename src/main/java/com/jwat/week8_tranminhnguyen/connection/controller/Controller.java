package com.jwat.week8_tranminhnguyen.connection.controller;

import com.jwat.week8_tranminhnguyen.connection.services.ServiceManager;
import com.jwat.week8_tranminhnguyen.model.Employee;

import java.util.List;

public class Controller implements IController {
    @Override
    public void addEmployee(Employee e) {
        var serviceManager = new ServiceManager();
        serviceManager.addEmployee(e);
    }

    @Override
    public void removeEmployee(String id) {
        var serviceManager = new ServiceManager();
        serviceManager.removeEmployee(id);
    }

    @Override
    public void getEmployee() {
        var serviceManager = new ServiceManager();
        serviceManager.getEmployee();
    }

    @Override
    public void updateEmployee(Employee e) {
        var serviceManager = new ServiceManager();
        serviceManager.updateEmployee(e);
    }
}
