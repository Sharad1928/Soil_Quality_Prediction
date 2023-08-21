import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class log extends HttpServlet
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
ResultSet rs=st.executeQuery("select * from login where UNAME='"+s1+"' and UPASS='"+s2+"'");
if(rs.next()){
    //Cookie ck=new Cookie("uname",s1);
    //ck.setMaxAge(60*60);
    //response.addCookie(ck);
    //Cookie ck1=new Cookie("uname",s2);
    //ck.setMaxAge(60*60);
    //response.addCookie(ck1);
      HttpSession session=request.getSession();
    session.setAttribute("uname",s1);

    response.sendRedirect("menu");
}
else{
	   

    response.sendRedirect("menu");
// response.sendRedirect("mymenu.html");
   // out.println("invalid name or pass");
}
con.close();
}
catch(Exception e1){
out.println(e1);
}
out.println("<body>");
out.println("<html>");
out.close();
}
}