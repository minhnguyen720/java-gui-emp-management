package com.jwat.week8_tranminhnguyen.DataHandler;

import java.util.List;
import java.util.regex.Pattern;

public class DataValidator {

    private List<List<String>> dataFromTable = DataStorage.getData();
    private int directorCounter = 0;
    private int managerCounter = 0;

    // Pattern
//    private final String PHONE_NUMBER_PATTERN = "\\d{10}";
    private static Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z]+");
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{2}-\\d{2}-\\d{4}$");
    private static Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    public DataValidator() {
    }

    public boolean validateRole(String role, String dept) {
        if (validateDirector(role) && validateManager(role, dept)) {
            return true;
        }
        return false;
    }

    public boolean validateDataFormat(List<String> data) {
        final String name = data.get(0);
        final String dob = data.get(2);
        final String salary = data.get(5);

        if (!NAME_PATTERN.matcher(name).matches()) {
            return false;
        }

        if (!DATE_PATTERN.matcher(dob).matches()) {
            return false;
        }

        if (!NUMBER_PATTERN.matcher(salary).matches()) {
            return false;
        }

        return true;
    }

    private List<List<String>> getTargetDeptList(String dept) {
        if (dept.equalsIgnoreCase("IT")) {
            return DataStorage.getItData();
        } else if (dept.equalsIgnoreCase("Account")) {
            return DataStorage.getAccountData();
        } else if (dept.equalsIgnoreCase("HR")) {
            return DataStorage.getHrData();
        } else {
            return DataStorage.getSalesData();
        }
    }

    private boolean validateManager(String role, String dept) {
        List<List<String>> targetDeptList = getTargetDeptList(dept);
        if (role.equalsIgnoreCase("Manager")) {
            for (List<String> emp : targetDeptList) {
                String roleFromList = emp.get(3);
                if (roleFromList.equalsIgnoreCase("Manager")) {
                    managerCounter++;
                }
            }
            if (managerCounter >= 1) { // The department already has a manager
                return false;
            }
        }

        return true;
    }

    private boolean validateDirector(String role) {
        if (role.equalsIgnoreCase("director")) {
            for (List<String> list : dataFromTable) {
                String roleFromList = list.get(3);

                if (roleFromList.equalsIgnoreCase("director")) {
                    directorCounter++;
                }
            }
            if (directorCounter >= 1) { // There is already have a director
                return false;
            }
        }
        return true;
    }
}
