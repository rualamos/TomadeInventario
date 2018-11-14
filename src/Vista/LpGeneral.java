    

package Vista;


import Vista.MenuPrincipal;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
        


public class LpGeneral extends javax.swing.JFrame {

    int bodega =Controlador.validaLogin.bodega;
    int tipoUsu =Controlador.validaLogin.tipouser;
    int año=Controlador.validaLogin.año  ;
    int mes=Controlador.validaLogin.mes ;
    int dia=Controlador.validaLogin.dia;
    String lpBodega,inBodega=null;
    String areaBod=null;
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String userName=Controlador.validaLogin.recuperarUsuario();
    int cboId=Vista.MenuPrincipal.cboID;
    DefaultTableModel modeloTabla=new DefaultTableModel(null,getcolumnas());
   
    public LpGeneral() {
        initComponents();
        tamañoColumnas();
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        
         if(bodega==0)
        {
            if(cboId==1)
            {
            lbl_bodega.setText("ADM Nacional");
            inBodega="BOD_ADM_";
            areaBod="ADM NACIONAL";  
            lpBodega="LP_ADM_";
            }else if(cboId==2)
            {
            lbl_bodega.setText("Internacional");
            inBodega="BOD_INTERNACIONAL_";
            areaBod="INTERNACIONAL";
            lpBodega="LP_INTERNACIONAL_";
            }else if(cboId==3){
            lbl_bodega.setText("STA Internacional");
            inBodega="BOD_STAINTER_";
            areaBod="STA INTERNACIONAL";   
            lpBodega="LP_STAINTER_";
            }else if(cboId==4)
            {
            lbl_bodega.setText("RMA Express");
            inBodega="BOD_EXPRESS_";
            areaBod="EXPRESS";  
            lpBodega="LP_EXPRESS_";
            }else if (cboId==5)
            {
            lbl_bodega.setText("C.Calidad");
            inBodega="BOD_CCALIDAD_";
            areaBod="C.CALIDAD";
            lpBodega="LP_CCALIDAD_";
            }else if(cboId==6)
            {
            lbl_bodega.setText("STA PCF");
            inBodega="BOD_STAPCF_";
            areaBod="STA PCF"; 
            lpBodega="LP_STAPCF_";
            }else if(cboId==7)
            {
            lbl_bodega.setText("Revision Fisica");
            inBodega="BOD_REVFISICA_";
            areaBod="REVISION FISICA"; 
            lpBodega="LP_REVFISICA_";
            }else if(cboId==8)
            {
            lbl_bodega.setText("Post Revision");
            inBodega="BOD_POSTREV_";
            areaBod="POST REVISION";
            lpBodega="LP_POSTREV_";
            }else if(cboId==9)
            {
            lbl_bodega.setText("Liquidacion");
            inBodega="BOD_LIQ_";
            areaBod="LIQUIDACION";
            lpBodega="LP_LIQ_";
            }else if(cboId==10){
            lbl_bodega.setText("Recepción");
            inBodega="BOD_RECEPCION_";
            areaBod="RECEPCION"; 
            lpBodega="LP_RECEPCION_";
            }
        }
        else if(bodega==1)
        {
          if(cboId==1)
          {
           lbl_bodega.setText("Internacional");
           inBodega="BOD_INTERNACIONAL_";
           areaBod="INTERNACIONAL";   
           lpBodega="LP_INTERNACIONAL_";
          }else if(cboId==2){
            lbl_bodega.setText("STA Internacional");
            inBodega="BOD_STAINTER_";
            areaBod="STA INTERNACIONAL"; 
            lpBodega="LP_STAINTER_";
          }else if (cboId==3)
          {
            lbl_bodega.setText("Revision Fisica");
            inBodega="BOD_REVFISICA_";
            areaBod="REVISION FISICA";  
            lpBodega="LP_REVFISICA_";
          }else if(cboId==4)
          {
            lbl_bodega.setText("Post Revision");
            inBodega="BOD_POSTREV_";
            areaBod="POST REVISION"; 
            lpBodega="LP_POSTREV_";
          }else if(cboId==5)
          {
             lbl_bodega.setText("Liquidacion");
            inBodega="BOD_LIQ_";
            areaBod="LIQUIDACION";
            lpBodega="LP_LIQ_";
          }
        
        }else if(bodega==2)
        {
          if(cboId==1)
          {
            lbl_bodega.setText("ADM Nacional");
            inBodega="BOD_ADM_";
            areaBod="ADM NACIONAL";   
            lpBodega="LP_ADM_";
          }else if(cboId==2)
          {
            lbl_bodega.setText("STA Nacional");
            inBodega="BOD_STANAC_";
            areaBod="STA NACIONAL";   
            lpBodega="LP_STANAC_";
          }
        }
        else if(bodega==3)
        {
            lbl_bodega.setText("STA PCF");
            inBodega="BOD_STAPCF_";
            areaBod="STA PCF";
            lpBodega="LP_STAPCF_";
            
        }else if(bodega==4)
        {
            lbl_bodega.setText("C.Calidad");
            inBodega="BOD_CCALIDAD_";
            areaBod="C.CALIDAD";
            lpBodega="LP_CCALIDAD_";
        }else if(bodega==5)
        {
            lbl_bodega.setText("Recepción");
            inBodega="BOD_RECEPCION_";
            areaBod="RECEPCION";
            lpBodega="LP_RECEPCION_";
        }else if(bodega==6)
        {
            lbl_bodega.setText("RMA Express");
            inBodega="BOD_EXPRESS_";
            areaBod="EXPRESS";
            lpBodega="LP_EXPRESS_";
        }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtab_lp = new javax.swing.JTable();
        lbl_bodega = new javax.swing.JLabel();
        btn_listar = new javax.swing.JButton();
        jcal_mes = new com.toedter.calendar.JMonthChooser();
        jcal_año = new com.toedter.calendar.JYearChooser();
        btn_descargar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Lista de precios");

        jtab_lp.setModel(modeloTabla);
        jtab_lp.setColumnSelectionAllowed(true);
        jtab_lp.setEnabled(false);
        jtab_lp.setOpaque(false);
        jtab_lp.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtab_lp);
        jtab_lp.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        lbl_bodega.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbl_bodega.setText("Bodega ");

