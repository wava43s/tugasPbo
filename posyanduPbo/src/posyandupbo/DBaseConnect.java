/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posyandupbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBaseConnect {
     final static String DBase_URL="jdbc:mysql://qqe.h.filess.io:3307/pboposyandu_callmoveor";
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String USER ="pboposyandu_callmoveor";
    final static String PASSWORD="338786d6a505af2f372b1cea44fa870cd8c2e392";
    
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DBase_URL,USER,PASSWORD);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
        return null;
    }
}