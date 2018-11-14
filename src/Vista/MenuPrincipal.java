
package Vista;

import Vista.Consultaid;
import Vista.EliminarUsuario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class MenuPrincipal extends javax.swing.JFrame {

int bodega =Controlador.validaLogin.bodega;
public static int cboID=0;

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        txt_fecha.setText(Controlador.validaLogin.fecha);
        cbo_bodega.setEnabled(false);cbo_bodega.setVisible(false);
        
        
        //Validar tipoUs
        if(Controlador.validaLogin.tipouser==3)
        {
            btn_crearusuario.setEnabled(false);
            btn_eliminaruser.setEnabled(false);
            btn_eliminarstock.setEnabled(false);
            btn_cambiarubicacion.setEnabled(false);
            btn_cambiaid.setEnabled(false);
            btn_modificarBodega.setEnabled(false);
            btn_cambiarPass.setEnabled(false);
        }
        
        if(Controlador.validaLogin.tipouser==2)
        {
            btn_crearusuario.setEnabled(false);
            btn_eliminaruser.setEnabled(false); 
        }
        
        
    //Validar Bodega
    switch (bodega) {
        case 0:
            lbl_bodega.setText("");
            lbl_bodega.setVisible(false);
            cbo_bodega.setEnabled(true);
            cbo_bodega.setVisible(true);
            cbo_bodega.addItem("ADM Nacional"); //1
            cbo_bodega.addItem("Internacional");//2
            cbo_bodega.addItem("RMA STA Internacional");//3
            cbo_bodega.addItem("RMA Express");//4
            cbo_bodega.addItem("Control de calidad");//5
            cbo_bodega.addItem("STA PCF");//6
            cbo_bodega.addItem("Revision Fisica");//7
            cbo_bodega.addItem("Post Revision");//8
            cbo_bodega.addItem("Liquidacion");//9
            cbo_bodega.addItem("Recepcion");//10
            break;
        case 1:
            lbl_bodega.setText("");
            lbl_bodega.setVisible(false);
            cbo_bodega.setEnabled(true);
            cbo_bodega.setVisible(true);
            cbo_bodega.addItem("Internacional");//1
            cbo_bodega.addItem("RMA STA Internacional");//2
            cbo_bodega.addItem("Revision Fisica");//3
            cbo_bodega.addItem("Post Revision");//4
            cbo_bodega.addItem("Liquidacion");//5
            break;
        case 2:
            lbl_bodega.setText("");
            lbl_bodega.setVisible(false);
            cbo_bodega.setEnabled(true);
            cbo_bodega.setVisible(true);
            cbo_bodega.addItem("ADM Nacional"); //1
            cbo_bodega.addItem("RMA STA Nacional"); //2
            break;
        case 3:
            lbl_bodega.setText("STA PCF");
            break;
        case 4:
            lbl_bodega.setText("Control de calidad");
            break;
        case 5:
            lbl_bodega.setText("Recepción");
            break;
        case 6:
            lbl_bodega.setText("RMA Express");
            break;
        default:
            break;
    }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel1 = new javax.swing.JPanel();
        btn_crearusuario = new javax.swing.JButton();
        btn_eliminaruser = new javax.swing.JButton();
        btn_consultaid = new javax.swing.JButton();
        btn_consultastock = new javax.swing.JButton();
        btn_eliminarstock = new javax.swing.JButton();
        btn_cambiarubicacion = new javax.swing.JButton();
        btn_tomainventario = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_lp = new javax.swing.JButton();
        cbo_bodega = new javax.swing.JComboBox<>();
        btn_cambiarPass = new javax.swing.JButton();
        btn_modificarBodega = new javax.swing.JButton();
        btn_cambiaid = new javax.swing.JButton();
        txt_fecha = new javax.swing.JLabel();
        lbl_bodega = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_crearusuario.setText("Crear Usuario");
        btn_crearusuario.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_crearusuario.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_crearusuario.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_crearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearusuarioActionPerformed(evt);
            }
        });

        btn_eliminaruser.setText("Eliminar Usuario");
        btn_eliminaruser.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_eliminaruser.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_eliminaruser.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_eliminaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaruserActionPerformed(evt);
            }
        });

        btn_consultaid.setText("Consulta ID");
        btn_consultaid.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_consultaid.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_consultaid.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_consultaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaidActionPerformed(evt);
            }
        });

        btn_consultastock.setText("Consulta Stock");
        btn_consultastock.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_consultastock.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_consultastock.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_consultastock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultastockActionPerformed(evt);
            }
        });

        btn_eliminarstock.setText("Eliminar de stock");
        btn_eliminarstock.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_eliminarstock.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_eliminarstock.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_eliminarstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarstockActionPerformed(evt);
            }
        });

        btn_cambiarubicacion.setText("Cambiar ubicación");
        btn_cambiarubicacion.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_cambiarubicacion.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_cambiarubicacion.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_cambiarubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarubicacionActionPerformed(evt);
            }
        });

        btn_tomainventario.setText("Toma de Inventario");
        btn_tomainventario.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_tomainventario.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_tomainventario.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_tomainventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tomainventarioActionPerformed(evt);
            }
        });

        btn_reportes.setText("Reporte de Bodega");
        btn_reportes.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_reportes.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_reportes.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        jLabel2.setText("Bodega:");

        btn_lp.setText("Lista de Precios");
        btn_lp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lpActionPerformed(evt);
            }
        });

        cbo_bodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cbo_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_bodegaActionPerformed(evt);
            }
        });

        btn_cambiarPass.setText("Cambiar contraseña");
        btn_cambiarPass.setMaximumSize(new java.awt.Dimension(190, 25));
        btn_cambiarPass.setMinimumSize(new java.awt.Dimension(190, 25));
        btn_cambiarPass.setPreferredSize(new java.awt.Dimension(190, 25));
        btn_cambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarPassActionPerformed(evt);
            }
        });

        btn_modificarBodega.setText("Modificar Bodega");
        btn_modificarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarBodegaActionPerformed(evt);
            }
        });

        btn_cambiaid.setText("Cambiar ID Ficha Stock");
        btn_cambiaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiaidActionPerformed(evt);
            }
        });

        txt_fecha.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(102, 102, 102));
        txt_fecha.setText("11/11/1111");

        lbl_bodega.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbl_bodega.setText("Bodega");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_bodega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_fecha)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_crearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_tomainventario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_eliminaruser, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addGap(24, 24, 24)
                                    .addComponent(btn_consultastock, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_modificarBodega, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cambiarubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_cambiaid, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addGap(24, 24, 24)
                                    .addComponent(btn_lp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_consultaid, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(btn_cambiarPass, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_eliminarstock, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cambiaid, btn_cambiarPass, btn_cambiarubicacion, btn_consultaid, btn_consultastock, btn_eliminarstock, btn_eliminaruser, btn_lp, btn_modificarBodega, btn_reportes, btn_tomainventario});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_bodega)
                    .addComponent(txt_fecha))
                .addGap(18, 18, 18)
                .addComponent(cbo_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tomainventario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultastock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificarBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cambiarubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cambiarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarstock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultaid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cambiaid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
       {
           if(cbo_bodega.isEnabled())
           {
               if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               ReportesGeneral tig =new ReportesGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
      }
           }
          
       
           if(!cbo_bodega.isEnabled())
      {
        ReportesGeneral tig =new ReportesGeneral();
               this.setVisible(false);
               tig.setVisible(true); 
      }
       
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_tomainventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tomainventarioActionPerformed
     
      if(cbo_bodega.isEnabled())
      {
          if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               TomaInventarioGeneral tig =new TomaInventarioGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
          
          
      }
      
      if(!cbo_bodega.isEnabled())
      {
        TomaInventarioGeneral tig =new TomaInventarioGeneral();
        this.setVisible(false);
         tig.setVisible(true);  
      }
         
    }//GEN-LAST:event_btn_tomainventarioActionPerformed

    private void btn_cambiarubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarubicacionActionPerformed
  if(cbo_bodega.isEnabled())
      {
          if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               ModificarUbicacionGeneral tig =new ModificarUbicacionGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
      }
  
   if(!cbo_bodega.isEnabled())
      {
               ModificarUbicacionGeneral tig =new ModificarUbicacionGeneral();
               this.setVisible(false);
               tig.setVisible(true); 
      }
    }//GEN-LAST:event_btn_cambiarubicacionActionPerformed

    private void btn_eliminarstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarstockActionPerformed
        {
          
          if(cbo_bodega.isEnabled())  
          {
              if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               EliminarProductoGeneral tig =new EliminarProductoGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
      }
          }
          
        
        if(!cbo_bodega.isEnabled())
      {
               EliminarProductoGeneral tig =new EliminarProductoGeneral();
               this.setVisible(false);
               tig.setVisible(true);
      }
    }//GEN-LAST:event_btn_eliminarstockActionPerformed

    private void btn_consultastockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultastockActionPerformed
        if(cbo_bodega.isEnabled())
      {
          if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               ConsultaSerieGeneral tig =new ConsultaSerieGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
      }
        
           if(!cbo_bodega.isEnabled())
      {
        ConsultaSerieGeneral tig =new ConsultaSerieGeneral();
               this.setVisible(false);
               tig.setVisible(true);  
      }
    }//GEN-LAST:event_btn_consultastockActionPerformed
    

    private void btn_consultaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaidActionPerformed
        Consultaid ci = new Consultaid();
        this.setVisible(false);
        ci.setVisible(true);
    }//GEN-LAST:event_btn_consultaidActionPerformed

    private void btn_eliminaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaruserActionPerformed
        
        EliminarUsuario eu = new EliminarUsuario();
        this.setVisible(false);
        eu.setVisible(true);
    }//GEN-LAST:event_btn_eliminaruserActionPerformed

    private void btn_crearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearusuarioActionPerformed
        Vista.CrearUsuario cu = new Vista.CrearUsuario();
        this.setVisible(false);
        cu.setVisible(true);
    }//GEN-LAST:event_btn_crearusuarioActionPerformed

    private void btn_cambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarPassActionPerformed
        Vista.CambiarContraseña cc= new Vista.CambiarContraseña();
        this.setVisible(false);
        cc.setVisible(true);
    }//GEN-LAST:event_btn_cambiarPassActionPerformed

    private void btn_modificarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarBodegaActionPerformed
        Vista.ModificarBodega mb= new Vista.ModificarBodega();
        this.setVisible(false);
        mb.setVisible(true);
    }//GEN-LAST:event_btn_modificarBodegaActionPerformed

    private void btn_cambiaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiaidActionPerformed
         if(cbo_bodega.isEnabled())
      {
          if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
              Vista.CambiarId cid= new Vista.CambiarId(); 
               this.setVisible(false);
               cid.setVisible(true);
          }
      }
        
           if(!cbo_bodega.isEnabled())
      {
                Vista.CambiarId cid= new Vista.CambiarId(); 
               this.setVisible(false);
               cid.setVisible(true);  
      }
    }//GEN-LAST:event_btn_cambiaidActionPerformed

    private void btn_lpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lpActionPerformed
       {
         if(cbo_bodega.isEnabled())
         {
              if(cbo_bodega.getSelectedIndex()==0)
          {
              JOptionPane.showMessageDialog(null, "Seleccione una bodega","",0);
              cbo_bodega.requestFocus();
          }else{
              cboID=cbo_bodega.getSelectedIndex();
               LpGeneral tig =new LpGeneral();
               this.setVisible(false);
               tig.setVisible(true);
          }
      }
         }
        
       
        if(!cbo_bodega.isEnabled())
      {
            LpGeneral tig =new LpGeneral();
               this.setVisible(false);
               tig.setVisible(true); 
      }
    }//GEN-LAST:event_btn_lpActionPerformed

    private void cbo_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_bodegaActionPerformed

    }//GEN-LAST:event_cbo_bodegaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
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
    private javax.swing.JButton btn_cambiaid;
    private javax.swing.JButton btn_cambiarPass;
    private javax.swing.JButton btn_cambiarubicacion;
    private javax.swing.JButton btn_consultaid;
    private javax.swing.JButton btn_consultastock;
    private javax.swing.JButton btn_crearusuario;
    private javax.swing.JButton btn_eliminarstock;
    private javax.swing.JButton btn_eliminaruser;
    private javax.swing.JButton btn_lp;
    private javax.swing.JButton btn_modificarBodega;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JButton btn_tomainventario;
    private javax.swing.JComboBox<String> cbo_bodega;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JLabel txt_fecha;
    // End of variables declaration//GEN-END:variables
}
