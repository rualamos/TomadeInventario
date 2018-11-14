
package Vista;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ModificarBodega extends javax.swing.JFrame {

    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int cboId=Vista.MenuPrincipal.cboID;
    
    public ModificarBodega() {
        initComponents();
        LimpiarCombo();LlenarCombo();LimpiarCombo2();LlenarCombo2();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        cbo_bodega.setEnabled(false);
        txta_bodega.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbo_usuario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_bodega = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_cambiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        cbo_bodega = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Modificar bodega");

        jLabel1.setText("Seleccione usuario");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txta_bodega.setColumns(20);
        txta_bodega.setRows(5);
        jScrollPane1.setViewportView(txta_bodega);

        jLabel2.setText("Nueva bodega");

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_cambiar.setText("Cambiar");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Bodega actual:");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
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
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(cbo_bodega, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                    .addComponent(btn_cambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cbo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(cbo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
       if(cbo_usuario.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(null, "Seleccione un usuario","",2);
       }
       if(cbo_usuario.getSelectedIndex()>0)
       {
          String user = cbo_usuario.getSelectedItem().toString();
          consulta(user);
       }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
        int bodega= cbo_bodega.getSelectedIndex()-1;
        String user = cbo_usuario.getSelectedItem().toString();
        
        if(txta_bodega.getText().length()>0)
        {
            actualizar(bodega, user);
            JOptionPane.showMessageDialog(null, "Usuario "+user+"\n movido a bodega "+ cbo_bodega.getSelectedItem().toString(),"",2);
            cbo_usuario.setEnabled(true);
            cbo_usuario.setSelectedIndex(0);
            txta_bodega.setText("");
            cbo_bodega.setEnabled(false);
            cbo_bodega.setSelectedIndex(0);
       }else{
             JOptionPane.showMessageDialog(null, "No se pudo modificar bodega","",0);
        }
    }//GEN-LAST:event_btn_cambiarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        cbo_usuario.setEnabled(true);
        cbo_usuario.setSelectedIndex(0);
        txta_bodega.setText("");
        cbo_bodega.setEnabled(false);
        cbo_bodega.setSelectedIndex(0);
        cbo_usuario.requestFocus();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        MenuPrincipal m = new MenuPrincipal();
            this.setVisible(false);
            m.setVisible(true);
           
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
            java.util.logging.Logger.getLogger(ModificarBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarBodega().setVisible(true);
            }
        });
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
      
       public void LimpiarCombo2()
    {
        try {
              int contador =cbo_bodega.getItemCount();
    for (int i = 0; i < contador; i++) {
        cbo_bodega.remove(0);
    }   
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
  
}
       public void LlenarCombo2()
    {
        LimpiarCombo2();
        try {
          conectar = Controlador.Conexion.obtener();
        
          String sql ="SELECT DESCRIPCION FROM BODEGA";
          pst = conectar.prepareStatement(sql);
          rs = pst.executeQuery();
          cbo_bodega.addItem("Seleccione...");
          
            while (rs.next()) {
               cbo_bodega.addItem(rs.getString(1));
                
            }
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
        }    
    }
      
      
      
        public boolean actualizar(int bodega , String user)
        {
        try {
            conectar = Controlador.Conexion.obtener();
            String sql= "UPDATE USUARIO SET ID_BODEGA=? WHERE USER =?";
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,bodega);
            pst.setString(2,user);
    
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
          
           public boolean consulta (String usuario)
    {
        
        try {
            int bodega=1;
            int tipouser=1;
            conectar = Controlador.Conexion.obtener();
            String sql= "SELECT * FROM USUARIO WHERE USER=?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,cbo_usuario.getSelectedItem().toString());
            rs=pst.executeQuery();
            
            if(rs.next())
            {
            bodega=rs.getInt("ID_BODEGA");
            tipouser=rs.getInt("ID_TIPOUSUARIO");
                
            if(tipouser==0)
            {
                JOptionPane.showMessageDialog(null, "El usuario es un administrador,\n imposible modificar","",2);
                cbo_usuario.setSelectedIndex(0);
                cbo_usuario.requestFocus();
                return false;
            }else{
                
            if(bodega==0)
            {
             txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega: Todas " );       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();
            }else if(bodega==1)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega: Internacional,STA Inter,RF,PR,Liq");       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }else if(bodega==2)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega:ADM,STA Nacional " );       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }else if(bodega==3)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega:STA PCF" );       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }else if(bodega==4)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Control de calidad");       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }else if(bodega==5)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega:Recepcion");       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }else if(bodega==6)
            {
            txta_bodega.setLineWrap(true);
            txta_bodega.setText("Bodega:RMA Express");       
            cbo_bodega.setEnabled(true); 
            cbo_usuario.setEnabled(false);
            cbo_usuario.updateUI();  
            }
            return true;   
            }
          
            }
           
        } catch (Exception e) {    
             JOptionPane.showMessageDialog(null,e,"",2); 
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox cbo_bodega;
    private javax.swing.JComboBox cbo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txta_bodega;
    // End of variables declaration//GEN-END:variables
}
