
import java.io.PrintWriter; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class distservlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException
{
	res.setContentType("text/html");
	try
	{
		PrintWriter pw=res.getWriter();
		
	String text1=req.getParameter("t1");
	System.out.println(text1);
	String text2=req.getParameter("t2");
	System.out.println(text2);
	String text3=req.getParameter("t3");
	System.out.println(text3);
	String text4=req.getParameter("t4");
	System.out.println(text4);
	String text5=req.getParameter("t5");
	System.out.println(text5);
	String text6=req.getParameter("t6");
	System.out.println(text6);
	String text7=req.getParameter("t7");
	System.out.println(text7);
	String text8=req.getParameter("t8");
	System.out.println(text8);
	String text9=req.getParameter("t9");
	System.out.println(text9);
	if(text1=="")
		pw.println("plz provide distributorid");
	else if(text2=="")
		pw.println("plz provide name");
	else if(text3=="")
		pw.println("plz provide contNo");
	else if(text4=="")
		pw.println("plz provide branchname");
	else if(text5=="")
		pw.println("plz provide place");
	else if(text6=="")
		pw.println("plz provide emailid");

	else if(text7=="")
		pw.println("plz provide officeNo");

	else if(text8=="")
		pw.println("plz provide services");
	else if(text9=="")
		pw.println("plz provide description");
	else
	{
		 DBConnect db= new DBConnect();		
			int a=db.insertData3(text1,text2,text3,text4,text5,text6,text7,text8,text9);
			                           		 
				if(a>0){
				 pw.println("Distributor data  is submitted");
				  pw.println("<html>");
				  pw.println("<body bgcolor='pink'>");
				                           			  
				  pw.println("<a href='Admin.html'>BACK </a>");
				                                    			  
				  pw.println("</body>");
				   pw.println("</html>");
				                                      			   
				   }
				else
				{
				   pw.println("Not inserted successfully");
				   }
			}
	
		
	}
	
	catch(Exception e)
	{
		
	}
}
}
