package com.jwat.week8_tranminhnguyen.connection.services;

import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddService {
    private String query = "insert into employee(id,name,gender,dob,mobile,email,role,dept,salary,type) values";

    private Connection con;
    private Statement st;

    public AddService(Connection con, Statement st) {
        this.con = con;
        this.st = st;
    }

    public void addEmployee(Employee e) {
        String values = "(" + "'" + e.getId() + "'" + "," + "'" + e.getName() + "'" + "," + "'" + e.getGender() + "'" + "," + "'" + e.getDob() + "'" + "," + "'" + e.getMobile() + "'" + "," + "'" + e.getEmail() + "'" + "," + "'" + e.getRole() + "'" + "," + "'" + e.getDept() + "'" + "," + "'" + e.getSalary() + "'" + "," + "'" + e.getType() + "'" + ");";

        String finalQuery = query + values;
        try {
            st.executeUpdate(finalQuery);

            st.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
