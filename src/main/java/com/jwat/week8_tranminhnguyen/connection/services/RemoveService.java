package com.jwat.week8_tranminhnguyen.connection.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveService {
    private final Statement st;
    private final String id;

    public RemoveService(Statement st,String id) {
        this.st = st;
        this.id = id;
    }

    public void removeEmployee() {
        String query = "DELETE FROM `employee`.`employee` WHERE (`id` = '" + id+ "');";
        try {
            st.executeUpdate(query);
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
