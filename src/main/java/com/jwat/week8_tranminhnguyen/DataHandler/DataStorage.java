package com.jwat.week8_tranminhnguyen.DataHandler;

import com.jwat.week8_tranminhnguyen.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private static List<Employee> dataFromTable = new ArrayList<>();
    private static List<Employee> itDeptList = new ArrayList<>();
    private static List<Employee> accountDeptList = new ArrayList<>();
    private static List<Employee> hrDeptList = new ArrayList<>();
    private static List<Employee> salesDeptList = new ArrayList<>();

    //-------------- Get data methods ---------------
    public static List<Employee> getData() {
        return dataFromTable;
    }

    public static List<Employee> getItData() {
        return itDeptList;
    }

    public static List<Employee> getHrData() {
        return hrDeptList;
    }

    public static List<Employee> getAccountData() {
        return accountDeptList;
    }

    public static List<Employee> getSalesData() {
        return salesDeptList;
    }

    //------------ Add data methods -----------------
    public static void addData(Employee data) {
        dataFromTable.add(data);
    }

    public static void addDataByDept(Employee e) {
        if (e.getRole().equalsIgnoreCase("it")) {
            itDeptList.add(e);
        }
        if (e.getRole().equalsIgnoreCase("account")) {
            accountDeptList.add(e);
        }
        if (e.getRole().equalsIgnoreCase("sales")) {
            salesDeptList.add(e);
        }
        if (e.getRole().equalsIgnoreCase("hr")) {
            hrDeptList.add(e);
        }
    }

// ----------------------------------------------
    public static void updateByIndex(Employee emp, int index) {
        List<String> row = new ArrayList<>();

        row.add(emp.getName());
        row.add(emp.getGender());
        row.add(emp.getDob());
        row.add(emp.getMobile());
        row.add(emp.getEmail());
        row.add(emp.getRole());
        row.add(emp.getDept());
        row.add(emp.getSalary());
        row.add(emp.getType());

        dataFromTable.set(index, emp);
    }

    public static void remove(int index) {
        dataFromTable.remove(index);
    }

    public static int getVolume() {
        return dataFromTable.size();
    }

    public static List<Employee> searchByName(String nameToSearch) {
        List<Employee> matchedData = new ArrayList<>();
        for (Employee emp : dataFromTable) {
            if (emp.getName().equalsIgnoreCase(nameToSearch)) {
                matchedData.add(emp);
            }
        }

        return matchedData;
    }

}
