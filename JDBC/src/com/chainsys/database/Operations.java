package com.chainsys.database;

import java.sql.*;
class Operations
{
     public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
     public static final String DBUSER = "system";
     public static final String DBPASS = "jeru0719";
     public static void main(String args[])
     {
          try
          {
               //Loading the driver
               Class.forName("oracle.jdbc.driver.OracleDriver");
               //Cretae the connection object
               Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
               //Insert the record
               String sql = "INSERT INTO FileTable (id,name) VALUES (?,?)";
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setInt(1, 100);
               statement.setString(2, "Prashant");
              

               int rowsInserted = statement.executeUpdate();
               if (rowsInserted > 0)
               {
                    System.out.println("A new employee was inserted successfully!\n");
               }
               // Display the record
               String sql1 = "SELECT * FROM FileTable";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql1);

               while (result.next())
               {
                    System.out.println (result.getInt(1)+" "+
                    result.getString(2)+" ");
               }

               //Update the record
               String sql2 = "Update FileTable set id = ? where name = ?";
               PreparedStatement pstmt = con.prepareStatement(sql2);
               pstmt.setString(1, "ram");
               pstmt.setString(2, "hy");
               int rowUpdate = pstmt.executeUpdate();
               if (rowUpdate > 0)
               {
                    System.out.println("\nRecord updated successfully!!\n");
               }

               //Delete the record
               String sql3 = "DELETE FROM FileTable WHERE empname=?";
               PreparedStatement statement1 = con.prepareStatement(sql3);
               statement1.setString(1,"jeru");

               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    System.out.println("A Employee was deleted successfully!\n");
               }
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
