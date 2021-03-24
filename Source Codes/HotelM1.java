import java.sql.SQLException; 
import java.util.Scanner; 
class HotelM1
{
    public static void DisplayOption() throws SQLException 
    { 
        Scanner sc=new Scanner(System.in); 
        String Option; 
        // Display options 
        System.out.println("*****************************************"); 
        System.out.println("|   HOTEL MANAGEMENT SYSTEM             |"); 
        System.out.println("*****************************************"); 
        System.out.println("| Options:                              |"); 
        System.out.println("|        1. Add New Customer            |"); 
        System.out.println("|        2. View All Customer           |"); 
        System.out.println("|        3. Search For Customer         |"); 
        System.out.println("|        4. Check Out                   |"); 
        System.out.println("|        5. Update Customer Data        |"); 
        System.out.println("|        6. Exit                        |"); 
        System.out.println("*****************************************"); 

        System.out.print("Select option: "); 
        Option=sc.next(); 
        //options to select from 
        switch(Option) 
		{ 
            case "1": 
                InsertDetails.Insert(); 
				//add=new InsertDetails(); 
				//add.Insert();
                break; 
            case "2": 
			    ViewDetails view=new ViewDetails();
				view.viewCustDetails()();
				break;
              //  InsertDetails.viewCustomers();

            /*case "3": 
                SearchCustomer search = new SearchCustomer(); 
                break; 
            case "4": 
                CheckOut checkout = new CheckOut(); 
                break; 
            case "5":  
                UpdateCustomer update = new UpdateCustomer(); 
                break; 
            case "6": 
                System.exit(0); 
                break; */
            default: 
                System.out.println("Selection Incorrect"); 
                break;  
        } 
        sc.close(); 
    } 
     
}

