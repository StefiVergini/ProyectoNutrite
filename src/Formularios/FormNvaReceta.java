
package Formularios;

import Desarrollo.Recetario;
import javax.swing.JOptionPane;

public class FormNvaReceta extends javax.swing.JInternalFrame {

  Recetario obj = new Recetario();
    public FormNvaReceta() {
        initComponents();
        this.CBTipoDieta.setModel(obj.MostrarTipoDieta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BtnGroupReceta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BtnAgregar = new org.edisoncor.gui.button.ButtonAction();
        BtnSalir = new org.edisoncor.gui.button.ButtonAction();
        LblTit = new javax.swing.JLabel();
        LblTitReceta = new javax.swing.JLabel();
        LblIngredientes = new javax.swing.JLabel();
        LblPasos = new javax.swing.JLabel();
        LblMomentodia = new javax.swing.JLabel();
        TxtTitReceta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtIngredientes = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtPasos = new javax.swing.JTextPane();
        LblTipoReceta = new javax.swing.JLabel();
        LblTipoDieta = new javax.swing.JLabel();
        RBdulce = new javax.swing.JRadioButton();
        RBSalada = new javax.swing.JRadioButton();
        CBTipoDieta = new javax.swing.JComboBox<>();
        TxtMomentodia = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Título: ");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BtnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        LblTit.setBackground(new java.awt.Color(0, 0, 0));
        LblTit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        LblTit.setForeground(new java.awt.Color(255, 255, 255));
        LblTit.setText("Nueva Receta:");

        LblTitReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTitReceta.setForeground(new java.awt.Color(255, 255, 255));
        LblTitReceta.setText("Título: ");

        LblIngredientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        LblIngredientes.setText("Ingredientes:");

        LblPasos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblPasos.setForeground(new java.awt.Color(255, 255, 255));
        LblPasos.setText("Pasos:");

        LblMomentodia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblMomentodia.setForeground(new java.awt.Color(255, 255, 255));
        LblMomentodia.setText("Momento del Día:");

        jScrollPane1.setViewportView(TxtIngredientes);

        jScrollPane2.setViewportView(TxtPasos);

        LblTipoReceta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipoReceta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoReceta.setText("Tipo de Receta:");

        LblTipoDieta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipoDieta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoDieta.setText("Tipo de Dieta:");

        BtnGroupReceta.add(RBdulce);
        RBdulce.setText("Dulce");

        BtnGroupReceta.add(RBSalada);
        RBSalada.setText("Salada");

        CBTipoDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblTit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTitReceta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTitReceta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblIngredientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblPasos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LblMomentodia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtMomentodia))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LblTipoReceta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBdulce)
                                        .addGap(10, 10, 10)
                                        .addComponent(RBSalada)
                                        .addGap(33, 33, 33)
                                        .addComponent(LblTipoDieta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBTipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblTit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTitReceta)
                    .addComponent(TxtTitReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblIngredientes))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPasos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoReceta)
                    .addComponent(RBdulce)
                    .addComponent(RBSalada)
                    .addComponent(LblTipoDieta)
                    .addComponent(CBTipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMomentodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblMomentodia)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        if (this.TxtTitReceta.getText().isEmpty() || this.TxtIngredientes.getText().isEmpty() || this.TxtPasos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR! Debe completar el título, los ingredientes y los pasos.");            
        } else {
            String titreceta = this.TxtTitReceta.getText().toLowerCase();
            String ingredientes = this.TxtIngredientes.getText().toLowerCase();
            String pasos = this.TxtPasos.getText().toLowerCase();
            String puntodeldia = this.TxtMomentodia.getText().toLowerCase();
            String tiporeceta = "";
            if (this.RBdulce.isSelected()) {
                tiporeceta = "Dulce";
                
            } else {
                if (this.RBSalada.isSelected()) {
                    tiporeceta = "Salada";
                }
            }
            boolean existe = obj.BuscarCodDietaxNom(this.CBTipoDieta.getSelectedItem().toString());
            if ( existe == true) {
                int coddieta = obj.getTipodieta();
                obj.setTipodieta(coddieta);
            Recetario obj1 = new Recetario(titreceta, ingredientes, pasos,tiporeceta, puntodeldia, coddieta);
            obj1.Altas();
                
            }             
//get selected item va a una variable de tipo String con parametros
            
            this.Limpiar();
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed
    public void Limpiar(){
        this.BtnGroupReceta.clearSelection();
        this.TxtTitReceta.setText(null);
        this.TxtIngredientes.setText(null);
        this.TxtPasos.setText(null);
        this.TxtMomentodia.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnAgregar;
    private javax.swing.ButtonGroup BtnGroupReceta;
    private org.edisoncor.gui.button.ButtonAction BtnSalir;
    private javax.swing.JComboBox<String> CBTipoDieta;
    private javax.swing.JLabel LblIngredientes;
    private javax.swing.JLabel LblMomentodia;
    private javax.swing.JLabel LblPasos;
    private javax.swing.JLabel LblTipoDieta;
    private javax.swing.JLabel LblTipoReceta;
    private javax.swing.JLabel LblTit;
    private javax.swing.JLabel LblTitReceta;
    private javax.swing.JRadioButton RBSalada;
    private javax.swing.JRadioButton RBdulce;
    private javax.swing.JTextPane TxtIngredientes;
    private javax.swing.JTextField TxtMomentodia;
    private javax.swing.JTextPane TxtPasos;
    private javax.swing.JTextField TxtTitReceta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
