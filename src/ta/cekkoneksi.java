/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.sql.SQLException;

/**
 *
 * @author A456U
 */
public class cekkoneksi {
    public static void main(String [] args) throws SQLException {
    Koneksi connection = new Koneksi();
    connection.connectdb();
}

}
