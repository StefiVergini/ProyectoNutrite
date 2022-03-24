
package Formularios;
import Desarrollo.Nutricionista;
import Desarrollo.Paciente;
import Desarrollo.lista;

import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        this.FInternalLogin.setVisible(true);
        this.BtnEscritorioIngresar.setVisible(false);
        this.Ocultar();
    }
    public void Ocultar(){
        this.LblUsuario.setVisible(false);
        this.LblPassword.setVisible(false);
        this.TxtUsuario.setVisible(false);
        this.TxtPassword.setVisible(false);
        this.BtnInicioSesion.setVisible(false);
        this.MenuItemNuevoPaciente.setVisible(false);
        this.MenuAgregar.setVisible(false);
        this.BtnCrearCta.setVisible(false);
        this.MenuModificaciones.setVisible(false);
        this.MenuItemModifPaciente.setVisible(false);
        this.MenuItemModifReceta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrouptipousuario = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        PanelImagen = new org.edisoncor.gui.panel.PanelImage();
        BtnEscritorioIngresar = new org.edisoncor.gui.button.ButtonAction();
        BtnEscritorioSalir = new org.edisoncor.gui.button.ButtonAction();
        FInternalLogin = new javax.swing.JInternalFrame();
        LblTipoUsuario = new javax.swing.JLabel();
        RbNutricionista = new javax.swing.JRadioButton();
        RbPaciente = new javax.swing.JRadioButton();
        LblUsuario = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        BtnInicioSesion = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnCrearCta = new javax.swing.JButton();
        PanelBotones = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        MenuAgregar = new javax.swing.JMenu();
        MenuItemNuevoPaciente = new javax.swing.JMenuItem();
        MenuItemNvaReceta = new javax.swing.JMenuItem();
        MenuItemNvaDieta = new javax.swing.JMenuItem();
        MenuItemObservacionPaciente = new javax.swing.JMenuItem();
        MenuModificaciones = new javax.swing.JMenu();
        MenuItemModifPaciente = new javax.swing.JMenuItem();
        MenuItemModifReceta = new javax.swing.JMenuItem();
        MenuBuscar = new javax.swing.JMenu();
        MenuItemRece = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PanelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoNutritePantallaInicio.jpg"))); // NOI18N

        BtnEscritorioIngresar.setBackground(new java.awt.Color(102, 102, 102));
        BtnEscritorioIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEscritorioIngresar.setText("INGRESAR");
        BtnEscritorioIngresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnEscritorioIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEscritorioIngresarMouseClicked(evt);
            }
        });
        BtnEscritorioIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEscritorioIngresarActionPerformed(evt);
            }
        });

        BtnEscritorioSalir.setBackground(new java.awt.Color(102, 102, 102));
        BtnEscritorioSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEscritorioSalir.setText("SALIR");
        BtnEscritorioSalir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BtnEscritorioSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEscritorioSalirActionPerformed(evt);
            }
        });

        FInternalLogin.setIconifiable(true);
        FInternalLogin.setMaximizable(true);
        FInternalLogin.setVisible(true);

        LblTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipoUsuario.setText("Seleccione una opción:");

        BotonGrouptipousuario.add(RbNutricionista);
        RbNutricionista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RbNutricionista.setText("Nutricionista");
        RbNutricionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNutricionistaActionPerformed(evt);
            }
        });

        BotonGrouptipousuario.add(RbPaciente);
        RbPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RbPaciente.setText("Paciente");
        RbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbPacienteActionPerformed(evt);
            }
        });

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        LblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        BtnInicioSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnInicioSesion.setText("Ingresar");
        BtnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioSesionActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnCrearCta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearCta.setText("Crear Cuenta");
        BtnCrearCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FInternalLoginLayout = new javax.swing.GroupLayout(FInternalLogin.getContentPane());
        FInternalLogin.getContentPane().setLayout(FInternalLoginLayout);
        FInternalLoginLayout.setHorizontalGroup(
            FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FInternalLoginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbPaciente)
                    .addComponent(RbNutricionista)
                    .addComponent(LblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(FInternalLoginLayout.createSequentialGroup()
                            .addComponent(BtnInicioSesion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(LblPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FInternalLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCrearCta)
                .addGap(123, 123, 123))
        );
        FInternalLoginLayout.setVerticalGroup(
            FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FInternalLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(LblUsuario)
                .addGap(18, 18, 18)
                .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbNutricionista)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FInternalLoginLayout.createSequentialGroup()
                        .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FInternalLoginLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(RbPaciente))
                            .addGroup(FInternalLoginLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LblPassword)))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FInternalLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(FInternalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnInicioSesion))
                .addGap(18, 18, 18)
                .addComponent(BtnCrearCta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout PanelImagenLayout = new javax.swing.GroupLayout(PanelImagen);
        PanelImagen.setLayout(PanelImagenLayout);
        PanelImagenLayout.setHorizontalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEscritorioIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(BtnEscritorioSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(PanelImagenLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(FInternalLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        PanelImagenLayout.setVerticalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FInternalLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEscritorioIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEscritorioSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        Escritorio.add(PanelImagen);
        PanelImagen.setBounds(120, 50, 1020, 470);

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1270, 570));

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 510));

        MenuAgregar.setBackground(new java.awt.Color(255, 153, 255));
        MenuAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuAgregar.setText("Agregar");
        MenuAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuItemNuevoPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemNuevoPaciente.setText("Nuevo Paciente");
        MenuItemNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevoPacienteActionPerformed(evt);
            }
        });
        MenuAgregar.add(MenuItemNuevoPaciente);

        MenuItemNvaReceta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemNvaReceta.setText("Nueva Receta");
        MenuItemNvaReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNvaRecetaActionPerformed(evt);
            }
        });
        MenuAgregar.add(MenuItemNvaReceta);

        MenuItemNvaDieta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemNvaDieta.setText("Nueva Dieta");
        MenuItemNvaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNvaDietaActionPerformed(evt);
            }
        });
        MenuAgregar.add(MenuItemNvaDieta);

        MenuItemObservacionPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemObservacionPaciente.setText("Observacion Paciente");
        MenuItemObservacionPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemObservacionPacienteActionPerformed(evt);
            }
        });
        MenuAgregar.add(MenuItemObservacionPaciente);

        menuBar.add(MenuAgregar);

        MenuModificaciones.setBackground(new java.awt.Color(255, 153, 255));
        MenuModificaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuModificaciones.setText("Modificar");
        MenuModificaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuItemModifPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemModifPaciente.setText("Paciente");
        MenuItemModifPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemModifPacienteActionPerformed(evt);
            }
        });
        MenuModificaciones.add(MenuItemModifPaciente);

        MenuItemModifReceta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemModifReceta.setText("Receta");
        MenuItemModifReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemModifRecetaActionPerformed(evt);
            }
        });
        MenuModificaciones.add(MenuItemModifReceta);

        menuBar.add(MenuModificaciones);

        MenuBuscar.setBackground(new java.awt.Color(255, 153, 255));
        MenuBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuBuscar.setText("Buscar");
        MenuBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuItemRece.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuItemRece.setText("Recetas");
        MenuItemRece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReceActionPerformed(evt);
            }
        });
        MenuBuscar.add(MenuItemRece);

        menuBar.add(MenuBuscar);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevoPacienteActionPerformed
       FormNvoPaciente nvopa = new FormNvoPaciente();
        this.Escritorio.add(nvopa);
        //Dimension desktopSize = this.Escritorio.getSize();
        //Dimension FrameSize = nvopa.getSize();
        //nvopa.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nvopa.show();
       
    }//GEN-LAST:event_MenuItemNuevoPacienteActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void RbNutricionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNutricionistaActionPerformed
        
        if (this.RbNutricionista.isSelected()) {
        this.LblUsuario.setVisible(true);
        this.LblPassword.setVisible(true);
        this.TxtUsuario.setVisible(true);
        this.TxtPassword.setVisible(true);
        this.BtnInicioSesion.setVisible(true); 
        this.LblUsuario.setText("Ingrese su número de Matrícula: ");
        this.LblPassword.setText("Ingrese su Contraseña: ");
        this.BtnCrearCta.setVisible(true);
        }
        
    }//GEN-LAST:event_RbNutricionistaActionPerformed

    private void RbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbPacienteActionPerformed
        if (this.RbPaciente.isSelected()) {
        this.LblUsuario.setText("Ingrese su email: ");
        this.LblPassword.setText("Ingrese su Nro de DNI: ");
        this.BtnCrearCta.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_RbPacienteActionPerformed

    private void BtnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioSesionActionPerformed
      //Nutricionista nu = new Nutricionista ();
      //Paciente pa = new Paciente();
        if (this.TxtUsuario.getText().isEmpty() || this.TxtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error! Debe completar los datos.", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);            
        } else {        
            if (this.RbNutricionista.isSelected()) {
                int nromatri = Integer.parseInt(this.TxtUsuario.getText());
                lista x = new lista();
                x.Cargar(nromatri);
               String Password = String.valueOf(this.TxtPassword.getPassword());
               Nutricionista nu = new Nutricionista ();
                nu.setPsw(Password);
                nu.setMatriNro(nromatri);
                if (nu.Login() == true) {
                    JOptionPane.showMessageDialog(null, "BIENVENIDO/A: " + nu.getNom());  
                    this.FInternalLogin.setVisible(false);
                    this.BtnEscritorioIngresar.setVisible(false);
                    this.FInternalLogin.dispose();
                    this.MenuAgregar.setVisible(true);
                    this.MenuItemNuevoPaciente.setVisible(true);
                    this.MenuItemNvaDieta.setVisible(true);
                    this.MenuItemNvaReceta.setVisible(true);
                    this.MenuModificaciones.setVisible(true);
                    this.MenuItemModifPaciente.setVisible(true);
                    this.MenuItemModifReceta.setVisible(true);
                    this.MenuItemObservacionPaciente.setVisible(true);
                     this.MenuBuscar.setVisible(true);
                   this.MenuItemRece.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Vuelva a ingresar los datos"); 
                    this.TxtUsuario.setText(null);
                    this.TxtPassword.setText(null);
                }
            } else {                
                if (this.RbPaciente.isSelected()) {
                    String Mail = this.TxtUsuario.getText();
                    String Password = String.valueOf(this.TxtPassword.getPassword());
                    Paciente pa = new Paciente();
                    pa.setEmail(Mail);
                    pa.setPsw(Password);
                    if (pa.Login() == true) {
                    JOptionPane.showMessageDialog(null, "BIENVENIDO/A: " + pa.getNombre());  
                    this.FInternalLogin.setVisible(false);
                    this.BtnEscritorioIngresar.setVisible(false);
                    this.FInternalLogin.dispose();
                    this.MenuAgregar.setVisible(false);
                    this.MenuItemNuevoPaciente.setVisible(false);
                    this.MenuItemNvaDieta.setVisible(false);
                    this.MenuItemNvaReceta.setVisible(false);
                    this.MenuModificaciones.setVisible(false);
                    this.MenuItemModifPaciente.setVisible(false);
                    this.MenuItemModifReceta.setVisible(false);
                   this.MenuItemObservacionPaciente.setVisible(false);
                   this.MenuBuscar.setVisible(true);
                   this.MenuItemRece.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Vuelva a ingresar los datos"); 
                    this.TxtUsuario.setText(null);
                    this.TxtPassword.setText(null);
                }
            }
        }
    }//GEN-LAST:event_BtnInicioSesionActionPerformed

    private void BtnCrearCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCtaActionPerformed
        FormCrearCtaNutricionista ctanu = new FormCrearCtaNutricionista();
        this.FInternalLogin.setVisible(false);
        this.BtnEscritorioIngresar.setVisible(true);
        this.Escritorio.add(ctanu);
        ctanu.show();      
    }//GEN-LAST:event_BtnCrearCtaActionPerformed

    private void BtnEscritorioIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEscritorioIngresarActionPerformed
        this.FInternalLogin.setVisible(true);
    }//GEN-LAST:event_BtnEscritorioIngresarActionPerformed

    private void BtnEscritorioSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEscritorioSalirActionPerformed
       dispose();
    }//GEN-LAST:event_BtnEscritorioSalirActionPerformed

    private void BtnEscritorioIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEscritorioIngresarMouseClicked
        this.FInternalLogin.setVisible(true);
    }//GEN-LAST:event_BtnEscritorioIngresarMouseClicked

    private void MenuItemNvaRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNvaRecetaActionPerformed
        FormNvaReceta nvare = new FormNvaReceta();
        this.Escritorio.add(nvare);
        nvare.show();
    }//GEN-LAST:event_MenuItemNvaRecetaActionPerformed

    private void MenuItemNvaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNvaDietaActionPerformed
        FormNvaDieta nvadie = new FormNvaDieta();
        this.Escritorio.add(nvadie);
        nvadie.show();
        
    }//GEN-LAST:event_MenuItemNvaDietaActionPerformed

    private void MenuItemModifPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemModifPacienteActionPerformed
        FormBajasyModif bamo = new FormBajasyModif();
        this.Escritorio.add(bamo);
        bamo.show();
    }//GEN-LAST:event_MenuItemModifPacienteActionPerformed

    private void MenuItemModifRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemModifRecetaActionPerformed
        FormModifBajasRecetas bare = new FormModifBajasRecetas();
        this.Escritorio.add(bare);
        bare.show();
    }//GEN-LAST:event_MenuItemModifRecetaActionPerformed

    private void MenuItemObservacionPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemObservacionPacienteActionPerformed
        FormAgregarObserv agro = new FormAgregarObserv();
        this.Escritorio.add(agro);
        agro.show();
    }//GEN-LAST:event_MenuItemObservacionPacienteActionPerformed

    private void MenuItemReceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReceActionPerformed
       FormBuscarReceta obj = new FormBuscarReceta();
       this.Escritorio.add(obj);
       obj.show();
    }//GEN-LAST:event_MenuItemReceActionPerformed
   

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonGrouptipousuario;
    private javax.swing.JButton BtnCrearCta;
    private org.edisoncor.gui.button.ButtonAction BtnEscritorioIngresar;
    private org.edisoncor.gui.button.ButtonAction BtnEscritorioSalir;
    private javax.swing.JButton BtnInicioSesion;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JInternalFrame FInternalLogin;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblTipoUsuario;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JMenu MenuAgregar;
    private javax.swing.JMenu MenuBuscar;
    private javax.swing.JMenuItem MenuItemModifPaciente;
    private javax.swing.JMenuItem MenuItemModifReceta;
    private javax.swing.JMenuItem MenuItemNuevoPaciente;
    private javax.swing.JMenuItem MenuItemNvaDieta;
    private javax.swing.JMenuItem MenuItemNvaReceta;
    private javax.swing.JMenuItem MenuItemObservacionPaciente;
    private javax.swing.JMenuItem MenuItemRece;
    private javax.swing.JMenu MenuModificaciones;
    private javax.swing.JPanel PanelBotones;
    private org.edisoncor.gui.panel.PanelImage PanelImagen;
    private javax.swing.JRadioButton RbNutricionista;
    private javax.swing.JRadioButton RbPaciente;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
