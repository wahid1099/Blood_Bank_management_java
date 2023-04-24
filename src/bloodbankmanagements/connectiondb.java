/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankmanagements;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wahid
 */
public class connectiondb {

    public static Connection getCon() throws SQLException {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Diu_projects", "wahid", "Wahid@#81");
            return con;
        } catch (ClassNotFoundException e) {
            return null;

        } 

    }
}
