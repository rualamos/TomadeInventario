
package Vista;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class CrearUsuario extends javax.swing.JFrame {

    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int cboId=Vista.MenuPrincipal.cboID;
 
    public CrearUsuario() {
        initComponents();
        LimpiarCombo();LlenarCombo(); LimpiarCombo2();LlenarCombo2();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        cbo_tipoUsuario = new javax.swing.JComboBox();
        psw_pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        psw_pass2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        cbo_bodega = new javax.swing.JComboBox();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Usuario");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Tipo de usuario");

        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Crear un nuevo usuario");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel7.setText("Repita contraseña");

        jLabel8.setText("Bodega");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(psw_pass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(psw_pass2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_tipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE))
                                .addGap(2, 2, 2))
                            .addComponent(cbo_bodega, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbo_tipoUsuario, psw_pass, psw_pass2, txt_apellido, txt_nombre, txt_usuario});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psw_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psw_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbo_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
     
        String user;
        String pass = null;
        String nombre;
        String apellido;
        int tipouser;
        int bodega;
        
          if(txt_nombre.getText().length()>0)
          {
                nombre = txt_nombre.getText();
          }else{
            nombre=null;
        }
        
         if(txt_apellido.getText().length()>0)
        apellido = txt_apellido.getText();
        else
        {
            apellido=null;
        }
         
          if(txt_usuario.getText().length()>0)
        user = txt_usuario.getText();
        else
        {
            user=null;
        }
            
        if(psw_pass.getText().equals(psw_pass2.getText().toString()))
        {  
        if(psw_pass.getText().length()>0 )
        pass = psw_pass.getText();
        else
        {
            pass=null;
        }
        }else{
         JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden","",2);
         psw_pass.setText("");
         psw_pass2.setText("");
         psw_pass.requestFocus();
        }
         
        if(cbo_tipoUsuario.getSelectedIndex()>0)
        tipouser = cbo_tipoUsuario.getSelectedIndex()-1;
        else
        {
            tipouser=-1;

        }
         if(cbo_bodega.getSelectedIndex()>0)
        bodega = cbo_bodega.getSelectedIndex()-1;
        else
        {
            bodega=-1;

        }
     
   
           if(nombre==null)
           {
               JOptionPane.showMessageDialog(null, "Ingrese un nombre","",2); 
               txt_nombre.requestFocus();
           }else if(apellido==null){
               JOptionPane.showMessageDialog(null, "Ingrese un apellido","",2); 
               txt_apellido.requestFocus();
           }else if(user==null){
               JOptionPane.showMessageDialog(null, "Ingrese un usuario","",2); 
               txt_usuario.requestFocus();
           }else if(pass==null)
           {
               JOptionPane.showMessageDialog(null, "Ingrese una contraseña","",2); 
               psw_pass.requestFocus();
           }
            
           else if(cbo_tipoUsuario.getSelectedIndex()==0)
           {
               JOptionPane.showMessageDialog(null, "Seleccione un tipo de usuario","",2); 
               cbo_tipoUsuario.requestFocus();
           }  else if(cbo_bodega.getSelectedIndex()==0)
           {
               JOptionPane.showMessageDialog(null, "Seleccione una bodega","",2); 
               cbo_tipoUsuario.requestFocus();
           }
           
           else
           {
               if(Controlador.crudUser.registrar(user, pass, nombre, apellido, tipouser, bodega))
        {
           JOptionPane.showMessageDialog(null, "Usuario "+ user + "  registrado exitosamente", "",1); 
           txt_nombre.setText("");
           txt_apellido.setText("");
           txt_usuario.setText("");
           psw_pass.setText("");
           psw_pass2.setText("");
           cbo_tipoUsuario.setSelectedIndex(0);
           cbo_bodega.setSelectedIndex(0);
           txt_nombre.requestFocus();
           
        }else
        {
            JOptionPane.showMessageDialog(null, "No se pudo crear un usuario nuevo (Usuario no debe existir previamente)","Error btn_crear",0);
        }    
           }
           
    }//GEN-LAST:event_btn_crearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
        
        
    }
    
      public void LimpiarCombo()
    {
    int contador =cbo_tipoUsuario.getItemCount();
    for (int i = 0; i < contador; i++) {
        cbo_tipoUsuario.remove(0);
    }    
}
     
     
      public void LlenarCombo()
    {
        LimpiarCombo();
        try {
          conectar = Controlador.Conexion.obtener();
        
          String sql ="SELECT DESCRIPCION FROM TIPOUSUARIO ";
          pst = conectar.prepareStatement(sql);
          rs = pst.executeQuery();
          cbo_tipoUsuario.addItem("Seleccione...");
          
            while (rs.next()) {
               cbo_tipoUsuario.addItem(rs.getString(1));
                
            }
        } catch (Exception e) {
        }     
    }
      
       public void LimpiarCombo2()
    {
    int contador =cbo_bodega.getItemCount();
    for (int i = 0; i < contador; i++) {
        cbo_bodega.remove(0);
    }   
    
    
}
      
       public void LlenarCombo2()
    {
        LimpiarCombo2();
        try {
          conectar = Controlador.Conexion.obtener();
          String sql ="SELECT DESCRIPCION FROM BODEGA ";
          pst = conectar.prepareStatement(sql);
          rs = pst.executeQuery();
          cbo_bodega.addItem("Seleccione...");
          
            while (rs.next()) {
               cbo_bodega.addItem(rs.getString(1));
                
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
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox cbo_bodega;
    private javax.swing.JComboBox cbo_tipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPasswordField psw_pass;
    private javax.swing.JPasswordField psw_pass2;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
