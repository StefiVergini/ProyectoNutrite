
package Formularios;
import Desarrollo.Paciente;
import javax.swing.JOptionPane;

public class FormAgregarObserv extends javax.swing.JInternalFrame {
Paciente pa = new Paciente();

    public FormAgregarObserv() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LblApePa = new javax.swing.JLabel();
        TxtApe = new javax.swing.JTextField();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelObserv = new javax.swing.JPanel();
        LblObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextPane();
        BtnAgregar = new org.edisoncor.gui.button.ButtonAction();
        BtnSalir = new org.edisoncor.gui.button.ButtonAction();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Panel.setBackground(new java.awt.Color(0, 0, 0));

        LblApePa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblApePa.setForeground(new java.awt.Color(255, 255, 255));
        LblApePa.setText("Ingrese el Apellido del Paciente:");

        buttonAction1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\iconsearch.png")); // NOI18N
        buttonAction1.setText("Buscar");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        PanelTabla.setBackground(new java.awt.Color(51, 51, 51));
        PanelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        PanelObserv.setBackground(new java.awt.Color(0, 0, 0));

        LblObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        LblObservaciones.setText("Observaciones:");

        jScrollPane2.setViewportView(TxtObservaciones);

        javax.swing.GroupLayout PanelObservLayout = new javax.swing.GroupLayout(PanelObserv);
        PanelObserv.setLayout(PanelObservLayout);
        PanelObservLayout.setHorizontalGroup(
            PanelObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObservLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelObservLayout.setVerticalGroup(
            PanelObservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObservLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblObservaciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelObservLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelObserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(LblApePa)
                            .addGap(28, 28, 28)
                            .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                            .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(111, 111, 111))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApePa)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelObserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        this.PanelObserv.setVisible(false);
        this.TxtObservaciones.setVisible(false);
        String ApeIngresado = this.TxtApe.getText();
        boolean existe = pa.BuscarXApe(ApeIngresado);
        if ( existe == true) {
            this.Tabla.setModel(pa.Titulos());
            this.Tabla.setModel(pa.MostrarPaciente(ApeIngresado));
        } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado. \n Vuelva a ingresar");
            this.TxtApe.setText(null);
        }
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
       this.PanelObserv.setVisible(true);
       this.TxtObservaciones.setVisible(true);
        int nrofila = this.Tabla.getSelectedRow(); //selecciona la fila
       String Ape = Tabla.getValueAt(nrofila, 0).toString();
       String Nom = this.Tabla.getValueAt(nrofila, 1).toString();
       String mail = this.Tabla.getValueAt(nrofila, 2).toString();
       String dni =  this.Tabla.getValueAt(nrofila, 3).toString();
       String celular =  this.Tabla.getValueAt(nrofila, 4).toString();
       String prepaga =  this.Tabla.getValueAt(nrofila, 5).toString();
       String Observaciones = this.Tabla.getValueAt(nrofila, 6).toString();
       this.Enviar(Observaciones);
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String observaciones = this.TxtObservaciones.getText().toUpperCase();
        String ApeIngresado = this.TxtApe.getText();
        Paciente obj1 = new Paciente (observaciones);
         try {
            int valor = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea agregar la observación?");
            if (valor == 0) {
                obj1.Modificar(ApeIngresado);
                JOptionPane.showMessageDialog(null, "Observación agregada.");                
            }
            this.Limpiar();
            this.PanelObserv.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No quiere modificar los datos");            
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed
public void Limpiar (){
    this.TxtApe.setText(null);
    this.TxtObservaciones.setText(null);
    this.PanelObserv.setVisible(false);
    this.Tabla.setVisible(false);
}
public void Enviar (String Observacion){
    this.TxtObservaciones.setText(Observacion);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnAgregar;
    private org.edisoncor.gui.button.ButtonAction BtnSalir;
    private javax.swing.JLabel LblApePa;
    private javax.swing.JLabel LblObservaciones;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelObserv;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JTextPane TxtObservaciones;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
