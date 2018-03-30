package Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_access {
    
    public static ResultSet login(String sql)throws SQLException, ClassNotFoundException{
        
        
        
        Connection conn= DB_connect.getConnection();
        Statement stm= conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        return rst;
    }
    
    
}
