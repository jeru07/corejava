package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Appointmentsdao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointments;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class AppointmentsUi
{

	public static void addNewAppointments() 
	{

		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
			  try 
			   {
		            Validator.checkNumberForParseInt(app_id);
		        }catch(InvalidInputDataException err) 
			   {
		            err.printStackTrace();
			   }
			  int Appo_id=Integer.parseInt(app_id);
			   try 
			   {
		            Validator.CheckNumberForGreaterThanZero(Appo_id);
		        }catch(InvalidInputDataException err) 
			   {
		            err.printStackTrace();
		        }
			   app.setAPPOINTMENT_ID(Appo_id);
			   
			   
			   
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		app.setAPPOINTMENT_DATE(newDate);
		
		
		System.out.println("Enter Doctor id:");
		String doc_id = sc.nextLine();
		   try 
		   {
	            Validator.checkNumberForParseInt(doc_id);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   int Doc_id=Integer.parseInt(doc_id);
		   try 
		   {
	            Validator.CheckNumberForGreaterThanZero(Doc_id);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   app.setDOCTOR_ID(Doc_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		   try 
		   {
	            Validator.checkStringOnly(patient);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   app.setPATIENT_NAME(patient);
		System.out.println("Enter fees collected:");
		float fees_collected = sc.nextFloat();
		   try 
		   {
	            Validator.checkStringForGreaterThanZero1(fees_collected);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		app.setFEES_COLLECTED(fees_collected);
		int result = Appointmentsdao.insertAppointment(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	
	public static void viewAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		Appointments doc = Appointmentsdao.getAppointmentById(app_id);
		System.out.println("Appointment id:" + doc.getAPPOINTMENT_ID());
		System.out.println("Appointment date:" + doc.getAPPOINTMENT_DATE());
		System.out.println("Doctor id:" + doc.getDOCTOR_ID());
		System.out.println("fees collected:" + doc.getFEES_COLLECTED());
		sc.close();
	}
	public static void allAppointmentDetails() {
		List<Appointments> applist =Appointmentsdao.getAllAppointment();
		Iterator<Appointments> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			System.out.println("app id:"+app.getAPPOINTMENT_ID()+" "+"DOC ID"+" "+app.getDOCTOR_ID());
		}
	}
	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		   try 
		   {
	            Validator.checkNumberForParseInt(app_id);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		app.setAPPOINTMENT_DATE(newDate);
		System.out.println("Enter Doctor id:");
		String doc_id = sc.nextLine();
		   try 
		   {
	            Validator.checkNumberForParseInt(doc_id);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   int docId = Integer.parseInt(doc_id);
			app.setDOCTOR_ID(docId);
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		   try 
		   {
	            Validator.checkStringOnly(patient);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		app.setPATIENT_NAME(patient);
		System.out.println("Enter fees collected:");
		float fees_collected = sc.nextFloat();
		   try 
		   {
	            Validator.checkStringForGreaterThanZero1(fees_collected);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		app.setFEES_COLLECTED(fees_collected);
		int result = Appointmentsdao.updateAppointment(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	
	
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		Appointments app=new Appointments();
		System.out.println("Enter Appointment id:");
		String app_id=sc.next();
		try {
			Validator.checkNumberForParseInt(app_id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		app.setAPPOINTMENT_ID(appId);
		
		int result = Appointmentsdao.deleteAppointment(appId);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updatePatientName() {
		Scanner sc=new Scanner(System.in);
		Appointments app=new Appointments();
		System.out.println("Enter patient Name:");
		String patient=sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
			
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		app.setPATIENT_NAME(patient);
		
		System.out.println("Enter Appointment id:");
		String app_id=sc.next();
		try {
			Validator.checkNumberForParseInt(app_id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		app.setAPPOINTMENT_ID(appId);
		
		int result=Appointmentsdao.updateAppointmentName(appId,patient);
		System.out.println(result+" row updated");
		sc.close();
		
	}
	public static void updateCollectedfees() {
		Scanner sc=new Scanner(System.in);
		Appointments app=new Appointments();
		System.out.println("Enter collected fees:");
		float colleted_fees=sc.nextFloat();
		try {
			Validator.checkStringForGreaterThanZero1(colleted_fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		app.setFEES_COLLECTED(colleted_fees);
		System.out.println("Enter Appointment id:");
		String app_id=sc.next();
		try {
			Validator.checkNumberForParseInt(app_id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		app.setAPPOINTMENT_ID(appId);
		
		int result=Appointmentsdao.updateAppointmentFees(appId, colleted_fees);
		System.out.println(result+" row updated");
		sc.close();
	}
}