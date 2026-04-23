package com.gla.jdbc;
import java.sql.*;
public class BankingManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");
        st.executeUpdate("INSERT INTO accounts VALUES(1,'Raj',15000)");

        ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE balance > 10000");
        while(rs.next()) System.out.println(rs.getString("name"));

        st.executeUpdate("UPDATE accounts SET balance = balance + 5000 WHERE accNo=1");
        st.executeUpdate("DELETE FROM accounts WHERE accNo=1");

        con.close();
    }
}
