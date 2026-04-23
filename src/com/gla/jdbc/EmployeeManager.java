package com.gla.jdbc;

import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)");
        st.executeUpdate("INSERT INTO employee VALUES(1,'Ram',40000)");

        ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary > 30000");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }

        st.executeUpdate("UPDATE employee SET salary = salary * 1.10 WHERE id = 1");
        st.executeUpdate("DELETE FROM employee WHERE salary < 15000");

        con.close();
    }
}
