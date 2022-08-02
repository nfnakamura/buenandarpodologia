
package Form;

import Desarrollo.ConsultaPlantillas;


public class FrmConsultaPlantillas extends javax.swing.JInternalFrame {

    
    ConsultaPlantillas objMes = new ConsultaPlantillas();
    
    public FrmConsultaPlantillas() {
        initComponents();
        
         this.TablaMostrar.setModel(objMes.Titulos());
        
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
        jPanel1 = new javax.swing.JPanel();
        ComboSelMes = new com.toedter.calendar.JMonthChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SpinAñoSel = new com.toedter.calendar.JYearChooser();
        ImagenPlantillas = new org.edisoncor.gui.panel.PanelImage();
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
                "Material", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(TablaMostrar);

        LblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTitulo1.setText("PLANTILLAS VENDIDAS EN EL MES");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        ComboSelMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(ComboSelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboSelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        ImagenPlantillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plantillas.png"))); // NOI18N

        javax.swing.GroupLayout ImagenPlantillasLayout = new javax.swing.GroupLayout(ImagenPlantillas);
        ImagenPlantillas.setLayout(ImagenPlantillasLayout);
        ImagenPlantillasLayout.setHorizontalGroup(
            ImagenPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        ImagenPlantillasLayout.setVerticalGroup(
            ImagenPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelMostrar1Layout = new javax.swing.GroupLayout(PanelMostrar1);
        PanelMostrar1.setLayout(PanelMostrar1Layout);
        PanelMostrar1Layout.setHorizontalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(LblTitulo1)
                        .addGap(18, 18, 18)
                        .addComponent(ImagenPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PanelMostrar1Layout.setVerticalGroup(
            PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar1Layout.createSequentialGroup()
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(LblTitulo1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrar1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImagenPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelMostrar1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelMostrar1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PanelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelImagen1Layout = new javax.swing.GroupLayout(PanelImagen1);
        PanelImagen1.setLayout(PanelImagen1Layout);
        PanelImagen1Layout.setHorizontalGroup(
            PanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        PanelImagen1Layout.setVerticalGroup(
            PanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
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
                .addGap(300, 300, 300)
                .addComponent(BtnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                        .addComponent(PanelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTitulo1Layout.createSequentialGroup()
                        .addComponent(PanelMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        PanelTitulo1Layout.setVerticalGroup(
            PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelMostrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnConsultar1))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout PanelConsulta1Layout = new javax.swing.GroupLayout(PanelConsulta1);
        PanelConsulta1.setLayout(PanelConsulta1Layout);
        PanelConsulta1Layout.setHorizontalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(PanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        PanelConsulta1Layout.setVerticalGroup(
            PanelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsulta1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(PanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
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
          this.TablaMostrar.setModel(objMes.Titulos());
         this.TablaMostrar.setModel(objMes.Datos(Mes, Anio));
        
    }//GEN-LAST:event_BtnConsultar1ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar1;
    private javax.swing.JButton BtnSalir;
    private com.toedter.calendar.JMonthChooser ComboSelMes;
    private org.edisoncor.gui.panel.PanelImage ImagenPlantillas;
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
    // End of variables declaration//GEN-END:variables
}
