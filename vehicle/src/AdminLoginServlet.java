import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.xml.ws.Response;


public class AdminLoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException{
		 System.out.println("Hai");
		   res.setContentType("text/html");
		   try{
		   PrintWriter pw=res.getWriter();
		   
		   String Text1=req.getParameter("Text1");
		  // System.out.println(Text1);
		   String Text2=req.getParameter("Text2");
		   //System.out.println(Text2);
		   
		   
		   if(Text1.equals("Admin")&& Text2.equals("1234"))
		   {
			   pw.println("Wel come" + "<a href='Admin.html'>Admin</a>");
		   }
		   
		
		   
		   
		   }catch(Exception e){
			   
		   }
	
	}

}
