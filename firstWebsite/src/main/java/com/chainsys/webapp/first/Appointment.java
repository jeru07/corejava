package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Appointmentsdao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Employee;

/**
 * Servlet implementation class Appointment
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		List<Appointments> applist =Appointmentsdao.getAllAppointment();
		Iterator<Appointments> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			
			out.println("app id:"+app.getAPPOINTMENT_ID()+" "+"DOC ID"+" "+app.getDOCTOR_ID());
			out.println("</p>");
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("click").equals("Add_app")) {
			String source="AddNewDoctor";
		    String message="<h1>Error while "+source+"</h1>";
			PrintWriter out = response.getWriter();
			int result = 0;
			
			Appointments app = new Appointments();	
			System.out.println("Enter the Appointment id:");
			String app_id =request.getParameter("id");
				  try 
				   {
			            Validator.checkNumberForParseInt(app_id);
			        }catch(InvalidInputDataException err) 
				   {
			        	message +=" Error in APPOINTMENT Id : </p>";
						String errorPage=ExceptionManager.handleException(err, source, message);
						out.print(errorPage);
						return;
				   }
				  int Appo_id=Integer.parseInt(app_id);
				   try 
				   {
			            Validator.CheckNumberForGreaterThanZero(Appo_id);
			        }catch(InvalidInputDataException err) 
				   {
			        	message +=" Error in APPOINTMENT Id : </p>";
						String errorPage=ExceptionManager.handleException(err, source, message);
						out.print(errorPage);
						return;
			        }
				   app.setAPPOINTMENT_ID(Appo_id);
				   
				   SimpleDateFormat dob_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
					String app_dob = request.getParameter("dob");
					try {
						Validator.checkDateFormat(app_dob);
					} catch (InvalidInputDataException err) {
						message +=" Error in Employee Hire date : </p>";
						String errorPage=ExceptionManager.handleException(err, source, message);
						out.print(errorPage);
						return;
					}
					Date newDate = null;
					try {
						newDate =dob_dateFormate.parse(app_dob);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					app.setAPPOINTMENT_DATE(newDate);
			
			System.out.println("Enter Doctor id:");
			String doc_id = request.getParameter("docid");
			   try 
			   {
		            Validator.checkNumberForParseInt(doc_id);
		        }catch(InvalidInputDataException err) 
			   {
		        	message +=" Error in Doctor Id : </p>";
					String errorPage=ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
		        }
			   int Doc_id=Integer.parseInt(doc_id);
			   try 
			   {
		            Validator.CheckNumberForGreaterThanZero(Doc_id);
		        }catch(InvalidInputDataException err) 
			   {
		        	message +=" Error in Doctor Id : </p>";
					String errorPage=ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
		        }
			   app.setDOCTOR_ID(Doc_id);
			
			System.out.println("Enter patient Name:");
			String patient =request.getParameter("name");
			   try 
			   {
		            Validator.checkStringOnly(patient);
		        }catch(InvalidInputDataException err) 
			   {
		        	message +=" Error in Patient name : </p>";
					String errorPage=ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
		        }
			   app.setPATIENT_NAME(patient);
			System.out.println("Enter fees collected:");
			String fees_collected = request.getParameter("fees");
			   try 
			   {
		            Validator.checkNumberForParseInt(fees_collected);
		        }catch(InvalidInputDataException err) 
			   {
		        	message +=" Error in fees : </p>";
					String errorPage=ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
		        }
			   int fees=Integer.parseInt(fees_collected);
			app.setFEES_COLLECTED(fees);
			
			 result = Appointmentsdao.insertAppointment(app);
			out.println(result + "row inserted");
		}
		else if(request.getParameter("click").equals("update_app")) {
			doPut(request, response);
			}else if(request.getParameter("click").equals("delete_app")) {
				doDelete(request, response);
		}
	}



protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	    
		PrintWriter out = response.getWriter();
		int result = 0;
		Appointments app = new Appointments();	
		System.out.println("Enter the Appointment id:");
		String app_id =request.getParameter("id");
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
		
		SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");

		try {
			Validator.checkStringOnly(app_date);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		 newDate = null;
		try {
			newDate = hire_dateFormate.parse(app_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_DATE(newDate);
		
		System.out.println("Enter Doctor id:");
		String doc_id = request.getParameter("docid");
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
		String patient =request.getParameter("name");
		   try 
		   {
	            Validator.checkStringOnly(patient);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   app.setPATIENT_NAME(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = request.getParameter("fees");
		   try 
		   {
	            Validator.checkNumberForParseInt(fees_collected);
	        }catch(InvalidInputDataException err) 
		   {
	            err.printStackTrace();
	        }
		   int fees=Integer.parseInt(fees_collected);
		app.setFEES_COLLECTED(fees);
		
		 result = Appointmentsdao.updateAppointment(app);
		out.println(result  + "row updated");
	}



protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	int result = 0;
	Appointments app=new Appointments();
	System.out.println("Enter Appointment id:");
	String app_id=request.getParameter("id");
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
	
	result = Appointmentsdao.deleteAppointment(appId);
	out.println(result+"row deleted");

}
}




