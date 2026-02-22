import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class register1 extends HttpServlet
 {
Statement st=null;
Connection con=null;
ResultSet rs;
public void init()
{
System.out.println("init");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");

}
catch(Exception ae)
{
}
}

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
            out.println("<head>");
            out.println("<h1><center>REGISTRATION REPORT</h1><hr>");  
            out.println("</head>");
          out.println("<body bgcolor=yellow>");
 out.println("<img src=2.jpg>");
            out.println("<h3><center>REGISTRATION REPORT</h3><hr>");
	out.println("<table border=2>");
 out.println("<tr>");
	 out.println("<th>FIRST NAME</th><th>EMAIL</th><th>PHONE NO</th><th>SOURCE</th><th>DESTINATION</th>");
	 out.println("</tr>");
 try 
{

st=con.createStatement();
	
	rs=st.executeQuery("select * from register");

while(rs.next())
{
out.println("<tr><td>");
out.println(rs.getString(1));
out.println("<td>");
out.println(rs.getString(2));
out.println("<td>");
out.println(rs.getString(3));
out.println("<td>");
out.println(rs.getString(4));
out.println("<td>");
out.println(rs.getString(5));
out.println("</tr>");
}
}
catch(Exception at)
{}
           out.println("</body>");
            out.println("</html>");
    } 
public void destroy()
{
System.out.println("this is destroy");
}}
