package com.sda.employees.model;

public class DepartmentSalary {

    private String deptName;
    private Double totalSalary;

    public DepartmentSalary(String deptName, Double salary) {
        this.deptName = deptName;
        this.totalSalary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDetpName(String detpName) {
        this.deptName = detpName;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

}
