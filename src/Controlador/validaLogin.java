
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class validaLogin {
 
    public static Connection conectar = null;
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static String usname = "";
    public static String usape = "";
    public static int bodega=-1;
    public static int tipouser=-1;
    public static Calendar date = new GregorianCalendar();
    public static int año = date.get(Calendar.YEAR);
    public static int mes = date.get(Calendar.MONTH)+1;
    public static int dia = date.get(Calendar.DAY_OF_MONTH);
    public static String fecha =dia+"/"+mes+"/"+año;
    
    /*-------------------------------------------------------------------*/
    
    public static boolean logIn(String usuario , String contrasena)
    {
        boolean bool=false;
        
        try {
        conectar = Controlador.Conexion.obtener();
            
            String sql= "SELECT * FROM USUARIO WHERE USER=? AND PASS=? ";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,usuario);
            pst.setString(2,contrasena);
            rs =pst.executeQuery();
            
            
            if (rs.next()) {
                usname = rs.getString("NOMBRE");
                usape =rs.getString("APELLIDO");
                bodega=rs.getInt("ID_BODEGA");
                tipouser=rs.getInt("ID_TIPOUSUARIO");
                JOptionPane.showMessageDialog(null, "Bienvenido " + usname + " " + usape ,"Login exitoso!",1);
                bool=true;
                 
            }else{
               JOptionPane.showMessageDialog(null, "Usuario o contraseña inválido(s)","Error",0);
               bool=false;
               
            }
        
        
        } catch (Exception e) {
               //JOptionPane.showMessageDialog(null, "Sin conexión a servidor","Error",0);
               JOptionPane.showMessageDialog(null, e);
        }
        return bool; 
    }
    
    /*-------------------------------------------------------------------*/
    
     public static String recuperarUsuario ()
    {
        
        return usname + " " + usape;
    }
    
      public static int recuperartipoUsuario (int tipouser)
    {
        int tipous=tipouser;
        return tipous;
    }
      
        public static int recuperarBodega (int bodega)
    {
        int bod=bodega;
        return bod;
    }
        
}
