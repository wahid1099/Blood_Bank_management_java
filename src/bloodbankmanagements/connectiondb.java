/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankmanagements;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wahid
 */
public class connectiondb {

  Connection con = null;
    public static Connection connectDB(){
        try {           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/Diu_projects","wahid","Wahid@#81");
            JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection failed " );
            return null;
    }  
  }
}
