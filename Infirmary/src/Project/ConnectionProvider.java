/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
 /*
 * @author divyanshjha
 */
public class ConnectionProvider {
    public  static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Divyansh@2023");
            return con;
        }
        
        catch(Exception e){
          return null;  
        }
    }
}
