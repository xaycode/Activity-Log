/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActivityLog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pradnya
 */
public class koneksi {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    
    public void konek()
    {
        koneksi("localhost", "activiylog", "root", "");
    }
    
    void koneksi(String server, String db, String user, String passwd){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            //System.out.print("Driver tidak bisa di load\n");
            System.out.println("Driver tidak bisa di load");
            e.printStackTrace();
            return;
        }
            //System.out.print("Driver berhasil di load\n");
            System.out.println("Driver berhasil di load");
            conn=null;
            try {
                conn=DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,passwd);    
            } catch (SQLException s){
                //System.out.print("Tidak Berhasil koneksi\n");
                System.out.println("Tidak Berhasil koneksi");
                s.printStackTrace();
                return;
            }
            //System.out.print("Driver di Load dan Koneksi berhasil\n");
            System.out.println("Driver di Load dan Koneksi berhasil");
    }
         
}
