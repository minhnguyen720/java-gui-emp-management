package com.jwat.week8_tranminhnguyen.dataHandler;

import com.jwat.week8_tranminhnguyen.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private static final List<Employee> DATA_FROM_TABLE = new ArrayList<>();
    private static final List<Employee> IT_DEPT_LIST = new ArrayList<>();
    private static final List<Employee> ACCOUNT_DEPT_LIST = new ArrayList<>();
    private static final List<Employee> HR_DEPT_LIST = new ArrayList<>();
    private static final List<Employee> SALES_DEPT_LIST = new ArrayList<>();

    //-------------- Get data methods ---------------
    public static List<Employee> getData() {
        return DATA_FROM_TABLE;
    }

    public static List<Employee> getItData() {
        return IT_DEPT_LIST;
    }

    public static List<Employee> getHrData() {
        return HR_DEPT_LIST;
    }

    public static List<Employee> getAccountData() {
        return ACCOUNT_DEPT_LIST;
    }

    public static List<Employee> getSalesData() {
        return SALES_DEPT_LIST;
    }

    //------------ Add data methods -----------------
    public static void addData(Employee data) {
        DATA_FROM_TABLE.add(data);
    }

    public static void addDataByDept(Employee e) {
        if (e.getDept().equalsIgnoreCase("it")) {
            IT_DEPT_LIST.add(e);
        }
        if (e.getDept().equalsIgnoreCase("account")) {
            ACCOUNT_DEPT_LIST.add(e);
        }
        if (e.getDept().equalsIgnoreCase("sales")) {
            SALES_DEPT_LIST.add(e);
        }
        if (e.getDept().equalsIgnoreCase("hr")) {
            HR_DEPT_LIST.add(e);
        }
    }

// ----------------------------------------------
    public static void clearData() {
        DATA_FROM_TABLE.clear();
        IT_DEPT_LIST.clear();
        HR_DEPT_LIST.clear();
        ACCOUNT_DEPT_LIST.clear();
        SALES_DEPT_LIST.clear();
    }

    public static int getVolume() {
        return DATA_FROM_TABLE.size();
    }

    public static List<Employee> searchByName(String nameToSearch) {
        List<Employee> matchedData = new ArrayList<>();
        for (Employee emp : DATA_FROM_TABLE) {
            if (emp.getName().equalsIgnoreCase(nameToSearch)) {
                matchedData.add(emp);
            }
        }

        return matchedData;
    }

}
