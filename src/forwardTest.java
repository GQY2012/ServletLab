import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


//public class FirstServlet implements Servlet{
public class forwardTest extends HttpServlet{
	
		
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/servlet/demo1");
		dispatcher.forward(request, response);
	}

}
