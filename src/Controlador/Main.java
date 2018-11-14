
package Controlador;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author rualamos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            Conexion.obtener();
            apiExcel a = new apiExcel();
            Vista.Login l = new Vista.Login();
            l.setVisible(true);
        } catch (Exception e) {
        }
        
        
    }
    
     
}
