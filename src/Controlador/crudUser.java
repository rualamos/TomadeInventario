
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class crudUser {
  
    private static Connection conectar = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    
  public static boolean registrar (String user , String pass , String nombre , String apellido , int tipouser, int bodega)
    {
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "INSERT INTO USUARIO(USER,PASS,NOMBRE,APELLIDO,ID_TIPOUSUARIO,ID_BODEGA) VALUES (?,?,?,?,?,?)";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,pass);
            pst.setString(3,nombre);
            pst.setString(4,apellido);
            pst.setInt(5,tipouser);
            pst.setInt(6,bodega);
            
            if(pst.executeUpdate()==1)
            return true;  
        } catch (Exception e) {
            
        }
        return false;
    }   
    
  
  
   public static boolean Eliminar(String usuario)
    {
        
        
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "DELETE FROM USUARIO WHERE USER =?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,usuario);
    
        
            
            if (pst.executeUpdate()==1) {
                JOptionPane.showMessageDialog(null, "Usuario "+ usuario +" eliminado");
                return true;
            }else{
                 JOptionPane.showMessageDialog(null, "No se pudo eliminar usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
   public boolean actualizar(int bodega , String usuario)
        {
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "UPDATE USUARIO SET ID_BODEGA=? WHERE USER =?";
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,bodega);
            pst.setString(2,usuario);
    
            if (pst.executeUpdate()>0) {
                
             return true;
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
        }
   
   
   
}
