import java.sql.*;
public class ViewDetails
{
  public static void viewCustDetails()
  {
	 try
	{
    Class.forName("com.mysql.jdbc.Driver");   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1","root","");  
	Statement stmt=con.createStatement(); 
	String ret_str="select * from customer_details";
   ResultSet rs=stmt.executeQuery(ret_str);  
// In emp table 4 fields are there i.e. id,name,salary and city
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)); 
    con.close(); 
   }
   catch(Exception e)
    { 
    System.out.println(e);
    }  
  }  
}