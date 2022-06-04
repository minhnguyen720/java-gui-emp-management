package com.jwat.week8_tranminhnguyen.DataHandler;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private static List<List<String>> dataFromTable = new ArrayList<>();
    private static List<List<String>> itDeptList = new ArrayList<>();
    private static List<List<String>> accountDeptList = new ArrayList<>();
    private static List<List<String>> hrDeptList = new ArrayList<>();
    private static List<List<String>> salesDeptList = new ArrayList<>();

    //-------------- Get data methods ---------------
    public static List<List<String>> getData() {
        return dataFromTable;
    }

    //------------ Add data methods -----------------
    public static void addData(List<String> data) {
        dataFromTable.add(data);
    }

    public static void addDataByRole(List<List<String>> data) {  
        for (List<String> e : data) {
            if (e.get(3).equalsIgnoreCase("it")) {
                itDeptList.add(e);
            }
            if (e.get(3).equalsIgnoreCase("account")) {
                accountDeptList.add(e);
            }
            if (e.get(3).equalsIgnoreCase("sales")) {
                salesDeptList.add(e);
            }
            if (e.get(3).equalsIgnoreCase("hr")) {
                hrDeptList.add(e);
            }
        }
    }

// ----------------------------------------------
    public static void initDummyData() {
        List<String> dummy = new ArrayList<>();
        dummy.add("s1");
        dummy.add("Male");
        dummy.add("07/02/2000");
        dummy.add("Staff");
        dummy.add("IT");
        dummy.add("12000");
        dataFromTable.add(dummy);

        List<String> dummy1 = new ArrayList<>();
        dummy1.add("d");
        dummy1.add("Male");
        dummy1.add("07/02/2000");
        dummy1.add("Director");
        dummy1.add("IT");
        dummy1.add("12000");
        dataFromTable.add(dummy1);

        List<String> dummy2 = new ArrayList<>();
        dummy2.add("m");
        dummy2.add("Male");
        dummy2.add("07/02/2000");
        dummy2.add("Manager");
        dummy2.add("IT");
        dummy2.add("12000");
        dataFromTable.add(dummy2);

        List<String> dummy3 = new ArrayList<>();
        dummy3.add("s2");
        dummy3.add("Male");
        dummy3.add("07/02/2000");
        dummy3.add("Staff");
        dummy3.add("IT");
        dummy3.add("12000");
        dataFromTable.add(dummy3);
    }

    public static void updateByIndex(List<String> data, int index) {
        System.out.println(index);
        dataFromTable.set(index, data);
    }

    public static void remove(int index) {
        dataFromTable.remove(index);
    }

    public static int getVolume() {
        return dataFromTable.size();
    }

    public static List<List<String>> searchByName(String nameToSearch) {
        List<List<String>> matchedData = new ArrayList<>();
        for (List<String> list : dataFromTable) {
            if (list.get(0).equalsIgnoreCase(nameToSearch)) {
                matchedData.add(list);
            }
        }

        return matchedData;
    }

}
