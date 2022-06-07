package com.jwat.week8_tranminhnguyen.dataHandler;

import com.jwat.week8_tranminhnguyen.model.Employee;
import java.util.List;
import java.util.regex.Pattern;

public class DataValidator {
    private final List<Employee> DATA_FROM_TABLE = DataStorage.getData();

    private int directorCounter = 0;
    private int managerCounter = 0;

    // Pattern
    private final Pattern MOBILE_PATTERN = Pattern.compile("\\d{10}");
    private final Pattern EMAIL_PATTERN
            = Pattern.compile("^(.+)@(\\S+)$");
    private final Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z]+");
    private final Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{2}-\\d{2}-\\d{4}$");
    private final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    public boolean validateRole(Employee e) {
        return validateDirector(
                e.getRole(),
                e.getId().toString())
                && validateManager(
                e.getRole(),
                e.getDept(),
                e.getId().toString());
    }

    public boolean validateDataFormat(Employee emp) {
        final String name = emp.getName();
        final String dob = emp.getDob();
        final String salary = emp.getSalary();
        final String email = emp.getEmail();
        final String mobile = emp.getMobile();

        return (NAME_PATTERN.matcher(name).matches()
                && EMAIL_PATTERN.matcher(email).matches()
                && DATE_PATTERN.matcher(dob).matches()
                && NUMBER_PATTERN.matcher(salary).matches()
                && MOBILE_PATTERN.matcher(mobile).matches());
    }

    private List<Employee> getTargetDeptList(String dept) {
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

    private boolean validateManager(String role, String dept, String id) {
        List<Employee> targetDeptList = getTargetDeptList(dept);

        if (role.equalsIgnoreCase("Manager")) {
            for (Employee emp : targetDeptList) {
                if (emp.getRole().equalsIgnoreCase("Manager") && !(emp.getId().toString().equals(id))) {
                    managerCounter++;
                }
            }
            // The department already has a manager
            return managerCounter < 1;
        }

        return true;
    }

    private boolean validateDirector(String role, String id) {
        if (role.equalsIgnoreCase("director")) {
            for (Employee emp : DATA_FROM_TABLE) {
                if (emp.getRole().equalsIgnoreCase("director")
                        && !(emp.getId().toString().equals(id))) {
                    directorCounter++;
                }
            }
            // There is already have a director
            return directorCounter < 1;
        }

        return true;
    }
}
