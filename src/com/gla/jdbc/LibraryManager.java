package com.gla.jdbc;

import java.sql.*;

public class LibraryManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");
        st.executeUpdate("INSERT INTO books VALUES(1,'Java','James','Available')");

        ResultSet rs = st.executeQuery("SELECT * FROM books WHERE status='Available'");
        while(rs.next()){
            System.out.println(rs.getString("title"));
        }

        st.executeUpdate("UPDATE books SET status='Issued' WHERE id=1");
        st.executeUpdate("DELETE FROM books WHERE id=1");

        con.close();
    }
}
