package com.jwat.week8_tranminhnguyen.connection.services;

import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceManager {
    static private Connection con;
    static private Statement st;

    private static final String username = "root";
    private static final String password = "password";
    private static final String url = "jdbc:mysql://localhost:3306/employee";

    public ServiceManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee e) {
        var addService = new AddService(con,st);
        addService.addEmployee(e);
    }

    public void removeEmployee(String id) {
        var removeService = new RemoveService(con,st,id);
        removeService.removeEmployee();
    }

    public void updateEmployee() {

    }

    public void getEmployee() {
        var getter = new GetService(con, st);
        getter.getEmployee();

    }
}
