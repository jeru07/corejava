package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete
{
	
	  public static void main(String[] args) 
		        
	  {
		        try 
		        {
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jeru0719");
		      String sql = "update FileTable set name='hy' where ID = 45";
		      
			PreparedStatement statement = con.prepareStatement(sql);
		     // statement.setString(9, "jeru");
		       
		      int rowsDeleted = statement.executeUpdate();
		      if (rowsDeleted > 0)
		      {
		          System.out.println("A user was deleted successfully!");
		      }
		        }

		        catch(Exception e) 
		        {
		            System.out.println(e.toString());
		        }
		        }
		        }
	  
