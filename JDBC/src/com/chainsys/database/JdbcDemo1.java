package com.chainsys.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo1 {
    public static void main(String[] args) 
         throws SQLException {
        try 
        {
        	
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jeru0719");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

        while (rs.next())
        {
            String x = rs.getString("first_name");
            String s = rs.getString("last_name");
//            float f = rs.getFloat("c");
            System.out.println(x+" "+s);
        }
       
        }
        catch(Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}