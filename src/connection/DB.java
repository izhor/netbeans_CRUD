/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

/**
 *
 * @author M A Z A
 */
public class DB {
    private Connection con;
    public Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully connected to the driver");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver Connection Failed: "+ex);
        }
        String url = "jdbc:mysql://localhost/uts_pemvis_alif";
        try{
            con = DriverManager.getConnection(url,"root","");
            System.out.println("Database Connection Success");
        }
        catch (SQLException ex){
            System.out.println("Database Connection Failed: "+ex);
        }
        return con;
    }
}
