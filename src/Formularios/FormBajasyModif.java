
package Formularios;

import Desarrollo.Paciente;
import Desarrollo.lista;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormBajasyModif extends javax.swing.JInternalFrame {
Paciente pa = new Paciente();

    public FormBajasyModif() {
        initComponents();
        this.Ocultar();
        this.CBTipodeDieta.setModel(pa.MostrarNomDieta());
    }
    public void Mostrar(){
        this.PanelDatosPersonales.setVisible(true);
        this.PanelBotones.setVisible(true);
        this.TxtNom.setVisible(true);
         this.TxtApe.setVisible(true);
            this.TxtDni.setVisible(true);
            this.TxtEmail.setVisible(true);
            this.TxtCel.setVisible(true);
            this.TxtDomicilio.setVisible(true);
            this.TxtEstatura.setVisible(true);
            this.TxtPeso.setVisible(true);
            this.TxtPrepaga.setVisible(true);
            this.TxtMatricula.setVisible(true);
             this.TxtAlergias.setVisible(true);
             this.TxtEnfermedades.setVisible(true);
             this.TxtObservaciones.setVisible(true);
            this.TxtNroAfiliado.setVisible(true);
            this.TxtAcFisica.setVisible(true);  
            this.DateFechaNac.setVisible(true);
             this.BtnModificar.setEnabled(true);
            this.BtnEliminar.setEnabled(true);
    }
    public void Ocultar (){
        this.PanelDatosPersonales.setVisible(true);
        this.PanelBotones.setVisible(false);
        this.TxtNom.setVisible(false);
            this.TxtApe.setVisible(false);
            this.TxtDni.setVisible(false);
            this.TxtEmail.setVisible(false);
            this.TxtCel.setVisible(false);
            this.TxtDomicilio.setVisible(false);
            this.TxtEstatura.setVisible(false);
            this.TxtPeso.setVisible(false);
            this.TxtPrepaga.setVisible(false);
            this.TxtMatricula.setVisible(false);
             this.TxtAlergias.setVisible(false);
             this.TxtEnfermedades.setVisible(false);
             this.TxtObservaciones.setVisible(false);
            this.TxtNroAfiliado.setVisible(false);
            this.TxtAcFisica.setVisible(false);            
            this.DateFechaNac.setVisible(false);
             this.BtnModificar.setEnabled(false);
            this.BtnEliminar.setEnabled(false);
            this.EditableFalso();
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
            this.TxtBuscarXDni.setText(null);
            this.GroupEntrena.clearSelection();   
            this.CBTipodeDieta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupEntrena = new javax.swing.ButtonGroup();
        BtnGroupBuscarX = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        BtnModificar = new org.edisoncor.gui.button.ButtonAction();
        BtnEliminar = new org.edisoncor.gui.button.ButtonAction();
        BtnNewBusqueda = new org.edisoncor.gui.button.ButtonAction();
        PanelBuscarPor = new javax.swing.JPanel();
        TxtBuscarXDni = new javax.swing.JTextField();
        BtnBuscar = new org.edisoncor.gui.button.ButtonAction();
        LblIngreseDni = new javax.swing.JLabel();
        PanelDatosPersonales = new javax.swing.JPanel();
        LblMail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        LblNom = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        LblApe = new javax.swing.JLabel();
        TxtApe = new javax.swing.JTextField();
        LblDni = new javax.swing.JLabel();
        TxtDni = new javax.swing.JTextField();
        LblCel = new javax.swing.JLabel();
        TxtCel = new javax.swing.JTextField();
        LblFechaNac = new javax.swing.JLabel();
        DateFechaNac = new com.toedter.calendar.JDateChooser();
        LblDomicilio = new javax.swing.JLabel();
        TxtDomicilio = new javax.swing.JTextField();
        LblEnfermedades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtEnfermedades = new javax.swing.JTextPane();
        LblAlergias = new javax.swing.JLabel();
        TxtAlergias = new javax.swing.JTextField();
        LblTipoDieta = new javax.swing.JLabel();
        CBTipodeDieta = new javax.swing.JComboBox<>();
        LblAcFisica = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAcFisica = new javax.swing.JTextPane();
        LblEstatura = new javax.swing.JLabel();
        TxtEstatura = new javax.swing.JTextField();
        LblPeso = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        LblPrepaga = new javax.swing.JLabel();
        TxtPrepaga = new javax.swing.JTextField();
        LblNroAfiliado = new javax.swing.JLabel();
        TxtNroAfiliado = new javax.swing.JTextField();
        LblMatricula = new javax.swing.JLabel();
        TxtMatricula = new javax.swing.JTextField();
        LblObservaciones = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextPane();
        BtnSalir = new org.edisoncor.gui.button.ButtonAction();
        jScrollPane4 = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 0, 0));
        Panel.setMinimumSize(new java.awt.Dimension(1070, 500));

        PanelBotones.setBackground(new java.awt.Color(0, 0, 0));

        BtnModificar.setForeground(new java.awt.Color(102, 255, 102));
        BtnModificar.setText("Modificar");
        BtnModificar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\deleteicon.png")); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnNewBusqueda.setText("Nueva Búsqueda");
        BtnNewBusqueda.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnNewBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(BtnNewBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNewBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelBuscarPor.setBackground(new java.awt.Color(0, 0, 0));
        PanelBuscarPor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR PACIENTE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        BtnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\iconsearch.png")); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        LblIngreseDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIngreseDni.setForeground(new java.awt.Color(255, 255, 255));
        LblIngreseDni.setText("Ingrese el Número de DNI:");

        javax.swing.GroupLayout PanelBuscarPorLayout = new javax.swing.GroupLayout(PanelBuscarPor);
        PanelBuscarPor.setLayout(PanelBuscarPorLayout);
        PanelBuscarPorLayout.setHorizontalGroup(
            PanelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarPorLayout.createSequentialGroup()
                .addGroup(PanelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarPorLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBuscarPorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PanelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblIngreseDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtBuscarXDni))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        PanelBuscarPorLayout.setVerticalGroup(
            PanelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarPorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LblIngreseDni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtBuscarXDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        PanelDatosPersonales.setBackground(new java.awt.Color(0, 0, 0));
        PanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        LblMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMail.setForeground(new java.awt.Color(255, 255, 255));
        LblMail.setText("Email:");

        TxtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNom.setForeground(new java.awt.Color(255, 255, 255));
        LblNom.setText("Nombre:");

        TxtNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblApe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblApe.setForeground(new java.awt.Color(255, 255, 255));
        LblApe.setText("Apellido:");

        TxtApe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDni.setForeground(new java.awt.Color(255, 255, 255));
        LblDni.setText("Documento de Identidad:");

        TxtDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCel.setForeground(new java.awt.Color(255, 255, 255));
        LblCel.setText("Celular:");

        TxtCel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblFechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaNac.setText("Fecha de Nacimiento: ");

        DateFechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblDomicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        LblDomicilio.setText("Domicilio:");

        TxtDomicilio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblEnfermedades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEnfermedades.setForeground(new java.awt.Color(255, 255, 255));
        LblEnfermedades.setText("Enfermedades:");

        TxtEnfermedades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(TxtEnfermedades);

        LblAlergias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblAlergias.setForeground(new java.awt.Color(255, 255, 255));
        LblAlergias.setText("Alergias:");

        TxtAlergias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblTipoDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblTipoDieta.setForeground(new java.awt.Color(255, 255, 255));
        LblTipoDieta.setText("Tipo de Dieta:");

        CBTipodeDieta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CBTipodeDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblAcFisica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblAcFisica.setForeground(new java.awt.Color(255, 255, 255));
        LblAcFisica.setText("¿Hace Actividad? ¿Cuál?");

        TxtAcFisica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(TxtAcFisica);

        LblEstatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEstatura.setForeground(new java.awt.Color(255, 255, 255));
        LblEstatura.setText("Estatura:");

        TxtEstatura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPeso.setForeground(new java.awt.Color(255, 255, 255));
        LblPeso.setText("Peso:");

        TxtPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblPrepaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblPrepaga.setForeground(new java.awt.Color(255, 255, 255));
        LblPrepaga.setText("Prepaga: ");

        TxtPrepaga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblNroAfiliado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNroAfiliado.setForeground(new java.awt.Color(255, 255, 255));
        LblNroAfiliado.setText("Nro de Afiliado: ");

        TxtNroAfiliado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblMatricula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMatricula.setForeground(new java.awt.Color(255, 255, 255));
        LblMatricula.setText("Nro de Matrícula del Profesional:");

        TxtMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LblObservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        LblObservaciones.setText("Observaciones:");

        TxtObservaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(TxtObservaciones);

        javax.swing.GroupLayout PanelDatosPersonalesLayout = new javax.swing.GroupLayout(PanelDatosPersonales);
        PanelDatosPersonales.setLayout(PanelDatosPersonalesLayout);
        PanelDatosPersonalesLayout.setHorizontalGroup(
            PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblNom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblMail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblCel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblApe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblDni)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtDni))))
                            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(LblAlergias)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtAlergias)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblEstatura))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosPersonalesLayout.createSequentialGroup()
                                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(LblDomicilio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtDomicilio))
                                            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                                .addComponent(LblEnfermedades)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblAcFisica)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                    .addComponent(LblObservaciones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                    .addComponent(LblMatricula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(LblPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblTipoDieta)
                            .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosPersonalesLayout.createSequentialGroup()
                                    .addComponent(LblFechaNac)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosPersonalesLayout.createSequentialGroup()
                                    .addComponent(LblPrepaga)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtPrepaga, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LblNroAfiliado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBTipodeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        PanelDatosPersonalesLayout.setVerticalGroup(
            PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblCel)
                        .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblMail))
                .addGap(7, 7, 7)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblApe)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFechaNac)
                    .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblDni)
                        .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblDomicilio)
                                    .addComponent(TxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEnfermedades)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LblAcFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAlergias)
                    .addComponent(LblEstatura)
                    .addComponent(TxtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPeso)
                    .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPrepaga)
                    .addComponent(TxtPrepaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNroAfiliado)
                    .addComponent(TxtNroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblMatricula)
                        .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblTipoDieta)
                        .addComponent(CBTipodeDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblObservaciones)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        BtnSalir.setText("Salir");
        BtnSalir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(PanelBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 480));
        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
             String nom = this.TxtNom.getText().toUpperCase();
            String ape = this.TxtApe.getText().toUpperCase();
            String dni = this.TxtDni.getText();
            String mail = this.TxtEmail.getText().toUpperCase();
            String cel = this.TxtCel.getText();
            String domicilio = this.TxtDomicilio.getText().toUpperCase();
            double estatura = Double.parseDouble(this.TxtEstatura.getText());
            double peso = Double.parseDouble(this.TxtPeso.getText());
            String prepaga = this.TxtPrepaga.getText().toUpperCase();
            int nromatri = Integer.parseInt(this.TxtMatricula.getText());
            String alergias = this.TxtAlergias.getText().toUpperCase();
            String enfermedades = this.TxtEnfermedades.getText().toUpperCase();
            String observaciones = this.TxtObservaciones.getText().toUpperCase();
            String nroafiliado = this.TxtNroAfiliado.getText();
            String acfisica = this.TxtAcFisica.getText().toUpperCase();
            
            pa.BuscarCodDietaxNom(this.CBTipodeDieta.getSelectedItem().toString());
            int coddieta = this.CBTipodeDieta.getSelectedIndex();
            pa.setTipodieta(coddieta);
                    
            Date fechanac = this.DateFechaNac.getDate();
            java.sql.Date fechaSql = ConvertirASql (fechanac);
                    
        Paciente p = new Paciente ( mail, dni, nom, ape, dni, cel, domicilio, fechaSql, nroafiliado, prepaga, estatura, peso, acfisica, enfermedades, alergias, observaciones, nromatri, coddieta);  
        try {
            int valor = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea modificar los datos del paciente?");
            if (valor == 0) {
                p.Modificar(dni);
            }
            this.PanelDatosPersonales.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No quiere modificar los datos");            
        }
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
       dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       try{
        int var = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar al paciente?", "ALERTA", JOptionPane.YES_NO_OPTION);
               switch (var) {
          
                case 0:
                    pa.Bajas(this.TxtDni.getText());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Presionó el botón NO");                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Presionó el botón CANCELAR");                    
                    break;
               }
               this.BtnNewBusquedaActionPerformed(evt);
          }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en el ConfirmDialog");            
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
            String DniIngresado = this.TxtBuscarXDni.getText();
            boolean existe = pa.Buscar(DniIngresado);
            if (existe == true) {
                this.Mostrar();
                this.TxtNom.setText(pa.getNombre());
            this.TxtApe.setText(pa.getApellido());
            this.TxtDni.setText(pa.getDni());
            this.TxtEmail.setText(pa.getEmail());
            this.TxtCel.setText(pa.getCelular());
            this.TxtDomicilio.setText(pa.getDomicilio());
            this.TxtEstatura.setText(String.valueOf(pa.getEstatura()));
            this.TxtPeso.setText(String.valueOf(pa.getPeso()));
            this.TxtPrepaga.setText(pa.getPrepaga());
            lista x = new lista();
            this.TxtMatricula.setText(String.valueOf(x.Mostrar()));
             this.TxtAlergias.setText(pa.getAlergias());
             this.TxtEnfermedades.setText(pa.getEnfermedades());
             this.TxtObservaciones.setText(pa.getObservaciones());
            this.TxtNroAfiliado.setText(pa.getNroAfiliado());
            this.TxtAcFisica.setText(pa.getAcFisica());             
            this.DateFechaNac.setDate(pa.getFechaNac());
            this.CBTipodeDieta.setSelectedItem(pa.getNomDieta());
            this.EditableTrue();
            } else{
                JOptionPane.showMessageDialog(null, "Paciente Inexistente!! \n Vuelva a Ingresar.");   
                this.TxtBuscarXDni.setText(null);
            }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnNewBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewBusquedaActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_BtnNewBusquedaActionPerformed
    public void EditableFalso(){
           this.TxtNom.setEditable(false);
            this.TxtApe.setEditable(false);
            this.TxtDni.setEditable(false);
            this.TxtEmail.setEditable(false);
            this.TxtCel.setEditable(false);
            this.TxtDomicilio.setEditable(false);
            this.TxtEstatura.setEditable(false);
            this.TxtPeso.setEditable(false);
            this.TxtPrepaga.setEditable(false);
            this.TxtMatricula.setEditable(false);
             this.TxtAlergias.setEditable(false);
             this.TxtEnfermedades.setEditable(false);
             this.TxtObservaciones.setEditable(false);
            this.TxtNroAfiliado.setEditable(false);
            this.TxtAcFisica.setEditable(false);           
            this.DateFechaNac.setEnabled(false);
            
    }
    public void EditableTrue(){
            this.TxtNom.setEditable(true);
            this.TxtApe.setEditable(true);
            this.TxtDni.setEditable(true);
            this.TxtEmail.setEditable(true);
            this.TxtCel.setEditable(true);
            this.TxtDomicilio.setEditable(true);
            this.TxtEstatura.setEditable(true);
            this.TxtPeso.setEditable(true);
            this.TxtPrepaga.setEditable(true);
            this.TxtMatricula.setEditable(true);
             this.TxtAlergias.setEditable(true);
             this.TxtEnfermedades.setEditable(true);
             this.TxtObservaciones.setEditable(true);
            this.TxtNroAfiliado.setEditable(true);
            this.TxtAcFisica.setEditable(true);           
            this.DateFechaNac.setEnabled(true);
            
    }
    
    
    private java.sql.Date ConvertirASql(java.util.Date fecha) 
    {
        java.sql.Date SqlFechaConvertida;
        SqlFechaConvertida = new java.sql.Date(fecha.getTime()); 
        return SqlFechaConvertida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnBuscar;
    private org.edisoncor.gui.button.ButtonAction BtnEliminar;
    private javax.swing.ButtonGroup BtnGroupBuscarX;
    private org.edisoncor.gui.button.ButtonAction BtnModificar;
    private org.edisoncor.gui.button.ButtonAction BtnNewBusqueda;
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
    private javax.swing.JLabel LblEstatura;
    private javax.swing.JLabel LblFechaNac;
    private javax.swing.JLabel LblIngreseDni;
    private javax.swing.JLabel LblMail;
    private javax.swing.JLabel LblMatricula;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblNroAfiliado;
    private javax.swing.JLabel LblObservaciones;
    private javax.swing.JLabel LblPeso;
    private javax.swing.JLabel LblPrepaga;
    private javax.swing.JLabel LblTipoDieta;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelBuscarPor;
    private javax.swing.JPanel PanelDatosPersonales;
    private javax.swing.JTextPane TxtAcFisica;
    private javax.swing.JTextField TxtAlergias;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JTextField TxtBuscarXDni;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
