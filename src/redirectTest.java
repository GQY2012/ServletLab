import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


//public class FirstServlet implements Servlet{
public class redirectTest extends HttpServlet{
	
		
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().println("redirect");
		response.sendRedirect("demo1");
	}
	

}