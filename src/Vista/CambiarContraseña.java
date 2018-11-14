package Vista;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class CambiarContraseña extends javax.swing.JFrame {

    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static int cboId=Vista.MenuPrincipal.cboID;
   
 public CambiarContraseña() {
        initComponents();
        LimpiarCombo(); LlenarCombo();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_cambiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        cbo_usuario = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        psw_antigua = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        psw_nueva1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        psw_nueva2 = new javax.swing.JPasswordField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Usuario");

        btn_cambiar.setText("Cambiar");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Cambiar contraseña");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña antigua");

        jLabel8.setText("Contraseña nueva");

        jLabel9.setText("Reitere contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_usuario, javax.swing.GroupLayout.Alignment.TRAILING, 0, 191, Short.MAX_VALUE)
                            .addComponent(psw_antigua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(psw_nueva1)
                            .addComponent(psw_nueva2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psw_antigua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psw_nueva1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psw_nueva2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
     if(cbo_usuario.getSelectedIndex()==0){
         JOptionPane.showMessageDialog(null, "Seleccione un usuario","",2);
         cbo_usuario.requestFocus();
     }else if(psw_antigua.getText().length()==0){
       JOptionPane.showMessageDialog(null, "Ingrese contraseña antigua \nde usuario "+cbo_usuario.getSelectedItem().toString(),"",2);
       psw_antigua.requestFocus();
     }else if(psw_nueva1.getText().length()==0){
       JOptionPane.showMessageDialog(null, "Ingrese nueva contraseña \nde usuario "+cbo_usuario.getSelectedItem().toString(),"",2);
       psw_nueva1.requestFocus();
     }else if (psw_nueva2.getText().length()==0){
      JOptionPane.showMessageDialog(null, "Reitere nueva contraseña \nde usuario "+cbo_usuario.getSelectedItem().toString(),"",2);
      psw_nueva2.requestFocus();   
     }else if(psw_nueva1.getText().toString().equals(psw_nueva2.getText().toString()))
     {
      int confirmar =JOptionPane.showConfirmDialog(null,"Desea cambiar password \ndel usuario "+cbo_usuario.getSelectedItem().toString()+ "?","",0);
      if (JOptionPane.OK_OPTION == confirmar){                    
           if(Cambiar())
           {
               JOptionPane.showMessageDialog(null,"Password del usuario  "+cbo_usuario.getSelectedItem().toString()+" \ncambiado exitosamente","",1);
               cbo_usuario.setSelectedIndex(0);
               psw_antigua.setText("");
               psw_nueva1.setText("");
               psw_nueva2.setText("");
               cbo_usuario.requestFocus();
           }
     }  
     }else{
          JOptionPane.showMessageDialog(null,"Password nuevo no coincide","",2);
          psw_nueva1.setText("");
          psw_nueva2.setText("");
          psw_nueva1.requestFocus();
     }
    }//GEN-LAST:event_btn_cambiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
      MenuPrincipal m = new MenuPrincipal();
            this.setVisible(false);
            m.setVisible(true);
            Vista.MenuPrincipal.cboID=0;
           
    }//GEN-LAST:event_btn_volverActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContraseña().setVisible(true);
            }
        });
        
        
    }
    
    public boolean Cambiar()
    {
        
        
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "UPDATE USUARIO SET PASS=? WHERE USER=? AND PASS=?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,(psw_nueva2.getText().toString()));
            pst.setString(2,(cbo_usuario.getSelectedItem().toString()));
            pst.setString(3,(psw_antigua.getText().toString()));
            
            if (pst.executeUpdate()==1) {
      
                return true;
            }else{
                 JOptionPane.showMessageDialog(null,"No fue posible cambiar contraseña","",2);
                 psw_antigua.setText("");
                 psw_nueva1.setText("");
                 psw_nueva2.setText("");
                 psw_antigua.requestFocus();
                 return false;
                 
            }
        } catch (Exception e) {
            
        }
        return false;
    }
   
      public void LimpiarCombo()
    {
    int contador =cbo_usuario.getItemCount();
    for (int i = 0; i < contador; i++) {
        cbo_usuario.remove(0);
    }   
}
    
      public void LlenarCombo()
    {
        LimpiarCombo();
        try {
          conectar = Controlador.Conexion.obtener();
        
          String sql ="SELECT USER FROM USUARIO ";
          pst = conectar.prepareStatement(sql);
          rs = pst.executeQuery();
          cbo_usuario.addItem("Seleccione...");
          
            while (rs.next()) {
               cbo_usuario.addItem(rs.getString(1));
                
            }
        } catch (Exception e) {
        }    
    }
        public void cargarIcono()
    {
        java.awt.Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/pcicon.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
        
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox cbo_usuario;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPasswordField psw_antigua;
    private javax.swing.JPasswordField psw_nueva1;
    private javax.swing.JPasswordField psw_nueva2;
    // End of variables declaration//GEN-END:variables
}
