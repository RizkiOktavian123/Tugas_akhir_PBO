/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class koneksi {
    public static Connection con;
    public static Statement st; 
    
     public static void koneksi(){
        try {
            con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/penggajian_karyawan","root","");
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi gagal"+ e);
        } //catch
    } //koneksi 
    
}
