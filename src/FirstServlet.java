import java.io.*;
import javax.servlet.*;

//public class FirstServlet implements Servlet{
public class FirstServlet extends GenericServlet{
	public void service(ServletRequest request, ServletResponse response)  throws ServletException, java.io.IOException{
		response.getWriter().write("Hello Servlet!");
	}
}

