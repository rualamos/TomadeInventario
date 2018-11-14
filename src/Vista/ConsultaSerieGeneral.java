
package Vista;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultaSerieGeneral extends javax.swing.JFrame {

    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int bodega =Controlador.validaLogin.bodega;
    int tipoUsu =Controlador.validaLogin.tipouser;
    int año=Controlador.validaLogin.año  ;
    int mes=Controlador.validaLogin.mes ;
    int dia=Controlador.validaLogin.dia;
    String inBodega=null;
    int cboId=Vista.MenuPrincipal.cboID;
    
    public ConsultaSerieGeneral() {
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
        btn_consultar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_bodega = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_familia = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txt_serie = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_consultar.setText("Buscar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Consulta serie stock");

        lbl_bodega.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbl_bodega.setText("Bodega");

        txta_familia.setEditable(false);
        txta_familia.setBackground(new java.awt.Color(240, 240, 240));
        txta_familia.setColumns(20);
        txta_familia.setRows(5);
        txta_familia.setTabSize(3);
        txta_familia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txta_familia);

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel14.setText("Serie");

        txt_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_serieActionPerformed(evt);
            }
        });
        txt_serie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_serieKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_bodega)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bodega)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        String serie=txt_serie.getText().toString();
        System.out.println(serie);
        if(consulta(serie));
        else{
            JOptionPane.showMessageDialog(null, "No se encontró Serie","",2);
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void txt_serieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_serieKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String serie=txt_serie.getText().toString();
            System.out.println(serie);
            if(consulta(serie));
            else{
                JOptionPane.showMessageDialog(null, "No se encontró Serie","",2);
            }
        }
    }//GEN-LAST:event_txt_serieKeyPressed

    private void txt_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_serieActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaSerieGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaSerieGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaSerieGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaSerieGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSerieGeneral().setVisible(true);
            }
        });
        
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
            pst.setString(1,txt_serie.getText().toString());
            rs=pst.executeQuery();
            if(rs.next())
                
            aid=rs.getString("CODIGO");
            familia=rs.getString("FAMILIA");
            marca=rs.getString("MARCA");
            ficha=rs.getString("FICHA");
            nombre=rs.getString("NOMBRE");
            cprom=rs.getString("COSTO_PROMEDIO");
            status=rs.getString("ESTADO");
            ubicacion=rs.getString("UBICACIÓN");
            
          
            txta_familia.setLineWrap(true);
       
            
            txta_familia.setText("ID: "+aid+"\n"+
                                "Familia: "+familia+"\n"+
                                "Marca: "+marca+"\n"+
                                "Descripción: "+nombre+"\n"+
                                "Ficha: "+ficha+"\n"+
                                "Estado ficha: "+status+"\n"+
                                "Costo Promedio: $"+cprom+"\n"+
                                "Ubicacion: "+ubicacion);
          
            
            
            System.out.println(familia);
            return true;  
        } catch (Exception e) {
            
           
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
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextArea txta_familia;
    // End of variables declaration//GEN-END:variables
}
