package com.gla.jdbc;

import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS customers(id INT, name VARCHAR(50), phone VARCHAR(15)");
        st.executeUpdate("INSERT INTO customers VALUES(1,'Aman','99999')");

        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE name LIKE '%Am%'");
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }

        st.executeUpdate("UPDATE customers SET phone='88888' WHERE id=1");
        st.executeUpdate("DELETE FROM customers WHERE id=1");

        con.close();
    }
}
