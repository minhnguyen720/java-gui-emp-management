package com.jwat.week8_tranminhnguyen.connection.services;

import com.jwat.week8_tranminhnguyen.model.Employee;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateService {
    private final Statement st;

    public UpdateService(Statement st) {
        this.st = st;
    }

    public void updateEmployee(Employee e) {
        String updatePhrase = "UPDATE `employee`.`employee` SET ";
        String conditionPhrase = " WHERE (`id` = '" + e.getId().toString() + "');";

        String updateName = "`name` = " + "'" + e.getName() + "',";
        String updateGender = "`gender` = " + "'" + e.getGender() + "',";
        String updateDob = "`dob` = " + "'" + e.getDob() + "',";
        String updateMobile = "`mobile` = " + "'" + e.getMobile() + "',";
        String updateEmail = "`email` = " + "'" + e.getEmail() + "',";
        String updateRole = "`role` = " + "'" + e.getRole() + "',";
        String updateDept = "`dept` = " + "'" + e.getDept() + "',";
        String updateSalary = "`salary` = " + "'" + e.getSalary() + "',";
        String updateType = "`type` = " + "'" + e.getType() + "'";

        String query = updatePhrase + updateName + updateGender + updateDob + updateMobile + updateEmail + updateRole + updateDept + updateSalary + updateType + conditionPhrase;

        try {
            st.executeUpdate(query);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

    }
}
