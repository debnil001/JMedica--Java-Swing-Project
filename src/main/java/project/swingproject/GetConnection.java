/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.swingproject;

import java.sql.*;

/**
 *
 * @author Debnil
 */
public class GetConnection {
    private Connection conn=null;
    public Connection getConnection(){
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore","root","debnil@2001");
        }
        catch(Exception e){
            System.out.println(e);
//            System.out.print("###44444");
        }
        finally{
            return conn;
        }
    }
}
