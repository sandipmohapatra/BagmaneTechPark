import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class admin extends HttpServlet
 {
PreparedStatement st=null;
Connection con=null;
ResultSet rs=null;
int i=0;
public void init()
{
System.out.println("init");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");

}
catch(Exception ae)
{}
}

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
       
	String a=req.getParameter("t1");
	String b=req.getParameter("t2");
	
	 if(a.equals("admin")&& b.equals("admin"))


	res.sendRedirect("adminreport.html");
else
	res.sendRedirect("admin.html");

	

 
             

            out.println("</body>");
            out.println("</html>");
              } 

 
}