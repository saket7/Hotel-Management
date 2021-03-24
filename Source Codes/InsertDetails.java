import java.sql.*;  
import java.util.*;
public class InsertDetails
{
 public static void Insert()
 { 
  try
  {  
  Class.forName("com.mysql.jdbc.Driver");   
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1","root","");  
  //here company is database name, root is username and password  
  Statement stmt=con.createStatement();  
  // Inserting row into a table through keyboard
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Customer ID:");
  int id=sc.nextInt();
  System.out.println("Enter Room number:");
  int room_no=sc.nextInt();
  sc.next();
  String name;
  System.out.println("Enter Customer name:");
  name=sc.nextLine();
  //sc.next();
  String contact_no;
  System.out.println("Enter Contact number:");
  contact_no=sc.next();
  //sc.next();
  String email;
  System.out.println("Enter Email id:");
  email=sc.next();
  String insert_qry= "insert into customer_details(id,room_no,name,contact_no,email) value"+
  "("+id+","+room_no+",'"+name+"','" +contact_no+"','"+email+"')";
  System.out.println(insert_qry);
  int num_row_inserted= stmt.executeUpdate(insert_qry);
  System.out.println("No. of rows inserted="+num_row_inserted);
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


