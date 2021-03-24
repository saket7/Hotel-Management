import java.sql.*;  
class MySQLCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1","root","");  
//here company is database name, root is username and password  
Statement stmt=con.createStatement();  

// Inserting row into a table
//String insert_qry= "insert into emp (id,name,salary,city) value (11,'Reshma',45000,'Thane')";
//int num_row_updated= stmt.executeUpdate(insert_qry);
//System.out.println("No. of rows inserted="+num_row_updated);

String ret_str="select * from customer_details where id=1";
ResultSet rs=stmt.executeQuery(ret_str);  
// In emp table 4 fields are there i.e. id,name,salary and city
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//+" "+rs.getInt(6)+" "+rs.getString(7));  


con.close();  
}
 catch(Exception e)
 { 
 System.out.println("driver not loaded "+e);}  
 }  
}  