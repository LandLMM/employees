package com.sda.employees.examples;

import java.sql.*;

public class ManagerHistory {
    static final String url = "jdbc:mysql://localhost/employees";
    static final String user = "root";
    static final String password = "";

    private static final String querry = "SELECT first_name, last_name, from_date, to_date " +
            "FROM dept_manager JOIN employees ON dept_manager.emp_no = employees.emp_no " +
            "JOIN departments ON departments.dept_no = dept_manager.dept_no WHERE dept_name = ?";

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            try (PreparedStatement stmt = conn.prepareStatement(querry)) {
                stmt.setString(1, "Marketing");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("first_name") + " "
                            + rs.getString("last_name") + " "
                            + rs.getDate("from_date") + " "
                            + rs.getDate("to_date"));
                }
                rs.close();
            }
        }
    }
}