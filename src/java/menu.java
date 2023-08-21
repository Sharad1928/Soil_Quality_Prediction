import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class menu extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body>");
    //Cookie[] ck=request.getCookies();
    //Cookie[] ck1=request.getCookies();
String s1=request.getParameter("u1");
    HttpSession session=request.getSession();
    String s=(String)session.getAttribute(s1);
    

if(s1==null){
out.println("<html><head><link rel='stylesheet' href='kamal.css'/></head><div id='mymenu'><ul><li> Home</li><li><a href='insert.html'> Pridict </a>   <li><a href=\"pr.html\"> Pridect production</a></li>\n" +
"</ul></div><form action='abc4'><div id='mydata'></table></div></form></html>");
out.println("Welcome "+s);
//out.println("Welcome "+ck1[0].getValue());


}
else{
  
    
    out.println("Wrong Way or Wrong Password");
}


out.println("<body>");
out.println("<html>");
out.close();
}
}