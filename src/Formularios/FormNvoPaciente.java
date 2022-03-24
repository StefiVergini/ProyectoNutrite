
package Formularios;

import Desarrollo.Nutricionista;
import Desarrollo.Paciente;
import Desarrollo.lista;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormNvoPaciente extends javax.swing.JInternalFrame {
Paciente objp = new Paciente (); 
    public FormNvoPaciente() {
        initComponents();
        lista x = new lista();
        this.TxtMatricula.setText(String.valueOf(x.Mostrar()));
        this.TxtMatricula.setEditable(false);
        this.CBTipodeDieta.setModel(objp.MostrarNomDieta());
    }
    public void Limpiar(){
          this.TxtNom.setText(null);
            this.TxtApe.setText(null);
            this.TxtDni.setText(null);
            this.TxtEmail.setText(null);
            this.TxtCel.setText(null);
            this.TxtDomicilio.setText(null);
            this.TxtEstatura.setText(null);
            this.TxtPeso.setText(null);
            this.TxtPrepaga.setText(null);
            this.TxtMatricula.setText(null);
             this.TxtAlergias.setText(null);
             this.TxtEnfermedades.setText(null);
             this.TxtObservaciones.setText(null);
            this.TxtNroAfiliado.setText(null);
            this.TxtAcFisica.setText(null);             
            this.DateFechaNac.setDate(null);
            this.GroupEntrena.clearSelection();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupEntrena = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        LblTit = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        LblApe = new javax.swing.JLabel();
        LblMail = new javax.swing.JLabel();
        LblDni = new javax.swing.JLabel();
        LblCel = new javax.swing.JLabel();
        LblTipoDieta = new javax.swing.JLabel();
        LblDomicilio = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtApe = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtDni = new javax.swing.JTextField();
        TxtDomicilio = new javax.swing.JTextField();
        TxtCel = new javax.swing.JTextField();
        CBTipodeDieta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DateFechaNac = new com.toedter.calendar.JDateChooser();
        LblFechaNac = new javax.swing.JLabel();
        LblObservaciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextPane();
        PanelPrepagaProf = new javax.swing.JPanel();
        LblMatricula = new javax.swing.JLabel();
        TxtMatricula = new javax.swing.JTextField();
        LblNroAfiliado = new javax.swing.JLabel();
        TxtNroAfiliado = new javax.swing.JTextField();
        LblPrepaga = new javax.swing.JLabel();
        TxtPrepaga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PanelEnfermedades = new javax.swing.JPanel();
        LblAlergias = new javax.swing.JLabel();
        TxtAlergias = new javax.swing.JTextField();
        PanelEntrenaDatos = new javax.swing.JPanel();
        LblEntrena = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        RbEntrenaSi = new javax.swing.JRadioButton();
        RbEntrenaNo = new javax.swing.JRadioButton();
        LblEstatura = new javax.swing.JLabel();
        TxtEstatura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        LblPeso = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LblAcFisica = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAcFisica = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BtnSalir = new org.edisoncor.gui.button.ButtonAction();
        BtnRegistrar = new org.edisoncor.gui.button.ButtonAction();
        LblEnfermedades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtEnfermedades = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 0, 0));
        Panel.setMinimumSize(new java.awt.Dimension(1070, 500));

        LblTit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblTit.setForeground(new java.awt.Color(255, 255, 255));
        LblTit.setText("COMPLETE LOS DATOS DEL NUEVO PACIENTE:");

        LblNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNom.setForeground(new java.awt.Color(255, 255, 255));
        LblNom.setText("Nombre:");

        LblApe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblApe.setForeground(new java.awt.Color(255, 255, 255));
        LblApe.setText("Apellido:");

        LblMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMail.setForeground(new java.awt.Color(255, 255, 255));
        LblMail.setText("Email:");

        LblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDni.setForeground(new java.awt.Color(255, 255, 255));
        LblDni.setText("Documento de Identidad:");

        LblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCel.setForeground(new java.awt.Color(255, 255, 255));
        LblCel.setText("Celular:");

        LblTipoDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblTipoDieta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoDieta.setText("Tipo de Dieta:");

        LblDomicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        LblDomicilio.setText("Domicilio:");

        CBTipodeDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Campos con * son obligatorios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        LblFechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaNac.setText("Fecha de Nacimiento: ");

        LblObservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        LblObservaciones.setText("Observaciones:");

        jScrollPane3.setViewportView(TxtObservaciones);

        PanelPrepagaProf.setBackground(new java.awt.Color(0, 0, 0));

        LblMatricula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMatricula.setForeground(new java.awt.Color(255, 255, 255));
        LblMatricula.setText("Nro de Matrícula del Profesional:");

        LblNroAfiliado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNroAfiliado.setForeground(new java.awt.Color(255, 255, 255));
        LblNroAfiliado.setText("Nro de Afiliado: ");

        LblPrepaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPrepaga.setForeground(new java.awt.Color(255, 255, 255));
        LblPrepaga.setText("Prepaga: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        javax.swing.GroupLayout PanelPrepagaProfLayout = new javax.swing.GroupLayout(PanelPrepagaProf);
        PanelPrepagaProf.setLayout(PanelPrepagaProfLayout);
        PanelPrepagaProfLayout.setHorizontalGroup(
            PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrepagaProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrepagaProfLayout.createSequentialGroup()
                        .addComponent(LblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrepagaProfLayout.createSequentialGroup()
                        .addComponent(LblNroAfiliado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrepagaProfLayout.createSequentialGroup()
                        .addComponent(LblPrepaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPrepaga, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PanelPrepagaProfLayout.setVerticalGroup(
            PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrepagaProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrepaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPrepaga)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNroAfiliado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNroAfiliado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrepagaProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMatricula)
                    .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelEnfermedades.setBackground(new java.awt.Color(0, 0, 0));

        LblAlergias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblAlergias.setForeground(new java.awt.Color(255, 255, 255));
        LblAlergias.setText("Alergias:");

        PanelEntrenaDatos.setBackground(new java.awt.Color(0, 0, 0));

        LblEntrena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEntrena.setForeground(new java.awt.Color(255, 255, 255));
        LblEntrena.setText("¿Entrena?");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        GroupEntrena.add(RbEntrenaSi);
        RbEntrenaSi.setText("SI");

        GroupEntrena.add(RbEntrenaNo);
        RbEntrenaNo.setText("NO");

        LblEstatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEstatura.setForeground(new java.awt.Color(255, 255, 255));
        LblEstatura.setText("Estatura:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        LblPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPeso.setForeground(new java.awt.Color(255, 255, 255));
        LblPeso.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        LblAcFisica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblAcFisica.setForeground(new java.awt.Color(255, 255, 255));
        LblAcFisica.setText("Actividad Física:");

        jScrollPane2.setViewportView(TxtAcFisica);

        javax.swing.GroupLayout PanelEntrenaDatosLayout = new javax.swing.GroupLayout(PanelEntrenaDatos);
        PanelEntrenaDatos.setLayout(PanelEntrenaDatosLayout);
        PanelEntrenaDatosLayout.setHorizontalGroup(
            PanelEntrenaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntrenaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEntrenaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEntrenaDatosLayout.createSequentialGroup()
                        .addComponent(LblAcFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEntrenaDatosLayout.createSequentialGroup()
                        .addComponent(LblEntrena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RbEntrenaSi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(RbEntrenaNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblEstatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelEntrenaDatosLayout.setVerticalGroup(
            PanelEntrenaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntrenaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEntrenaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEntrena)
                    .addComponent(jLabel18)
                    .addComponent(RbEntrenaSi)
                    .addComponent(RbEntrenaNo)
                    .addComponent(LblEstatura)
                    .addComponent(TxtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(LblPeso)
                    .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PanelEntrenaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAcFisica)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelEnfermedadesLayout = new javax.swing.GroupLayout(PanelEnfermedades);
        PanelEnfermedades.setLayout(PanelEnfermedadesLayout);
        PanelEnfermedadesLayout.setHorizontalGroup(
            PanelEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermedadesLayout.createSequentialGroup()
                .addGroup(PanelEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEnfermedadesLayout.createSequentialGroup()
                        .addComponent(LblAlergias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelEntrenaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEnfermedadesLayout.setVerticalGroup(
            PanelEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermedadesLayout.createSequentialGroup()
                .addGroup(PanelEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAlergias)
                    .addComponent(TxtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelEntrenaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("ATENCIÓN: Usuario y Contraseña del Paciente");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Usuario: su Email");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Contraseña: su DNI");

        BtnSalir.setText("SALIR");
        BtnSalir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        LblEnfermedades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEnfermedades.setForeground(new java.awt.Color(255, 255, 255));
        LblEnfermedades.setText("Enfermedades:");

        jScrollPane1.setViewportView(TxtEnfermedades);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Contraseña: su DNI");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel13))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblNom, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblMail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblCel, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                                    .addComponent(TxtNom))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel16)))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(LblEnfermedades)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PanelEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelPrepagaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19))
                                    .addComponent(jLabel8))))
                        .addGap(25, 25, 25)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(LblApe)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(LblDni)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(LblFechaNac)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel17))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(LblTipoDieta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CBTipodeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(LblDomicilio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(5, 5, 5))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(LblObservaciones)
                                    .addGap(403, 403, 403)))
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(LblTit)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(LblTit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblApe)
                        .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblNom)
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDni)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMail)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LblFechaNac)
                                .addComponent(LblCel)
                                .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblDomicilio)
                                    .addComponent(TxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblTipoDieta)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CBTipodeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblObservaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEnfermedades)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelPrepagaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel19))
                                .addGap(175, 175, 175)))
                        .addComponent(jLabel13))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 490));
        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        if (this.TxtNom.getText().isEmpty() || this.TxtApe.getText().isEmpty() || this.TxtDni.getText().isEmpty() || this.TxtEmail.getText().isEmpty() || this.TxtCel.getText().isEmpty() || this.TxtDomicilio.getText().isEmpty() || this.TxtEstatura.getText().isEmpty() || this.TxtPeso.getText().isEmpty() || this.TxtPrepaga.getText().isEmpty() || this.TxtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR !! Debe completar los campos obligatorios", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);

        } else {
            
            String nom = this.TxtNom.getText().toUpperCase();
            String ape = this.TxtApe.getText().toUpperCase();
            String dni = this.TxtDni.getText();
            String mail = this.TxtEmail.getText().toUpperCase();
            String cel = this.TxtCel.getText();
            String domicilio = this.TxtDomicilio.getText().toUpperCase();
            double estatura = Double.parseDouble(this.TxtEstatura.getText());
            double peso = Double.parseDouble(this.TxtPeso.getText());
            String prepaga = this.TxtPrepaga.getText().toUpperCase();
            String alergias = this.TxtAlergias.getText().toUpperCase();
            String enfermedades = this.TxtEnfermedades.getText().toUpperCase();
            String observaciones = this.TxtObservaciones.getText().toUpperCase();
            String nroafiliado = this.TxtNroAfiliado.getText();
            String acfisica = this.TxtAcFisica.getText().toUpperCase();
            int nromatri = Integer.parseInt(this.TxtMatricula.getText());
            boolean entrena = true;
            if ( this.RbEntrenaSi.isSelected()) {
                entrena = true;
                objp.setEntrena(entrena);
            } else {
                if (this.RbEntrenaNo.isSelected()) {
                    entrena = false;
                    objp.setEntrena(entrena);
                }
                
               }
            objp.BuscarCodDietaxNom(this.CBTipodeDieta.getSelectedItem().toString());
            int coddieta = this.CBTipodeDieta.getSelectedIndex();
            objp.setTipodieta(coddieta);
                    
            Date fechanac = this.DateFechaNac.getDate();
            java.sql.Date fechaSql = ConvertirASql (fechanac);
            
            Paciente p = new Paciente ( mail, dni, nom, ape, dni, cel, domicilio, fechaSql, nroafiliado, prepaga, estatura, peso, entrena, acfisica, enfermedades, alergias, observaciones, nromatri, coddieta);  
            p.Altas();
            this.Limpiar();
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        int var = JOptionPane.showConfirmDialog(null, "¿Está seguro que no desea registrar al nuevo paciente?", "ALERTA", JOptionPane.YES_NO_OPTION);
               switch (var) {
          
                case 0:
                    dispose();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Presionó el botón NO");                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Presionó el botón CANCELAR");                    
                    break;
               }
    }//GEN-LAST:event_BtnSalirActionPerformed
    public void EditableFalso(){
     this.TxtAcFisica.setEditable(false);
    }
    public void EditableTrue(){
    this.TxtAcFisica.setEditable(true); 
    }
    private java.sql.Date ConvertirASql(java.util.Date fecha) 
    {
        java.sql.Date SqlFechaConvertida;
        SqlFechaConvertida = new java.sql.Date(fecha.getTime()); 
        return SqlFechaConvertida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnRegistrar;
    private org.edisoncor.gui.button.ButtonAction BtnSalir;
    private javax.swing.JComboBox<String> CBTipodeDieta;
    private com.toedter.calendar.JDateChooser DateFechaNac;
    private javax.swing.ButtonGroup GroupEntrena;
    private javax.swing.JLabel LblAcFisica;
    private javax.swing.JLabel LblAlergias;
    private javax.swing.JLabel LblApe;
    private javax.swing.JLabel LblCel;
    private javax.swing.JLabel LblDni;
    private javax.swing.JLabel LblDomicilio;
    private javax.swing.JLabel LblEnfermedades;
    private javax.swing.JLabel LblEntrena;
    private javax.swing.JLabel LblEstatura;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblMail;
    private javax.swing.JLabel LblMatricula;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblNroAfiliado;
    private javax.swing.JLabel LblObservaciones;
    private javax.swing.JLabel LblPeso;
    private javax.swing.JLabel LblPrepaga;
    private javax.swing.JLabel LblTipoDieta;
    private javax.swing.JLabel LblTit;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelEnfermedades;
    private javax.swing.JPanel PanelEntrenaDatos;
    private javax.swing.JPanel PanelPrepagaProf;
    private javax.swing.JRadioButton RbEntrenaNo;
    private javax.swing.JRadioButton RbEntrenaSi;
    private javax.swing.JTextPane TxtAcFisica;
    private javax.swing.JTextField TxtAlergias;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JTextField TxtCel;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtDomicilio;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextPane TxtEnfermedades;
    private javax.swing.JTextField TxtEstatura;
    private javax.swing.JTextField TxtMatricula;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtNroAfiliado;
    private javax.swing.JTextPane TxtObservaciones;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JTextField TxtPrepaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
