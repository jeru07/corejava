package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class File {
    public static void main(String[] args) 
         {
        try 
        {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jeru0719");

        Statement stmt = con.createStatement();
        
        
       // int result=stmt.executeUpdate("insert into FileTable values(7,'jeru')");
        //int result=stmt.executeUpdate("update FileTable set NAME='Vimal' where ID=6788");
        int result=stmt.executeUpdate("delete from FileTable where ID=1234");  
       
        System.out.println(result+"records affected");  
      
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}