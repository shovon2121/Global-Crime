
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dcL
 */
public class Dbconnect {
    
         public Connection getConnection(){
             
            Connection con;

       try {
         //  Getting connection with server
          // For my sql server user name = root & password = root
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime?autoReconnect=true&useSSL=false", "root","root");
           return con;
       } 
      catch (Exception e) {
          
           return null;
       }
   }
         
          public void ExeQuery(String str) throws Exception{
        
        
        try {
		Connection conn = this.getConnection();
                Statement stmt  = conn.createStatement();
                stmt.execute(str);
               // stmt.executeQuery(str);
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
        
        
        System.out.println("QUERY EXECUTED");
    }
          
          
       
    
          
          
          
    
    public ResultSet ShowData(String query) throws Exception{
        
        Connection conn = this.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
       
        return rs;
    }

   ResultSet executeQuery (String query) throws Exception{
       Connection conn = this.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
       
        return rs;
   }

   

    
    
}

