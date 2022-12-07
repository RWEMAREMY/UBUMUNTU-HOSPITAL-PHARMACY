/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubumuntu.hosp.phar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author REMY
 */
class Myconnection {
    public void connection()
    {
        try {
            Class.forName("com.mysql.jdbc.Drive");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    } 
}
