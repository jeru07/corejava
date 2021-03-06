package com.chainsys.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileOperations {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		read();
		
	}
	 
	
	private static void createNewFile()
	{
		File file = new File(("d:\\temo\\new demo.txt"));

	    try {
	    	
	      boolean value = file.createNewFile();
	      if (value)
	      {
	        System.out.println("New Java File is created.");
	      }
	      else
	      {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e)
	    {
	      e.getStackTrace();
	    }
	}
	
	private static void rename()
	{
		 File file = new File("d:/temo/new demo.txt");
       
	        File renameFile = new File("d:/temo/new hy.txt");
	         
	        if(file.renameTo(renameFile))
	        {
	            System.out.println("File was successfully renamed");
	        } 
	        else
	        {
	            System.out.println("Error: Unable to rename file");
	        }    
	}
	
	private static void append() 
	{
		String textToAppend = "Happy Learning !!";
		String fileName = "d:/temo/new class.txt";

		try
		(FileWriter fileWriter = new FileWriter(fileName, true);
		PrintWriter printWriter = new PrintWriter(fileWriter);)
		{
		  printWriter.println(textToAppend);
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
	 
	private static void modify() throws IOException
	{
		 FileOutputStream file = new FileOutputStream("d:/temo/new class.txt");
        
         String modify = "java training.";
         byte[] b = modify.getBytes();
         file.write(b);
         file.close();
         System.out.println("Modification Complete");
         
         FileInputStream file1 = new FileInputStream("d:/temo/new class.txt");
         int i;
         while((i=file1.read())!=-1)
         {
         System.out.print((char)i);
         }
         file1.close(); 
	}
	private static void read() throws IOException 
	{
		  FileReader file=new FileReader("d:/temo/hel.txt");    
          int i;    
          while((i=file.read())!=-1)    
          System.out.print((char)i);    
          file.close();  
	}
	
	private static void delete() throws IOException
	{
		  File file = new File("d:/temo/city.txt");
		    boolean value = file.delete();
		    if(value) 
		    {
		      System.out.println("file is successfully deleted.");
		    }
		    else {
		      System.out.println("File doesn't exit");
		    }
		  }
	
	private static void copy() throws IOException {
	    
		try 
        {
            InputStream input=new FileInputStream("d:/temo/hello.txt");
            OutputStream output=new FileOutputStream("d:/temo/new demo.txt ");
            int content=input.read();
            while(content != -1)
            {
                output.write(content);
                content=input.read();
            }
            output.flush();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
	
		public static void moveFile()
		{

	        Path sourceFilePath = Paths.get("d:/temo/hello.txt");
	        Path targetFilePath = Paths.get("d:/temo/hel.txt");

	        try {
	            Files.move(sourceFilePath, targetFilePath);
	        } catch (FileAlreadyExistsException ex) 
	        {
	            System.out.println("Target file already exists");
	        } 
	        catch (IOException err) {
	        	
	            System.out.format("I/O error:", err);
	        }
	    }
		}
	

	

	

