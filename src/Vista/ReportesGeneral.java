
package Vista;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportesGeneral extends javax.swing.JFrame {

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
    
    public ReportesGeneral() {
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

        jcal_mes = new com.toedter.calendar.JMonthChooser();
        jcal_año = new com.toedter.calendar.JYearChooser();
        jLabel6 = new javax.swing.JLabel();
        lbl_bodega = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_descarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Reportes");

        lbl_bodega.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbl_bodega.setText("Bodega");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_descarga.setText("Descarga");
        btn_descarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcal_mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_descarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jcal_año, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_bodega)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_bodega))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcal_año, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcal_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_descarga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        this.setVisible(false);
        m.setVisible(true);
       
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_descargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descargaActionPerformed
       
       año=jcal_año.getYear();
       mes=jcal_mes.getMonth()+1;
       Controlador.apiExcel ae = new Controlador.apiExcel();
       ae.descargaXlsx_General(mes, año, inBodega);
      
       
    }//GEN-LAST:event_btn_descargaActionPerformed


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
            java.util.logging.Logger.getLogger(ReportesGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesGeneral().setVisible(true);
            }
        });
    }

    public void cargarIcono()
    {
        java.awt.Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/pcicon.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_descarga;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JYearChooser jcal_año;
    private com.toedter.calendar.JMonthChooser jcal_mes;
    private javax.swing.JLabel lbl_bodega;
    // End of variables declaration//GEN-END:variables
}
