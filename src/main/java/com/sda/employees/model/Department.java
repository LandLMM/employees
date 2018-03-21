package com.sda.employees.model;

import java.util.HashSet;
import java.util.Set;

public class Department {

    private Integer deptId;
    private String deptName;
    private Set<Employee> employees = new HashSet<>();

    public Department(Integer deptId, String deptName, Set<Employee> employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = employees;
    }


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
