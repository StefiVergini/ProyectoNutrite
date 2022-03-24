
package Formularios;
import Desarrollo.Nutricionista;
import javax.swing.JOptionPane;

public class FormCrearCtaNutricionista extends javax.swing.JInternalFrame {

    public FormCrearCtaNutricionista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LblTit = new javax.swing.JLabel();
        LblCel = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        LblMail = new javax.swing.JLabel();
        LblApe = new javax.swing.JLabel();
        LblDni = new javax.swing.JLabel();
        LblNroMatri = new javax.swing.JLabel();
        LblPsw = new javax.swing.JLabel();
        LblConfirmarPsw = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtDni = new javax.swing.JTextField();
        TxtNumMat = new javax.swing.JTextField();
        TxtCel = new javax.swing.JTextField();
        TxtApe = new javax.swing.JTextField();
        TxtMail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtConfirmarPsw = new javax.swing.JPasswordField();
        TxtPsw = new javax.swing.JPasswordField();
        BtnRegistrarse = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 0, 0));
        Panel.setForeground(new java.awt.Color(255, 204, 255));
        Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LblTit.setBackground(new java.awt.Color(0, 0, 0));
        LblTit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        LblTit.setForeground(new java.awt.Color(255, 255, 255));
        LblTit.setText("COMPLETE LOS DATOS PARA REGISTRARSE");

        LblCel.setBackground(new java.awt.Color(255, 255, 255));
        LblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCel.setForeground(new java.awt.Color(255, 255, 255));
        LblCel.setText("Celular: ");

        LblNom.setBackground(new java.awt.Color(255, 255, 255));
        LblNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNom.setForeground(new java.awt.Color(255, 255, 255));
        LblNom.setText("Nombre:");

        LblMail.setBackground(new java.awt.Color(255, 255, 255));
        LblMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMail.setForeground(new java.awt.Color(255, 255, 255));
        LblMail.setText("Email: ");

        LblApe.setBackground(new java.awt.Color(255, 255, 255));
        LblApe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblApe.setForeground(new java.awt.Color(255, 255, 255));
        LblApe.setText("Apellido: ");

        LblDni.setBackground(new java.awt.Color(255, 255, 255));
        LblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDni.setForeground(new java.awt.Color(255, 255, 255));
        LblDni.setText("Documento de Identidad: ");

        LblNroMatri.setBackground(new java.awt.Color(255, 255, 255));
        LblNroMatri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNroMatri.setForeground(new java.awt.Color(255, 255, 255));
        LblNroMatri.setText("Número de Matrícula:");

        LblPsw.setBackground(new java.awt.Color(255, 255, 255));
        LblPsw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPsw.setForeground(new java.awt.Color(255, 255, 255));
        LblPsw.setText("Contraseña: ");

        LblConfirmarPsw.setBackground(new java.awt.Color(255, 255, 255));
        LblConfirmarPsw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblConfirmarPsw.setForeground(new java.awt.Color(255, 255, 255));
        LblConfirmarPsw.setText("Confirmar Contraseña:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Máximo 10 caracteres");

        BtnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarse.setText("REGISTRARSE");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSalir.setText("SALIR");
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
                .addGap(272, 272, 272)
                .addComponent(LblTit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarse))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(174, 174, 174))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblPsw)
                                            .addComponent(LblNroMatri))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtPsw)))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblDni)
                                    .addComponent(LblNom))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblApe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblConfirmarPsw, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblCel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblMail, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtConfirmarPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(BtnSalir)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblTit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNom)
                    .addComponent(LblApe)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDni)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCel)
                    .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNroMatri)
                    .addComponent(TxtNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMail))
                .addGap(46, 46, 46)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPsw, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblConfirmarPsw)
                        .addComponent(TxtConfirmarPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(52, 52, 52)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrarse)
                    .addComponent(BtnSalir))
                .addGap(40, 40, 40))
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
       dispose();
        /*FormPrincipal pp = new FormPrincipal();
        pp.setVisible(true);*/
        
        
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
        if (this.TxtNom.getText().isEmpty() || this.TxtApe.getText().isEmpty() || this.TxtDni.getText().isEmpty() || this.TxtMail.getText().isEmpty() || this.TxtCel.getText().isEmpty() || this.TxtNumMat.getText().isEmpty() || this.TxtPsw.getText().isEmpty() || this.TxtConfirmarPsw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR !! Debe completar todos los datos", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);            
        } else {
            String nom = this.TxtNom.getText().toUpperCase();
            String ape = this.TxtApe.getText().toUpperCase();
            String dni = this.TxtDni.getText();
            String mail = this.TxtMail.getText().toUpperCase();
            String cel = this.TxtCel.getText();
            int nromatri = Integer.parseInt(this.TxtNumMat.getText());
            String password = this.TxtPsw.getText().toUpperCase();
            String confirmarpsw = this.TxtConfirmarPsw.getText().toUpperCase();
            if (!password.equals(confirmarpsw)) {
                JOptionPane.showMessageDialog(null, "Error! Las contraseñas deben ser iguales." + "\nEscríbalas nuevamente."); 
                this.TxtPsw.setText(null);
                this.TxtConfirmarPsw.setText(null);
            }else{
                Nutricionista n = new Nutricionista(nromatri, mail, password, nom, ape, dni, cel);
                n.Altas();
                dispose();
               
               /*FormPrincipal pp = new FormPrincipal();
               pp.setVisible(true);*/
            }
        }
    }//GEN-LAST:event_BtnRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblApe;
    private javax.swing.JLabel LblCel;
    private javax.swing.JLabel LblConfirmarPsw;
    private javax.swing.JLabel LblDni;
    private javax.swing.JLabel LblMail;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblNroMatri;
    private javax.swing.JLabel LblPsw;
    private javax.swing.JLabel LblTit;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JTextField TxtCel;
    private javax.swing.JPasswordField TxtConfirmarPsw;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtMail;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtNumMat;
    private javax.swing.JPasswordField TxtPsw;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
