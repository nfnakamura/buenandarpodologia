
package Form;

import Desarrollo.ConsultaProdTotal;



public class FrmConsultaProdTotal extends javax.swing.JInternalFrame {

    
    ConsultaProdTotal objProd = new ConsultaProdTotal();
    
    public FrmConsultaProdTotal() {
        initComponents();
        
        this.TablaMostrar.setModel(objProd.Titulos());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsulta1 = new javax.swing.JPanel();
        PanelTitulo1 = new org.edisoncor.gui.panel.PanelRound();
        PanelMostrar1 = new org.edisoncor.gui.panel.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMostrar = new javax.swing.JTable();
        LblTitulo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ComboSelMes = new com.toedter.calendar.JMonthChooser();
        jPanel4 = new javax.swing.JPanel();
        SpinAñoSel = new com.toedter.calendar.JYearChooser();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        ImagenLenox = new org.edisoncor.gui.panel.PanelImage();
        ImagenPlantillas4 = new org.edisoncor.gui.panel.PanelImage();
        PanelImagen1 = new org.edisoncor.gui.panel.PanelImage();
        BtnConsultar1 = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        PanelConsulta1.setBackground(new java.awt.Color(153, 204, 255));

        PanelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        PanelTitulo1.setColorDeBorde(new java.awt.Color(109, 172, 199));
        PanelTitulo1.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelTitulo1.setColorSecundario(new java.awt.Color(255, 255, 255));

        PanelMostrar1.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrar1.setColorDeBorde(new java.awt.Color(119, 186, 215));
        PanelMostrar1.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelMostrar1.setColorSecundario(new java.awt.Color(255, 255, 255));

        TablaMostrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(TablaMostrar);

        LblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTitulo1.setText("TOTAL PRODUCTOS VENDIDOS EN EL MES");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Año");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ComboSelMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboSelMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboSelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpinAñoSel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpinAñoSel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar2.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        ImagenLenox.setBackground(new java.awt.Color(255, 255, 255));
        ImagenLenox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cropped-logo-7.png"))); // NOI18N

        javax.swing.GroupLayout ImagenLenoxLayout = new javax.swing.GroupLayout(ImagenLenox);
        ImagenLenox.setLayout(ImagenLenoxLayout);
        ImagenLenoxLayout.setHorizontalGroup(
            ImagenLenoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        ImagenLenoxLayout.setVerticalGroup(
            ImagenLenoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        ImagenPlantillas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plantillas.png"))); // NOI18N

        javax.swing.GroupLayout ImagenPlantillas4Layout = new javax.swing.GroupLayout(ImagenPlantillas4);
        ImagenPlantillas4.setLayout(ImagenPlantillas4Layout);
        ImagenPlantillas4Layout.setHorizontalGroup(
            ImagenPlantillas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        ImagenPlantillas4Layout.setVerticalGroup(
            ImagenPlantillas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelMostrar1Layout = new javax.swing.GroupLayout(PanelMostrar1);
        PanelMostrar1.setLayout(PanelMostrar1Layout);
        PanelMostrar1Layout.setHorizontalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrar1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(ImagenLenox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(ImagenPlantillas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(LblTitulo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMostrar1Layout.setVerticalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LblTitulo1)
                .addGap(18, 18, 18)
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrar1Layout.createSequentialGroup()
                        .addComponent(ImagenLenox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ImagenPlantillas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        PanelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelImagen1Layout = new javax.swing.GroupLayout(PanelImagen1);
        PanelImagen1.setLayout(PanelImagen1Layout);
        PanelImagen1Layout.setHorizontalGroup(
            PanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        PanelImagen1Layout.setVerticalGroup(
            PanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        BtnConsultar1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnConsultar1.setText("Consultar");
        BtnConsultar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultar1ActionPerformed(evt);
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

        javax.swing.GroupLayout PanelTitulo1Layout = new javax.swing.GroupLayout(PanelTitulo1);
        PanelTitulo1.setLayout(PanelTitulo1Layout);
        PanelTitulo1Layout.setHorizontalGroup(
            PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitulo1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(PanelMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                        .addComponent(PanelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                        .addComponent(BtnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        PanelTitulo1Layout.setVerticalGroup(
            PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnConsultar1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelConsulta1Layout = new javax.swing.GroupLayout(PanelConsulta1);
        PanelConsulta1.setLayout(PanelConsulta1Layout);
        PanelConsulta1Layout.setHorizontalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        PanelConsulta1Layout.setVerticalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultar1ActionPerformed
        
       String Mes = String.valueOf(this.ComboSelMes.getMonth());
       String Anio = String.valueOf(this.SpinAñoSel.getYear());
        if ("0".equals(Mes))
        {
            Mes = "01";
        }
        else
        {
            if ("1".equals(Mes))
            {
                Mes = "02";
            } 
            else
            {
                if ("2".equals(Mes))
                {
                  Mes = "03";  
                } 
                else
                {
                    if ("3".equals(Mes))
                    {
                        Mes = "04";
                    }
                    else 
                    {
                        if ("4".equals(Mes))
                        {
                            Mes = "05";
                        }
                        else
                        {
                            if ("5".equals(Mes))
                            {
                              Mes = "06";   
                            }
                            else
                            {
                                if ("6".equals(Mes)) 
                                {
                                    Mes = "07";
                                }
                                else
                                {
                                    if ("7".equals(Mes))
                                    {
                                        Mes = "08";
                                    } else 
                                    {
                                        if ("8".equals(Mes)) 
                                        {
                                            Mes = "09";
                                        } 
                                        else
                                        {
                                            if ("9".equals(Mes))
                                            {
                                               Mes = "10"; 
                                            } else 
                                            {
                                                if ("10".equals(Mes))
                                                {
                                                    Mes = "11";
                                                } 
                                                else
                                                {
                                                    if ("11".equals(Mes)) 
                                                    {
                                                        Mes = "12";
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }  
         this.TablaMostrar.setModel(objProd.Titulos());
         this.TablaMostrar.setModel(objProd.Datos(Mes, Anio));
        
        
        
    }//GEN-LAST:event_BtnConsultar1ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar1;
    private javax.swing.JButton BtnSalir;
    private com.toedter.calendar.JMonthChooser ComboSelMes;
    private org.edisoncor.gui.panel.PanelImage ImagenLenox;
    private org.edisoncor.gui.panel.PanelImage ImagenPlantillas4;
    private javax.swing.JLabel LblTitulo1;
    private javax.swing.JPanel PanelConsulta1;
    private org.edisoncor.gui.panel.PanelImage PanelImagen1;
    private org.edisoncor.gui.panel.PanelRound PanelMostrar1;
    private org.edisoncor.gui.panel.PanelRound PanelTitulo1;
    private com.toedter.calendar.JYearChooser SpinAñoSel;
    private javax.swing.JTable TablaMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
