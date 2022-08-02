
package Form;


import Desarrollo.Validaciones;


public class FrmMenu extends javax.swing.JFrame {

    
    Validaciones objVal = new Validaciones();

    public FrmMenu() {
        initComponents();
        
       this.BtnFicha.setEnabled(false);
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new org.edisoncor.gui.panel.Panel();
        PanelArriba = new javax.swing.JPanel();
        PanelTitulo = new org.edisoncor.gui.panel.PanelRound();
        LblNom = new javax.swing.JLabel();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRound();
        LblApe = new javax.swing.JLabel();
        TxtApe = new org.edisoncor.gui.textField.TextFieldRound();
        panelRound2 = new org.edisoncor.gui.panel.PanelRound();
        BtnFicha = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jMenuBar1 = new javax.swing.JMenuBar();
        OpcInicio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        OpcConsultas = new javax.swing.JMenu();
        ConsultaMas30Dias = new javax.swing.JMenuItem();
        ConsultaMensual = new javax.swing.JMenuItem();
        ConsultaPlantillas = new javax.swing.JMenuItem();
        ConsultaLenox = new javax.swing.JMenuItem();
        ConsultaProdBuenAndar = new javax.swing.JMenuItem();
        ConsultaTotalProd = new javax.swing.JMenuItem();
        OpcPod = new javax.swing.JMenu();
        MenuAbmPod = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setColorPrimario(new java.awt.Color(153, 204, 255));
        Escritorio.setColorSecundario(new java.awt.Color(102, 204, 255));

        PanelArriba.setBackground(new java.awt.Color(0, 153, 255));
        PanelArriba.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelArribaLayout = new javax.swing.GroupLayout(PanelArriba);
        PanelArriba.setLayout(PanelArribaLayout);
        PanelArribaLayout.setHorizontalGroup(
            PanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelArribaLayout.setVerticalGroup(
            PanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        PanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTitulo.setColorDeBorde(new java.awt.Color(109, 172, 199));
        PanelTitulo.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelTitulo.setColorSecundario(new java.awt.Color(255, 255, 255));

        LblNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblNom.setText("Nombre");

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        LblApe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblApe.setText("Apellido");

        TxtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApeKeyTyped(evt);
            }
        });

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setColorDeBorde(new java.awt.Color(119, 186, 215));
        panelRound2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRound2.setColorSecundario(new java.awt.Color(255, 255, 255));

