
package Form;

import Desarrollo.Podologas;
import Desarrollo.Validaciones;
import javax.swing.JOptionPane;



public class FrmPodologas extends javax.swing.JInternalFrame {

    
    Validaciones objVal = new Validaciones();
    
    public FrmPodologas() {
        initComponents();
        
       this.BtnBaja.setEnabled(false);
       this.BtnModif.setEnabled(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        PanelTitulo = new org.edisoncor.gui.panel.PanelRound();
        PanelMostrar = new org.edisoncor.gui.panel.PanelRound();
        LblNom = new javax.swing.JLabel();
        LblApe = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtApe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        PanelMostrar1 = new org.edisoncor.gui.panel.PanelRound();
        TxtIdPod1 = new javax.swing.JLabel();
        LblIdPod = new javax.swing.JLabel();
        TxtIdPod = new javax.swing.JLabel();
        PanelImagen = new org.edisoncor.gui.panel.PanelImage();
        BtnAlta = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnModif = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        panel1.setColorPrimario(new java.awt.Color(153, 204, 255));
        panel1.setColorSecundario(new java.awt.Color(153, 204, 255));

        PanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTitulo.setColorDeBorde(new java.awt.Color(109, 172, 199));
        PanelTitulo.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelTitulo.setColorSecundario(new java.awt.Color(255, 255, 255));

        PanelMostrar.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrar.setColorDeBorde(new java.awt.Color(119, 186, 215));
        PanelMostrar.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelMostrar.setColorSecundario(new java.awt.Color(255, 255, 255));

        LblNom.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblNom.setText("Nombre");

        LblApe.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblApe.setText("Apellido");

        TxtNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        TxtApe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText("REGISTRO PODÓLOGAS");

        BtnLimpiar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnBuscar.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/piess.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        PanelMostrar1.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrar1.setAnchoDeBorde(2.0F);
        PanelMostrar1.setColorDeBorde(new java.awt.Color(119, 186, 215));
        PanelMostrar1.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelMostrar1.setColorSecundario(new java.awt.Color(255, 255, 255));

        TxtIdPod1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N

        LblIdPod.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblIdPod.setText("Id Nro");

        TxtIdPod.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N

        javax.swing.GroupLayout PanelMostrar1Layout = new javax.swing.GroupLayout(PanelMostrar1);
        PanelMostrar1.setLayout(PanelMostrar1Layout);
        PanelMostrar1Layout.setHorizontalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(TxtIdPod1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LblIdPod)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIdPod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelMostrar1Layout.setVerticalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblIdPod)
                    .addComponent(TxtIdPod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(TxtIdPod1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelMostrarLayout = new javax.swing.GroupLayout(PanelMostrar);
        PanelMostrar.setLayout(PanelMostrarLayout);
        PanelMostrarLayout.setHorizontalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarLayout.createSequentialGroup()
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(PanelMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addContainerGap(252, Short.MAX_VALUE)
                        .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(PanelMostrarLayout.createSequentialGroup()
                                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblApe)
                                    .addComponent(LblNom))
                                .addGap(45, 45, 45)
                                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)))
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(204, 204, 204))
        );
        PanelMostrarLayout.setVerticalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarLayout.createSequentialGroup()
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(PanelMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNom)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApe)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnLimpiar)
                            .addComponent(BtnBuscar)))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        PanelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelImagenLayout = new javax.swing.GroupLayout(PanelImagen);
        PanelImagen.setLayout(PanelImagenLayout);
        PanelImagenLayout.setHorizontalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        PanelImagenLayout.setVerticalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        BtnAlta.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnAlta.setText("Registrar");
        BtnAlta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnBaja.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnBaja.setText("Baja");
        BtnBaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnModif.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnModif.setText("Modificar");
        BtnModif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addComponent(BtnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(BtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlta)
                    .addComponent(BtnBaja)
                    .addComponent(BtnModif)
                    .addComponent(BtnSalir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
           
       String Nom = this.TxtNom.getText().toUpperCase();
       String Ape = this.TxtApe.getText().toUpperCase();
       
       Podologas objAltaPodologa = new Podologas(Nom,Ape);
       objAltaPodologa.AltasPodologa();
       limpiar(); 
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        Podologas objBuscaIdPodologa = new Podologas();
        
        int IdPodologaAux = Integer.parseInt(this.TxtIdPod.getText());
        System.out.println(IdPodologaAux);
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar a la podóloga del registro?", "", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == 0)
        {
          objBuscaIdPodologa.BajaPodologa(IdPodologaAux);
        limpiar();  
        }
        
        
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
       int IdPodologaAux = Integer.parseInt(this.TxtIdPod.getText());
       String Nom = this.TxtNom.getText().toUpperCase();
       String Ape = this.TxtApe.getText().toUpperCase();
        
       Podologas objModifPodologa = new Podologas(Nom,Ape);
       objModifPodologa.ModifPodologa(IdPodologaAux);
        
    }//GEN-LAST:event_BtnModifActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String Nom = this.TxtNom.getText().toUpperCase();
        String Ape = this.TxtApe.getText().toUpperCase();
        
        Podologas objBuscaIdPodologa = new Podologas();
        boolean existe = objBuscaIdPodologa.BuscarPodId(Nom,Ape);
        if (existe == true) 
        {
            this.TxtIdPod.setText(String.valueOf(objBuscaIdPodologa.getIdPodologa()));
            this.TxtNom.setText(String.valueOf(objBuscaIdPodologa.getNom()));
            this.TxtApe.setText(String.valueOf(objBuscaIdPodologa.getApe())); 
            JOptionPane.showMessageDialog(null, "Podologa Encontrada");
            
            this.BtnBaja.setEnabled(true);
            this.BtnModif.setEnabled(true);
            this.BtnAlta.setEnabled(false);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "ATENCION!! Id inexistente ", "PODOLOGAS", JOptionPane.INFORMATION_MESSAGE);
        }
      
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        objVal.sololetras(evt);
        String campo = TxtNom.getText();
        int longitud = 30;
        objVal.validarLongitud(campo, longitud, evt);        
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApeKeyTyped
        objVal.sololetras(evt);
        String campo = TxtNom.getText();
        int longitud = 30;
        objVal.validarLongitud(campo, longitud, evt);  
    }//GEN-LAST:event_TxtApeKeyTyped

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    public void limpiar()
    {
        this.TxtIdPod.setText(null);
        this.TxtNom.setText(null);
        this.TxtApe.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModif;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblApe;
    private javax.swing.JLabel LblIdPod;
    private javax.swing.JLabel LblNom;
    private org.edisoncor.gui.panel.PanelImage PanelImagen;
    private org.edisoncor.gui.panel.PanelRound PanelMostrar;
    private org.edisoncor.gui.panel.PanelRound PanelMostrar1;
    private org.edisoncor.gui.panel.PanelRound PanelTitulo;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JLabel TxtIdPod;
    private javax.swing.JLabel TxtIdPod1;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JLabel jLabel3;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    // End of variables declaration//GEN-END:variables
}
