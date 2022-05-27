package com.secondwebapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Home
 */
@WebServlet(name="Home",urlPatterns ={"/home","/veedu"}, description="servlet for home page",
initParams= {@WebInitParam(name=" phone",value="325974408")
,@WebInitParam(name="mail",value="xyz@gmail.com")})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Home()
    {
      super(); 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration<String> initParamNames= getInitParameterNames();
		while(initParamNames.hasMoreElements())
		{
			String name= initParamNames.nextElement();
			out.println(name+":"+getInitParameter(name)+"</p>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
