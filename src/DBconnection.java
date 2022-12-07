/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author REMY
 */
public class DBconnection {
   
   static final String DB_URL="jdbc:mysql://localhost/uhp";
   static final String FIRST="root";
   static final String PASS="";
   public static Connection ConnectDB(){
       Connection conn=null;
      try{
      Class.forName("com.msql.jdbc.Driver");
      conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/medecines","root","");
      return conn;
      }catch(Exception ex){
      System.out.println("there were some error while conneting to db.");
      return null;
      }
   }
}