        btn_listar.setText("Listar");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_descargar.setText("Descargar");
        btn_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descargarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar tabla");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jcal_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jcal_año, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(lbl_bodega)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bodega)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcal_año, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcal_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        this.setVisible(false);
        m.setVisible(true);
        
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        
      if(setFilas())
      {
         btn_listar.setEnabled(false);
         btn_listar.updateUI(); 
      }else{
          //JOptionPane.showMessageDialog(null, "No existe LP del periodo seleccionado","",0);
      }
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descargarActionPerformed
        if (jtab_lp.getRowCount()==0) {
            JOptionPane.showMessageDialog(null, "Lista de precios se encuentras vacía","",0);
        }else{
            exportar();
           
        }
    }//GEN-LAST:event_btn_descargarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtab_lp.getModel();
         modelo.setRowCount(0);
         btn_listar.setEnabled(true);
         btn_listar.updateUI();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LpGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LpGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LpGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LpGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LpGeneral().setVisible(true);
            }
        });
        
        
    }
    
    private boolean setFilas()
    {
        boolean bool=false;
    
        try {
          int mes=jcal_mes.getMonth()+1;
        int año=jcal_año.getYear();
            conectar = Controlador.Conexion.obtener();
            String sql ="SELECT CODIGO,MARCA,NOMBRE, FORMAT(SUM(C_1),\"#####\") AS CANTIDAD_1, SUM(C_2) AS CANTIDAD_2,FORMAT((SUM(C_2)-SUM(C_1)),\"####\") AS DIFERENCIA\n" +
            "FROM\n" +
            "(\n" +
            "SELECT "+lpBodega+mes+"_"+año+".Codigo,"+lpBodega+mes+"_"+año+".`Marca`,"+lpBodega+mes+"_"+año+".`Nombre`,TRUNCATE("+lpBodega+mes+"_"+año+".Stock,5) AS C_1,0 AS C_2\n" +
            "FROM "+lpBodega+mes+"_"+año+"\n" +
            "UNION ALL\n" +
            "SELECT "+inBodega+mes+"_"+año+".CODIGO,0 AS C_1,"+inBodega+mes+"_"+año+".`MARCA`,"+inBodega+mes+"_"+año+".`NOMBRE`, IFNULL(COUNT(1),0) AS C_2\n" +
            "FROM "+inBodega+mes+"_"+año+"\n" +
            "GROUP BY CODIGO\n" +
            ") AS A\n" +
            "GROUP BY CODIGO\n" +
            "ORDER BY DIFERENCIA ASC";
             pst = conectar.prepareStatement(sql);
             rs=pst.executeQuery();
             
             Object datos []=new Object[6];
             while(rs.next()){
              bool =true;   
                 for (int i = 0; i < 6; i++) {
                     datos[i]=rs.getObject(i+1);
                 }
                 modeloTabla.addRow(datos);
             }
             rs.close();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e,"",0);
        }
        return bool;
    }
    
      
    public String[] getcolumnas()
    {
        String columna[]=new String[]{"ID","Marca","Nombre","LP","Stock","Diferencia"};
        return columna;
    }
    


    public void tamañoColumnas(){
        TableColumnModel columnModel = jtab_lp.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(110);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(700);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
         columnModel.getColumn(5).setPreferredWidth(100);
    }
        public void cargarIcono()
    {
        java.awt.Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/pcicon.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    
        public void exportar()
        {         
          XSSFWorkbook workbook = new XSSFWorkbook();
          XSSFSheet sheet = workbook.createSheet("Hoja1");
          int cantFila=jtab_lp.getRowCount();
          int cantCol=jtab_lp.getColumnCount();
          int xs=1;
            try {
    
                XSSFRow rowhead = sheet.createRow((short) 0);
                rowhead.createCell((short) 0).setCellValue("ID");
                rowhead.createCell((short) 1).setCellValue("MARCA");
                rowhead.createCell((short) 2).setCellValue("NOMBRE");
                rowhead.createCell((short) 3).setCellValue("LP");
                rowhead.createCell((short) 4).setCellValue("STOCK");
                rowhead.createCell((short) 5).setCellValue("DIFERENCIA"); 
                
                for (int i = 0; i < cantFila; i++) {
                 XSSFRow fila = sheet.createRow((short)xs );
                    for (int j = 0; j < cantCol; j++) {
                      Cell celda= fila.createCell(j);
                          celda.setCellValue(String.valueOf(jtab_lp.getValueAt(i,j)));
                          if(j==0||j>2)
                          {
                             celda.setCellValue(Integer.valueOf(jtab_lp.getValueAt(i,j).toString())); 
                          }        
                    }
                    xs++;
                }
            JFileChooser fileChooser = new JFileChooser();
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
                 
                }
            }catch (Exception e){//por alguna excepcion salta un mensaje de error
                JOptionPane.showMessageDialog(null,"Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
             
            }
            } catch (Exception e) {
            }
          
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.XLSX", "xlsx","XLSX"));//filtro para ver solo archivos .edu
        }
     
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_descargar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser jcal_año;
    private com.toedter.calendar.JMonthChooser jcal_mes;
    private javax.swing.JTable jtab_lp;
    private javax.swing.JLabel lbl_bodega;
    // End of variables declaration//GEN-END:variables
}
