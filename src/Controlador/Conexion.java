/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author rualamos
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
   private static Connection cnx = null;
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://10.1.26.xxx/tomadeinventario", "xxxxx", "#xxxxxxxx,");
         } catch (SQLException ex) {
            //throw new SQLException(ex);
            ex.printStackTrace();
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con el servidor","Error de comunicación",0); 
         }
      }
      return cnx;
   }
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
   
   public Connection getConnection(){ 
return cnx; 
} 

public void desconectar(){ 
cnx = null; 
}
}

    

