package com.jwat.week8_tranminhnguyen.connection.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveService {
    private Connection con;
    private Statement st;
    private String id;

    public RemoveService(Connection con, Statement st,String id) {
        this.con = con;
        this.st = st;
        this.id = id;
    }

    public void removeEmployee() {
        String query = "DELETE FROM `employee`.`employee` WHERE (`id` = '" + id+ "');";
        try {
            st.executeUpdate(query);
            st.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
