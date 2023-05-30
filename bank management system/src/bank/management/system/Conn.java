// steps to jdbc connection
//     1. Register the driver
//     2. Create Connection
//     3. create statement
//     4. Execute query
//     5. close connection

package bank.management.system;

import java.sql.*;  

public class Conn {
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","admin");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
