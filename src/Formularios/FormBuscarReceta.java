
package Formularios;

import Desarrollo.Recetario;
import javax.swing.JOptionPane;

public class FormBuscarReceta extends javax.swing.JInternalFrame {

  Recetario re = new Recetario();
  String dietaElegida;
    public FormBuscarReceta() {
        initComponents();
        this.CBTipoDieta.setModel(re.MostrarTipoDieta());
        this.Ocultar();
    }
    
    public void Ocultar (){
        this.PanelEnviarDatos.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.Tabla.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BtnGroupReceta = new javax.swing.ButtonGroup();
        BtnGroupBuscar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BtnSalir = new org.edisoncor.gui.button.ButtonAction();
        PanelEnviarDatos = new javax.swing.JPanel();
        TxtTitReceta = new javax.swing.JTextField();
        LblTitReceta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtIngredientes = new javax.swing.JTextPane();
        LblIngredientes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtPasos = new javax.swing.JTextPane();
        LblPasos = new javax.swing.JLabel();
        CBTipoDieta = new javax.swing.JComboBox<>();
        LblTipoDieta = new javax.swing.JLabel();
        LblTipoReceta = new javax.swing.JLabel();
        TxtTipoRecip = new javax.swing.JTextField();
        TxtMomentodia = new javax.swing.JTextField();
        LblMomentodia = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        RbCodReceta = new javax.swing.JRadioButton();
        RbTipoDieta = new javax.swing.JRadioButton();
        TxtCodDieta = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaNomDieta = new javax.swing.JList<>();
        BtnBuscar = new org.edisoncor.gui.button.ButtonAction();
        BtnNuevaBusqueda = new org.edisoncor.gui.button.ButtonAction();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Título: ");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BtnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        PanelEnviarDatos.setBackground(new java.awt.Color(51, 51, 51));

        LblTitReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTitReceta.setForeground(new java.awt.Color(255, 255, 255));
        LblTitReceta.setText("Título: ");

        jScrollPane1.setViewportView(TxtIngredientes);

        LblIngredientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        LblIngredientes.setText("Ingredientes:");

        jScrollPane2.setViewportView(TxtPasos);

        LblPasos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblPasos.setForeground(new java.awt.Color(255, 255, 255));
        LblPasos.setText("Pasos:");

        CBTipoDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblTipoDieta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipoDieta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoDieta.setText("Tipo de Dieta:");

        LblTipoReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipoReceta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoReceta.setText("Tipo de Receta:");

        LblMomentodia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblMomentodia.setForeground(new java.awt.Color(255, 255, 255));
        LblMomentodia.setText("Momento del Día:");

        javax.swing.GroupLayout PanelEnviarDatosLayout = new javax.swing.GroupLayout(PanelEnviarDatos);
        PanelEnviarDatos.setLayout(PanelEnviarDatosLayout);
        PanelEnviarDatosLayout.setHorizontalGroup(
            PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(LblIngredientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblTitReceta)
                .addGap(18, 18, 18)
                .addComponent(TxtTitReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTipoReceta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtTipoRecip, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEnviarDatosLayout.createSequentialGroup()
                                .addComponent(LblMomentodia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                                .addComponent(LblTipoDieta)
                                .addGap(29, 29, 29)))
                        .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMomentodia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBTipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LblPasos)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        PanelEnviarDatosLayout.setVerticalGroup(
            PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTitReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTitReceta))
                .addGap(18, 18, 18)
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIngredientes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(LblPasos))
                    .addGroup(PanelEnviarDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTipoRecip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTipoReceta)
                    .addComponent(LblMomentodia)
                    .addComponent(TxtMomentodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEnviarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoDieta)
                    .addComponent(CBTipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        PanelTabla.setBackground(new java.awt.Color(51, 51, 51));
        PanelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTablaLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PanelBuscar.setBackground(new java.awt.Color(0, 0, 0));
        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR RECETA POR:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        BtnGroupBuscar.add(RbCodReceta);
        RbCodReceta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RbCodReceta.setText("Código Receta");
        RbCodReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbCodRecetaMouseClicked(evt);
            }
        });

        BtnGroupBuscar.add(RbTipoDieta);
        RbTipoDieta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RbTipoDieta.setText("Tipo de Dieta");
        RbTipoDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbTipoDietaMouseClicked(evt);
            }
        });

        ListaNomDieta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListaNomDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ListaNomDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaNomDietaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ListaNomDieta);

        BtnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(RbTipoDieta)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(RbCodReceta)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCodDieta)))
                .addContainerGap())
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbCodReceta)
                    .addComponent(TxtCodDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(RbTipoDieta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnNuevaBusqueda.setText("Nueva Búsqueda");
        BtnNuevaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevaBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnNuevaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelEnviarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(BtnNuevaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelEnviarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.PanelEnviarDatos.setVisible(true);
   
        if (this.RbCodReceta.isSelected()) {
            int codigoIngresado = Integer.parseInt(this.TxtCodDieta.getText());
            boolean existe = re.BuscarRecetaXId(codigoIngresado);
            if (existe == true) {
               //ENCONTRO Y MOSTRARA LOS DATOS  
               this.TxtTitReceta.setText(re.getTitReceta());
               this.TxtIngredientes.setText(re.getIngredientes());
               this.TxtPasos.setText(re.getPasos());
               this.TxtTipoRecip.setText(re.getTipoReceta());
               this.TxtMomentodia.setText(re.getPuntodelDia());
               this.CBTipoDieta.setSelectedItem(re.getNomDieta());
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INEXISTENTE !!");                
            }
        } else {
            if (this.RbTipoDieta.isSelected()) {
                this.PanelTabla.setVisible(true);
                this.Tabla.setVisible(true);
                dietaElegida = this.ListaNomDieta.getSelectedValue();
                re.BuscarCodDietaxNom(dietaElegida);
                //re.Mostrar(dietaElegida);
                //MOSTRAR LOS DATOS DE ESE PRODUCTO
                this.PanelTabla.setVisible(true);
                this.Tabla.setModel(re.Titulo());
                this.Tabla.setModel(re.Mostrar(dietaElegida));
                
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción !!");                
                            
            }
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

        

    public void Enviar (String Titreceta, String ingrediente, String pasos,String tiporece,String puntodia, String tipodieta){
       this.TxtTitReceta.setText(Titreceta);
       this.TxtIngredientes.setText(ingrediente);
       this.TxtPasos.setText(pasos);
        this.TxtTipoRecip.setText(tiporece);
        this.TxtMomentodia.setText(puntodia);
        this.CBTipoDieta.setSelectedItem(tipodieta);
    }
    private void RbCodRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbCodRecetaMouseClicked
       this.TxtCodDieta.setVisible(true);
       this.ListaNomDieta.setVisible(false);
    }//GEN-LAST:event_RbCodRecetaMouseClicked

    private void RbTipoDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbTipoDietaMouseClicked
        this.TxtCodDieta.setVisible(false);
        this.ListaNomDieta.setVisible(true);
        this.ListaNomDieta.setModel(re.MostrarDietas());
    }//GEN-LAST:event_RbTipoDietaMouseClicked

    private void ListaNomDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaNomDietaMouseClicked
       dietaElegida = this.ListaNomDieta.getSelectedValue();
      // this.Tabla.setSelectionModel(dietaElegida).;
       //this.TxtFab.setText(FabricanteElegido); 
    }//GEN-LAST:event_ListaNomDietaMouseClicked

    private void BtnNuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevaBusquedaActionPerformed
        this.Ocultar();
        this.RbCodReceta.setSelected(false);
      this.RbTipoDieta.setSelected(false);
      this.BtnGroupBuscar.clearSelection();
      this.TxtCodDieta.setText(null);
    }//GEN-LAST:event_BtnNuevaBusquedaActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
     int nrofila = this.Tabla.getSelectedRow(); //selecciona la fila
       String Titreceta = Tabla.getValueAt(nrofila, 0).toString();
       String ingrediente = this.Tabla.getValueAt(nrofila, 1).toString();
       String pasos = this.Tabla.getValueAt(nrofila, 2).toString();
       String tiporece =  this.Tabla.getValueAt(nrofila, 3).toString();
       String puntodia =  this.Tabla.getValueAt(nrofila, 4).toString();
       String tipodieta =  this.Tabla.getValueAt(nrofila, 5).toString();
       this.Enviar(Titreceta, ingrediente, pasos, tiporece, puntodia, tipodieta);
    }//GEN-LAST:event_TablaMouseClicked
    public void Limpiar(){
        
        this.TxtTitReceta.setText(null);
        this.TxtIngredientes.setText(null);
        this.TxtPasos.setText(null);
        this.TxtMomentodia.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnBuscar;
    private javax.swing.ButtonGroup BtnGroupBuscar;
    private javax.swing.ButtonGroup BtnGroupReceta;
    private org.edisoncor.gui.button.ButtonAction BtnNuevaBusqueda;
    private org.edisoncor.gui.button.ButtonAction BtnSalir;
    private javax.swing.JComboBox<String> CBTipoDieta;
    private javax.swing.JLabel LblIngredientes;
    private javax.swing.JLabel LblMomentodia;
    private javax.swing.JLabel LblPasos;
    private javax.swing.JLabel LblTipoDieta;
    private javax.swing.JLabel LblTipoReceta;
    private javax.swing.JLabel LblTitReceta;
    private javax.swing.JList<String> ListaNomDieta;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelEnviarDatos;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JRadioButton RbCodReceta;
    private javax.swing.JRadioButton RbTipoDieta;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtCodDieta;
    private javax.swing.JTextPane TxtIngredientes;
    private javax.swing.JTextField TxtMomentodia;
    private javax.swing.JTextPane TxtPasos;
    private javax.swing.JTextField TxtTipoRecip;
    private javax.swing.JTextField TxtTitReceta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
