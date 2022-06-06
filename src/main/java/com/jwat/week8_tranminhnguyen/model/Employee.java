package com.jwat.week8_tranminhnguyen.model;

import java.util.UUID;

public class Employee {

    private String name;
    private String gender;
    private String mobile;
    private String email;
    private String dob;
    private String role;
    private String dept;
    private String type;
    private final UUID id;
    private String salary;

    public Employee(
            String name,
            String gender,
            String dob,
            String mobile,
            String email,
            String role,
            String dept,
            String salary,
            String type) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.dob = dob;
        this.type = type;
        this.id = UUID.randomUUID();
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(
            String id,
            String name,
            String gender,
            String dob,
            String mobile,
            String email,
            String role,
            String dept,
            String salary,
            String type) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.dob = dob;
        this.type = type;
        this.id = UUID.fromString(id);
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
