
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nandri Bagus
 */
public class koneksi {
    
    public Connection openConnection(){
        
        Connection con;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/belajar_adp";
            con = DriverManager.getConnection(url, "root", "");
            return con;
        }
        catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
}
