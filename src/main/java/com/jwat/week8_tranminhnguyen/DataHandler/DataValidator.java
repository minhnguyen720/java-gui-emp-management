package com.jwat.week8_tranminhnguyen.DataHandler;

import java.util.List;
import java.util.regex.Pattern;

public class DataValidator {

    private List<List<String>> dataFromTable = DataStorage.getData();
    private int directorCounter = 0;

    public DataValidator() {
    }
    ;

    // Pattern
//    private final String PHONE_NUMBER_PATTERN = "\\d{10}";
    private static Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z]+");
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{2}-\\d{2}-\\d{4}$");
    private static Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    public boolean validateRole(String role) {
        if (role.equalsIgnoreCase("director")) {
            for (List<String> list : dataFromTable) {
                String roleFromList = list.get(3);
                
                if (roleFromList.equalsIgnoreCase("director")) {
                    directorCounter++;
                }
            }
            if (directorCounter > 1) { // There is already exist director
                return false;
            }
        }
        
        if(role.equalsIgnoreCase("manager")) {
            
        }

        return true;
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
}
