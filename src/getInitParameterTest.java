import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;


//public class FirstServlet implements Servlet{
public class getInitParameterTest extends GenericServlet{
	
	
	public void service(ServletRequest request, ServletResponse response)  
			throws ServletException, java.io.IOException{
		response.getWriter().write("Hello Servlet!");
		
		ServletConfig config = getServletConfig();
		ServletContext context = config.getServletContext();
		
		Enumeration<String> enumeration = context.getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			String value = context.getInitParameter(name);
			//System.out.println(name + ":" + value);
			response.getWriter().write(name + ":" + value);
		}
		
		Enumeration<String> configEnumeration = this.getInitParameterNames();
		while(configEnumeration.hasMoreElements()) {
			String name = configEnumeration.nextElement();
			String value = this.getInitParameter(name);
			//System.out.println(name + ":" + value);
			response.getWriter().write(name + ":" + value);
		}
	}
}
