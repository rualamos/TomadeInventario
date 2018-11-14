package Vista;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CambiarId extends javax.swing.JFrame {

 int bodega =Controlador.validaLogin.bodega;
    int tipoUsu =Controlador.validaLogin.tipouser;
    int año=Controlador.validaLogin.año  ;
    int mes=Controlador.validaLogin.mes ;
    int dia=Controlador.validaLogin.dia;
    private String outCodigo,outFamilia,outMarca,outNombre,outCosto=null;
    String lpBodega,inBodega=null;
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String userName=Controlador.validaLogin.recuperarUsuario();
    int cboId=Vista.MenuPrincipal.cboID;

    public CambiarId() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        txt_id.setEnabled(false);btn_consultarId.setEnabled(false);
        txta_ficha.setEditable(false); txta_id.setEditable(false);
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ficha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_ficha = new javax.swing.JTextArea();
        btn_consultarFicha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_consultarId = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_id = new javax.swing.JTextArea();
        lbl_bodega = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_cambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setText("Cambiar ID Ficha");

        jLabel2.setText("Ficha");

        txta_ficha.setColumns(20);
        txta_ficha.setRows(5);
        jScrollPane1.setViewportView(txta_ficha);

        btn_consultarFicha.setText("Ingresar");
        btn_consultarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarFichaActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        btn_consultarId.setText("Consultar");
        btn_consultarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarIdActionPerformed(evt);
            }
        });

        txta_id.setColumns(20);
        txta_id.setRows(5);
        jScrollPane2.setViewportView(txta_id);

        lbl_bodega.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbl_bodega.setText("bodega");

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_cambiar.setText("Cambiar ID");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_bodega))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_consultarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_ficha)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_consultarId)
                            .addComponent(btn_limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cambiar)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_bodega))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultarFicha))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultarId))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_cambiar)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarFichaActionPerformed
        String inFicha = txt_ficha.getText().toString();
        if(consultaFicha(inFicha))
        {
            btn_consultarFicha.setEnabled(false);txt_ficha.setEnabled(false);
            btn_consultarId.setEnabled(true);txt_id.setEnabled(true);
        }
        
    }//GEN-LAST:event_btn_consultarFichaActionPerformed

    private void btn_consultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarIdActionPerformed
        String ide=txt_id.getText().toString();
        if(txta_ficha.toString().length()>0){
          consultaId(ide);
          txta_ficha.setEnabled(false);
          
      }
    }//GEN-LAST:event_btn_consultarIdActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_ficha.setText(""); txt_id.setText("");
        txta_ficha.setText("");txta_id.setText("");
        btn_consultarId.setEnabled(false);btn_consultarFicha.setEnabled(true);
        txt_ficha.setEnabled(true);txt_id.setEnabled(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
       String f=txt_ficha.getText();
            cambiarID(outCodigo,outFamilia,outMarca,outNombre,outCosto,f);
        
    }//GEN-LAST:event_btn_cambiarActionPerformed

 
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
            java.util.logging.Logger.getLogger(CambiarId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarId().setVisible(true);
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
     
     public boolean consultaFicha(String inFicha)
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
            pst.setString(1,inFicha);
            rs=pst.executeQuery();
            if(rs.next())
            aid=rs.getString("CODIGO");
            familia=rs.getString("FAMILIA");
            marca=rs.getString("MARCA");
            serie=rs.getString("SERIE");
            nombre=rs.getString("NOMBRE");
            cprom=rs.getString("COSTO_PROMEDIO");
            status=rs.getString("ESTADO");
            ubicacion=rs.getString("UBICACIÓN");
           
            txta_ficha.setLineWrap(true);
            txta_ficha.setText( "Ficha: "+inFicha+"\n"+
                                "Serie: "+serie+"\n"+
                                "ID: "+aid+"\n"+
                                "Familia: "+familia+"\n"+
                                "Marca: "+marca+"\n"+
                                "Descripción: "+nombre+"\n"+
                                "Estado ficha: "+status+"\n"+
                                "Costo Promedio: $"+cprom+"\n"+
                                "Ubicacion: "+ubicacion);
            return true;  
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
        }
        return false;
     }
     
     public boolean consultaId(String inId)
     {
          try {
            String fam=null;
            String mar=null;
            String nom=null;
            String cp=null;  
            conectar = Controlador.Conexion.obtener();
            String sql= "SELECT * FROM CP WHERE CODIGO=?";
            pst = conectar.prepareStatement(sql);
            pst.setString(1,inId);
            rs=pst.executeQuery();
            if(rs.next())
            fam=rs.getString("FAMILIA");
            mar=rs.getString("MARCA");
            nom=rs.getString("NOMBRE");
            cp=rs.getString("COSTO_PROMEDIO");
  
            txta_id.setLineWrap(true);
            txta_id.setText( "Nuevo ID: "+inId+"\n"+
                                "Familia: "+fam+"\n"+
                                "Marca: "+mar+"\n"+
                                "Descripción: "+nom+"\n"+
                                "Costo Promedio: $"+cp);
            
            outCodigo=inId;
            outFamilia=fam;
            outMarca=mar;
            outNombre=nom;
            outCosto=cp;
              System.out.println(""+outCodigo+outFamilia);
            return true;  
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
           
        }
        return false;
     }
    
     public boolean cambiarID(String outCodigo,String outFamilia,String outMarca,String outNombre,String outCosto ,String outFicha)
     {
         
         boolean b=false;
         try {
            conectar = Controlador.Conexion.obtener();
            String sql= "UPDATE "+inBodega+mes+"_"+año+" SET CODIGO=? ,FAMILIA=? ,MARCA=? ,NOMBRE=? ,COSTO_PROMEDIO=? WHERE FICHA=?"; 
             System.out.println(""+sql+outCodigo+" "+outFamilia+""+outMarca+""+outNombre+""+outCosto+""+outFicha);
            pst = conectar.prepareStatement(sql); 
            pst.setString(1,outCodigo);
            pst.setString(2,outFamilia);
            pst.setString(3,outMarca);
            pst.setString(4,outNombre);
            pst.setString(5,outCosto);
            pst.setString(6,outFicha);
        
            
            if(pst.executeUpdate()>0)
            {

                b=true;
                JOptionPane.showMessageDialog(null, "Exito!");
            }
         
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
         
         return b;
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_consultarFicha;
    private javax.swing.JButton btn_consultarId;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JTextField txt_ficha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txta_ficha;
    private javax.swing.JTextArea txta_id;
    // End of variables declaration//GEN-END:variables
}