        BtnFicha.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BtnFicha.setText("Ficha Paciente");
        BtnFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFichaActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(BtnFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(BtnFicha))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BtnSalir)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelTituloLayout.createSequentialGroup()
                                .addComponent(LblNom)
                                .addGap(184, 184, 184)
                                .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelTituloLayout.createSequentialGroup()
                                .addComponent(LblApe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApe)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(PanelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        OpcInicio.setText("Inicio");
        OpcInicio.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Menú Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        OpcInicio.add(jMenuItem1);

        jMenuBar1.add(OpcInicio);

        OpcConsultas.setText("Consultas");
        OpcConsultas.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        ConsultaMas30Dias.setText("Ultima consulta más de 30 días");
        ConsultaMas30Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaMas30DiasActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaMas30Dias);

        ConsultaMensual.setText("Total consultas mes");
        ConsultaMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaMensualActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaMensual);

        ConsultaPlantillas.setText("Cantidad plantillas mes");
        ConsultaPlantillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaPlantillasActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaPlantillas);

        ConsultaLenox.setText("Cantidad de prod Lenox mes");
        ConsultaLenox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaLenoxActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaLenox);

        ConsultaProdBuenAndar.setText("Cantidad de prod BuenAndar mes");
        ConsultaProdBuenAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaProdBuenAndarActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaProdBuenAndar);

        ConsultaTotalProd.setText("Total productos mes");
        ConsultaTotalProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaTotalProdActionPerformed(evt);
            }
        });
        OpcConsultas.add(ConsultaTotalProd);

        jMenuBar1.add(OpcConsultas);

        OpcPod.setText("Podologas");
        OpcPod.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        MenuAbmPod.setText("ABM");
        MenuAbmPod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbmPodActionPerformed(evt);
            }
        });
        OpcPod.add(MenuAbmPod);

        jMenuBar1.add(OpcPod);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFichaActionPerformed
       //validar con if las cajas de txt que no esten vacias.... no se puede hacer nada
       //ejecuto metodo buscarpornomyape
       //y si no existe solo completa nom y ape con un get Text
       // si existe le pasa la data con el metodo buscarpornomyape y  le completa los campos
       
       String Nom = "";
       String Ape = "";// las mando por constructor
              
        
       Nom = this.TxtNom.getText();
       Ape = this.TxtApe.getText();
       
       
              
       FrmFichaHistoriaClinica objFichaHistoriaClinica = new FrmFichaHistoriaClinica(Nom, Ape); //pasarle nom ape construuctor con parametros
       Escritorio.add(objFichaHistoriaClinica);
       objFichaHistoriaClinica.show();
       
       
       
       PanelTitulo.setVisible(false);
       PanelArriba.setVisible(false);

       
    }//GEN-LAST:event_BtnFichaActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
       PanelTitulo.setVisible(true);
       PanelArriba.setVisible(true);
       this.TxtNom.setText(null);
       this.TxtApe.setText(null);
       
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ConsultaMas30DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaMas30DiasActionPerformed
        FrmConsultaMas30Dias objAccionBoton = new FrmConsultaMas30Dias();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
                        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaMas30DiasActionPerformed

    private void ConsultaMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaMensualActionPerformed
        FrmConsultaTotalMensuales objAccionBoton = new FrmConsultaTotalMensuales();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaMensualActionPerformed

    private void ConsultaPlantillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaPlantillasActionPerformed
        FrmConsultaPlantillas objAccionBoton = new FrmConsultaPlantillas();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaPlantillasActionPerformed

    private void ConsultaLenoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaLenoxActionPerformed
        FrmConsultaLenox objAccionBoton = new FrmConsultaLenox();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaLenoxActionPerformed

    private void ConsultaProdBuenAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProdBuenAndarActionPerformed
        FrmConsultaProdBuenAndar objAccionBoton = new FrmConsultaProdBuenAndar();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaProdBuenAndarActionPerformed

    private void ConsultaTotalProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaTotalProdActionPerformed
        FrmConsultaProdTotal objAccionBoton = new FrmConsultaProdTotal();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_ConsultaTotalProdActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        this.BtnFicha.setEnabled(true);
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

    private void MenuAbmPodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbmPodActionPerformed
        FrmPodologas objAccionBoton = new FrmPodologas();
        Escritorio.add(objAccionBoton);
        objAccionBoton.show();
        
        PanelTitulo.setVisible(false);
        PanelArriba.setVisible(false);
    }//GEN-LAST:event_MenuAbmPodActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFicha;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JMenuItem ConsultaLenox;
    private javax.swing.JMenuItem ConsultaMas30Dias;
    private javax.swing.JMenuItem ConsultaMensual;
    private javax.swing.JMenuItem ConsultaPlantillas;
    private javax.swing.JMenuItem ConsultaProdBuenAndar;
    private javax.swing.JMenuItem ConsultaTotalProd;
    private org.edisoncor.gui.panel.Panel Escritorio;
    private javax.swing.JLabel LblApe;
    private javax.swing.JLabel LblNom;
    private javax.swing.JMenuItem MenuAbmPod;
    private javax.swing.JMenu OpcConsultas;
    private javax.swing.JMenu OpcInicio;
    private javax.swing.JMenu OpcPod;
    private javax.swing.JPanel PanelArriba;
    private org.edisoncor.gui.panel.PanelRound PanelTitulo;
    private org.edisoncor.gui.textField.TextFieldRound TxtApe;
    private org.edisoncor.gui.textField.TextFieldRound TxtNom;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
