/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1pack1;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/university","root","");
             JOptionPane.showMessageDialog(null,"Connected to database succssess");
             return conn;
        }catch(Exception e){
     JOptionPane.showMessageDialog(null,e);
     
}
        return null;
    }
    
}
    

