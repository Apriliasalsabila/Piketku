/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author A456U
 */
public class Koneksi {
    Connection conn;
    Statement pst;
    public void connectdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/piketku","root","");
            pst = conn.createStatement();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
}
}