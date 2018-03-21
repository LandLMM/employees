package com.sda.employees.dao;

import java.sql.Connection;

public class DepartmentSqlDao implements DepartmentDao{

    static final String url = "jdbc:mysql://localhost/employees";
    static final String user = "root";
    static final String password = "";

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DepartmentSqlDao{}";
    }
}
