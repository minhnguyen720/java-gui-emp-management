package com.jwat.week8_tranminhnguyen.connection.services;

import com.jwat.week8_tranminhnguyen.dataHandler.DataStorage;
import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetService {
    private final Connection con;
    private final Statement st;

    public GetService(Connection con, Statement st) {
        this.con = con;
        this.st = st;
    }

    public void getEmployee() {
        try {
            String GET_EMP = "SELECT * FROM employee";

            ResultSet result = st.executeQuery(GET_EMP);
            ResultSetMetaData rsmd = result.getMetaData();

            List<String> data = new ArrayList<>();
            List<Employee> allEmpList = new ArrayList<>();
            while (result.next()) {
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    data.add(result.getString(i + 1));
                    if (i == 9) {
                        allEmpList.add(
                                new Employee(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7), data.get(8), data.get(9))
                        );
                        data.clear();
                    }
                }
            }

            for(Employee e : allEmpList) {
                DataStorage.addData(e);
                DataStorage.addDataByDept(e);
            }

            st.close();
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
