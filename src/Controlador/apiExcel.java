
package Controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class apiExcel {
    
   int año = Controlador.validaLogin.año;
   int mes = Controlador.validaLogin.mes;
   int dia = Controlador.validaLogin.dia;
    public static boolean bool;
   
  
    
    
    
    public boolean descargaXlsx_Internacional (int mes, int año)
    {
    try {

    Connection con = Conexion.obtener();

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_INTERNACIONAL_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
      fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
           
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                   
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
    
     public boolean descargaXlsx_RevFisica(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
   
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_REVFISICA_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
   
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
               
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                  
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
         JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
     
     public boolean descargaXlsx_PostRev(int mes, int año)
    {
    try {
   Connection con = Conexion.obtener();
   
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_POSTREV_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
         
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
            bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
          JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
        JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
   
     
      public boolean descargaXlsx_Express(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
   
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_EXPRESS_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar

                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
       JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
    
      public boolean descargaXlsx_Recepcion(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_RECEPCION_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
    
      
      public boolean descargaXlsx_cCalidad(int mes, int año)
    {
    try {
   Connection con = Conexion.obtener();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_CCALIDAD_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
         
                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
    } catch (ClassNotFoundException e1) {
          JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
         JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
    
      
      public boolean descargaXlsx_staPcf(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_STAPCF_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;

      while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }    
    
  
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    } catch (ClassNotFoundException e1) {
      JOptionPane.showMessageDialog(null,"No existe reporte del periodo "+mes+"/"+año, "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
       JOptionPane.showMessageDialog(null,"No existe reporte del periodo "+mes+"/"+año, "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
      
      public boolean descargaXlsx_ADM(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_ADM_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
                    //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
    } catch (ClassNotFoundException e1) {
          JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
        return bool;
    }
       public boolean descargaXlsx_Liq(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
   
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_LIQ_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
   
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
               
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                  
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
       JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
        JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
   
    
   public boolean descargaXlsx_StaInter(int mes, int año)
    {
    try {
    Connection con = Conexion.obtener();
   
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM BOD_STAINTER_"+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
   
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
       fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
               
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                  
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
       JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
        JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }   
   
   public boolean descargaXlsx_General (int mes, int año, String inBodega)
    {
    try {

    Connection con = Conexion.obtener();

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM "+inBodega+mes+"_"+año);
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Hoja1");
    XSSFRow rowhead = sheet.createRow((short) 0);
    rowhead.createCell((short) 0).setCellValue("SERIE");
    rowhead.createCell((short) 1).setCellValue("CODIGO");
    rowhead.createCell((short) 2).setCellValue("ID");
    rowhead.createCell((short) 3).setCellValue("AREA");
    rowhead.createCell((short) 4).setCellValue("UBICACIÓN");
    rowhead.createCell((short) 5).setCellValue("RESPONSABLE");
    rowhead.createCell((short) 6).setCellValue("TIPO");
    rowhead.createCell((short) 7).setCellValue("FAMILIA");
    rowhead.createCell((short) 8).setCellValue("MARCA");
    rowhead.createCell((short) 9).setCellValue("NOMBRE");
    rowhead.createCell((short) 10).setCellValue("COSTO_PROMEDIO");
    rowhead.createCell((short) 11).setCellValue("ESTATUS");
    rowhead.createCell((short) 12).setCellValue("FICHA");
    rowhead.createCell((short) 13).setCellValue("USUARIO");
    rowhead.createCell((short) 14).setCellValue("ESTADO");
    rowhead.createCell((short) 15).setCellValue("PROVEEDOR");
    
    int i = 1;
    
    while (rs.next()){
        XSSFRow row = sheet.createRow((short) i);
        row.createCell((short) 0).setCellValue(rs.getString("SERIE"));
        row.createCell((short) 1).setCellValue(rs.getString("CODIGO"));
        row.createCell((short) 2).setCellValue(rs.getString("ID"));
        row.createCell((short) 3).setCellValue(rs.getString("AREA"));
        row.createCell((short) 4).setCellValue(rs.getString("UBICACIÓN"));
        row.createCell((short) 5).setCellValue(rs.getString("RESPONSABLE"));
        row.createCell((short) 6).setCellValue(rs.getString("TIPO"));
        row.createCell((short) 7).setCellValue(rs.getString("FAMILIA"));
        row.createCell((short) 8).setCellValue(rs.getString("MARCA"));
        row.createCell((short) 9).setCellValue(rs.getString("NOMBRE"));
        row.createCell((short) 10).setCellValue(rs.getString("COSTO_PROMEDIO"));
        row.createCell((short) 11).setCellValue(rs.getString("ESTATUS"));
        row.createCell((short) 12).setCellValue(rs.getString("FICHA"));
        row.createCell((short) 13).setCellValue(rs.getString("USUARIO"));
        row.createCell((short) 14).setCellValue(rs.getString("ESTADO"));
        row.createCell((short) 15).setCellValue(rs.getString("PROVEEDOR"));
        i++;
    }
    
     JFileChooser fileChooser = new JFileChooser();
      fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
            int seleccion = fileChooser.showSaveDialog(null);
            try{
                if (seleccion == JFileChooser.APPROVE_OPTION){//comprueba si ha presionado el boton de aceptar
                    File JFC = fileChooser.getSelectedFile();
                    String PATH = JFC.getAbsolutePath();//obtenemos el path del archivo a guardar
           
                        if(!(PATH.endsWith(".xlsx"))){
                     FileOutputStream fileOut = new FileOutputStream(PATH+".xlsx");
                     workbook.write(fileOut);
                     fileOut.close();
                        }else{
                     FileOutputStream fileOut = new FileOutputStream(PATH);
                     workbook.write(fileOut);
                     fileOut.close(); 
                   
                    }
  
                    JOptionPane.showMessageDialog(null,"Reporte generado en "+ PATH, "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
                    bool=true;
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
                bool=false;
            }
                  
    
   
    } catch (ClassNotFoundException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null,"No existe reporte de este periodo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
    }
    return bool;
    }
   
}

