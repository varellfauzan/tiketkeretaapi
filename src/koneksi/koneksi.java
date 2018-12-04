/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Cax
 */
public class koneksi {
     private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal konek"+ex);
        }
        String url = "jdbc:mysql://localhost/tiket_kereta";
        try{
            koneksi = (Connection)DriverManager.getConnection(url,"root","");
        }catch(SQLException ex){
            System.out.println("gagal konek db"+ex);
        }
        return koneksi;
    }

}
