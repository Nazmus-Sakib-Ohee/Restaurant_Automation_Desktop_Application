
package wifiordering;


import com.mysql.jdbc.exceptions.MySQLDataException;
import java.io.*;
import java.sql.*;

public class SampleDatabase {
    Connection con;

    public SampleDatabase() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/desktop", "root", "");
        
        
    }
    
    
    public Connection getconnection(){
        return con;
    }
        public static void main(String args[]) throws SQLException, ClassNotFoundException {
            SampleDatabase obj = new SampleDatabase();
            
        }
}
    

