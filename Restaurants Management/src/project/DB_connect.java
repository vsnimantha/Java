/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author TDK
 */
public class DB_connect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","tdk@sliit");
            return conn;
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
}
