package com.jwat.week8_tranminhnguyen.connection.services;

import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceManager {
    static private Connection con;
    static private Statement st;
    public ServiceManager() {
        try { // check if driver existed
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String username = "root";
            String password = "password";
            String url = "jdbc:mysql://localhost:3306/employee";

            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee e) {
        var addService = new AddService(st);
        addService.addEmployee(e);
    }

    public void removeEmployee(String id) {
        var removeService = new RemoveService(st,id);
        removeService.removeEmployee();
    }

    public void updateEmployee(Employee e) {
        var updateService = new UpdateService(st);
        updateService.updateEmployee(e);
    }

    public void getEmployee() {
        var getService = new GetService(con, st);
        getService.getEmployee();

    }
}
