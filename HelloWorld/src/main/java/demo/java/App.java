import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class App extends HttpServlet{ 
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)
  throws ServletException,IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  pw.println("<html>");
  pw.println("<head><title>Hello World</title></title>");
  pw.println("<body>");
  pw.println("<h1>Good Morning !!</h1>");
  pw.println("</body></html>");
  }
}