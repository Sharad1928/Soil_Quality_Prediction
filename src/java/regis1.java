import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class regis1 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body>");

String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","root");
Statement st=con.createStatement();
st.executeUpdate("insert into login values('"+s1+"','"+s2+"')");
response.sendRedirect("login.html");
con.close();
}
catch(Exception e){

out.println(e);
}
out.println("</body>");
out.println("</html>");
out.close();
}
}