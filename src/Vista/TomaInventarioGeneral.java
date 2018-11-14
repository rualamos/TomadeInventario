package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class TomaInventarioGeneral extends javax.swing.JFrame {

    int bodega =Controlador.validaLogin.bodega;
    int tipoUsu =Controlador.validaLogin.tipouser;
    int año=Controlador.validaLogin.año  ;
    int mes=Controlador.validaLogin.mes ;
    int dia=Controlador.validaLogin.dia;
    String inBodega=null;
    String areaBod=null;
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean bool=false;
    String userName=Controlador.validaLogin.recuperarUsuario();
    int cboId=Vista.MenuPrincipal.cboID;
    
        public TomaInventarioGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Sesión: "+Controlador.validaLogin.recuperarUsuario());
        cargarIcono();
        txta_masivo.setEnabled(false);
        btn_agregaMasivo.setEnabled(false);
        txt_cantidad.setText(""+tab_aregarInv.getRowCount());
        jdate_month.setEnabled(false);
        jdate_year.setEnabled(false);

      
        switch (bodega) {
            case 0:
                if(cboId==1)
                {
                    lbl_bodega.setText("ADM Nacional");
                    inBodega="BOD_ADM_";
                    areaBod="ADM NACIONAL";
                }else if(cboId==2)
                {
                    lbl_bodega.setText("Internacional");
                    inBodega="BOD_INTERNACIONAL_";
                    areaBod="INTERNACIONAL";
                }else if(cboId==3){
                    lbl_bodega.setText("STA Internacional");
                    inBodega="BOD_STAINTER_";
                    areaBod="STA INTERNACIONAL";
                }else if(cboId==4)
                {
                    lbl_bodega.setText("RMA Express");
                    inBodega="BOD_EXPRESS_";
                    areaBod="EXPRESS";
                }else if (cboId==5)
                {
                    lbl_bodega.setText("C.Calidad");
                    inBodega="BOD_CCALIDAD_";
                    areaBod="C.CALIDAD";
                }else if(cboId==6)
                {
                    lbl_bodega.setText("STA PCF");
                    inBodega="BOD_STAPCF_";
                    areaBod="STA PCF";
                }else if(cboId==7)
                {
                    lbl_bodega.setText("Revision Fisica");
                    inBodega="BOD_REVFISICA_";
                    areaBod="REVISION FISICA";
                }else if(cboId==8)
                {
                    lbl_bodega.setText("Post Revision");
                    inBodega="BOD_POSTREV_";
                    areaBod="POST REVISION";
                }else if(cboId==9)
                {
                    lbl_bodega.setText("Liquidacion");
                    inBodega="BOD_LIQ_";
                    areaBod="LIQUIDACION";
                }else if(cboId==10){
                    lbl_bodega.setText("Recepción");
                    inBodega="BOD_RECEPCION_";
                    areaBod="RECEPCION";
                }   break;
            case 1:
                if(cboId==1)
                {
                    lbl_bodega.setText("Internacional");
                    inBodega="BOD_INTERNACIONAL_";
                    areaBod="INTERNACIONAL";
                }else if(cboId==2){
                    lbl_bodega.setText("STA Internacional");
                    inBodega="BOD_STAINTER_";
                    areaBod="STA INTERNACIONAL";
                }else if (cboId==3)
                {
                    lbl_bodega.setText("Revision Fisica");
                    inBodega="BOD_REVFISICA_";
                    areaBod="REVISION FISICA";
                }else if(cboId==4)
                {
                    lbl_bodega.setText("Post Revision");
                    inBodega="BOD_POSTREV_";
                    areaBod="POST REVISION";
                }else if(cboId==5)
                {
                    lbl_bodega.setText("Liquidacion");
                    inBodega="BOD_LIQ_";
                    areaBod="LIQUIDACION";
                }     break;
            case 2:
                if(cboId==1)
                {
                    lbl_bodega.setText("ADM Nacional");
                    inBodega="BOD_ADM_";
                    areaBod="ADM NACIONAL";
                }else if(cboId==2)
                {
                    lbl_bodega.setText("STA Nacional");
                    inBodega="BOD_STANAC_";
                    areaBod="STA NACIONAL";
                }     break;
            case 3:
                lbl_bodega.setText("STA PCF");
                inBodega="BOD_STAPCF_";
                areaBod="STA PCF";
                break;
            case 4:
                lbl_bodega.setText("C.Calidad");
                inBodega="BOD_CCALIDAD_";
                areaBod="C.CALIDAD";
                break;
            case 5:
                lbl_bodega.setText("Recepción");
                inBodega="BOD_RECEPCION_";
                areaBod="RECEPCION";
                break;
            case 6:
                lbl_bodega.setText("RMA Express");
                inBodega="BOD_EXPRESS_";
                areaBod="EXPRESS";
                break;
            default:
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_serie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ubicacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_aregarInv = new javax.swing.JTable();
        btn_agregarFila = new javax.swing.JButton();
        btn_eliminarFila = new javax.swing.JButton();
        btn_limpiarTabla = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_bodega = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_masivo = new javax.swing.JTextArea();
        btn_masivo = new javax.swing.JButton();
        btn_agregaMasivo = new javax.swing.JButton();
        btn_porserie = new javax.swing.JButton();
        jdate_month = new com.toedter.calendar.JMonthChooser();
        jdate_year = new com.toedter.calendar.JYearChooser();
        btn_cambiarper = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Serie");

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

        jLabel3.setText("Ubicación");

        tab_aregarInv.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tab_aregarInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serie", "Codigo", "", "Area", "Ubicación", "Responsable", "Tipo", "Familia", "Marca", "Nombre", "C.Prom", "Estatus", "Ficha", "Usuario", "Estado", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_aregarInv.setColumnSelectionAllowed(true);
        tab_aregarInv.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tab_aregarInv);
        tab_aregarInv.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tab_aregarInv.getColumnModel().getColumnCount() > 0) {
            tab_aregarInv.getColumnModel().getColumn(2).setResizable(false);
            tab_aregarInv.getColumnModel().getColumn(2).setPreferredWidth(0);
            tab_aregarInv.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_agregarFila.setText("Agregar Serie");
        btn_agregarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarFilaActionPerformed(evt);
            }
        });

        btn_eliminarFila.setText("Eliminar Fila");
        btn_eliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarFilaActionPerformed(evt);
            }
        });

        btn_limpiarTabla.setText("Limpiar tabla");
        btn_limpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarTablaActionPerformed(evt);
            }
        });

        btn_ingresar.setText("Ingresar a stock");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("Toma de inventario :");

        lbl_bodega.setFont(new java.awt.Font("Gautami", 0, 14)); // NOI18N
        lbl_bodega.setText("X");

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel1.setText("CANTIDAD =");

        txt_cantidad.setText("0");

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel7.setText("Periodo:");

        txta_masivo.setColumns(20);
        txta_masivo.setLineWrap(true);
        txta_masivo.setRows(5);
        jScrollPane2.setViewportView(txta_masivo);

        btn_masivo.setText("Masivo por ficha");
        btn_masivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masivoActionPerformed(evt);
            }
        });

        btn_agregaMasivo.setText("Agregar Masivo");
        btn_agregaMasivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregaMasivoActionPerformed(evt);
            }
        });

        btn_porserie.setText("Inventario por serie");
        btn_porserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porserieActionPerformed(evt);
            }
        });

        btn_cambiarper.setText("Cambiar periodo");
        btn_cambiarper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btn_eliminarFila, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(214, 214, 214))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_agregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_porserie))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cambiarper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_agregaMasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_masivo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_bodega)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdate_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdate_year, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(lbl_bodega)
                                .addComponent(jLabel7))
                            .addComponent(jdate_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_porserie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_masivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregaMasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cambiarper, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_eliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_serieActionPerformed

    private void btn_agregarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarFilaActionPerformed
        String serie = txt_serie.getText().toString().trim();
        
        try {
            if (txt_serie.getText().toString().length() < 4) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese una serie");
                txt_serie.requestFocus();
            } else if (txt_ubicacion.getText().toString().length() < 2) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese una ubicación válida");
                txt_ubicacion.requestFocus();
            } else {

                agrega(serie);
                txt_cantidad.setText(""+tab_aregarInv.getRowCount());
                txt_cantidad.updateUI(); 

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_agregarFilaActionPerformed

    private void btn_eliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarFilaActionPerformed

        DefaultTableModel model = (DefaultTableModel) tab_aregarInv.getModel();
        int a = tab_aregarInv.getSelectedRow();
        if (a < 0) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");
            if (JOptionPane.OK_OPTION == confirmar) {
                model.removeRow(a);
                txt_cantidad.setText(""+tab_aregarInv.getRowCount());
                 txt_cantidad.updateUI();
            }
        }
    }//GEN-LAST:event_btn_eliminarFilaActionPerformed

    private void btn_limpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarTablaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
        {
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Limpiar la tabla completa? ");
            if (JOptionPane.OK_OPTION == confirmar) {
                modelo.setRowCount(0);
                txt_cantidad.setText(""+tab_aregarInv.getRowCount());
                 txt_cantidad.updateUI();

            }

        }

    }//GEN-LAST:event_btn_limpiarTablaActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
         año=jdate_year.getYear();
         mes=jdate_month.getMonth()+1;
        if (tab_aregarInv.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Agrege al menos una serie para Guardar!!!","",2);

        } else {
            try {
                conectar = Controlador.Conexion.obtener();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Sin conexion a servidor","Error!",0);
            } catch (ClassNotFoundException ex) {
         JOptionPane.showMessageDialog(this, "Sin conexion a servidor","Error!",0);
            }
            DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
            int Filas = modelo.getRowCount();
            for (int i = 0; i < Filas; i++) {
                try {

                    String serie = tab_aregarInv.getValueAt(i, 0).toString();
                    String codigo = tab_aregarInv.getValueAt(i, 1).toString();
                    String aid = tab_aregarInv.getValueAt(i, 2).toString();
                    String area = tab_aregarInv.getValueAt(i, 3).toString();
                    String ubicacion = tab_aregarInv.getValueAt(i, 4).toString();
                    String responsable = tab_aregarInv.getValueAt(i, 5).toString();
                    String tipo = tab_aregarInv.getValueAt(i, 6).toString();
                    String familia = tab_aregarInv.getValueAt(i, 7).toString();
                    String marca = tab_aregarInv.getValueAt(i, 8).toString();
                    String nombre = tab_aregarInv.getValueAt(i, 9).toString();
                    String cprom = tab_aregarInv.getValueAt(i, 10).toString();
                    String status = tab_aregarInv.getValueAt(i, 11).toString();
                    String ficha = tab_aregarInv.getValueAt(i, 12).toString();
                    String usuario = tab_aregarInv.getValueAt(i, 13).toString();
                    String estado = tab_aregarInv.getValueAt(i, 14).toString();
                    String proveedor = tab_aregarInv.getValueAt(i, 15).toString();

                    Statement st;
                    st = conectar.createStatement();
                    int rs;
                    String sql;
                    if(duplicado(serie))
                    {
                        if(tipoUsu==3)
                        {
                            bool=false; 
                            JOptionPane.showMessageDialog(this, "Serie "+ serie+ " duplicada en inventario,comuniquese con su supervisor");
                        }
                        
                          if(tipoUsu<=2)
                          {
                              bool=true;
                              int confirmar = JOptionPane.showConfirmDialog(null,"Serie  " +serie+ "  duplicada. Desea ingresar de todos modos?","",0);
                              if (JOptionPane.OK_OPTION == confirmar) {
                              try {
                              sql = "INSERT INTO "+inBodega+mes+"_"+año+"(SERIE,CODIGO,ID,AREA,UBICACIÓN,RESPONSABLE,TIPO,FAMILIA,MARCA,NOMBRE,COSTO_PROMEDIO,ESTATUS,FICHA,USUARIO,ESTADO,PROVEEDOR)"
                              + " values('" + serie + "', '" + codigo + "','" + aid + "', '" + area + "', '" + ubicacion + "', '" + responsable + "', '" + tipo + "', '" + familia + "', '" + marca + "', '" + nombre + "', '" + cprom + "','" + status + "','" + ficha + "','" + usuario + "','" + estado + "','" + proveedor + "')";
                              rs = st.executeUpdate(sql); 
                                  } catch (Exception e) {
                                  }
                           }else{
                          bool=false;  
                          JOptionPane.showMessageDialog(this, "Serie  "+serie+ "  no ingresada");    
                              }
                    }
                    
                    }else{
                       sql = "INSERT INTO "+inBodega+mes+"_"+año+"(SERIE,CODIGO,ID,AREA,UBICACIÓN,RESPONSABLE,TIPO,FAMILIA,MARCA,NOMBRE,COSTO_PROMEDIO,ESTATUS,FICHA,USUARIO,ESTADO,PROVEEDOR)"
                       + " values('" + serie + "', '" + codigo + "','" + aid + "', '" + area + "', '" + ubicacion + "', '" + responsable + "', '" + tipo + "', '" + familia + "', '" + marca + "', '" + nombre + "', '" + cprom + "','" + status + "','" + ficha + "','" + usuario + "','" + estado + "','" + proveedor + "')";
                        rs = st.executeUpdate(sql); 
                        bool=true;
                    }
                    
                   
                     } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "No se pudo ingresar a stock","Error!",2);
                }
            }
        }
          if(bool)
                     {
                         JOptionPane.showMessageDialog(this, tab_aregarInv.getRowCount()+" serie(s) ingresada(s) a inventario");
                          
                          DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
                          modelo.setRowCount(0);
                          txt_serie.setText("");
                          txta_masivo.setText("");
                          txt_cantidad.setText(""+tab_aregarInv.getRowCount());
                          tab_aregarInv.updateUI();
                          
                     }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        if (txt_serie.isEnabled()) {
         txt_serie.setText("");   
        }else if(txta_masivo.isEnabled())
        {
            txta_masivo.setText("");
        }
        
        txt_ubicacion.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
            MenuPrincipal m = new MenuPrincipal();
            this.setVisible(false);
            m.setVisible(true);
            
        
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_serieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_serieKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
      {
          String serie = txt_serie.getText().toString().trim();
        

        try {
            if (txt_serie.getText().toString().length() < 4) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese una serie");
                txt_serie.requestFocus();
            } else if (txt_ubicacion.getText().toString().length() < 2) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese una ubicación válida");
                txt_serie.requestFocus();
            } else {

                agrega(serie);
                DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
                 txt_cantidad.setText(""+tab_aregarInv.getRowCount());
                 tab_aregarInv.updateUI();

            }
        } catch (Exception e) {
        }

      }
    }//GEN-LAST:event_txt_serieKeyPressed

    private void btn_masivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masivoActionPerformed
        txt_serie.setEnabled(false);
        txt_serie.setText("");
        btn_agregarFila.setEnabled(false);
        btn_agregaMasivo.setEnabled(true);
        txta_masivo.setEnabled(true);
        
    }//GEN-LAST:event_btn_masivoActionPerformed

    private void btn_agregaMasivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregaMasivoActionPerformed
       if (txt_ubicacion.getText().toString().length() < 2) {
             JOptionPane.showMessageDialog(null,"Ingrese una ubicación válida","",2);
             txt_ubicacion.requestFocus();
       }else if(txta_masivo.getText().length()==0 )
       {
           JOptionPane.showMessageDialog(null,"Ingrese fichas separadas por coma","",2);
          txta_masivo.requestFocus();
       }
       else{
        agregaMasivo();  
        txt_cantidad.setText(""+tab_aregarInv.getRowCount());
        tab_aregarInv.updateUI();
       }
       
    }//GEN-LAST:event_btn_agregaMasivoActionPerformed

    private void btn_porserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porserieActionPerformed
        txt_serie.setEnabled(true);
        btn_agregarFila.setEnabled(true);
        btn_agregaMasivo.setEnabled(false);
        txta_masivo.setEnabled(false);
        txta_masivo.setText("");
    }//GEN-LAST:event_btn_porserieActionPerformed

    private void btn_cambiarperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarperActionPerformed
      int confirmar = JOptionPane.showConfirmDialog(null,
                    "Desea cambiar el periodo de inventario? \n (alterar la fecha modificara la tabla en la que se ingresan los datos)","Advertencia",0);
            if (JOptionPane.OK_OPTION == confirmar) {
               jdate_month.setEnabled(true);
               jdate_year.setEnabled(true); 
            }
    }//GEN-LAST:event_btn_cambiarperActionPerformed

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
            java.util.logging.Logger.getLogger(TomaInventarioGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomaInventarioGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomaInventarioGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomaInventarioGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TomaInventarioGeneral().setVisible(true);
            }
        });
    }

    public boolean duplicado(String serie){
        año=jdate_year.getYear();
         mes=jdate_month.getMonth()+1;
        boolean s=false;
        try {
        String sql= "select SERIE from "+inBodega+mes+"_"+año+" WHERE SERIE=?";
        pst = conectar.prepareStatement(sql);
        pst.setString(1, serie);
        rs =pst.executeQuery();
        
        if(rs.next())
        {
          s=true; 
        }else s=false;
     
            
            
        } catch (Exception e) {
        }
        System.out.println(s);
        return s;
       
    }
    
    public boolean agrega(String serie) {

        try {
            String codigo = null;
            String aid = null;
            String area = null;
            String ubicacion = null;
            String responsable = null;
            String tipo = null;
            String familia = null;
            String marca = null;
            String nombre = null;
            String cprom = null;
            String status = null;
            String ficha = null;
            String usuario = null;
            String estado = null;
            String proveedor = null;

         
           
            conectar = Controlador.Conexion.obtener();   
         
            
            String sql = "SELECT * FROM FICHASQ WHERE SERIEPRODUCTO=? AND ESTATUSFICHA='ABIERTA'";

            pst = conectar.prepareStatement(sql);
            pst.setString(1, txt_serie.getText().toString().trim());
            rs = pst.executeQuery();
            if (rs.next()) {
                serie = txt_serie.getText().toString().trim();
            }
            codigo = rs.getString("IDPRODUCTO");;
            aid = "";
            area = areaBod;
            ubicacion = txt_ubicacion.getText().toString().toUpperCase();
            responsable = userName.toUpperCase();
            tipo = rs.getString("TIPOGESTIÓN");
            familia = rs.getString("FAMILIA");
            marca = rs.getString("MARCA");
            nombre = rs.getString("NOMBREPRODUCTO");
            cprom = rs.getString("COSTOPROMEDIO");
            status = rs.getString("ESTADOACTUAL");
            ficha = rs.getString("IDFICHA");
            usuario = rs.getString("EJECUTOR");
            estado = rs.getString("ESTATUSFICHA");
            proveedor = rs.getString("PROVEEDOR");

            DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
            Object[] fila = new Object[16];

            fila[0] = serie;
            fila[1] = codigo;
            fila[2] = aid;
            fila[3] = area;
            fila[4] = ubicacion;
            fila[5] = responsable;
            fila[6] = tipo;
            fila[7] = familia;
            fila[8] = marca;
            fila[9] = nombre;
            fila[10] = cprom;
            fila[11] = status;
            fila[12] = ficha;
            fila[13] = usuario;
            fila[14] = estado;
            fila[15] = proveedor;
           
            Boolean aviso = false;
            for (int i = 0; i < tab_aregarInv.getRowCount(); i++) {
                if (tab_aregarInv.getValueAt(i, 0).equals(serie)) {
                    JOptionPane.showMessageDialog(null, "La serie " + serie + " ya existe en la tabla.");
                    aviso = true;
                }
            }

            if (aviso == false) {
                modelo.addRow(fila);
                tab_aregarInv.setModel(modelo);
                txt_serie.setText("");
                txt_serie.requestFocus(true);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Serie incorrecta o sin ficha");
        }
        return false;
    }
    
     public boolean agregaFicha(String ficha) {

        try {
            String serie= null;
            String codigo = null;
            String aid = null;
            String area = null;
            String ubicacion = null;
            String responsable = null;
            String tipo = null;
            String familia = null;
            String marca = null;
            String nombre = null;
            String cprom = null;
            String status = null;
            String usuario = null;
            String estado = null;
            String proveedor = null;

           conectar = Controlador.Conexion.obtener();
         
            String sql = "SELECT * FROM FICHASQ WHERE IDFICHA=? AND ESTATUSFICHA='ABIERTA'";

            pst = conectar.prepareStatement(sql);
            pst.setString(1, ficha);
            rs = pst.executeQuery();
            if (rs.next()) {
             
            }
            serie=rs.getString("SERIEPRODUCTO");
            codigo = rs.getString("IDPRODUCTO");
            aid = "";
            area = areaBod;
            ubicacion = txt_ubicacion.getText().toString().toUpperCase();
            responsable = userName.toUpperCase();
            tipo = rs.getString("TIPOGESTIÓN");
            familia = rs.getString("FAMILIA");
            marca = rs.getString("MARCA");
            nombre = rs.getString("NOMBREPRODUCTO");
            cprom = rs.getString("COSTOPROMEDIO");
            status = rs.getString("ESTADOACTUAL");
            ficha = rs.getString("IDFICHA");
            usuario = rs.getString("EJECUTOR");
            estado = rs.getString("ESTATUSFICHA");
            proveedor = rs.getString("PROVEEDOR");

            DefaultTableModel modelo = (DefaultTableModel) tab_aregarInv.getModel();
            Object[] fila = new Object[16];

            fila[0] = serie;
            fila[1] = codigo;
            fila[2] = aid;
            fila[3] = area;
            fila[4] = ubicacion;
            fila[5] = responsable;
            fila[6] = tipo;
            fila[7] = familia;
            fila[8] = marca;
            fila[9] = nombre;
            fila[10] = cprom;
            fila[11] = status;
            fila[12] = ficha;
            fila[13] = usuario;
            fila[14] = estado;
            fila[15] = proveedor;
           
            Boolean aviso = false;
            for (int i = 0; i < tab_aregarInv.getRowCount(); i++) {
                if (tab_aregarInv.getValueAt(i, 12).equals(ficha)) {
                    JOptionPane.showMessageDialog(null, "La ficha " + ficha + " ya existe en la tabla.");
                    aviso = true;
                }
            }
            if (aviso == false) {
                modelo.addRow(fila);
                tab_aregarInv.setModel(modelo);
                txt_serie.setText("");
                txt_serie.requestFocus(true);
            }
        } catch (Exception e) {
 
        }
        return false;   
    }
    
    
    public void agregaMasivo(){
        boolean bul=true;
        String cadena = txta_masivo.getText().toString();
        String [] split;
        split=cadena.split(",");
        String fic="";
        int largo= split.length;
        System.out.println(""+largo);
      
        for (int i = 0; i < largo; i++) {
            bul=true;
            String ficha =split[i];
            if(agregaFicha(ficha))
            {
                
            }else{
                fic=fic+ficha+" ";
                bul=false;
            }
            
        }
         if(!bul){
              JOptionPane.showMessageDialog(null,"Ficha(s) "+fic+" con problemas" );
            }
            System.out.println(fic);
    }
    
            public void cargarIcono()
    {
        java.awt.Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/pcicon.png"));
        setIconImage(icon);
        setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregaMasivo;
    private javax.swing.JButton btn_agregarFila;
    private javax.swing.JButton btn_cambiarper;
    private javax.swing.JButton btn_eliminarFila;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_limpiarTabla;
    private javax.swing.JButton btn_masivo;
    private javax.swing.JButton btn_porserie;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JMonthChooser jdate_month;
    private com.toedter.calendar.JYearChooser jdate_year;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JTable tab_aregarInv;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextField txt_ubicacion;
    private javax.swing.JTextArea txta_masivo;
    // End of variables declaration//GEN-END:variables
}
