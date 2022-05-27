package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GlobalState
 */
public class GlobalState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalState() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 PrintWriter out = response.getWriter();
	        response.setContentType("text/html");
	        out.println("<html><head><title>Attributes</title></head><body>");
	        Enumeration<String> names=request.getParameterNames();
	        while(names.hasMoreElements())
	        {
	        	String ParameterName =names.nextElement();
	        	System.out.println(ParameterName);
	        	request.getParameterValues(ParameterName);
	        	String [] values=request.getParameterValues(ParameterName);
	        	int length=values.length;
	        	for (int i=0;i<length;i++)
	        	{
	        		System.out.println("values;"+values[i]);
	        	}
	        }
	        
	        
	        
	        String submitValue = request.getParameter("submit");
	        ServletContext ctx=this.getServletContext();
	        if (submitValue.equals("set")) {
	            String salaryInput = request.getParameter("salary");
	            ctx.setAttribute("ctxsalary",salaryInput);// storing data in servlet for all each user
	            //ctx.setAttribute() stores the data in the collection using the key and value.
	            //salary =key,salaryInput = value
	            out.println("<h1>Value Set</h1>" + salaryInput);
	        } 
	        else if (submitValue.equals("fetch")) 
	        {
	            String contextSalary = (String)ctx.getAttribute("ctxsalary");//stateful
	            out.println("<h1>Value fetched</h1>" + contextSalary);//returning value from context to HTML
	           if(contextSalary==null)
	            {
	            	out.println("<h1>SESSION NOT YET SET</h1>");
	            }
	        //    String sessionSalary = (String)session.getAttribute("salary")
	            else
	            {
	            out.println("<h1>Value fetched</h1>" + contextSalary);//returning value from global variable to HTML
	        }
	        }
	        out.println("<input type='hidden' value='5000' name='bonus' id='bonus' >");
	        out.println("</body></html>");
	   
      //data stored in servlet context is multiuser
	 //read or modified from all other servlets
	}
	    }
