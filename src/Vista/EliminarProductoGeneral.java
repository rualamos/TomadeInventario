

package Vista;

import Vista.MenuPrincipal;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class EliminarProductoGeneral extends javax.swing.JFrame {

    int bodega =Controlador.validaLogin.bodega;
    int tipoUsu =Controlador.validaLogin.tipouser;
    int año=Controlador.validaLogin.año  ;
    int mes=Controlador.validaLogin.mes ;
    int dia=Controlador.validaLogin.dia;
    String inBodega=null;
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int cboId=Vista.MenuPrincipal.cboID;
 
    public EliminarProductoGeneral() {
        initComponents();
      
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        
         switch (bodega) {
            case 0:
                if(cboId==1)
                {
                    lbl_bodega.setText("ADM Nacional");
                    inBodega="BOD_ADM_";
                }else if(cboId==2)
                {
                    lbl_bodega.setText("Internacional");
                    inBodega="BOD_INTERNACIONAL_";
                }else if(cboId==3){
                    lbl_bodega.setText("STA Internacional");
                    inBodega="BOD_STAINTER_";
                }else if(cboId==4)
                {
                    lbl_bodega.setText("RMA Express");
                    inBodega="BOD_EXPRESS_";
                }else if (cboId==5)
                {
                    lbl_bodega.setText("C.Calidad");
                    inBodega="BOD_CCALIDAD_";
                }else if(cboId==6)
                {
                    lbl_bodega.setText("STA PCF");
                    inBodega="BOD_STAPCF_";
                }else if(cboId==7)
                {
                    lbl_bodega.setText("Revision Fisica");
                    inBodega="BOD_REVFISICA_";
                }else if(cboId==8)
                {
                    lbl_bodega.setText("Post Revision");
                    inBodega="BOD_POSTREV_";
                }else if(cboId==9)
                {
                    lbl_bodega.setText("Liquidacion");
                    inBodega="BOD_LIQ_";
                }else if(cboId==10){
                    lbl_bodega.setText("Recepción");
                    inBodega="BOD_RECEPCION_";
                }   break;
            case 1:
                if(cboId==1)
                {
                    lbl_bodega.setText("Internacional");
                    inBodega="BOD_INTERNACIONAL_";
                }else if(cboId==2){
                    lbl_bodega.setText("STA Internacional");
                    inBodega="BOD_STAINTER_";
                }else if (cboId==3)
                {
                    lbl_bodega.setText("Revision Fisica");
                    inBodega="BOD_REVFISICA_";
                }else if(cboId==4)
                {
                    lbl_bodega.setText("Post Revision");
                    inBodega="BOD_POSTREV_";
                }else if(cboId==5)
                {
                    lbl_bodega.setText("Liquidacion");
                    inBodega="BOD_LIQ_";
                }     break;
            case 2:
                if(cboId==1)
                {
                    lbl_bodega.setText("ADM Nacional");
                    inBodega="BOD_ADM_";
                }else if(cboId==2)
                {
                    lbl_bodega.setText("STA Nacional");
                    inBodega="BOD_STANAC_";
                }     break;
            case 3:
                lbl_bodega.setText("STA PCF");
                inBodega="BOD_STAPCF_";
                break;
            case 4:
                lbl_bodega.setText("C.Calidad");
                inBodega="BOD_CCALIDAD_";
                break;
            case 5:
                lbl_bodega.setText("Recepción");
                inBodega="BOD_RECEPCION_";
                break;
            case 6:
                lbl_bodega.setText("RMA Express");
                inBodega="BOD_EXPRESS_";
                break;
            default:
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        txt_serie = new javax.swing.JTextField();
        btn_consultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_producto = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_consultar1 = new javax.swing.JButton();
        lbl_bodega = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_serie.setPreferredSize(null);
        txt_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_serieActionPerformed(evt);
            }
        });

        btn_consultar.setText("Ingresar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Eliminar producto");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        txta_producto.setEditable(false);
        txta_producto.setBackground(new java.awt.Color(240, 240, 240));
        txta_producto.setColumns(20);
        txta_producto.setRows(5);
        txta_producto.setTabSize(3);
        txta_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txta_producto);

        jLabel14.setText("Serie");

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_consultar1.setText("Masivo");
        btn_consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar1ActionPerformed(evt);
            }
        });

        lbl_bodega.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbl_bodega.setText("Bodega");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(6, 6, 6)
                            .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_consultar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lbl_bodega)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_consultar, btn_eliminar, btn_limpiar, btn_volver});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(lbl_bodega)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_consultar, btn_eliminar, btn_limpiar, btn_volver});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        String serie=txt_serie.getText();
        System.out.println(serie);
        if(consulta(serie))
        {
            txt_serie.disable();
            txt_serie.updateUI();
        }
            else{
            JOptionPane.showMessageDialog(null, "No se encontró Serie","",2); 
            txt_serie.requestFocus();
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
            MenuPrincipal m = new MenuPrincipal();
            this.setVisible(false);
            m.setVisible(true);
         
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_serieActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        if(txta_producto.getText().length()>0)
        {
            String serie=txt_serie.getText().toString();
            eliminar(serie);
            JOptionPane.showMessageDialog(null, "Producto Serie: "+serie+" eliminado de stock ","",1); 
            txt_serie.setText("");
            txt_serie.setEnabled(true);
            txta_producto.setText("");
            txt_serie.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una serie en stock  para continuar","",2);   
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_serie.setText("");
        txta_producto.setText("");
        txt_serie.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar1ActionPerformed
        agregaMasivo();
    }//GEN-LAST:event_btn_consultar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarProductoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProductoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProductoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProductoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarProductoGeneral().setVisible(true);
            }
        });
        
        
    }
    
    
    public void agregaMasivo()
    {
        String cadena = txt_serie.getText().toString();
        String [] split;
        split=cadena.split(",");
        int largo= split.length;
        System.out.println(""+largo);
      
        for (int i = 0; i < largo; i++) {
            String ficha =split[i];
            consultaFicha(ficha);
        }
    }
    public boolean consulta (String serie)
    {
        
        try {
            
            String aid=null;
            String familia=null;
            String marca=null;
            String ficha=null;
            String nombre=null;
            String cprom=null;
            String status=null;
            String ubicacion=null;
            
            conectar = Controlador.Conexion.obtener();
            String sql= "SELECT * FROM "+inBodega+mes+"_"+año+" WHERE SERIE=?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,txt_serie.getText());
            rs=pst.executeQuery();
            
            if(rs.next())
                
            aid=rs.getString("CODIGO");
            familia=rs.getString("FAMILIA");
            marca=rs.getString("MARCA");
            ficha=rs.getString("FICHA");
            nombre=rs.getString("NOMBRE");
            cprom=rs.getString("COSTO_PROMEDIO");
            status=rs.getString("ESTATUS");
            ubicacion=rs.getString("UBICACIÓN");
            txta_producto.setLineWrap(true);
            txta_producto.setText("Serie: " + serie +"\nID: "+aid+"\nNombre: "+nombre+"\nMarca: "+marca+"\nFicha: "+ficha+"\nUbicación: "+ubicacion);     
            System.out.println(aid);
            return true;  
        } catch (Exception e) {
            
           
        }
        return false;
        
       
    }
    
    public boolean consultaFicha (String ficha)
    {
        
        try {
            
            String aid=null;
            String familia=null;
            String marca=null;
            String serie=null;
            String nombre=null;
            String cprom=null;
            String status=null;
            String ubicacion=null;
            
            conectar = Controlador.Conexion.obtener();
            String sql= "SELECT * FROM "+inBodega+mes+"_"+año+" WHERE FICHA=?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,ficha);
            rs=pst.executeQuery();
            
            if(rs.next())   
            aid=rs.getString("CODIGO");
            familia=rs.getString("FAMILIA");
            marca=rs.getString("MARCA");
            serie=rs.getString("SERIE");
            nombre=rs.getString("NOMBRE");
            cprom=rs.getString("COSTO_PROMEDIO");
            status=rs.getString("ESTATUS");
            ubicacion=rs.getString("UBICACIÓN");           
            txta_producto.setLineWrap(true);
            txta_producto.setText("Serie: " + serie +"\nID: "+aid+"\nNombre: "+nombre+"\nMarca: "+marca+"\nFicha: "+ficha+"\nUbicación: "+ubicacion);
            System.out.println(aid);
            return true;  
        } catch (Exception e) {
            
        }
        return false;
        
    }
    
      public boolean eliminar(String serie)
        {
           
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "DELETE FROM "+inBodega+mes+"_"+año+" WHERE SERIE =?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,(txt_serie.getText().toString()));
    
            if (pst.executeUpdate()>0) {
                
             return true;
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
        }
        public void cargarIcono()
    {
        java.awt.Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/pcicon.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_consultar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextArea txta_producto;
    // End of variables declaration//GEN-END:variables
}
