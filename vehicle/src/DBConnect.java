import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect 
{
	
	
	boolean getData(String name,String Pass) throws ClassNotFoundException, SQLException{
		boolean flag=false;
		ResultSet rs = null;
		System.out.println("KKKKKKKKKKKKKKKK");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("KKKKKKKKKKKKKKKK");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
			System.out.println(con);
			Statement st=con.createStatement();
			String s1="select * from register where username='"+name+"' and password='"+Pass+"'";
			System.out.println(s1);
			 rs=st.executeQuery(s1);
			
			System.out.println(rs);
			
	
		while(rs.next())
		{
			System.out.println("KKKKKKKKKKKKKKK9999999999999999s");
			if(name.equalsIgnoreCase(rs.getString(1)) && Pass.equalsIgnoreCase(rs.getString(2)))
			{
			
				System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		
		return flag;
	}

	public int insertData1(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6,String Text7) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into register values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"','"+Text7+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
	public int insertData2(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6,String Text7) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into product values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"','"+Text7+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
	public int insertData3(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6,String Text7, String Text8,String Text9) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into distributor values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"','"+Text7+"','"+Text8+"','"+Text9+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
	public int insertData4(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into complaints values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
	public int insertData5(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into manufacturer values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
	public int insertData6(String Text1, String Text2,String Text3, String Text4,String Text5, String Text6, String Text7) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
		System.out.println(con);
		Statement st=con.createStatement();
		String s1="insert into retailer values('"+Text1+"','"+Text2+"' ,'"+Text3+"','"+Text4+"','"+Text5+"','"+Text6+"','"+Text7+"')";
		System.out.println(s1);
		 int rs=st.executeUpdate(s1);
		 System.out.println(rs);
		 return rs;
		
	}
	
}
