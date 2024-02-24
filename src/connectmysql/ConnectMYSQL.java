/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmysql;

import java.sql.Connection;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ivonne
 */
public class ConnectMYSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","300208566*Fc");
            System.out.println(con);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE NAME LIKE 'A%'");
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }

        }catch(ClassNotFoundException ex){
            Logger.getLogger(ConnectMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(ConnectMYSQL.class.getName()).log(Level.SEVERE,null,ex);
        
        }
   
    }
    
}
