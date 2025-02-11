//package Insurance1;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginservlet extends HttpServlet {

	
	   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException{
		   
		   
		   System.out.println("Hai");
		   res.setContentType("text/html");
		   try{
		   PrintWriter pw=res.getWriter();
		   
		   String enmae=req.getParameter("t1");
		   System.out.println(enmae);
		   String epass=req.getParameter("t2");
		   System.out.println(epass);
		  DBConnect db=new DBConnect();
		   boolean b=db.getData(enmae, epass);
		   if(b){
			   pw.println("Succcess ful login user id is"+ enmae + "<a href='home.html'>HOME PAGE </a>");
		   }else{
			   pw.println("Unauthorised user");
		   }
		   }catch(Exception e){
			   
		   
		   }
	   }
}
