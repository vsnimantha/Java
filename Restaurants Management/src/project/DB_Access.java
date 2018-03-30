/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author TDK
 */
public class DB_Access {
    
    static Connection conn = DB_connect.ConnectDB();
    static ResultSet rs = null;
    static Statement ps = null;
    static PreparedStatement pst = null;
    
    static int row = 0;
    static int col = 0;
// fill the combo box 1 in mainPage    
    public static ResultSet combo1(){
        try{
            String sql;
            sql = "select * from food.setm";
            ps=conn.createStatement();
            rs=ps.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            return null;
        }
    }
// fill the combo box 2 in mainPage      
    public static ResultSet combo2(){
    
        try{
           String sql;
                sql = "select * from food.buffet";
                ps=conn.createStatement();
                rs=ps.executeQuery(sql);
                return rs;
        }
        catch(Exception e){
            return null;
        }
        
    }
    public static ResultSet combo3(){
    
        try{
           String sql;
                sql = "select * from food.shorte";
                ps=conn.createStatement();
                rs=ps.executeQuery(sql);
                return rs;
        }
        catch(Exception e){
            return null;
        } 
    }
    
    public static ResultSet getItemSetM(String str){
        try{
            String sql;
                sql = "select price from food.setm where name ='"+str+"'";
            ps=conn.createStatement();
            rs=ps.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            
            return null;
        }
    }
    
    public static ResultSet getItemBuffet(String str){
        try{
            String sql;
                sql = "select price from food.buffet where name ='"+str+"'";
            ps=conn.createStatement();
            rs=ps.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            
            return null;
        }
    }
    
    public static ResultSet getItemShortE(String str){
        try{
            String sql;
                sql = "select price from food.shorte where name ='"+str+"'";
            ps=conn.createStatement();
            rs=ps.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            
            return null;
        }
    }
    
    //other implements 
    public static int Setrow(int a){
    row = 0 + a;
    return row;
    
    }
    public static int Setcol(int a){
    col = 0 + a;
    return col;
    
    }
    
    public static int CalcPrice(int a, int b){
        return a*b;
    }
    //---------------------------------------------
    
    //------------------- LOGIN codes -------------
    public static ResultSet LogIn(String n, String p){
    try{
            String sql;
                sql = "select * from login.login where username =? and pwd =?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, n);
            pst.setString(2, p);
            rs=pst.executeQuery();
            return rs;
        }
        catch(Exception e){
            return null;
        }
    }
    
    public static ResultSet LogInCombo(){
        try{
            String sql;
                sql = "Select * from login.login";
            ps = conn.createStatement();
            rs = ps.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
        return null;
        }
    }
    //---------------------------------------------
    
    //------------------- Manager view ------------
       // for the item details tab in manager view we used combo box filling 1, 2 and 3 
       // for the user details tab in manager view we used LogInCombo method in DB_Access
    
    
}
