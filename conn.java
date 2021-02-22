package customer;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project","root","rupu");
            if(c!=null) {
            	System.out.println("Success");
            }
            else {
            	System.out.println("Fail");
            }
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
