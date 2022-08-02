
package Form;

import Desarrollo.Ficha;
import Desarrollo.HistoriaClinica;
import Desarrollo.Plantillas;
import Desarrollo.Podologas;
import Desarrollo.Productos;
import Desarrollo.Validaciones;
import javax.swing.JOptionPane;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;
import javax.swing.undo.UndoManager;

public class FrmFichaHistoriaClinica extends javax.swing.JInternalFrame {
    
    
    int NroFicha;
    String Diabet = "";
    String TxtDiabet= "";
    String OtroAnt = "";
    String TxtOtroAnt = ""; 
    String Esguince = "";
    String TxtEsguince = "";
    String TomaAsp = "";
    String TxtTomaAsp = "";
    String Alergias = "";
    String TxtAlergias = "";
    
    
    int fila = 0;
    static String matriz [][] = new String [5][21];
    
    Plantillas objPlantillas = new Plantillas();
   
    Validaciones objVal = new Validaciones();
    
    Podologas objPod = new Podologas();
    
    UndoManager um = new UndoManager();
    
    public FrmFichaHistoriaClinica(String Nom , String Ape) {  // agregarle los parametros de nombre y apellido para que los cargue
        initComponents();
     
    this.ComboPodologa.setModel(objPod.MostrarNom());   
        
    this.TxtNom.setText(Nom);
    this.TxtApe.setText(Ape);
    this.TxtNroFicha.setEditable(false);
    this.TxtDiabetico.setEditable(false);
    this.TxtTomaMedicacion.setEditable(false);
    this.TxtAlergia.setEditable(false);
    this.TxtOtroAntMed.setEditable(false);
    this.TxtEsguinceFrac.setEditable(false);
    this.TxtAreaAntMed.setEditable(false);
    
    this.TxtOtroMotiv.setEditable(false);
    this.TxtHalluxIzq.setEditable(false);
    this.TxtDedo2Izq.setEditable(false);
    this.TxtDedo3Izq.setEditable(false);
    this.TxtDedo4Izq.setEditable(false);
    this.TxtDedo5Izq.setEditable(false);
    this.TxtZonaTalarIzq.setEditable(false);
    this.TxtZonaMetIzq.setEditable(false);
    this.TxtEspInterdigitalIzq.setEditable(false);
    this.TxtZonaPlanIzq.setEditable(false);
    this.TxtZonaMedIzq.setEditable(false);
    this.TxtHalluxDer.setEditable(false); 
    this.TxtDedo2Der.setEditable(false);
    this.TxtDedo3Der.setEditable(false);
    this.TxtDedo4Der.setEditable(false); 
    this.TxtDedo5Der.setEditable(false);
    this.TxtZonaTalarDer.setEditable(false);
    this.TxtZonaMetDer.setEditable(false);
    this.TxtEspInterdigitalDer.setEditable(false);
    this.TxtZonaPlanDer.setEditable(false);
    this.TxtZonaMedDer.setEditable(false);
    this.TxtOtroTrat.setEditable(false);
    this.TxtOtroOrtesis.setEditable(false);
    this.TxtOtroIndic.setEditable(false);
    this.TxtDetalleHistoriaClinica.setEditable(false);
    this.TxtDetalleHistoriaClinica.setEditable(false);
    
    this.BtnEditarFicha.setEnabled(false);
    this.BtnAceptarEditFicha.setEnabled(false);
    this.BtnCancelarEditFicha.setEnabled(false);
    
    this.BtnEditarHistoriaClinica.setEnabled(false);
    this.BtnAceptarEditHistoriaClinica.setEnabled(false);
    this.BtnCancelarEditHistoriaClinica.setEnabled(false);
    this.BtnGuardarConsulta.setEnabled(false);
    
    this.SpinRealIntIzq.setEnabled(false);
    this.SpinRealExtIzq.setEnabled(false);
    this.SpinRealIntDer.setEnabled(false);
    this.SpinRealExtDer.setEnabled(false);
    
    Date FechaActual = new Date();
    this.DateFechaConsulta.setDate(FechaActual);
    this.DateFechaProductos.setDate(FechaActual);
    
    this.TablaMostrar.setModel(objPlantillas.Titulos());
     
    
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrpSexo = new javax.swing.ButtonGroup();
        PopMDeshacerRehacer = new javax.swing.JPopupMenu();
        opDeshacer = new javax.swing.JMenuItem();
        opRehacer = new javax.swing.JMenuItem();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jPanel3 = new javax.swing.JPanel();
        LblAntMedicosList = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtAreaAntMed = new javax.swing.JTextArea();
        PanelMostrarDatos = new javax.swing.JPanel();
        LblMostrarApe = new javax.swing.JLabel();
        LblActividadFisica = new javax.swing.JLabel();
        LblMostrarNroFicha = new javax.swing.JLabel();
        LblMostrarEdad = new javax.swing.JLabel();
        LblMostrarSexo = new javax.swing.JLabel();
        LblMostrarNom = new javax.swing.JLabel();
        LblActividadFisicaReal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        PanelPestanas = new javax.swing.JTabbedPane();
        PanelFicha = new javax.swing.JPanel();
        PanelBotonesFicha = new javax.swing.JPanel();
        BtnEditarFicha = new javax.swing.JButton();
        BtnGuardarFicha = new javax.swing.JButton();
        BtnCancelarEditFicha = new javax.swing.JButton();
        LblTituloFicha = new javax.swing.JLabel();
        BtnLimpiarForm = new javax.swing.JButton();
        BtnAceptarEditFicha = new javax.swing.JButton();
        PanelDatos2 = new javax.swing.JPanel();
        LblAntMed = new javax.swing.JLabel();
        ChkEsguince = new javax.swing.JCheckBox();
        ChkDiabetico = new javax.swing.JCheckBox();
        ChkAnticoag = new javax.swing.JCheckBox();
        ChkMedicacion = new javax.swing.JCheckBox();
        ChkAlergia = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtObservFicha = new javax.swing.JTextArea();
        LblObservFicha = new javax.swing.JLabel();
        ChkOtroAntMed = new javax.swing.JCheckBox();
        TxtOtroAntMed = new javax.swing.JTextField();
        TxtAlergia = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtEsguinceFrac = new javax.swing.JTextArea();
        TxtDiabetico = new javax.swing.JTextField();
        TxtTomaMedicacion = new javax.swing.JTextField();
        PanelDatos1 = new javax.swing.JPanel();
        LblNom = new javax.swing.JLabel();
        LblNroFicha = new javax.swing.JLabel();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRound();
        LblApe = new javax.swing.JLabel();
        TxtApe = new org.edisoncor.gui.textField.TextFieldRound();
        LblDni = new javax.swing.JLabel();
        TxtDni = new org.edisoncor.gui.textField.TextFieldRound();
        LblSexo = new javax.swing.JLabel();
        LblCel = new javax.swing.JLabel();
        TxtCel = new org.edisoncor.gui.textField.TextFieldRound();
        LblTel = new javax.swing.JLabel();
        TxtTel = new org.edisoncor.gui.textField.TextFieldRound();
        LblDir = new javax.swing.JLabel();
        TxtDir = new org.edisoncor.gui.textField.TextFieldRound();
        LblMail = new javax.swing.JLabel();
        TxtMail = new org.edisoncor.gui.textField.TextFieldRound();
        LblActFisica = new javax.swing.JLabel();
        TxtActFisica = new org.edisoncor.gui.textField.TextFieldRound();
        LblFecha = new javax.swing.JLabel();
        DateFechaNac = new com.toedter.calendar.JDateChooser();
        TxtNroFicha = new javax.swing.JTextField();
        RbFem = new javax.swing.JRadioButton();
        RbMasc = new javax.swing.JRadioButton();
        RbOtro = new javax.swing.JRadioButton();
        BtnBuscarPaciente = new javax.swing.JButton();
        PanelHistoriaClinica = new javax.swing.JPanel();
        PanelBotonesHist = new javax.swing.JPanel();
        LblTituloHistoria = new javax.swing.JLabel();
        BtnLimpiarHistClinica = new javax.swing.JButton();
        BtnGuardarHistoriaClinica = new javax.swing.JButton();
        BtnVerDetalleHist = new javax.swing.JButton();
        PanelIndicaciones = new javax.swing.JPanel();
        LblIndicaciones = new javax.swing.JLabel();
        ChkVolver7 = new javax.swing.JCheckBox();
        ChkRealizarConsMed = new javax.swing.JCheckBox();
        ChkAntiBac = new javax.swing.JCheckBox();
        ChkCremaRegen = new javax.swing.JCheckBox();
        ChkCremaHid = new javax.swing.JCheckBox();
        ChkOrtesis = new javax.swing.JCheckBox();
        ChkPlantillas = new javax.swing.JCheckBox();
        ChkOtroIndic = new javax.swing.JCheckBox();
        TxtOtroIndic = new javax.swing.JTextField();
        ChkCompresas = new javax.swing.JCheckBox();
        ChkTratAntimic = new javax.swing.JCheckBox();
        ChkVolver30 = new javax.swing.JCheckBox();
        PanelObservHistoria = new javax.swing.JPanel();
        LblObservHistoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtObservHistoria = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        PanelDiag = new javax.swing.JPanel();
        ComboDiag = new javax.swing.JComboBox<>();
        LblDiag = new javax.swing.JLabel();
        TxtChkOtroDiag = new javax.swing.JTextField();
        BtnConfirmDiag = new javax.swing.JButton();
        PanelZona = new javax.swing.JPanel();
        LblZonaPod = new javax.swing.JLabel();
        ChkHalluxIzq = new javax.swing.JCheckBox();
        ChkDedo2Izq = new javax.swing.JCheckBox();
        ChkDedo3Izq = new javax.swing.JCheckBox();
        ChkDedo4Izq = new javax.swing.JCheckBox();
        ChkDedo5Izq = new javax.swing.JCheckBox();
        ChkZonaTalarIzq = new javax.swing.JCheckBox();
        ChkZonaMetaIzq = new javax.swing.JCheckBox();
        ChkZonaPlantIzq = new javax.swing.JCheckBox();
        ChkZonaMedialIzq = new javax.swing.JCheckBox();
        TxtHalluxIzq = new javax.swing.JTextField();
        TxtDedo2Izq = new javax.swing.JTextField();
        TxtDedo3Izq = new javax.swing.JTextField();
        TxtDedo4Izq = new javax.swing.JTextField();
        TxtDedo5Izq = new javax.swing.JTextField();
        TxtZonaTalarIzq = new javax.swing.JTextField();
        TxtZonaPlanIzq = new javax.swing.JTextField();
        TxtZonaMedIzq = new javax.swing.JTextField();
        TxtZonaMetIzq = new javax.swing.JTextField();
        ChkEspInterdigitalIzq = new javax.swing.JCheckBox();
        TxtEspInterdigitalIzq = new javax.swing.JTextField();
        PanelSector = new javax.swing.JPanel();
        LblSector = new javax.swing.JLabel();
        ChkHalluxDer = new javax.swing.JCheckBox();
        ChkDedo2Der = new javax.swing.JCheckBox();
        ChkDedo3Der = new javax.swing.JCheckBox();
        ChkDedo4Der = new javax.swing.JCheckBox();
        ChkDedo5Der = new javax.swing.JCheckBox();
        ChkZonaTalarDer = new javax.swing.JCheckBox();
        ChkZonaPlantDer = new javax.swing.JCheckBox();
        ChkZonaMedialDer = new javax.swing.JCheckBox();
        ChkZonaMetaDer = new javax.swing.JCheckBox();
        TxtHalluxDer = new javax.swing.JTextField();
        TxtDedo2Der = new javax.swing.JTextField();
        TxtDedo3Der = new javax.swing.JTextField();
        TxtDedo4Der = new javax.swing.JTextField();
        TxtDedo5Der = new javax.swing.JTextField();
        TxtZonaTalarDer = new javax.swing.JTextField();
        TxtZonaPlanDer = new javax.swing.JTextField();
        TxtZonaMedDer = new javax.swing.JTextField();
        TxtZonaMetDer = new javax.swing.JTextField();
        TxtEspInterdigitalDer = new javax.swing.JTextField();
        ChkEspInterdigitalDer = new javax.swing.JCheckBox();
        PanelMotiv = new javax.swing.JPanel();
        LblMotivoCons = new javax.swing.JLabel();
        ChkControl = new javax.swing.JCheckBox();
        ChkCuracion = new javax.swing.JCheckBox();
        ChkPedigraf = new javax.swing.JCheckBox();
        ChkOtroMotiv = new javax.swing.JCheckBox();
        TxtOtroMotiv = new javax.swing.JTextField();
        ChkVisitaMen = new javax.swing.JCheckBox();
        ChkAlgia = new javax.swing.JCheckBox();
        ChkTopic = new javax.swing.JCheckBox();
        PanelFechaConsulta = new javax.swing.JPanel();
        LblFechaConsulta = new javax.swing.JLabel();
        DateFechaConsulta = new com.toedter.calendar.JDateChooser();
        PanelOrtesis = new javax.swing.JPanel();
        ChkBajadedo = new javax.swing.JCheckBox();
        ChkCorrectorNoc = new javax.swing.JCheckBox();
        ChkDedal = new javax.swing.JCheckBox();
        LblOrtesis = new javax.swing.JLabel();
        ChkDescargaMoles = new javax.swing.JCheckBox();
        ChkDescargaGomaEva = new javax.swing.JCheckBox();
        ChkOrtesisSilicona = new javax.swing.JCheckBox();
        ChkFerula = new javax.swing.JCheckBox();
        ChkAcrilico = new javax.swing.JCheckBox();
        ChkOtroOrtesis = new javax.swing.JCheckBox();
        TxtOtroOrtesis = new javax.swing.JTextField();
        ChkAnilloSil = new javax.swing.JCheckBox();
        ChkSeparador = new javax.swing.JCheckBox();
        PanelPodologas = new javax.swing.JPanel();
        ComboPodologa = new javax.swing.JComboBox<>();
        LblTrat1 = new javax.swing.JLabel();
        PanelCodHistoria = new javax.swing.JPanel();
        LblCodHist = new javax.swing.JLabel();
        TxtCodHist = new javax.swing.JTextField();
        BtnBuscarHistoria = new javax.swing.JButton();
        PanelTrat = new javax.swing.JPanel();
        ChkRemDent = new javax.swing.JCheckBox();
        ChkHelotomia = new javax.swing.JCheckBox();
        ChkEspiculotomia = new javax.swing.JCheckBox();
        ChkTopicacion = new javax.swing.JCheckBox();
        ChkColacion = new javax.swing.JCheckBox();
        LblTerap = new javax.swing.JLabel();
        ChkOtroTrat = new javax.swing.JCheckBox();
        TxtOtroTrat = new javax.swing.JTextField();
        ChkLimpiezaSurcos = new javax.swing.JCheckBox();
        ChkEduPod = new javax.swing.JCheckBox();
        ChkCorteU = new javax.swing.JCheckBox();
        ChkAblacOnic = new javax.swing.JCheckBox();
        ChkAblacTotLamin = new javax.swing.JCheckBox();
        ChkAblacParLamin = new javax.swing.JCheckBox();
        ChkFresado = new javax.swing.JCheckBox();
        ChkIdemCons = new javax.swing.JCheckBox();
        ChkHiperqueratomía = new javax.swing.JCheckBox();
        ChkReguLamina = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        PanelDetalleHistoria = new javax.swing.JPanel();
        PanelDetalleGrandeHistoria = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtDetalleHistoriaClinica = new javax.swing.JTextArea();
        PanelTituloDetalle = new javax.swing.JPanel();
        LblDetalleGrandeHistoria = new javax.swing.JLabel();
        BtnGuardarConsulta = new javax.swing.JButton();
        BtnEditarHistoriaClinica = new javax.swing.JButton();
        BtnAceptarEditHistoriaClinica = new javax.swing.JButton();
        BtnCancelarEditHistoriaClinica = new javax.swing.JButton();
        PanelProximosTurnos = new javax.swing.JPanel();
        PanelPlantillas = new javax.swing.JPanel();
        ImagenPlantillas = new org.edisoncor.gui.panel.PanelImage();
        LblPlanitllasTit = new javax.swing.JLabel();
        LblMaterial = new javax.swing.JLabel();
        ComboMaterial = new javax.swing.JComboBox<>();
        PanelPlantillaDer = new javax.swing.JPanel();
        LblPlantillaPieDer = new javax.swing.JLabel();
        ChkArcoDuroDer = new javax.swing.JCheckBox();
        ChkArcoBlandoDer = new javax.swing.JCheckBox();
        ChkCunPronDer = new javax.swing.JCheckBox();
        ChkCunSupDer = new javax.swing.JCheckBox();
        ChkTalonDer = new javax.swing.JCheckBox();
        ChkRealIntDer = new javax.swing.JCheckBox();
        SpinRealIntDer = new javax.swing.JSpinner();
        LblMm3 = new javax.swing.JLabel();
        ChkRealExtDer = new javax.swing.JCheckBox();
        SpinRealExtDer = new javax.swing.JSpinner();
        LblMm4 = new javax.swing.JLabel();
        PanelPlantillaIzq = new javax.swing.JPanel();
        LblPlantillaPieIzq = new javax.swing.JLabel();
        ChkArcoDuroIzq = new javax.swing.JCheckBox();
        ChkArcoBlandoIzq = new javax.swing.JCheckBox();
        ChkCunPronIzq = new javax.swing.JCheckBox();
        ChkCunSupIzq = new javax.swing.JCheckBox();
        ChkTalonIzq = new javax.swing.JCheckBox();
        ChkRealIntIzq = new javax.swing.JCheckBox();
        ChkRealExtIzq = new javax.swing.JCheckBox();
        LblMm1 = new javax.swing.JLabel();
        LblMm2 = new javax.swing.JLabel();
        SpinRealIntIzq = new javax.swing.JSpinner();
        SpinRealExtIzq = new javax.swing.JSpinner();
        PanelFechaProd = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        DateFechaProductos = new com.toedter.calendar.JDateChooser();
        LblCantidadPlanitllas = new javax.swing.JLabel();
        SpinCantidadPlantillas = new javax.swing.JSpinner();
        ChkPlantillasProd = new javax.swing.JCheckBox();
        BtnVerTabla = new javax.swing.JButton();
        BtnBajaRegistro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        LblDetalleGrandeHistoria1 = new javax.swing.JLabel();
        BtnGuardarProductos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        LblProdLenox = new javax.swing.JLabel();
        ImagenLenox = new org.edisoncor.gui.panel.PanelImage();
        ChkAnilloSilProd = new javax.swing.JCheckBox();
        ChkBajaDedoProd = new javax.swing.JCheckBox();
        ChkCorrecHxProd = new javax.swing.JCheckBox();
        ChkDedalProd = new javax.swing.JCheckBox();
        ChkSeparadorProd = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        SpinCantAnillo = new javax.swing.JSpinner();
        SpinCantBajaDedo = new javax.swing.JSpinner();
        SpinCantCorrecHx = new javax.swing.JSpinner();
        SpinCantDedal = new javax.swing.JSpinner();
        SpinCantSeparador = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        LblProdBuenAndar = new javax.swing.JLabel();
        ImagenBuenAndarProd = new org.edisoncor.gui.panel.PanelImage();
        ChkAcrilicoProd = new javax.swing.JCheckBox();
        ChkDescaGomaEvaProd = new javax.swing.JCheckBox();
        ChkDescMolesProd = new javax.swing.JCheckBox();
        ChkFerulaProd = new javax.swing.JCheckBox();
        ChkOrtesisProd = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        SpinCantAcrilico = new javax.swing.JSpinner();
        SpinCantDescGomaEva = new javax.swing.JSpinner();
        SpinCantDescMoles = new javax.swing.JSpinner();
        SpinCantFerula = new javax.swing.JSpinner();
        SpinCantOrtesis = new javax.swing.JSpinner();
        PanelDatos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaMostrar = new javax.swing.JTable();

        opDeshacer.setText("Deshacer");
        PopMDeshacerRehacer.add(opDeshacer);

        opRehacer.setLabel("Rehacer");
        PopMDeshacerRehacer.add(opRehacer);

        setClosable(true);
        setIconifiable(true);

        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel2.setColorPrimario(new java.awt.Color(102, 204, 255));
        panel2.setColorSecundario(new java.awt.Color(51, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblAntMedicosList.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblAntMedicosList.setForeground(new java.awt.Color(255, 255, 255));
        LblAntMedicosList.setText("Ant. Médicos");

        TxtAreaAntMed.setBackground(new java.awt.Color(0, 153, 255));
        TxtAreaAntMed.setColumns(20);
        TxtAreaAntMed.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        TxtAreaAntMed.setForeground(new java.awt.Color(255, 255, 255));
        TxtAreaAntMed.setRows(5);
        TxtAreaAntMed.setBorder(null);
        jScrollPane5.setViewportView(TxtAreaAntMed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LblAntMedicosList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblAntMedicosList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelMostrarDatos.setBackground(new java.awt.Color(0, 153, 255));
        PanelMostrarDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblMostrarApe.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblMostrarApe.setForeground(new java.awt.Color(255, 255, 255));
        LblMostrarApe.setText("Apellido");

        LblActividadFisica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        LblActividadFisica.setForeground(new java.awt.Color(255, 255, 255));
        LblActividadFisica.setText("Actividad Fisica");

        LblMostrarNroFicha.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        LblMostrarNroFicha.setForeground(new java.awt.Color(255, 255, 255));
        LblMostrarNroFicha.setText("Ficha Paciente Nº ");

        LblMostrarEdad.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        LblMostrarEdad.setForeground(new java.awt.Color(255, 255, 255));
        LblMostrarEdad.setText("Edad ");

        LblMostrarSexo.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        LblMostrarSexo.setForeground(new java.awt.Color(255, 255, 255));
        LblMostrarSexo.setText("Sexo ");

        LblMostrarNom.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        LblMostrarNom.setForeground(new java.awt.Color(255, 255, 255));
        LblMostrarNom.setText("Nombre ");

        LblActividadFisicaReal.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        LblActividadFisicaReal.setForeground(new java.awt.Color(255, 255, 255));
        LblActividadFisicaReal.setText("      ");

        javax.swing.GroupLayout PanelMostrarDatosLayout = new javax.swing.GroupLayout(PanelMostrarDatos);
        PanelMostrarDatos.setLayout(PanelMostrarDatosLayout);
        PanelMostrarDatosLayout.setHorizontalGroup(
            PanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarDatosLayout.createSequentialGroup()
                        .addComponent(LblMostrarNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblMostrarApe))
                    .addComponent(LblMostrarNroFicha)
                    .addGroup(PanelMostrarDatosLayout.createSequentialGroup()
                        .addComponent(LblMostrarEdad)
                        .addGap(18, 18, 18)
                        .addComponent(LblMostrarSexo))
                    .addComponent(LblActividadFisica)
                    .addComponent(LblActividadFisicaReal))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        PanelMostrarDatosLayout.setVerticalGroup(
            PanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMostrarApe)
                    .addComponent(LblMostrarNom))
                .addGap(27, 27, 27)
                .addComponent(LblMostrarNroFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMostrarEdad)
                    .addComponent(LblMostrarSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblActividadFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblActividadFisicaReal)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(0, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPestanas.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N

        PanelFicha.setBackground(new java.awt.Color(255, 255, 255));
        PanelFicha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PanelBotonesFicha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnEditarFicha.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnEditarFicha.setText("Editar Datos");
        BtnEditarFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEditarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarFichaActionPerformed(evt);
            }
        });

        BtnGuardarFicha.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnGuardarFicha.setText("Guardar Paciente");
        BtnGuardarFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarFichaActionPerformed(evt);
            }
        });

        BtnCancelarEditFicha.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnCancelarEditFicha.setText("Cancelar");
        BtnCancelarEditFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelarEditFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarEditFichaActionPerformed(evt);
            }
        });

        LblTituloFicha.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        LblTituloFicha.setText("Datos Administrativos");

        BtnLimpiarForm.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnLimpiarForm.setText("Nuevo Paciente");
        BtnLimpiarForm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpiarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarFormActionPerformed(evt);
            }
        });

        BtnAceptarEditFicha.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnAceptarEditFicha.setText("Aceptar");
        BtnAceptarEditFicha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAceptarEditFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarEditFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesFichaLayout = new javax.swing.GroupLayout(PanelBotonesFicha);
        PanelBotonesFicha.setLayout(PanelBotonesFichaLayout);
        PanelBotonesFichaLayout.setHorizontalGroup(
            PanelBotonesFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesFichaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblTituloFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(BtnLimpiarForm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(BtnEditarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAceptarEditFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelarEditFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PanelBotonesFichaLayout.setVerticalGroup(
            PanelBotonesFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTituloFicha)
                    .addComponent(BtnLimpiarForm)
                    .addComponent(BtnGuardarFicha)
                    .addComponent(BtnEditarFicha)
                    .addComponent(BtnAceptarEditFicha)
                    .addComponent(BtnCancelarEditFicha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDatos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblAntMed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblAntMed.setText("Antecedentes Médicos");

        ChkEsguince.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkEsguince.setText("Esguince, fracturas u operaciones en miembros inferiores");
        ChkEsguince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkEsguinceActionPerformed(evt);
            }
        });

        ChkDiabetico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkDiabetico.setText("Diabético/a");
        ChkDiabetico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDiabeticoMouseClicked(evt);
            }
        });

        ChkAnticoag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkAnticoag.setText("Anticoagulado/a");

        ChkMedicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkMedicacion.setText("Medicamentos");
        ChkMedicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkMedicacionMouseClicked(evt);
            }
        });

        ChkAlergia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkAlergia.setText("Alergias");
        ChkAlergia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkAlergiaMouseClicked(evt);
            }
        });

        TxtObservFicha.setColumns(20);
        TxtObservFicha.setRows(5);
        jScrollPane3.setViewportView(TxtObservFicha);

        LblObservFicha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblObservFicha.setText("Observaciones");

        ChkOtroAntMed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChkOtroAntMed.setText("Otro");
        ChkOtroAntMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOtroAntMedMouseClicked(evt);
            }
        });
        ChkOtroAntMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOtroAntMedActionPerformed(evt);
            }
        });

        TxtOtroAntMed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TxtAlergia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TxtEsguinceFrac.setColumns(20);
        TxtEsguinceFrac.setRows(5);
        TxtEsguinceFrac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtEsguinceFracMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TxtEsguinceFrac);

        TxtDiabetico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TxtTomaMedicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelDatos2Layout = new javax.swing.GroupLayout(PanelDatos2);
        PanelDatos2.setLayout(PanelDatos2Layout);
        PanelDatos2Layout.setHorizontalGroup(
            PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAntMed)
                    .addComponent(ChkAnticoag)
                    .addComponent(LblObservFicha)
                    .addComponent(ChkEsguince)
                    .addGroup(PanelDatos2Layout.createSequentialGroup()
                        .addComponent(ChkDiabetico)
                        .addGap(31, 31, 31)
                        .addComponent(TxtDiabetico, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelDatos2Layout.createSequentialGroup()
                            .addComponent(ChkOtroAntMed)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtOtroAntMed, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatos2Layout.createSequentialGroup()
                            .addComponent(ChkAlergia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatos2Layout.createSequentialGroup()
                            .addComponent(ChkMedicacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtTomaMedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelDatos2Layout.setVerticalGroup(
            PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblAntMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDiabetico)
                    .addComponent(TxtDiabetico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkAnticoag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTomaMedicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkMedicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkAlergia)
                    .addComponent(TxtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkOtroAntMed)
                    .addComponent(TxtOtroAntMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChkEsguince)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblObservFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDatos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNom.setText("Nombre*");

        LblNroFicha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNroFicha.setText("Nº de Ficha");

        TxtNom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        LblApe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblApe.setText("Apellido*");

        TxtApe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApeKeyTyped(evt);
            }
        });

        LblDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDni.setText("Dni");

        TxtDni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDniKeyTyped(evt);
            }
        });

        LblSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblSexo.setText("Sexo");

        LblCel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCel.setText("Celular*");

        TxtCel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCelKeyTyped(evt);
            }
        });

        LblTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTel.setText("Teléfono");

        TxtTel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelKeyTyped(evt);
            }
        });

        LblDir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDir.setText("Direccion*");

        TxtDir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblMail.setText("Mail");

        TxtMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LblActFisica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblActFisica.setText("Act. Física");

        TxtActFisica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtActFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtActFisicaKeyTyped(evt);
            }
        });

        LblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFecha.setText("Fecha Nac.*");

        DateFechaNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TxtNroFicha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnGrpSexo.add(RbFem);
        RbFem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbFem.setSelected(true);
        RbFem.setText("Fememino");

        BtnGrpSexo.add(RbMasc);
        RbMasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbMasc.setText("Masculino");

        BtnGrpSexo.add(RbOtro);
        RbOtro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbOtro.setText("No Binario");

        BtnBuscarPaciente.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnBuscarPaciente.setText("Buscar Ficha");
        BtnBuscarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatos1Layout = new javax.swing.GroupLayout(PanelDatos1);
        PanelDatos1.setLayout(PanelDatos1Layout);
        PanelDatos1Layout.setHorizontalGroup(
            PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNroFicha)
                .addGap(18, 18, 18)
                .addComponent(TxtNroFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(BtnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(PanelDatos1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatos1Layout.createSequentialGroup()
                        .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDir)
                            .addComponent(LblMail)
                            .addComponent(LblActFisica))
                        .addGap(14, 14, 14)
                        .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtActFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDatos1Layout.createSequentialGroup()
                        .addComponent(LblNom)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatos1Layout.createSequentialGroup()
                        .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblApe)
                            .addComponent(LblDni))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatos1Layout.createSequentialGroup()
                            .addComponent(LblTel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelDatos1Layout.createSequentialGroup()
                            .addComponent(LblCel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatos1Layout.createSequentialGroup()
                            .addComponent(LblFecha)
                            .addGap(81, 81, 81)
                            .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatos1Layout.createSequentialGroup()
                            .addComponent(LblSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RbFem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RbMasc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RbOtro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatos1Layout.setVerticalGroup(
            PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNroFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNroFicha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApe)
                    .addComponent(TxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDni)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFecha)
                    .addComponent(DateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RbFem)
                    .addComponent(RbMasc)
                    .addComponent(RbOtro))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCel)
                    .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTel)
                    .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDir)
                    .addComponent(TxtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMail)
                    .addComponent(TxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblActFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtActFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFichaLayout = new javax.swing.GroupLayout(PanelFicha);
        PanelFicha.setLayout(PanelFichaLayout);
        PanelFichaLayout.setHorizontalGroup(
            PanelFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotonesFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFichaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PanelDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(PanelDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFichaLayout.setVerticalGroup(
            PanelFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFichaLayout.createSequentialGroup()
                .addComponent(PanelBotonesFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanelPestanas.addTab("Ficha Paciente", PanelFicha);

        PanelHistoriaClinica.setBackground(new java.awt.Color(255, 255, 255));
        PanelHistoriaClinica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelHistoriaClinica.setPreferredSize(new java.awt.Dimension(1500, 965));

        PanelBotonesHist.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblTituloHistoria.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        LblTituloHistoria.setText("Datos Clínicos");

        BtnLimpiarHistClinica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnLimpiarHistClinica.setText("Limpiar Historia Clinica");
        BtnLimpiarHistClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpiarHistClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarHistClinicaActionPerformed(evt);
            }
        });

        BtnGuardarHistoriaClinica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnGuardarHistoriaClinica.setText("Alta");
        BtnGuardarHistoriaClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardarHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarHistoriaClinicaActionPerformed(evt);
            }
        });

        BtnVerDetalleHist.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnVerDetalleHist.setText("Ver Detalle Hist Clinica");
        BtnVerDetalleHist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnVerDetalleHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerDetalleHistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesHistLayout = new javax.swing.GroupLayout(PanelBotonesHist);
        PanelBotonesHist.setLayout(PanelBotonesHistLayout);
        PanelBotonesHistLayout.setHorizontalGroup(
            PanelBotonesHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesHistLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LblTituloHistoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(BtnVerDetalleHist, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BtnGuardarHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BtnLimpiarHistClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PanelBotonesHistLayout.setVerticalGroup(
            PanelBotonesHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesHistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTituloHistoria)
                    .addComponent(BtnVerDetalleHist)
                    .addComponent(BtnGuardarHistoriaClinica)
                    .addComponent(BtnLimpiarHistClinica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelIndicaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblIndicaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIndicaciones.setText("Indicaciones");

        ChkVolver7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkVolver7.setText("Volver en 7 días");

        ChkRealizarConsMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRealizarConsMed.setText("Realizar una consulta médica");

        ChkAntiBac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAntiBac.setText("Antibacteriano tópico");

        ChkCremaRegen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCremaRegen.setText("Crema regeneradora");

        ChkCremaHid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCremaHid.setText("Crema hidrantante");

        ChkOrtesis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOrtesis.setText("Ortesis");

        ChkPlantillas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkPlantillas.setText("Plantillas");
        ChkPlantillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkPlantillasMouseClicked(evt);
            }
        });

        ChkOtroIndic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOtroIndic.setText("Otro");
        ChkOtroIndic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOtroIndicMouseClicked(evt);
            }
        });

        TxtOtroIndic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkCompresas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCompresas.setText("Compresas");

        ChkTratAntimic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkTratAntimic.setText("Tratamiento antimic. tópico");
        ChkTratAntimic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkTratAntimicActionPerformed(evt);
            }
        });

        ChkVolver30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkVolver30.setText("Volver en 30 días");

        javax.swing.GroupLayout PanelIndicacionesLayout = new javax.swing.GroupLayout(PanelIndicaciones);
        PanelIndicaciones.setLayout(PanelIndicacionesLayout);
        PanelIndicacionesLayout.setHorizontalGroup(
            PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                                .addComponent(ChkCompresas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ChkPlantillas))
                            .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkCremaHid)
                                    .addComponent(ChkVolver30)
                                    .addComponent(ChkVolver7)
                                    .addComponent(ChkRealizarConsMed)
                                    .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIndicacionesLayout.createSequentialGroup()
                                            .addComponent(ChkOtroIndic)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TxtOtroIndic, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ChkTratAntimic))
                                    .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                                        .addComponent(ChkAntiBac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ChkOrtesis)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChkCremaRegen))
                    .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(LblIndicaciones)))
                .addContainerGap())
        );
        PanelIndicacionesLayout.setVerticalGroup(
            PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                .addComponent(LblIndicaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAntiBac)
                    .addComponent(ChkOrtesis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkCompresas)
                    .addComponent(ChkPlantillas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkCremaHid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkCremaRegen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIndicacionesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ChkTratAntimic))
                    .addComponent(ChkRealizarConsMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkVolver7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkVolver30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIndicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOtroIndic)
                    .addComponent(TxtOtroIndic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PanelObservHistoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblObservHistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblObservHistoria.setText("Observaciones");

        TxtObservHistoria.setColumns(20);
        TxtObservHistoria.setRows(5);
        jScrollPane1.setViewportView(TxtObservHistoria);

        javax.swing.GroupLayout PanelObservHistoriaLayout = new javax.swing.GroupLayout(PanelObservHistoria);
        PanelObservHistoria.setLayout(PanelObservHistoriaLayout);
        PanelObservHistoriaLayout.setHorizontalGroup(
            PanelObservHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObservHistoriaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LblObservHistoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelObservHistoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelObservHistoriaLayout.setVerticalGroup(
            PanelObservHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObservHistoriaLayout.createSequentialGroup()
                .addComponent(LblObservHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PanelDiag.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ComboDiag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboDiag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bromhidrosis", "Hallux Valgus", "Helomas", "Hiperhidrosis", "Hiperqueratosis", "Lesión por cuerpo extraño", "Micosis interdigital", "Onicocriptosis", "Onicodistrofia", "Onicofagia-Onicotiromanía", "Onicofosis", "Onicomicosis", "Queratodermia", "Traumatismo ungueal", "Verruga Plantar", "Otro" }));
        ComboDiag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboDiagMouseClicked(evt);
            }
        });
        ComboDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDiagActionPerformed(evt);
            }
        });

        LblDiag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDiag.setText("Diagnóstico");

        BtnConfirmDiag.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        BtnConfirmDiag.setText("Confirmar Diag");
        BtnConfirmDiag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnConfirmDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmDiagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDiagLayout = new javax.swing.GroupLayout(PanelDiag);
        PanelDiag.setLayout(PanelDiagLayout);
        PanelDiagLayout.setHorizontalGroup(
            PanelDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiagLayout.createSequentialGroup()
                .addGroup(PanelDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDiagLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtChkOtroDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDiagLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblDiag)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(PanelDiagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnConfirmDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDiagLayout.setVerticalGroup(
            PanelDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiagLayout.createSequentialGroup()
                .addComponent(LblDiag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtChkOtroDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(BtnConfirmDiag)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelZona.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblZonaPod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblZonaPod.setText("Pie Izquierdo");

        ChkHalluxIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkHalluxIzq.setText("Hallux");
        ChkHalluxIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkHalluxIzqMouseClicked(evt);
            }
        });
        ChkHalluxIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkHalluxIzqActionPerformed(evt);
            }
        });

        ChkDedo2Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo2Izq.setText("Dedo 2");
        ChkDedo2Izq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo2IzqMouseClicked(evt);
            }
        });
        ChkDedo2Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo2IzqActionPerformed(evt);
            }
        });

        ChkDedo3Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo3Izq.setText("Dedo 3");
        ChkDedo3Izq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo3IzqMouseClicked(evt);
            }
        });
        ChkDedo3Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo3IzqActionPerformed(evt);
            }
        });

        ChkDedo4Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo4Izq.setText("Dedo 4");
        ChkDedo4Izq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo4IzqMouseClicked(evt);
            }
        });
        ChkDedo4Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo4IzqActionPerformed(evt);
            }
        });

        ChkDedo5Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo5Izq.setText("Dedo 5");
        ChkDedo5Izq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo5IzqMouseClicked(evt);
            }
        });
        ChkDedo5Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo5IzqActionPerformed(evt);
            }
        });

        ChkZonaTalarIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaTalarIzq.setText("Zona Talar");
        ChkZonaTalarIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaTalarIzqMouseClicked(evt);
            }
        });
        ChkZonaTalarIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaTalarIzqActionPerformed(evt);
            }
        });

        ChkZonaMetaIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaMetaIzq.setText("Zona Metatarsal");
        ChkZonaMetaIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaMetaIzqMouseClicked(evt);
            }
        });
        ChkZonaMetaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaMetaIzqActionPerformed(evt);
            }
        });

        ChkZonaPlantIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaPlantIzq.setText("Zona Plantar");
        ChkZonaPlantIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaPlantIzqMouseClicked(evt);
            }
        });
        ChkZonaPlantIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaPlantIzqActionPerformed(evt);
            }
        });

        ChkZonaMedialIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaMedialIzq.setText("Zona Medial");
        ChkZonaMedialIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaMedialIzqMouseClicked(evt);
            }
        });
        ChkZonaMedialIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaMedialIzqActionPerformed(evt);
            }
        });

        TxtHalluxIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo2Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo3Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo4Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo5Izq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaTalarIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaPlanIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaMedIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaMetIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkEspInterdigitalIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkEspInterdigitalIzq.setText("Esp. Interdigital");
        ChkEspInterdigitalIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkEspInterdigitalIzqMouseClicked(evt);
            }
        });
        ChkEspInterdigitalIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkEspInterdigitalIzqActionPerformed(evt);
            }
        });

        TxtEspInterdigitalIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout PanelZonaLayout = new javax.swing.GroupLayout(PanelZona);
        PanelZona.setLayout(PanelZonaLayout);
        PanelZonaLayout.setHorizontalGroup(
            PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelZonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addComponent(ChkEspInterdigitalIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEspInterdigitalIzq))
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addComponent(ChkZonaMetaIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtZonaMetIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkHalluxIzq)
                            .addComponent(ChkDedo2Izq)
                            .addComponent(ChkDedo3Izq)
                            .addComponent(ChkDedo4Izq)
                            .addComponent(ChkDedo5Izq)
                            .addComponent(ChkZonaTalarIzq))
                        .addGap(31, 31, 31)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtDedo5Izq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(TxtDedo4Izq, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtDedo3Izq, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtDedo2Izq, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtHalluxIzq, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(TxtZonaTalarIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkZonaPlantIzq)
                            .addComponent(ChkZonaMedialIzq))
                        .addGap(21, 21, 21)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtZonaPlanIzq)
                            .addComponent(TxtZonaMedIzq))))
                .addGap(133, 133, 133))
            .addGroup(PanelZonaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(LblZonaPod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelZonaLayout.setVerticalGroup(
            PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelZonaLayout.createSequentialGroup()
                .addComponent(LblZonaPod)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDedo3Izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkDedo3Izq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDedo4Izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkDedo4Izq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDedo5Izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkDedo5Izq)))
                    .addGroup(PanelZonaLayout.createSequentialGroup()
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkHalluxIzq)
                            .addComponent(TxtHalluxIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkDedo2Izq)
                            .addComponent(TxtDedo2Izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaTalarIzq)
                    .addComponent(TxtZonaTalarIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaPlantIzq)
                    .addComponent(TxtZonaPlanIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaMedialIzq)
                    .addComponent(TxtZonaMedIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaMetaIzq)
                    .addComponent(TxtZonaMetIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkEspInterdigitalIzq)
                    .addComponent(TxtEspInterdigitalIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSector.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblSector.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblSector.setText("Pie Derecho");

        ChkHalluxDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkHalluxDer.setText("Hallux");
        ChkHalluxDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkHalluxDerMouseClicked(evt);
            }
        });
        ChkHalluxDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkHalluxDerActionPerformed(evt);
            }
        });

        ChkDedo2Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo2Der.setText("Dedo 2");
        ChkDedo2Der.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo2DerMouseClicked(evt);
            }
        });
        ChkDedo2Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo2DerActionPerformed(evt);
            }
        });

        ChkDedo3Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo3Der.setText("Dedo 3");
        ChkDedo3Der.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo3DerMouseClicked(evt);
            }
        });
        ChkDedo3Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo3DerActionPerformed(evt);
            }
        });

        ChkDedo4Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo4Der.setText("Dedo 4");
        ChkDedo4Der.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo4DerMouseClicked(evt);
            }
        });
        ChkDedo4Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo4DerActionPerformed(evt);
            }
        });

        ChkDedo5Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedo5Der.setText("Dedo 5");
        ChkDedo5Der.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedo5DerMouseClicked(evt);
            }
        });
        ChkDedo5Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDedo5DerActionPerformed(evt);
            }
        });

        ChkZonaTalarDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaTalarDer.setText("Zona Talar");
        ChkZonaTalarDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaTalarDerMouseClicked(evt);
            }
        });
        ChkZonaTalarDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaTalarDerActionPerformed(evt);
            }
        });

        ChkZonaPlantDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaPlantDer.setText("Zona Plantar");
        ChkZonaPlantDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaPlantDerMouseClicked(evt);
            }
        });
        ChkZonaPlantDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaPlantDerActionPerformed(evt);
            }
        });

        ChkZonaMedialDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaMedialDer.setText("Zona Medial");
        ChkZonaMedialDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaMedialDerMouseClicked(evt);
            }
        });
        ChkZonaMedialDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaMedialDerActionPerformed(evt);
            }
        });

        ChkZonaMetaDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkZonaMetaDer.setText("Zona Metatarsal");
        ChkZonaMetaDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkZonaMetaDerMouseClicked(evt);
            }
        });
        ChkZonaMetaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkZonaMetaDerActionPerformed(evt);
            }
        });

        TxtHalluxDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo2Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo3Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo4Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtDedo5Der.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaTalarDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaPlanDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaMedDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtZonaMetDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtEspInterdigitalDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkEspInterdigitalDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkEspInterdigitalDer.setText("Esp. Interdigital");
        ChkEspInterdigitalDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkEspInterdigitalDerMouseClicked(evt);
            }
        });
        ChkEspInterdigitalDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkEspInterdigitalDerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSectorLayout = new javax.swing.GroupLayout(PanelSector);
        PanelSector.setLayout(PanelSectorLayout);
        PanelSectorLayout.setHorizontalGroup(
            PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSectorLayout.createSequentialGroup()
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ChkEspInterdigitalDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEspInterdigitalDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkZonaMetaDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtZonaMetDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkZonaMedialDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtZonaMedDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkZonaPlantDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtZonaPlanDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkZonaTalarDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtZonaTalarDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkDedo5Der)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDedo5Der, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkDedo4Der)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDedo4Der, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkDedo3Der)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDedo3Der, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkDedo2Der)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDedo2Der, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSectorLayout.createSequentialGroup()
                        .addComponent(ChkHalluxDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtHalluxDer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(PanelSectorLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LblSector)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSectorLayout.setVerticalGroup(
            PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSectorLayout.createSequentialGroup()
                .addComponent(LblSector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkHalluxDer)
                    .addComponent(TxtHalluxDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDedo2Der)
                    .addComponent(TxtDedo2Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDedo3Der)
                    .addComponent(TxtDedo3Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDedo4Der)
                    .addComponent(TxtDedo4Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDedo5Der)
                    .addComponent(TxtDedo5Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaTalarDer)
                    .addComponent(TxtZonaTalarDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaPlantDer)
                    .addComponent(TxtZonaPlanDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaMedialDer)
                    .addComponent(TxtZonaMedDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkZonaMetaDer)
                    .addComponent(TxtZonaMetDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkEspInterdigitalDer)
                    .addComponent(TxtEspInterdigitalDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelZona, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSector, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelDiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelZona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelSector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMotiv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblMotivoCons.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblMotivoCons.setText("Motivo de la Consulta");

        ChkControl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkControl.setText("Control");

        ChkCuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCuracion.setText("Curación");

        ChkPedigraf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkPedigraf.setText("Pedigrafía");
        ChkPedigraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkPedigrafActionPerformed(evt);
            }
        });

        ChkOtroMotiv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOtroMotiv.setText("Otro");
        ChkOtroMotiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOtroMotivMouseClicked(evt);
            }
        });
        ChkOtroMotiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOtroMotivActionPerformed(evt);
            }
        });

        TxtOtroMotiv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkVisitaMen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkVisitaMen.setText("Visita mensual");
        ChkVisitaMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVisitaMenActionPerformed(evt);
            }
        });

        ChkAlgia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAlgia.setText("Algia");
        ChkAlgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkAlgiaActionPerformed(evt);
            }
        });

        ChkTopic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkTopic.setText("Topicación");
        ChkTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkTopicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMotivLayout = new javax.swing.GroupLayout(PanelMotiv);
        PanelMotiv.setLayout(PanelMotivLayout);
        PanelMotivLayout.setHorizontalGroup(
            PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMotivLayout.createSequentialGroup()
                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMotivLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkCuracion)
                            .addComponent(ChkControl)
                            .addComponent(ChkOtroMotiv)
                            .addComponent(ChkAlgia))
                        .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelMotivLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtOtroMotiv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChkVisitaMen)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMotivLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkTopic)
                                    .addComponent(ChkPedigraf))
                                .addGap(17, 17, 17))))
                    .addGroup(PanelMotivLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LblMotivoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelMotivLayout.setVerticalGroup(
            PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMotivLayout.createSequentialGroup()
                .addComponent(LblMotivoCons)
                .addGap(18, 18, 18)
                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAlgia)
                    .addComponent(ChkPedigraf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkControl)
                    .addComponent(ChkTopic))
                .addGap(5, 5, 5)
                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkVisitaMen)
                    .addComponent(ChkCuracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMotivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOtroMotiv)
                    .addComponent(TxtOtroMotiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        PanelFechaConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblFechaConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaConsulta.setText("Fecha de consulta");

        DateFechaConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelFechaConsultaLayout = new javax.swing.GroupLayout(PanelFechaConsulta);
        PanelFechaConsulta.setLayout(PanelFechaConsultaLayout);
        PanelFechaConsultaLayout.setHorizontalGroup(
            PanelFechaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFechaConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DateFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelFechaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblFechaConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFechaConsultaLayout.setVerticalGroup(
            PanelFechaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaConsultaLayout.createSequentialGroup()
                .addComponent(LblFechaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelOrtesis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ChkBajadedo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkBajadedo.setText("Bajadedo");
        ChkBajadedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkBajadedoMouseClicked(evt);
            }
        });

        ChkCorrectorNoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCorrectorNoc.setText("Corrector de Hx");
        ChkCorrectorNoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkCorrectorNocMouseClicked(evt);
            }
        });

        ChkDedal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDedal.setText("Dedal");
        ChkDedal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDedalMouseClicked(evt);
            }
        });

        LblOrtesis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblOrtesis.setText("Ortesis");

        ChkDescargaMoles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDescargaMoles.setText("Descarga de moleskin");
        ChkDescargaMoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDescargaMolesMouseClicked(evt);
            }
        });

        ChkDescargaGomaEva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkDescargaGomaEva.setText("Descarga de goma eva");
        ChkDescargaGomaEva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkDescargaGomaEvaMouseClicked(evt);
            }
        });

        ChkOrtesisSilicona.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOrtesisSilicona.setText("Ortesis de silicona");
        ChkOrtesisSilicona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOrtesisSiliconaMouseClicked(evt);
            }
        });

        ChkFerula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkFerula.setText("Ferula");
        ChkFerula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkFerulaMouseClicked(evt);
            }
        });

        ChkAcrilico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAcrilico.setText("Acrilico");
        ChkAcrilico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkAcrilicoMouseClicked(evt);
            }
        });

        ChkOtroOrtesis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOtroOrtesis.setText("Otro");
        ChkOtroOrtesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOtroOrtesisMouseClicked(evt);
            }
        });

        TxtOtroOrtesis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkAnilloSil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAnilloSil.setText("Anillo de silicona");
        ChkAnilloSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkAnilloSilMouseClicked(evt);
            }
        });

        ChkSeparador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkSeparador.setText("Separador");
        ChkSeparador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkSeparadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelOrtesisLayout = new javax.swing.GroupLayout(PanelOrtesis);
        PanelOrtesis.setLayout(PanelOrtesisLayout);
        PanelOrtesisLayout.setHorizontalGroup(
            PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrtesisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOrtesisLayout.createSequentialGroup()
                        .addComponent(ChkOtroOrtesis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtOtroOrtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelOrtesisLayout.createSequentialGroup()
                        .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkSeparador)
                            .addComponent(ChkOrtesisSilicona)
                            .addComponent(ChkDescargaMoles)
                            .addComponent(ChkDescargaGomaEva)
                            .addGroup(PanelOrtesisLayout.createSequentialGroup()
                                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LblOrtesis)
                                        .addComponent(ChkAnilloSil))
                                    .addComponent(ChkCorrectorNoc)
                                    .addComponent(ChkAcrilico))
                                .addGap(18, 18, 18)
                                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkFerula)
                                    .addComponent(ChkDedal)
                                    .addComponent(ChkBajadedo))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelOrtesisLayout.setVerticalGroup(
            PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrtesisLayout.createSequentialGroup()
                .addComponent(LblOrtesis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAcrilico)
                    .addComponent(ChkBajadedo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAnilloSil)
                    .addComponent(ChkDedal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkCorrectorNoc)
                    .addComponent(ChkFerula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkDescargaMoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkDescargaGomaEva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkOrtesisSilicona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkSeparador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOrtesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOtroOrtesis)
                    .addComponent(TxtOtroOrtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelPodologas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ComboPodologa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboPodologa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silvia Pereira", "Aldana Vargas", "Otra" }));
        ComboPodologa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPodologaActionPerformed(evt);
            }
        });

        LblTrat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTrat1.setText("Podóloga");

        javax.swing.GroupLayout PanelPodologasLayout = new javax.swing.GroupLayout(PanelPodologas);
        PanelPodologas.setLayout(PanelPodologasLayout);
        PanelPodologasLayout.setHorizontalGroup(
            PanelPodologasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPodologasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPodologasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboPodologa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPodologasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LblTrat1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPodologasLayout.setVerticalGroup(
            PanelPodologasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPodologasLayout.createSequentialGroup()
                .addComponent(LblTrat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboPodologa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PanelCodHistoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblCodHist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblCodHist.setText("Cod. Hist. Clinica ");

        BtnBuscarHistoria.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnBuscarHistoria.setText("Buscar Paciente");
        BtnBuscarHistoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarHistoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCodHistoriaLayout = new javax.swing.GroupLayout(PanelCodHistoria);
        PanelCodHistoria.setLayout(PanelCodHistoriaLayout);
        PanelCodHistoriaLayout.setHorizontalGroup(
            PanelCodHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCodHistoriaLayout.createSequentialGroup()
                .addComponent(LblCodHist)
                .addGap(29, 29, 29)
                .addComponent(TxtCodHist, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBuscarHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        PanelCodHistoriaLayout.setVerticalGroup(
            PanelCodHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCodHistoriaLayout.createSequentialGroup()
                .addGroup(PanelCodHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodHist)
                    .addComponent(TxtCodHist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarHistoria))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        PanelTrat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ChkRemDent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRemDent.setText("Remocion de dentritus");

        ChkHelotomia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkHelotomia.setText("Helotomia");

        ChkEspiculotomia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkEspiculotomia.setText("Espiculotomia");

        ChkTopicacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkTopicacion.setText("Topicación ");

        ChkColacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkColacion.setText("Colocación de descarga");

        LblTerap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTerap.setText("Terapéutica");

        ChkOtroTrat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkOtroTrat.setText("Otro");
        ChkOtroTrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkOtroTratMouseClicked(evt);
            }
        });
        ChkOtroTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOtroTratActionPerformed(evt);
            }
        });

        TxtOtroTrat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ChkLimpiezaSurcos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkLimpiezaSurcos.setText("Limpieza de surcos");

        ChkEduPod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkEduPod.setText("Educación podológica");

        ChkCorteU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCorteU.setText("Corte de uñas");

        ChkAblacOnic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAblacOnic.setText("Ablación de Onicofosis");

        ChkAblacTotLamin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAblacTotLamin.setText("Ablación total de lámina");

        ChkAblacParLamin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkAblacParLamin.setText("Ablación parcial de lámina");

        ChkFresado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkFresado.setText("Fresado ungueal");

        ChkIdemCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkIdemCons.setText("Idem terapéutica anterior");

        ChkHiperqueratomía.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkHiperqueratomía.setText("Hiperoqueratomía");

        ChkReguLamina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkReguLamina.setText("Regularización de lámina");

        javax.swing.GroupLayout PanelTratLayout = new javax.swing.GroupLayout(PanelTrat);
        PanelTrat.setLayout(PanelTratLayout);
        PanelTratLayout.setHorizontalGroup(
            PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTratLayout.createSequentialGroup()
                .addGroup(PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTratLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkHelotomia)
                            .addComponent(ChkIdemCons)
                            .addComponent(ChkAblacOnic)
                            .addComponent(ChkAblacTotLamin)
                            .addComponent(ChkCorteU)
                            .addComponent(ChkColacion)
                            .addComponent(ChkEduPod)
                            .addComponent(ChkEspiculotomia)
                            .addComponent(ChkFresado)
                            .addComponent(ChkHiperqueratomía)
                            .addComponent(ChkReguLamina)
                            .addComponent(ChkLimpiezaSurcos)
                            .addComponent(ChkRemDent)
                            .addComponent(ChkTopicacion)
                            .addGroup(PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTratLayout.createSequentialGroup()
                                    .addComponent(ChkOtroTrat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtOtroTrat))
                                .addComponent(ChkAblacParLamin, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(PanelTratLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblTerap)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTratLayout.setVerticalGroup(
            PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTratLayout.createSequentialGroup()
                .addComponent(LblTerap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkIdemCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkAblacOnic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkAblacParLamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkAblacTotLamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkColacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkCorteU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkEduPod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkEspiculotomia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkFresado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkHelotomia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkHiperqueratomía)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkLimpiezaSurcos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkReguLamina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkRemDent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkTopicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOtroTrat)
                    .addComponent(TxtOtroTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelHistoriaClinicaLayout = new javax.swing.GroupLayout(PanelHistoriaClinica);
        PanelHistoriaClinica.setLayout(PanelHistoriaClinicaLayout);
        PanelHistoriaClinicaLayout.setHorizontalGroup(
            PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHistoriaClinicaLayout.createSequentialGroup()
                .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelCodHistoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelHistoriaClinicaLayout.createSequentialGroup()
                                .addComponent(PanelMotiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelPodologas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelObservHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelOrtesis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(926, 926, 926))
            .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                .addComponent(PanelBotonesHist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelHistoriaClinicaLayout.setVerticalGroup(
            PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                .addComponent(PanelBotonesHist, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                        .addComponent(PanelOrtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                            .addComponent(PanelTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelObservHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelHistoriaClinicaLayout.createSequentialGroup()
                            .addComponent(PanelCodHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelHistoriaClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PanelPodologas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PanelMotiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PanelFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPestanas.addTab("Historia Clínica", PanelHistoriaClinica);

        PanelDetalleHistoria.setBackground(new java.awt.Color(255, 255, 255));

        PanelDetalleGrandeHistoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtDetalleHistoriaClinica.setColumns(20);
        TxtDetalleHistoriaClinica.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TxtDetalleHistoriaClinica.setRows(5);
        jScrollPane6.setViewportView(TxtDetalleHistoriaClinica);

        javax.swing.GroupLayout PanelDetalleGrandeHistoriaLayout = new javax.swing.GroupLayout(PanelDetalleGrandeHistoria);
        PanelDetalleGrandeHistoria.setLayout(PanelDetalleGrandeHistoriaLayout);
        PanelDetalleGrandeHistoriaLayout.setHorizontalGroup(
            PanelDetalleGrandeHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleGrandeHistoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        PanelDetalleGrandeHistoriaLayout.setVerticalGroup(
            PanelDetalleGrandeHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleGrandeHistoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTituloDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblDetalleGrandeHistoria.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        LblDetalleGrandeHistoria.setText("Detalle Historia Clinica");

        BtnGuardarConsulta.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnGuardarConsulta.setText("Guardar Consulta");
        BtnGuardarConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarConsultaActionPerformed(evt);
            }
        });

        BtnEditarHistoriaClinica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnEditarHistoriaClinica.setText("Editar");
        BtnEditarHistoriaClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEditarHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarHistoriaClinicaActionPerformed(evt);
            }
        });

        BtnAceptarEditHistoriaClinica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnAceptarEditHistoriaClinica.setText("Aceptar");
        BtnAceptarEditHistoriaClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAceptarEditHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarEditHistoriaClinicaActionPerformed(evt);
            }
        });

        BtnCancelarEditHistoriaClinica.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnCancelarEditHistoriaClinica.setText("Cancelar");
        BtnCancelarEditHistoriaClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelarEditHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarEditHistoriaClinicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTituloDetalleLayout = new javax.swing.GroupLayout(PanelTituloDetalle);
        PanelTituloDetalle.setLayout(PanelTituloDetalleLayout);
        PanelTituloDetalleLayout.setHorizontalGroup(
            PanelTituloDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloDetalleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblDetalleGrandeHistoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(BtnGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnAceptarEditHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelarEditHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        PanelTituloDetalleLayout.setVerticalGroup(
            PanelTituloDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTituloDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTituloDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnEditarHistoriaClinica)
                        .addComponent(BtnAceptarEditHistoriaClinica)
                        .addComponent(BtnCancelarEditHistoriaClinica)
                        .addComponent(BtnGuardarConsulta))
                    .addComponent(LblDetalleGrandeHistoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDetalleHistoriaLayout = new javax.swing.GroupLayout(PanelDetalleHistoria);
        PanelDetalleHistoria.setLayout(PanelDetalleHistoriaLayout);
        PanelDetalleHistoriaLayout.setHorizontalGroup(
            PanelDetalleHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelDetalleGrandeHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelDetalleHistoriaLayout.setVerticalGroup(
            PanelDetalleHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleHistoriaLayout.createSequentialGroup()
                .addComponent(PanelTituloDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDetalleGrandeHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDetalleHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDetalleHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );

        PanelPestanas.addTab("Detalle Historia", jPanel1);

        PanelProximosTurnos.setBackground(new java.awt.Color(255, 255, 255));

        PanelPlantillas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ImagenPlantillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plantillas.png"))); // NOI18N

        javax.swing.GroupLayout ImagenPlantillasLayout = new javax.swing.GroupLayout(ImagenPlantillas);
        ImagenPlantillas.setLayout(ImagenPlantillasLayout);
        ImagenPlantillasLayout.setHorizontalGroup(
            ImagenPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        ImagenPlantillasLayout.setVerticalGroup(
            ImagenPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        LblPlanitllasTit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblPlanitllasTit.setText("Plantillas");

        LblMaterial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblMaterial.setText("Material");

        ComboMaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poliform", "Soft", "Plastozote" }));

        PanelPlantillaDer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblPlantillaPieDer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LblPlantillaPieDer.setText("Pie Derecho");

        ChkArcoDuroDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkArcoDuroDer.setText("Arco Duro");

        ChkArcoBlandoDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkArcoBlandoDer.setText("Arco Blando");

        ChkCunPronDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCunPronDer.setText("Cuña Pronadora");

        ChkCunSupDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCunSupDer.setText("Cuña Supinadora");

        ChkTalonDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkTalonDer.setText("Talón con Oquedad");

        ChkRealIntDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRealIntDer.setText("Realce Talón Interno");
        ChkRealIntDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkRealIntDerMouseClicked(evt);
            }
        });

        SpinRealIntDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SpinRealIntDer.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        LblMm3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblMm3.setText("mm.");

        ChkRealExtDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRealExtDer.setText("Realce Talón Externo");
        ChkRealExtDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkRealExtDerMouseClicked(evt);
            }
        });

        SpinRealExtDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SpinRealExtDer.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        LblMm4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblMm4.setText("mm.");

        javax.swing.GroupLayout PanelPlantillaDerLayout = new javax.swing.GroupLayout(PanelPlantillaDer);
        PanelPlantillaDer.setLayout(PanelPlantillaDerLayout);
        PanelPlantillaDerLayout.setHorizontalGroup(
            PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkCunPronDer)
                    .addComponent(ChkArcoBlandoDer)
                    .addComponent(ChkArcoDuroDer)
                    .addComponent(ChkCunSupDer)
                    .addComponent(ChkTalonDer)
                    .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                        .addGroup(PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                                .addComponent(ChkRealExtDer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinRealExtDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                                .addComponent(ChkRealIntDer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinRealIntDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMm3)
                            .addComponent(LblMm4)))))
            .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(LblPlantillaPieDer))
        );
        PanelPlantillaDerLayout.setVerticalGroup(
            PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillaDerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPlantillaPieDer)
                .addGap(18, 18, 18)
                .addComponent(ChkArcoDuroDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkArcoBlandoDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkCunPronDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkCunSupDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkTalonDer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkRealIntDer)
                    .addComponent(LblMm3)
                    .addComponent(SpinRealIntDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPlantillaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkRealExtDer)
                    .addComponent(LblMm4)
                    .addComponent(SpinRealExtDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanelPlantillaIzq.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblPlantillaPieIzq.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LblPlantillaPieIzq.setText("Pie Izquierdo");

        ChkArcoDuroIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkArcoDuroIzq.setText("Arco Duro");

        ChkArcoBlandoIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkArcoBlandoIzq.setText("Arco Blando");

        ChkCunPronIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCunPronIzq.setText("Cuña Pronadora");

        ChkCunSupIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkCunSupIzq.setText("Cuña Supinadora");

        ChkTalonIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkTalonIzq.setText("Talón con Oquedad");

        ChkRealIntIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRealIntIzq.setText("Realce Talón Interno");
        ChkRealIntIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkRealIntIzqMouseClicked(evt);
            }
        });

        ChkRealExtIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChkRealExtIzq.setText("Realce Talón Externo");
        ChkRealExtIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkRealExtIzqMouseClicked(evt);
            }
        });

        LblMm1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblMm1.setText("mm.");

        LblMm2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblMm2.setText("mm.");

        SpinRealIntIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SpinRealIntIzq.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        SpinRealExtIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SpinRealExtIzq.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        javax.swing.GroupLayout PanelPlantillaIzqLayout = new javax.swing.GroupLayout(PanelPlantillaIzq);
        PanelPlantillaIzq.setLayout(PanelPlantillaIzqLayout);
        PanelPlantillaIzqLayout.setHorizontalGroup(
            PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkCunPronIzq)
                    .addComponent(ChkArcoBlandoIzq)
                    .addComponent(ChkArcoDuroIzq)
                    .addComponent(ChkCunSupIzq)
                    .addComponent(ChkTalonIzq)
                    .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                        .addGroup(PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                                .addComponent(ChkRealExtIzq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinRealExtIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                                .addComponent(ChkRealIntIzq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinRealIntIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMm1)
                            .addComponent(LblMm2)))))
            .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(LblPlantillaPieIzq))
        );
        PanelPlantillaIzqLayout.setVerticalGroup(
            PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillaIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPlantillaPieIzq)
                .addGap(18, 18, 18)
                .addComponent(ChkArcoDuroIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkArcoBlandoIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkCunPronIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkCunSupIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChkTalonIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkRealIntIzq)
                    .addComponent(LblMm1)
                    .addComponent(SpinRealIntIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPlantillaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkRealExtIzq)
                    .addComponent(LblMm2)
                    .addComponent(SpinRealExtIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanelFechaProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Fecha");

        javax.swing.GroupLayout PanelFechaProdLayout = new javax.swing.GroupLayout(PanelFechaProd);
        PanelFechaProd.setLayout(PanelFechaProdLayout);
        PanelFechaProdLayout.setHorizontalGroup(
            PanelFechaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(35, 35, 35)
                .addComponent(DateFechaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelFechaProdLayout.setVerticalGroup(
            PanelFechaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFechaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFechaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblCantidadPlanitllas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCantidadPlanitllas.setText("Cantidad");

        SpinCantidadPlantillas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BtnVerTabla.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnVerTabla.setText("Ver Tabla Plantillas");
        BtnVerTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerTablaActionPerformed(evt);
            }
        });

        BtnBajaRegistro.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnBajaRegistro.setText("Borrar Registro");
        BtnBajaRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBajaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPlantillasLayout = new javax.swing.GroupLayout(PanelPlantillas);
        PanelPlantillas.setLayout(PanelPlantillasLayout);
        PanelPlantillasLayout.setHorizontalGroup(
            PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlantillasLayout.createSequentialGroup()
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelPlantillaIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnVerTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelPlantillaDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPlantillasLayout.createSequentialGroup()
                                .addComponent(BtnBajaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(PanelPlantillasLayout.createSequentialGroup()
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                                .addComponent(LblMaterial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                                .addComponent(LblPlanitllasTit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkPlantillasProd)))
                        .addGap(18, 18, 18)
                        .addComponent(ImagenPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(PanelFechaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                                .addComponent(LblCantidadPlanitllas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SpinCantidadPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PanelPlantillasLayout.setVerticalGroup(
            PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlantillasLayout.createSequentialGroup()
                .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlantillasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPlanitllasTit)
                            .addComponent(ChkPlantillasProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblMaterial)
                            .addComponent(ComboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ImagenPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelPlantillasLayout.createSequentialGroup()
                            .addComponent(PanelFechaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LblCantidadPlanitllas)
                                .addComponent(SpinCantidadPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPlantillaIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPlantillaDer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBajaRegistro)
                    .addComponent(BtnVerTabla))
                .addGap(24, 24, 24))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblDetalleGrandeHistoria1.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        LblDetalleGrandeHistoria1.setText("Productos Ortesis-Ortopedia");

        BtnGuardarProductos.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        BtnGuardarProductos.setText("Guardar");
        BtnGuardarProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblDetalleGrandeHistoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarProductos)
                    .addComponent(LblDetalleGrandeHistoria1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblProdLenox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblProdLenox.setText("Productos Lenox");

        ImagenLenox.setBackground(new java.awt.Color(255, 255, 255));
        ImagenLenox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cropped-logo-7.png"))); // NOI18N

        javax.swing.GroupLayout ImagenLenoxLayout = new javax.swing.GroupLayout(ImagenLenox);
        ImagenLenox.setLayout(ImagenLenoxLayout);
        ImagenLenoxLayout.setHorizontalGroup(
            ImagenLenoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        ImagenLenoxLayout.setVerticalGroup(
            ImagenLenoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        ChkAnilloSilProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkAnilloSilProd.setText("Anilllo de silicona");

        ChkBajaDedoProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkBajaDedoProd.setText("Bajadedo");

        ChkCorrecHxProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkCorrecHxProd.setText("Corrector de Halux Valgus");

        ChkDedalProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkDedalProd.setText("Dedal");

        ChkSeparadorProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkSeparadorProd.setText("Separador");

        jLabel4.setText("Cant.");

        SpinCantAnillo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantBajaDedo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantCorrecHx.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantDedal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantSeparador.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LblProdLenox))
                    .addComponent(ImagenLenox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkBajaDedoProd)
                            .addComponent(ChkDedalProd)
                            .addComponent(ChkSeparadorProd)
                            .addComponent(ChkAnilloSilProd)
                            .addComponent(ChkCorrecHxProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinCantCorrecHx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinCantAnillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinCantSeparador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinCantDedal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinCantBajaDedo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblProdLenox)
                        .addGap(18, 18, 18)
                        .addComponent(ImagenLenox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(SpinCantAnillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpinCantBajaDedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpinCantCorrecHx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SpinCantDedal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpinCantSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ChkAnilloSilProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkBajaDedoProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkCorrecHxProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkDedalProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkSeparadorProd)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblProdBuenAndar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblProdBuenAndar.setText("Ortesis BuenAndar");

        ImagenBuenAndarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Buen Andar2.jpg"))); // NOI18N

        javax.swing.GroupLayout ImagenBuenAndarProdLayout = new javax.swing.GroupLayout(ImagenBuenAndarProd);
        ImagenBuenAndarProd.setLayout(ImagenBuenAndarProdLayout);
        ImagenBuenAndarProdLayout.setHorizontalGroup(
            ImagenBuenAndarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        ImagenBuenAndarProdLayout.setVerticalGroup(
            ImagenBuenAndarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        ChkAcrilicoProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkAcrilicoProd.setText("Acrilico");

        ChkDescaGomaEvaProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkDescaGomaEvaProd.setText("Descarga de Goma Eva");

        ChkDescMolesProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkDescMolesProd.setText("Descarga de Moleskin");

        ChkFerulaProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkFerulaProd.setText("Férula");

        ChkOrtesisProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChkOrtesisProd.setText("Ortesis a medida de Silicona");

        jLabel5.setText("Cant.");

        SpinCantAcrilico.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantDescGomaEva.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantDescMoles.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantFerula.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        SpinCantOrtesis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblProdBuenAndar)
                    .addComponent(ImagenBuenAndarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(ChkOrtesisProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(SpinCantOrtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(ChkFerulaProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpinCantFerula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(ChkDescaGomaEvaProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpinCantDescGomaEva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(ChkDescMolesProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpinCantDescMoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(ChkAcrilicoProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SpinCantAcrilico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(16, 16, 16))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LblProdBuenAndar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagenBuenAndarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAcrilicoProd)
                    .addComponent(SpinCantAcrilico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDescaGomaEvaProd)
                    .addComponent(SpinCantDescGomaEva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDescMolesProd)
                    .addComponent(SpinCantDescMoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkFerulaProd)
                    .addComponent(SpinCantFerula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkOrtesisProd)
                    .addComponent(SpinCantOrtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        TablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Material", "Arc Dr I", "Arc Bl I", "Cuñ P I", "Cuñ S I", "Tln Oq I", "R Tl Int I", "R Tl Ext I", "Arc Dr D", "Arc Bl D", "Cuñ P D", "Cuñ S D", "Tln Oq I", "R Tl Int D", "R Tl Ext D", "Fecha Consulta"
            }
        ));
        jScrollPane7.setViewportView(TablaMostrar);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelProximosTurnosLayout = new javax.swing.GroupLayout(PanelProximosTurnos);
        PanelProximosTurnos.setLayout(PanelProximosTurnosLayout);
        PanelProximosTurnosLayout.setHorizontalGroup(
            PanelProximosTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProximosTurnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProximosTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProximosTurnosLayout.createSequentialGroup()
                        .addComponent(PanelPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(PanelProximosTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(PanelProximosTurnosLayout.createSequentialGroup()
                        .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelProximosTurnosLayout.setVerticalGroup(
            PanelProximosTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProximosTurnosLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProximosTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProximosTurnosLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PanelPestanas.addTab("Ortesis-Ortopedia", PanelProximosTurnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChkOtroTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOtroTratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkOtroTratActionPerformed

    private void BtnBuscarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarHistoriaActionPerformed
      // BuscarPorCodHist();
    
     String DetalleHist = ""; 
     String CodHist = this.TxtCodHist.getText().toUpperCase(); 
     java.util.Date fecha;
 
     
     HistoriaClinica objBuscaCodHist = new HistoriaClinica();
     
     if(this.TxtCodHist.getText().isEmpty())
     { 
         JOptionPane.showMessageDialog(null, "ATENCION!! Debe ingresar un código", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
     }   
     else
     {    
        
        boolean existe = objBuscaCodHist.BuscarCodHistoriaClinica(CodHist);
        if (existe == true)
        {   

           DetalleHist =  objBuscaCodHist.getDetalleHistClin();
           this.TxtDetalleHistoriaClinica.setText(DetalleHist);
           this.TxtDetalleHistoriaClinica.setText(DetalleHist);
                      
           CodHist = objBuscaCodHist.getIdHistoriaClinica();
           this.TxtCodHist.setText(CodHist);
           
           fecha = objBuscaCodHist.getFechaConsulta();
           
           
        }         
        else
        {
           JOptionPane.showMessageDialog(null, "ATENCION!! Codigo inexistente (Ej código: NOMAPE1984)", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
        }          
     }
     
     this.BtnEditarHistoriaClinica.setEnabled(true);
     this.BtnGuardarHistoriaClinica.setEnabled(false);
     
    }//GEN-LAST:event_BtnBuscarHistoriaActionPerformed

    private void ChkOtroMotivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOtroMotivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkOtroMotivActionPerformed

    private void ChkPedigrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkPedigrafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkPedigrafActionPerformed

    private void ChkTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkTopicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkTopicActionPerformed

    private void ChkVisitaMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVisitaMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVisitaMenActionPerformed

    private void ChkAlgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkAlgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkAlgiaActionPerformed

    private void ChkZonaPlantIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaPlantIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaPlantIzqActionPerformed

    private void ChkZonaMetaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaMetaIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaMetaIzqActionPerformed

    private void ChkZonaTalarIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaTalarIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaTalarIzqActionPerformed

    private void ChkDedo5IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo5IzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo5IzqActionPerformed

    private void ChkDedo4IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo4IzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo4IzqActionPerformed

    private void ChkDedo3IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo3IzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo3IzqActionPerformed

    private void ChkDedo2IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo2IzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo2IzqActionPerformed

    private void ChkHalluxIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkHalluxIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkHalluxIzqActionPerformed

    private void ComboDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDiagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDiagActionPerformed

    private void ChkTratAntimicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkTratAntimicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkTratAntimicActionPerformed

    private void BtnGuardarHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarHistoriaClinicaActionPerformed
        String DetalleHist;
        String CodHist;
        java.util.Date Fecha;
        int FkNroFicha = 0;
        String Nom = "";
        String Ape = "";

    
          
       
        DetalleHist = this.TxtDetalleHistoriaClinica.getText();
        CodHist = this.TxtCodHist.getText();
        Fecha = this.DateFechaConsulta.getDate();
        java.sql.Date fechasql = ConvertirASql(Fecha);

        Nom = this.TxtNom.getText().toUpperCase();
        Ape = this.TxtApe.getText().toUpperCase();
        
        Ficha objNroFicha = new Ficha(); //voy a buscar el dato del NrodeFicha para igualar al FKNroFicha
        boolean existe = objNroFicha.BuscarIdFicha(Nom, Ape);
        if (existe == true)
        {
            NroFicha = objNroFicha.getNroFicha();
            FkNroFicha = NroFicha;
        }
   
        
        HistoriaClinica objAltaHistoria = new HistoriaClinica(CodHist, DetalleHist, fechasql, FkNroFicha);
        objAltaHistoria.AltaHistClinica();

        
    }//GEN-LAST:event_BtnGuardarHistoriaClinicaActionPerformed

    private void TxtEsguinceFracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtEsguinceFracMouseClicked
        if (this.ChkEsguince.isSelected())
        {
            this.TxtEsguinceFrac.setEditable(true);
        } else
        {
            TxtEsguinceFrac.setText(null);
            this.TxtEsguinceFrac.setEditable(false);
        }
    }//GEN-LAST:event_TxtEsguinceFracMouseClicked

    private void ChkOtroAntMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOtroAntMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkOtroAntMedActionPerformed

    private void ChkOtroAntMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOtroAntMedMouseClicked
        if (this.ChkOtroAntMed.isSelected())
        {
            this.TxtOtroAntMed.setEditable(true);
           
        } else
        {
            this.TxtOtroAntMed.setText(null);
            this.TxtOtroAntMed.setEditable(false);
           
        }
    }//GEN-LAST:event_ChkOtroAntMedMouseClicked

    private void ChkAlergiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkAlergiaMouseClicked
        if (this.ChkAlergia.isSelected())
        {
            this.TxtAlergia.setEditable(true);
        } else
        {
            this.TxtAlergia.setText(null);
            this.TxtAlergia.setEditable(false);
        }
    }//GEN-LAST:event_ChkAlergiaMouseClicked

    private void ChkMedicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkMedicacionMouseClicked
        if (this.ChkMedicacion.isSelected())
        {
            this.TxtTomaMedicacion.setEditable(true);
        } else
        {
            this.TxtTomaMedicacion.setText(null);
            this.TxtTomaMedicacion.setEditable(false);
        }
    }//GEN-LAST:event_ChkMedicacionMouseClicked

    private void ChkDiabeticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDiabeticoMouseClicked
        if (this.ChkDiabetico.isSelected())
        {
            TxtDiabetico.setEditable(true);
        } else
        {
            TxtDiabetico.setText(null);
            TxtDiabetico.setEditable(false);
        }
    }//GEN-LAST:event_ChkDiabeticoMouseClicked

    private void ChkEsguinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkEsguinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkEsguinceActionPerformed

    private void BtnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPacienteActionPerformed
        java.util.Date fecha;
        java.sql.Date fechasql;
        String Nom = this.TxtNom.getText().toUpperCase();
        String Ape = this.TxtApe.getText().toUpperCase();
        String Dni = "";
        String Sexo = "";
        String Cel = "";
        String Tel = "";
        String Dir = "";
        String Mail = "";
        String ActFis = "";
        String Diabet = "";
        String TxtDiabet = "";
        String Anticoag = "";
        String Medic = "";
        String TxtMedic = "";
        String Alergias = "";
        String TxtAlergias = "";
        String EsguinceF = "";
        String TxtEsguinceF = "";
        String Observa = "";
        String Otro = "";
        String TxtOtro = "";
        
            if (TxtNom.getText().isEmpty() || TxtApe.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "ATENCION! ingrese NOMBRE y APELLIDO del paciente a buscar", "FICHA", JOptionPane.INFORMATION_MESSAGE);
            }  
            else
            {
                Ficha objBuscaPaciente = new Ficha();
            boolean existe = objBuscaPaciente.BuscarPorNomyApe(Nom, Ape);
            if (existe == true)
            {
                
                NroFicha = objBuscaPaciente.getNroFicha();
                TxtNroFicha.setText(String.valueOf(NroFicha));
                LblMostrarNroFicha.setText("Ficha Paciente Nº" + String.valueOf(NroFicha));
                this.TxtNom.setText(Nom);
                this.LblMostrarNom.setText(Nom);
                this.TxtApe.setText(Ape);
                this.LblMostrarApe.setText(Ape);
                Dni = objBuscaPaciente.getDni();
                this.TxtDni.setText(Dni);
                Sexo = objBuscaPaciente.getSexo();
                if ("F".equals(Sexo))
                {
                    this.RbFem.setSelected(true);
                }
                else
                {
                    if ("M".equals(objBuscaPaciente.getSexo())) 
                    {
                        this.RbMasc.setSelected(true);
                    }
                    else
                    {
                        this.RbOtro.setSelected(true);
                    }    
                }
                fecha = objBuscaPaciente.getFecha();
                this.DateFechaNac.setDate(fecha);
                //Edad
                Date FechaSelec = this.DateFechaNac.getDate();
                LocalDate FechaActual = LocalDate.now();
                LocalDate FechaCalendario = FechaSelec.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Period edad2 = Period.between(FechaCalendario, FechaActual);
                this.LblMostrarEdad.setText("Edad " + edad2.getYears() + " años");
                
                Cel = objBuscaPaciente.getCel();
                this.TxtCel.setText(Cel);
                Tel = objBuscaPaciente.getTel();
                this.TxtTel.setText(Tel);
                Dir = objBuscaPaciente.getDir();
                this.TxtDir.setText(Dir);
                Mail = objBuscaPaciente.getMail();
                this.TxtMail.setText(Mail);
                ActFis = objBuscaPaciente.getActFisica();
                this.TxtActFisica.setText(ActFis);
                Diabet = objBuscaPaciente.isDiabet();
                if ("Sí".equals(Diabet))
                {    
                    this.ChkDiabetico.setSelected(true);
                    TxtDiabet = objBuscaPaciente.getTxtDiabet();
                    this.TxtDiabetico.setText(TxtDiabet);
                }
                Anticoag = objBuscaPaciente.isAnticoag();
                if ("Sí".equals(Anticoag))
                {
                    this.ChkAnticoag.setSelected(true);
                }
                Medic = objBuscaPaciente.isTomaAsp();
                if ("Sí".equals(Medic))
                {
                    this.ChkMedicacion.setSelected(true);
                    TxtMedic = objBuscaPaciente.getTxtTomaAsp();
                    this.TxtTomaMedicacion.setText(TxtMedic);
                }
                Alergias = objBuscaPaciente.isAlergias();
                if ("Sí".equals(Alergias))
                {   
                    this.ChkAlergia.setSelected(true);
                    TxtAlergias = objBuscaPaciente.getTxtAlergias();
                    this.TxtAlergia.setText(TxtAlergias);
                }
                EsguinceF = objBuscaPaciente.isEsguince();
                if ("Sí".equals(EsguinceF))
                {
                    this.ChkEsguince.setSelected(true);
                    TxtEsguinceF = objBuscaPaciente.getTxtEsguince();
                    this.TxtEsguinceFrac.setText(TxtEsguinceF);
                }
                Observa = objBuscaPaciente.getObserv();
                this.TxtObservFicha.setText(Observa);
                Otro = objBuscaPaciente.isOtroAnt();
                if ("Sí".equals(Otro))
                {
                    this.ChkOtroAntMed.setSelected(true);
                    TxtOtro = objBuscaPaciente.getTxtOtroAnt();
                    this.TxtOtroAntMed.setText(TxtOtro);
                }
               
                LblMostrarSexo.setText("Sexo " + String.valueOf(Sexo));
                LblActividadFisicaReal.setText(ActFis);


                String Txt = "";

                if (this.ChkDiabetico.isSelected())
                {
                    Txt += "Diabetes - " + TxtDiabetico.getText();
                }

                if (this.ChkAnticoag.isSelected())
                {
                    Txt += "\nAnticoagulado";
                }

                if (this.ChkMedicacion.isSelected())
                {
                    Txt += "\nMedicamentos - " + TxtTomaMedicacion.getText();
                }

                if (this.ChkAlergia.isSelected())
                {
                    Txt += "\nAlergias - " + TxtAlergia.getText();
                }
                if (this.ChkEsguince.isSelected())
                {
                    Txt += "\nLesiones miembros inf - " + TxtEsguinceFrac.getText();
                }

                if (this.ChkOtroAntMed.isSelected())
                {
                    Txt += "\nOtro - " + TxtOtroAntMed.getText();
                }

                this.TxtAreaAntMed.setText(Txt);
              
                 //Metodo para completar los campos de HIST CLIN por Nro de Ficha
              
                    HistoriaClinica objBuscarHistClin = new HistoriaClinica ();
                    String DetalleHist = "";
                    String CodHist = "";
                    int FkNroFicha = NroFicha;
                       System.out.println(FkNroFicha);

                   boolean existente = objBuscarHistClin.BuscarHistClinPorNroFicha(FkNroFicha);
                   if (existente == true)
                   {   

                       DetalleHist =  objBuscarHistClin.getDetalleHistClin();
                       this.TxtDetalleHistoriaClinica.setText(DetalleHist);
                       this.TxtDetalleHistoriaClinica.setText(DetalleHist);

                       CodHist = objBuscarHistClin.getIdHistoriaClinica();
                       this.TxtCodHist.setText(CodHist);

                       fecha = objBuscarHistClin.getFechaConsulta();
                     
                       DeshabilitarEdicion(); 
                       this.BtnEditarFicha.setEnabled(true);
                       this.BtnGuardarFicha.setEnabled(false);
                       this.BtnBuscarPaciente.setEnabled(false);
                       this.BtnEditarHistoriaClinica.setEnabled(true);

                   }         
                   else
                   {
                       JOptionPane.showMessageDialog(null, "ATENCION!! Paciente sin Historia Clinica", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
                       HabilitarEdicion();
                   } 
                
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ATENCION!! Paciente buscado inexistente, debe registrarlo", "FICHA", JOptionPane.INFORMATION_MESSAGE);
                HabilitarEdicion();
            }    
            
           
            
            }    
            
            
    }//GEN-LAST:event_BtnBuscarPacienteActionPerformed

    private void BtnLimpiarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarFormActionPerformed
        Limpiar();
        HabilitarEdicion();
        this.BtnEditarFicha.setEnabled(false);
        this.BtnGuardarFicha.setEnabled(true);
        this.BtnBuscarPaciente.setEnabled(true);
        
    }//GEN-LAST:event_BtnLimpiarFormActionPerformed

    private void BtnGuardarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarFichaActionPerformed

        java.util.Date Fecha;
        
        
        String Nom = "";
        String Ape = "";
        String Dni = "";
        String Sexo = "";
        String Cel = "";
        String Tel = "";
        String Dir = "";
        String Mail = "";
        String ActFisica = "";
        String Observ = "";
        String Anticoag = "";
        
        
        
        //FALTA SET TEXT NULL CON IF IS EMPTY PARA LOS CAMPOS NO OBLIGATORIOS
        Fecha = this.DateFechaNac.getDate();
        
        
        
        if (TxtNom.getText().isEmpty() || TxtApe.getText().isEmpty() || TxtCel.getText().isEmpty() || TxtDir.getText().isEmpty() || DateFechaNac.getDate() == null) 
        {
            JOptionPane.showMessageDialog(null, "ATENCION! Debe completar los campos obligatorios", "FICHA", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {   java.sql.Date fechasql = ConvertirASql(Fecha);
            Nom = this.TxtNom.getText().toUpperCase();
            Ape = this.TxtApe.getText().toUpperCase();
            Dni = this.TxtDni.getText();
            if (this.RbMasc.isSelected()) //
            {
                Sexo = "M";
            }
            else
            {
                if(this.RbFem.isSelected())
                {
                    Sexo = "F";
                }
                else
                {
                    Sexo = "X";
                }
            }
            Cel = this.TxtCel.getText();
            Tel = this.TxtTel.getText();
            Dir = this.TxtDir.getText();
            Mail = this.TxtMail.getText();
            ActFisica = this.TxtActFisica.getText();
            
            Observ = this.TxtObservFicha.getText();

            if (this.ChkAnticoag.isSelected())
            {
                Anticoag = "Sí";
            }
            else
            {
                Anticoag = "No";
            }
            if (this.ChkEsguince.isSelected())
            {
                 Esguince = "Sí";
                 TxtEsguince = this.TxtEsguinceFrac.getText();
            } 
            else
            {
                Esguince = "No";
            }
             if (this.ChkOtroAntMed.isSelected())
            {
                OtroAnt = "Sí";
                TxtOtroAnt = this.TxtOtroAntMed.getText();
            }
            else
            {
                 OtroAnt = "No";
            }
            if (this.ChkAlergia.isSelected())
            {
                Alergias = "Sí";
                TxtAlergias = this.TxtAlergia.getText();
            } 
            else
            {
                Alergias = "No";
            } 
            if (this.ChkMedicacion.isSelected())
            {            
                TomaAsp = "Sí";
                TxtTomaAsp = this.TxtTomaMedicacion.getText();
            } else
            {
                TomaAsp = "No";
            }
            if (this.ChkDiabetico.isSelected())
            {
                 Diabet = "Sí";
                 TxtDiabet = this.TxtDiabetico.getText();
            }
            else
            {
                 Diabet = "No";
            }

            Ficha objAltaFicha = new Ficha(Nom,Ape,Dni,Sexo,Cel,Tel,Dir,Mail,ActFisica,fechasql,Observ,Diabet,TxtDiabet,Anticoag,TomaAsp,TxtTomaAsp,Alergias,TxtAlergias, Esguince,TxtEsguince,OtroAnt,TxtOtroAnt);
            objAltaFicha.AltaFicha();

            //Panel de mostrar

            LblMostrarNom.setText(Nom);
            LblMostrarApe.setText(Ape);
            //Muestra Nro de ficha
            Ficha objNroFicha = new Ficha();
            boolean existe = objNroFicha.BuscarIdFicha(Nom, Ape);
            if (existe == true)
            {
                NroFicha = objNroFicha.getNroFicha();
                TxtNroFicha.setText(String.valueOf(NroFicha));
                LblMostrarNroFicha.setText("Ficha Paciente Nº" + String.valueOf(NroFicha));
            }
            //EDAD
            Date FechaSelec = this.DateFechaNac.getDate();
            LocalDate FechaActual = LocalDate.now();
            LocalDate FechaCalendario = FechaSelec.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period edad2 = Period.between(FechaCalendario, FechaActual);
            this.LblMostrarEdad.setText("Edad " + edad2.getYears() + " años");
            
            LblMostrarSexo.setText("Sexo " + String.valueOf(Sexo));
            LblActividadFisicaReal.setText(ActFisica);

            //Mostrar AntMed en TxtArea
            String Txt = "";

            if (this.ChkDiabetico.isSelected())
            {
                Txt += "Diabetes - " + TxtDiabetico.getText();
            }

            if (this.ChkAnticoag.isSelected())
            {
                Txt += "\nAnticoagulado";
            }

            if (this.ChkMedicacion.isSelected())
            {
                Txt += "\nMedicamentos - " + TxtTomaMedicacion.getText();
            }

            if (this.ChkAlergia.isSelected())
            {
                Txt += "\nAlergias - " + TxtAlergia.getText();
            }
            if (this.ChkEsguince.isSelected())
            {
                Txt += "\nLesiones miembros inf - " + TxtEsguinceFrac.getText();
            }

            if (this.ChkOtroAntMed.isSelected())
            {
                Txt += "\nOtro - " + TxtOtroAntMed.getText();
            }

            this.TxtAreaAntMed.setText(Txt);
            DeshabilitarEdicion();
            this.BtnGuardarFicha.setEnabled(false);
        }
        
        this.BtnEditarFicha.setEnabled(false);
        
        
        
    }//GEN-LAST:event_BtnGuardarFichaActionPerformed

    private void ChkZonaMedialIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaMedialIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaMedialIzqActionPerformed

    private void ChkHalluxDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkHalluxDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkHalluxDerActionPerformed

    private void ChkDedo2DerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo2DerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo2DerActionPerformed

    private void ChkDedo3DerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo3DerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo3DerActionPerformed

    private void ChkDedo4DerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo4DerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo4DerActionPerformed

    private void ChkDedo5DerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDedo5DerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDedo5DerActionPerformed

    private void ChkZonaTalarDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaTalarDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaTalarDerActionPerformed

    private void ChkZonaPlantDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaPlantDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaPlantDerActionPerformed

    private void ChkZonaMedialDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaMedialDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaMedialDerActionPerformed

    private void ChkZonaMetaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkZonaMetaDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkZonaMetaDerActionPerformed

    private void BtnLimpiarHistClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarHistClinicaActionPerformed
        LimpiarHistoria();
        Limpiar();
        HabilitarEdicion();
        this.BtnGuardarHistoriaClinica.setEnabled(true);
        this.BtnEditarHistoriaClinica.setEnabled(false);
        this.BtnAceptarEditHistoriaClinica.setEnabled(false);
        this.BtnCancelarEditHistoriaClinica.setEnabled(false);
        
    }//GEN-LAST:event_BtnLimpiarHistClinicaActionPerformed

    private void ChkOtroMotivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOtroMotivMouseClicked
       if (this.ChkOtroMotiv.isSelected())
        { 
            this.TxtOtroMotiv.setEditable(true);
        }
       else
       {
           this.TxtOtroMotiv.setEditable(false);
           this.TxtOtroMotiv.setText(null);
       }
    }//GEN-LAST:event_ChkOtroMotivMouseClicked

    private void ChkHalluxIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkHalluxIzqMouseClicked
        if (this.ChkHalluxIzq.isSelected())
        {   
            this.TxtHalluxIzq.setEditable(true);
            
        }
        else
        {
            this.TxtHalluxIzq.setEditable(false);
            this.TxtHalluxIzq.setText(null);
        }    
    }//GEN-LAST:event_ChkHalluxIzqMouseClicked

    private void ChkDedo2IzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo2IzqMouseClicked
         if (this.ChkDedo2Izq.isSelected())
        {   
            this.TxtDedo2Izq.setEditable(true);
        }
         else
         {
            this.TxtDedo2Izq.setEditable(false);
            this.TxtDedo2Izq.setText(null);
         }     
    }//GEN-LAST:event_ChkDedo2IzqMouseClicked

    private void ChkDedo3IzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo3IzqMouseClicked
       if (this.ChkDedo3Izq.isSelected())
        {
           this.TxtDedo3Izq.setEditable(true);
        }
       else
       {
           this.TxtDedo3Izq.setEditable(false);
           this.TxtDedo3Izq.setText(null);
       }    
    }//GEN-LAST:event_ChkDedo3IzqMouseClicked

    private void ChkDedo4IzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo4IzqMouseClicked
       if (this.ChkDedo4Izq.isSelected())
        {
             this.TxtDedo4Izq.setEditable(true);
        }
       else
       {
           this.TxtDedo4Izq.setEditable(false);
           this.TxtDedo4Izq.setText(null);
       }        
    }//GEN-LAST:event_ChkDedo4IzqMouseClicked

    private void ChkDedo5IzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo5IzqMouseClicked
       if (this.ChkDedo5Izq.isSelected())
        {
             this.TxtDedo5Izq.setEditable(true);
        }
       else
       {
           this.TxtDedo5Izq.setEditable(false);
           this.TxtDedo5Izq.setText(null);
       }  
    }//GEN-LAST:event_ChkDedo5IzqMouseClicked

    private void ChkZonaTalarIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaTalarIzqMouseClicked
      if (this.ChkZonaTalarIzq.isSelected())
      {  
        this.TxtZonaTalarIzq.setEditable(true);
      }
      else
      {
         this.TxtZonaTalarIzq.setEditable(false); 
         this.TxtZonaTalarIzq.setText(null);
      }    
    }//GEN-LAST:event_ChkZonaTalarIzqMouseClicked

    private void ChkZonaPlantIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaPlantIzqMouseClicked
         if (this.ChkZonaPlantIzq.isSelected())
      {  
        this.TxtZonaPlanIzq.setEditable(true);
      }
      else
      {
         this.TxtZonaPlanIzq.setEditable(false); 
         this.TxtZonaPlanIzq.setText(null);
      }      
    }//GEN-LAST:event_ChkZonaPlantIzqMouseClicked

    private void ChkZonaMedialIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaMedialIzqMouseClicked
         if (this.ChkZonaMedialIzq.isSelected())
      {  
        this.TxtZonaMedIzq.setEditable(true);
      }
      else
      {
         this.TxtZonaMedIzq.setEditable(false); 
         this.TxtZonaMedIzq.setText(null);
      }         
    }//GEN-LAST:event_ChkZonaMedialIzqMouseClicked

    private void ChkZonaMetaIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaMetaIzqMouseClicked
         if (this.ChkZonaMetaIzq.isSelected())
      {  
        this.TxtZonaMetIzq.setEditable(true);
      }
      else
      {
         this.TxtZonaMetIzq.setEditable(false);
         this.TxtZonaMetIzq.setText(null);
      }         
    }//GEN-LAST:event_ChkZonaMetaIzqMouseClicked

    private void ChkHalluxDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkHalluxDerMouseClicked
         if (this.ChkHalluxDer.isSelected())
        {   
            this.TxtHalluxDer.setEditable(true);
            
        }
        else
        {
            this.TxtHalluxDer.setEditable(false);
            this.TxtHalluxDer.setText(null);
        }  
    }//GEN-LAST:event_ChkHalluxDerMouseClicked

    private void ChkDedo2DerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo2DerMouseClicked
          if (this.ChkDedo2Der.isSelected())
        {   
            this.TxtDedo2Der.setEditable(true);
        }
         else
         {
            this.TxtDedo2Der.setEditable(false);
            this.TxtDedo2Der.setText(null);
         }
    }//GEN-LAST:event_ChkDedo2DerMouseClicked

    private void ChkDedo3DerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo3DerMouseClicked
       if (this.ChkDedo3Der.isSelected())
        {
           this.TxtDedo3Der.setEditable(true);
        }
       else
       {
           this.TxtDedo3Der.setEditable(false);
           this.TxtDedo3Der.setText(null);
       }            
    }//GEN-LAST:event_ChkDedo3DerMouseClicked

    private void ChkDedo4DerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo4DerMouseClicked
       if (this.ChkDedo4Der.isSelected())
        {
             this.TxtDedo4Der.setEditable(true);
        }
       else
       {
           this.TxtDedo4Der.setEditable(false);
           this.TxtDedo4Der.setText(null);
       } 
    }//GEN-LAST:event_ChkDedo4DerMouseClicked

    private void ChkDedo5DerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedo5DerMouseClicked
       if (this.ChkDedo5Der.isSelected())
        {
             this.TxtDedo5Der.setEditable(true);
        }
       else
       {
           this.TxtDedo5Der.setEditable(false);
           this.TxtDedo5Der.setText(null);
       } 
    }//GEN-LAST:event_ChkDedo5DerMouseClicked

    private void ChkZonaTalarDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaTalarDerMouseClicked
      if (this.ChkZonaTalarDer.isSelected())
      {  
        this.TxtZonaTalarDer.setEditable(true);
      }
      else
      {
         this.TxtZonaTalarDer.setEditable(false); 
          this.TxtZonaTalarDer.setText(null);
      }  
    }//GEN-LAST:event_ChkZonaTalarDerMouseClicked

    private void ChkZonaPlantDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaPlantDerMouseClicked
         if (this.ChkZonaPlantDer.isSelected())
      {  
        this.TxtZonaPlanDer.setEditable(true);
      }
      else
      {
         this.TxtZonaPlanDer.setEditable(false); 
         this.TxtZonaPlanDer.setText(null);
      }   
    }//GEN-LAST:event_ChkZonaPlantDerMouseClicked

    private void ChkZonaMedialDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaMedialDerMouseClicked
         if (this.ChkZonaMedialDer.isSelected())
      {  
        this.TxtZonaMedDer.setEditable(true);
      }
      else
      {
         this.TxtZonaMedDer.setEditable(false); 
         this.TxtZonaMedDer.setText(null);
      }   
    }//GEN-LAST:event_ChkZonaMedialDerMouseClicked

    private void ChkZonaMetaDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkZonaMetaDerMouseClicked
         if (this.ChkZonaMetaDer.isSelected())
      {  
        this.TxtZonaMetDer.setEditable(true);
      }
      else
      {
         this.TxtZonaMetDer.setEditable(false); 
         this.TxtZonaMetDer.setText(null);
      }       
    }//GEN-LAST:event_ChkZonaMetaDerMouseClicked

    private void ChkOtroTratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOtroTratMouseClicked
        if (this.ChkOtroTrat.isSelected())
        {
            this.TxtOtroTrat.setEditable(true);
        }
        else
        {
            this.TxtOtroTrat.setEditable(false);
            this.TxtOtroTrat.setText(null);
        }    
    }//GEN-LAST:event_ChkOtroTratMouseClicked

    private void ChkOtroIndicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOtroIndicMouseClicked
        if (this.ChkOtroIndic.isSelected())
        {
            this.TxtOtroIndic.setEditable(true);
        } 
        else 
        {
            this.TxtOtroIndic.setEditable(false);
            this.TxtOtroIndic.setText(null);
        }
    }//GEN-LAST:event_ChkOtroIndicMouseClicked

    private void ChkOtroOrtesisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOtroOrtesisMouseClicked
        if (this.ChkOtroOrtesis.isSelected())
        {
            this.TxtOtroOrtesis.setEditable(true);
        } 
        else
        {
            this.TxtOtroOrtesis.setEditable(false);
            this.TxtOtroOrtesis.setText(null);
        }
    }//GEN-LAST:event_ChkOtroOrtesisMouseClicked

    private void BtnVerDetalleHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerDetalleHistActionPerformed
        
        VerDetalleHistoria();// 
        this.BtnEditarHistoriaClinica.setEnabled(true);
        this.BtnGuardarConsulta.setEnabled(true);
        PanelPestanas.setSelectedIndex(2);
    }//GEN-LAST:event_BtnVerDetalleHistActionPerformed

    private void ChkEspInterdigitalIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkEspInterdigitalIzqMouseClicked
        if (this.ChkEspInterdigitalIzq.isSelected())
        {   
            this.TxtEspInterdigitalIzq.setEditable(true);
            
        }
        else
        {
            this.TxtEspInterdigitalIzq.setEditable(false);
            this.TxtEspInterdigitalIzq.setText(null);
        }    
    }//GEN-LAST:event_ChkEspInterdigitalIzqMouseClicked

    private void ChkEspInterdigitalIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkEspInterdigitalIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkEspInterdigitalIzqActionPerformed

    private void ChkEspInterdigitalDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkEspInterdigitalDerMouseClicked
             if (this.ChkEspInterdigitalDer.isSelected())
        {   
            this.TxtEspInterdigitalDer.setEditable(true);
            
        }
        else
        {
            this.TxtEspInterdigitalDer.setEditable(false);
            this.TxtEspInterdigitalDer.setText(null);
        }    
    }//GEN-LAST:event_ChkEspInterdigitalDerMouseClicked

    private void ChkEspInterdigitalDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkEspInterdigitalDerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkEspInterdigitalDerActionPerformed

    private void BtnConfirmDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmDiagActionPerformed

         
        
             matriz[fila][0] = String.valueOf(this.ComboDiag.getSelectedItem()) + " " + TxtChkOtroDiag.getText();
             
                    
             int ComboIndex = this.ComboDiag.getSelectedIndex();
             System.out.println(ComboIndex);
             
            if(this.ChkHalluxIzq.isSelected())
            {    
                   matriz[fila][1] = "HX PI " + this.TxtHalluxIzq.getText() + ", ";
            }
             else
            {
                matriz[fila][1] = "";
            }
            if (this.ChkDedo2Izq.isSelected())
            {
                   matriz[fila][2] = "D2 PI " + this.TxtDedo2Izq.getText() + ", ";			
            }
             else
            {
                matriz[fila][2] = "";
            }  
            if (this.ChkDedo3Izq.isSelected())
            {
                   matriz[fila][3] = "D3 PI " + this.TxtDedo3Izq.getText() + ", ";
            }
             else
            {
                matriz[fila][3] = "";
            }  
            if (this.ChkDedo4Izq.isSelected())
            {
                   matriz[fila][4] = "D4 PI " + this.TxtDedo4Izq.getText() + ", ";
            }
             else
            {
                matriz[fila][4] = "";
            }  
            if (this.ChkDedo5Izq.isSelected())
            {
                  matriz[fila][5] = "D5 PI " + this.TxtDedo5Izq.getText() + ", ";
            }
             else
            {
                matriz[fila][5] = "";
            }  
            if (this.ChkZonaTalarIzq.isSelected())
            {
                matriz[fila][6] = "zona talar PI " + this.TxtZonaTalarIzq.getText() + ", ";
            }
             else
            {
                matriz[fila][6] = "";
            }  
            if (this.ChkZonaMetaIzq.isSelected())
            {
                matriz[fila][7] = "zona metatarsal PI " + this.TxtZonaMetIzq.getText() + ", ";
            }
             else
            {
                matriz[fila][7] = "";
            }  
            if (this.ChkZonaPlantIzq.isSelected())
            {
                 matriz[fila][8] = "zona plantar PI " + this.TxtZonaPlanIzq.getText() + ", ";
            }
             else
            {
                matriz[fila][8] = "";
            }  
            if (this.ChkZonaMedialIzq.isSelected())
            {
                 matriz[fila][9] = "zona medial PI " + this.TxtZonaMedIzq.getText() + ", ";
            } 
             else
            {
                matriz[fila][9] = "";
            }  
            if (this.ChkEspInterdigitalIzq.isSelected())
            {
                  matriz[fila][10] = "esp interdigital PI " + this.TxtEspInterdigitalIzq.getText() + ", ";
            }
             else
            {
                matriz[fila][10] = "";
            }  
            //Pie Der

            if (this.ChkHalluxDer.isSelected())
            {
                   matriz[fila][11] = "HX PD " + this.TxtHalluxDer.getText()+ ", ";
            }
            else
            {
                matriz[fila][11] = "";
            }  
            if (this.ChkDedo2Der.isSelected())
            {
                  matriz[fila][12] = "D2 PD " + this.TxtDedo2Der.getText()+ ", ";
            }
             else
            {
                matriz[fila][12] = "";
            }              
            if (this.ChkDedo3Der.isSelected())
            {
                 matriz[fila][13] = "D3 PD " + this.TxtDedo3Der.getText() + ", ";
            }
             else
            {
                matriz[fila][13] = "";
            }              
            if (this.ChkDedo4Der.isSelected())
            {
               matriz[fila][14] = "D4 PD " + this.TxtDedo4Der.getText() + ", ";
            }
             else
            {
                matriz[fila][14] = "";
            }              
            if (this.ChkDedo5Der.isSelected())
            {
                matriz[fila][15] = "D5 PD " + this.TxtDedo5Der.getText() + ", ";
            }
             else
            {
                matriz[fila][15] = "";
            }              
            if (this.ChkZonaTalarDer.isSelected())
            {
                 matriz[fila][16] = "zona talar PD " + this.TxtZonaTalarDer.getText() + ", ";
            }
             else
            {
                matriz[fila][16] = "";
            }              
            if (this.ChkZonaMetaDer.isSelected())
            {
                matriz[fila][17] = "zona metatarsal PD " + this.TxtZonaMetDer.getText() + ", ";
            }
             else
            {
                matriz[fila][17] = "";
            }              
            if (this.ChkZonaPlantDer.isSelected())
            {
                matriz[fila][18] = "zona plantar PD " + this.TxtZonaPlanDer.getText() + ", ";
            } 
             else
            {
                matriz[fila][18] = "";
            }              
            if (this.ChkZonaMedialDer.isSelected())
            {
                matriz[fila][19] = "zona medial PD " + this.TxtZonaMedDer.getText() + ", ";
            }    
             else
            {
                matriz[fila][19] = "";
            }              
            if (this.ChkEspInterdigitalDer.isSelected())
            {
                 matriz[fila][20] = "esp interdigital PD " + this.TxtEspInterdigitalDer.getText() + ", ";
            }
             else
            {
                matriz[fila][20] = "";
            }              
                  JOptionPane.showMessageDialog(null, "Diagnótico cargado");   
            fila++; 
                  
            LimpiarDiagnostico();
            
    }//GEN-LAST:event_BtnConfirmDiagActionPerformed

    private void ComboDiagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboDiagMouseClicked
       
       
       
    }//GEN-LAST:event_ComboDiagMouseClicked

    private void BtnEditarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarFichaActionPerformed
        this.BtnCancelarEditFicha.setEnabled(true);       
        this.BtnAceptarEditFicha.setEnabled(true);
        HabilitarEdicion();
    }//GEN-LAST:event_BtnEditarFichaActionPerformed

    private void BtnAceptarEditFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarEditFichaActionPerformed
      //modificacion
      
        java.util.Date Fecha;
        String Sexo = "";
        String Anticoag = "";
        
       Fecha = this.DateFechaNac.getDate();
       java.sql.Date fechasql = ConvertirASql(Fecha);
        
       String Nom = this.TxtNom.getText();
       String Ape = this.TxtApe.getText();
       String Dni = this.TxtDni.getText();
            if (this.RbMasc.isSelected()) //
            {
                Sexo = "M";
            }
            else
            {
                if(this.RbFem.isSelected())
                {
                    Sexo = "F";
                }
                else
                {
                    Sexo = "O";
                }
            }
           String Cel = this.TxtCel.getText();
           String Tel = this.TxtTel.getText();
           String Dir = this.TxtDir.getText();
           String Mail = this.TxtMail.getText();
           String ActFisica = this.TxtActFisica.getText();

           String Observ = this.TxtObservFicha.getText();

            if (this.ChkAnticoag.isSelected())
            {
                Anticoag = "Sí";
            }
            else
            {
                Anticoag = "No";
            }
            if (this.ChkEsguince.isSelected())
            {
                 Esguince = "Sí";
                 TxtEsguince = this.TxtEsguinceFrac.getText();
            } 
            else
            {
                Esguince = "No";
            }
             if (this.ChkOtroAntMed.isSelected())
            {
                OtroAnt = "Sí";
                TxtOtroAnt = this.TxtOtroAntMed.getText();
            }
            else
            {
                 OtroAnt = "No";
            }
            if (this.ChkAlergia.isSelected())
            {
                Alergias = "Sí";
                TxtAlergias = this.TxtAlergia.getText();
            } 
            else
            {
                Alergias = "No";
            } 
            if (this.ChkMedicacion.isSelected())
            {            
                TomaAsp = "Sí";
                TxtTomaAsp = this.TxtTomaMedicacion.getText();
            } else
            {
                TomaAsp = "No";
            }
            if (this.ChkDiabetico.isSelected())
            {
                 Diabet = "Sí";
                 TxtDiabet = this.TxtDiabetico.getText();
            }
            else
            {
                 Diabet = "No";
            }
       
                
         Ficha objModifFicha = new Ficha(Nom,Ape,Dni,Sexo,Cel,Tel,Dir,Mail,ActFisica,fechasql,Observ,Diabet,TxtDiabet,Anticoag,TomaAsp,TxtTomaAsp,Alergias,TxtAlergias, Esguince,TxtEsguince,OtroAnt,TxtOtroAnt);
         int NroFicha = Integer.parseInt(this.TxtNroFicha.getText());
         objModifFicha.ModifFicha(NroFicha);
       
    }//GEN-LAST:event_BtnAceptarEditFichaActionPerformed

    private void BtnCancelarEditFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarEditFichaActionPerformed
      DeshabilitarEdicion();
      this.BtnAceptarEditFicha.setEnabled(false);
    }//GEN-LAST:event_BtnCancelarEditFichaActionPerformed

    private void BtnEditarHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarHistoriaClinicaActionPerformed
    this.BtnAceptarEditHistoriaClinica.setEnabled(true);
    this.BtnCancelarEditHistoriaClinica.setEnabled(true);
    this.TxtDetalleHistoriaClinica.setEditable(true);
    this.BtnGuardarHistoriaClinica.setEnabled(false);
    this.BtnVerDetalleHist.setEnabled(false);
    this.BtnEditarHistoriaClinica.setEnabled(false);
    this.BtnGuardarConsulta.setEnabled(false);
   
    }//GEN-LAST:event_BtnEditarHistoriaClinicaActionPerformed

    private void BtnAceptarEditHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarEditHistoriaClinicaActionPerformed
      // ModifDetalleHistoria();
      String CodHist = this.TxtCodHist.getText();
      int IdFicha = Integer.parseInt(this.TxtNroFicha.getText());
      String TxtDetalleHistModif = this.TxtDetalleHistoriaClinica.getText();
      
      java.util.Date Fecha;
             
      Fecha = this.DateFechaConsulta.getDate();
      java.sql.Date fechasql = ConvertirASql(Fecha);
      
      HistoriaClinica objModifDetalle = new HistoriaClinica (CodHist ,TxtDetalleHistModif, fechasql, IdFicha);
      objModifDetalle.ModifDetalleHistoria(CodHist, IdFicha);
     
      
      this.BtnVerDetalleHist.setEnabled(true);
      this.BtnEditarHistoriaClinica.setEnabled(true);
      this.TxtDetalleHistoriaClinica.setText(null);
      this.TxtDetalleHistoriaClinica.setText(this.TxtDetalleHistoriaClinica.getText());// para que le pase el texto del detalle chico al grande cuando edito
      this.BtnAceptarEditHistoriaClinica.setEnabled(false);
      this.BtnCancelarEditHistoriaClinica.setEnabled(false);
    }//GEN-LAST:event_BtnAceptarEditHistoriaClinicaActionPerformed

    private void BtnCancelarEditHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarEditHistoriaClinicaActionPerformed
       this.TxtDetalleHistoriaClinica.setEditable(false);
       this.BtnVerDetalleHist.setEnabled(true);
       this.BtnEditarHistoriaClinica.setEnabled(true);
       this.BtnAceptarEditHistoriaClinica.setEnabled(false);
       this.BtnCancelarEditHistoriaClinica.setEnabled(false);
    }//GEN-LAST:event_BtnCancelarEditHistoriaClinicaActionPerformed

    private void BtnGuardarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarConsultaActionPerformed
       
      String CodHist = this.TxtCodHist.getText();
      int IdFicha = Integer.parseInt(this.TxtNroFicha.getText());
      String TxtDetalleHistModif = this.TxtDetalleHistoriaClinica.getText();
      
      java.util.Date Fecha;
             
      Fecha = this.DateFechaConsulta.getDate();
      java.sql.Date fechasql = ConvertirASql(Fecha);
      
      HistoriaClinica objModifDetalle = new HistoriaClinica (CodHist ,TxtDetalleHistModif, fechasql, IdFicha);
      objModifDetalle.ModifDetalleHistoria(CodHist, IdFicha);
        
    }//GEN-LAST:event_BtnGuardarConsultaActionPerformed

    private void BtnGuardarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProductosActionPerformed
        
        //Alta Productos()
        
        String NomProd = "";
        String Marca = "";
        int Cantidad = 0;
        String FkCodHistoria = "";
        FkCodHistoria = this.TxtCodHist.getText();
        int FkIdFicha = Integer.parseInt(this.TxtNroFicha.getText());
       
        
        java.util.Date FechaVta; 
        FechaVta = this.DateFechaConsulta.getDate();
        java.sql.Date fechasql = ConvertirASql(FechaVta);
        
               
        if (this.ChkPlantillasProd.isSelected())
        {
            NomProd = "Plantillas";
            Marca = "Ortopedia";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantidadPlantillas.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        } 
        
        if (this.ChkAnilloSilProd.isSelected()) 
        {
           NomProd = "Anillo de Silicona";
           Marca = "Lenox"; 
           Cantidad = Integer.parseInt(String.valueOf(this.SpinCantAnillo.getValue()));
           Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
           objProd.AltaProd();  
            
        }    
      
        if (this.ChkBajaDedoProd.isSelected())
        {
            NomProd = "Bajadedo";
            Marca = "Lenox";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantBajaDedo.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        }    
        
        if (this.ChkCorrecHxProd.isSelected())
        {
            NomProd = "Corrector de Hx";
            Marca = "Lenox";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantCorrecHx.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        } 
       
        if (this.ChkDedalProd.isSelected())
        {
            NomProd = "Dedal";
            Marca = "Lenox";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantDedal.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        }
    
        if (this.ChkSeparadorProd.isSelected())
        {
            NomProd = "Separador";
            Marca = "Lenox";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantSeparador.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        }
        
         if (this.ChkAcrilicoProd.isSelected()) 
        {
            NomProd = "Acrílico";
            Marca = "BuenAndar";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantAcrilico.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        }
      
        if (this.ChkDescaGomaEvaProd.isSelected()) 
        {
            NomProd = "Descarga de goma eva";
            Marca = "BuenAndar";
            Cantidad =  Integer.parseInt(String.valueOf(this.SpinCantDescGomaEva.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();  
        } 
             
        if (this.ChkDescMolesProd.isSelected())
        {
            NomProd = "Descarga de moleskin";
            Marca = "BuenAndar";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantDescMoles.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();              
        } 
            
        if (this.ChkFerulaProd.isSelected()) 
        {
            NomProd = "Férula";
            Marca = "BuenAndar";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantFerula.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();   
        }
    
        if (this.ChkOrtesisProd.isSelected()) 
        {
            NomProd = "Ortesis de silicona";
            Marca = "BuenAndar";
            Cantidad = Integer.parseInt(String.valueOf(this.SpinCantOrtesis.getValue()));
            Productos objProd = new Productos(NomProd,Cantidad, Marca, fechasql, FkCodHistoria, FkIdFicha); 
            objProd.AltaProd();    
        } 
        
        
        
       //AltaPlantilla FALTA FK
        
             
        if (this.ChkPlantillasProd.isSelected()) 
        {
            
          
        String Material;
        String ArcoDuroIzq;
        String ArcoBlandoIzq;
        String CunPronIzq;
        String CunSupIzq;
        String TalOqIzq;
        String TalRealIntIzq;
        int MmTalRealIntIzq = 0;
        String TalRealExtIzq;
        int MmTalRealExtIzq = 0;
        String ArcoDuroDer;
        String ArcoBlandoDer;
        String CunPronDer;
        String CunSupDer;
        String TalOqDer;
        String TalRealIntDer;
        int MmTalRealIntDer = 0;
        String TalRealExtDer;
        int MmTalRealExtDer = 0;
             
       int  FkIdProducto = 0;
       int IdProducto; 
       String CodHistProdAux = this.TxtCodHist.getText();
       String fechaVtaAux = String.valueOf(fechasql);
       
       String nomProdAux = "Plantillas";
                   
        Productos objIdProd = new Productos(); //para buscar el id producto y mostrar
            
        boolean existe = objIdProd.BuscarxCodHist(CodHistProdAux, fechaVtaAux, nomProdAux); // busco por 3 para que me devuelva el id de productos
           
            if (existe == true)
            {
                IdProducto =  objIdProd.getIdProducto();
                FkIdProducto = IdProducto;
                               
            }
  
               
              
       Material = String.valueOf(this.ComboMaterial.getSelectedItem());
       
                if (this.ChkArcoDuroIzq.isSelected())
                {
                    ArcoDuroIzq = "Sí";
                }
                else
                {
                    ArcoDuroIzq = "No";
                }    
                if (this.ChkArcoBlandoIzq.isSelected())
                {
                    ArcoBlandoIzq = "Sí";
                }
                else
                {
                    ArcoBlandoIzq = "No"; 
                } 
                if (this.ChkCunPronIzq.isSelected())
                {
                    CunPronIzq = "Sí";
                }
                else
                {
                     CunPronIzq = "No";
                } 
                if (this.ChkCunSupIzq.isSelected())
                {
                    CunSupIzq = "Sí";
                }
                else
                {
                    CunSupIzq = "No";
                }         
                if (this.ChkTalonIzq.isSelected())
                {
                    TalOqIzq = "Sí";
                }
                else
                {
                   TalOqIzq = "No"; 
                }         
                if (this.ChkRealIntIzq.isSelected())
                {
                    TalRealIntIzq = "Sí";
                    MmTalRealIntIzq = Integer.parseInt(String.valueOf(this.SpinRealIntIzq.getValue()));
                }
                else
                {
                    TalRealIntIzq = "No";
                }         
                if (this.ChkRealExtIzq.isSelected())
                {
                    TalRealExtIzq = "Sí";
                    MmTalRealExtIzq = Integer.parseInt(String.valueOf(this.SpinRealExtIzq.getValue()));
                }
                else
                {
                    TalRealExtIzq = "No";
                }         
                if (this.ChkArcoDuroDer.isSelected())
                {
                    ArcoDuroDer = "Sí";
                }
                else
                {
                    ArcoDuroDer = "No";
                }         
                if (this.ChkArcoBlandoDer.isSelected())
                {
                    ArcoBlandoDer = "Sí";
                }
                else
                {
                    ArcoBlandoDer = "No";
                }         
                if (this.ChkCunPronDer.isSelected())
                {
                    CunPronDer = "Sí";
                }
                else
                {
                    CunPronDer = "No";
                }         
                if (this.ChkCunSupDer.isSelected())
                {
                    CunSupDer = "Sí";
                }
                else
                {
                    CunSupDer = "No";
                }         
                if (this.ChkTalonDer.isSelected())
                {
                    TalOqDer = "Sí";
                }
                else
                {
                    TalOqDer = "No";
                }         
                if (this.ChkRealIntDer.isSelected())
                {
                    TalRealIntDer = "Sí";
                     MmTalRealIntDer = Integer.parseInt(String.valueOf(this.SpinRealIntDer.getValue()));
                }
                else
                {
                    TalRealIntDer = "No";
                }         
                if (this.ChkRealExtDer.isSelected())
                {
                    TalRealExtDer = "Sí";
                    MmTalRealExtDer = Integer.parseInt(String.valueOf(this.SpinRealExtDer.getValue()));
                }
                else
                {
                    TalRealExtDer = "No";
                } 

                Plantillas objPlantillas = new Plantillas(Material,ArcoDuroIzq,ArcoBlandoIzq,CunPronIzq,CunSupIzq,TalOqIzq,TalRealIntIzq,MmTalRealIntIzq,TalRealExtIzq,MmTalRealExtIzq,ArcoDuroDer,ArcoBlandoDer,CunPronDer,CunSupDer,TalOqDer,TalRealIntDer,MmTalRealIntDer,TalRealExtDer,MmTalRealExtDer,FkIdProducto);
                objPlantillas.AltaPlantillas();
            
        }
       
         JOptionPane.showMessageDialog(null, "Productos Guardados");
        
    }//GEN-LAST:event_BtnGuardarProductosActionPerformed

    private void ChkAcrilicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkAcrilicoMouseClicked
        if (this.ChkAcrilico.isSelected())
        {
            this.ChkAcrilicoProd.setSelected(true);
        } else
        {
            this.ChkAcrilicoProd.setSelected(false);
        }
       
    }//GEN-LAST:event_ChkAcrilicoMouseClicked

    private void ChkAnilloSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkAnilloSilMouseClicked
        if (this.ChkAnilloSil.isSelected())
        {
            this.ChkAnilloSilProd.setSelected(true);
        }
        else
        {
           this.ChkAnilloSilProd.setSelected(false); 
        }
    }//GEN-LAST:event_ChkAnilloSilMouseClicked

    private void ChkBajadedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkBajadedoMouseClicked
        if (ChkBajadedo.isSelected())
        {
            this.ChkBajaDedoProd.setSelected(true);
        }
        else
        {
            this.ChkBajaDedoProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkBajadedoMouseClicked

    private void ChkCorrectorNocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkCorrectorNocMouseClicked
        if (this.ChkCorrectorNoc.isSelected())
        {
            this.ChkCorrecHxProd.setSelected(true);
        } else 
        {
             this.ChkCorrecHxProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkCorrectorNocMouseClicked

    private void ChkDedalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDedalMouseClicked
        if (this.ChkDedal.isSelected())
        {
            this.ChkDedalProd.setSelected(true);
        } 
        else
        {
            this.ChkDedalProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkDedalMouseClicked

    private void ChkDescargaGomaEvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDescargaGomaEvaMouseClicked
        if (this.ChkDescargaGomaEva.isSelected())
        {
            this.ChkDescaGomaEvaProd.setSelected(true);
        } else 
        {
            this.ChkDescaGomaEvaProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkDescargaGomaEvaMouseClicked

    private void ChkDescargaMolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkDescargaMolesMouseClicked
        if (this.ChkDescargaMoles.isSelected())
        {
            this.ChkDescMolesProd.setSelected(true);
        } else
        {
            this.ChkDescMolesProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkDescargaMolesMouseClicked

    private void ChkFerulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkFerulaMouseClicked
        if (this.ChkFerula.isSelected())
        {
            this.ChkFerulaProd.setSelected(true);
        } else
        {
            this.ChkFerulaProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkFerulaMouseClicked

    private void ChkOrtesisSiliconaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkOrtesisSiliconaMouseClicked
        if (this.ChkOrtesisSilicona.isSelected()) 
        {
            this.ChkOrtesisProd.setSelected(true);
        } else
        {
            this.ChkOrtesisProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkOrtesisSiliconaMouseClicked

    private void ChkSeparadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkSeparadorMouseClicked
        if (this.ChkSeparador.isSelected())
        {
            this.ChkSeparadorProd.setSelected(true);
        } else
        {
            this.ChkSeparadorProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkSeparadorMouseClicked

    private void ChkPlantillasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkPlantillasMouseClicked
        if (this.ChkPlantillas.isSelected())
        {
            this.ChkPlantillasProd.setSelected(true);
        } else 
        {
            this.ChkPlantillasProd.setSelected(false);
        }
    }//GEN-LAST:event_ChkPlantillasMouseClicked

    private void BtnVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerTablaActionPerformed
        
        String CodHistAux = this.TxtCodHist.getText();
                        
        this.TablaMostrar.setModel(objPlantillas.Titulos());
        this.TablaMostrar.setModel(objPlantillas.Datos(CodHistAux));
    }//GEN-LAST:event_BtnVerTablaActionPerformed

    private void BtnBajaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaRegistroActionPerformed
      
        int IdPlantillasAux = objPlantillas.getIdPlantilla();//ver de donde traigo el dato del Id   
        
        DefaultTableModel Tabla = (DefaultTableModel)TablaMostrar.getModel();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la plantilla del registro?", "", JOptionPane.OK_CANCEL_OPTION);       
        if (respuesta == 0) 
        {
            Tabla.removeRow(TablaMostrar.getSelectedRow());
            objPlantillas.Bajas(IdPlantillasAux);  
        }
       
        
    }//GEN-LAST:event_BtnBajaRegistroActionPerformed

    private void ChkRealIntIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkRealIntIzqMouseClicked
        if (ChkRealIntIzq.isSelected())
        {
          this.SpinRealIntIzq.setEnabled(true);  
        } else 
        {
          this.SpinRealIntIzq.setEnabled(false);  
        }
              
    }//GEN-LAST:event_ChkRealIntIzqMouseClicked

    private void ChkRealExtIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkRealExtIzqMouseClicked
        if (ChkRealExtIzq.isSelected()) 
        {
          this.SpinRealExtIzq.setEnabled(true);  
        } else 
        {
            this.SpinRealExtIzq.setEnabled(false);
        }
        
    }//GEN-LAST:event_ChkRealExtIzqMouseClicked

    private void ChkRealIntDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkRealIntDerMouseClicked
        if (ChkRealIntDer.isSelected())
        {
          this.SpinRealIntDer.setEnabled(true);   
        } else 
        {
           this.SpinRealIntDer.setEnabled(false); 
        }
 
        
    }//GEN-LAST:event_ChkRealIntDerMouseClicked

    private void ChkRealExtDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkRealExtDerMouseClicked
        if (ChkRealExtDer.isSelected()) 
        {
           this.SpinRealExtDer.setEnabled(true); 
        } else
        {
           this.SpinRealExtDer.setEnabled(false);  
        }
 
        
         
    }//GEN-LAST:event_ChkRealExtDerMouseClicked

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
        
        
    }//GEN-LAST:event_TxtNomActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        objVal.sololetras(evt);
        String campo = TxtNom.getText();
        int longitud = 30;
        objVal.validarLongitud(campo, longitud, evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApeKeyTyped
        objVal.sololetras(evt);
        String campo = TxtApe.getText();
        int longitud = 30;
        objVal.validarLongitud(campo, longitud, evt);
    }//GEN-LAST:event_TxtApeKeyTyped

    private void TxtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDniKeyTyped
        objVal.solonumero(evt);
    }//GEN-LAST:event_TxtDniKeyTyped

    private void TxtCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCelKeyTyped
        objVal.solonumero(evt);
    }//GEN-LAST:event_TxtCelKeyTyped

    private void TxtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelKeyTyped
        objVal.solonumero(evt);
    }//GEN-LAST:event_TxtTelKeyTyped

    private void TxtActFisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtActFisicaKeyTyped
        objVal.sololetras(evt);
        String campo = TxtActFisica.getText();
        int longitud = 30;
        objVal.validarLongitud(campo, longitud, evt);
    }//GEN-LAST:event_TxtActFisicaKeyTyped

    private void ComboPodologaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPodologaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPodologaActionPerformed
      private java.sql.Date ConvertirASql(java.util.Date FechaDelFormulario) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaDelFormulario.getTime()); 
        return SqlFechaConvertida;
    }
     
    private void HabilitarEdicion()
    {
      this.TxtNom.setEditable(true);
      this.TxtApe.setEditable(true);
      this.TxtDni.setEditable(true);
      this.TxtDir.setEditable (true);
      this.TxtCel.setEditable(true);
      this.TxtTel.setEditable(true); 
      this.TxtMail.setEditable(true);
      this.TxtActFisica.setEditable(true);
      this.TxtDiabetico.setEditable(true);
      this.TxtTomaMedicacion.setEditable(true);
      this.TxtAlergia.setEditable(true);
      this.TxtEsguinceFrac.setEditable(true);
      this.TxtObservFicha.setEditable(true);
      this.TxtOtroAntMed.setEditable(true);
    }        
      
    private void DeshabilitarEdicion()
    {
      this.TxtNom.setEditable(false);
      this.TxtApe.setEditable(false);
      this.TxtDni.setEditable(false);
      this.TxtDir.setEditable (false);
      this.TxtCel.setEditable(false);
      this.TxtTel.setEditable(false); 
      this.TxtMail.setEditable(false);
      this.TxtActFisica.setEditable(false);
      this.TxtDiabetico.setEditable(false);
      this.TxtTomaMedicacion.setEditable(false);
      this.TxtAlergia.setEditable(false);
      this.TxtEsguinceFrac.setEditable(false);
      this.TxtObservFicha.setEditable(false);
      this.TxtOtroAntMed.setEditable(false);  
    }  
      
      
     private void Limpiar() // 
    {     // Limpiarme el NroFicha 
         
             NroFicha = 0;
         
         // Ficha
           this.TxtNroFicha.setText(null); 
           this.TxtNom.setText (null);
           this.TxtApe.setText (null);
           this.TxtDir.setText (null);
           this.TxtCel.setText(null);
           this.TxtTel.setText(null); 
           this.TxtDni.setText(null);
           this.TxtMail.setText(null);
           this.TxtActFisica.setText(null);
           this.DateFechaNac.setDate(null);
           this.TxtObservFicha.setText(null);
           this.ChkDiabetico.setSelected(false); 
           this.TxtDiabetico.setText(null);
           this.ChkAnticoag.setSelected(false);
           this.ChkMedicacion.setSelected(false);
           this.TxtTomaMedicacion.setText(null);
           this.ChkAlergia.setSelected(false);
           this.TxtAlergia.setText(null);
           this.ChkEsguince.setSelected(false);
           this.TxtEsguinceFrac.setText(null);
           this.ChkOtroAntMed.setSelected(false);
           this.TxtOtroAntMed.setText(null);
           LblMostrarNom.setText("Nombre"); 
           LblMostrarApe.setText("Apellido");
           LblMostrarNroFicha.setText("Paciente Ficha Nº");
           LblMostrarEdad.setText ("Edad"); 
           LblMostrarSexo.setText("Sexo");
           LblActividadFisicaReal.setText("");
           this.TxtAreaAntMed.setText (null);
           
          // Historia Clinica
          this.TxtCodHist.setText(null);
          this.ChkControl.setSelected(false);
          this.ChkCuracion.setSelected(false);
          this.ChkAlgia.setSelected(false);
          this.ChkVisitaMen.setSelected(false);
          this.ChkTopic.setSelected(false);
          this.ChkPedigraf.setSelected(false);
          this.ChkOtroMotiv.setSelected(false);
          this.TxtOtroMotiv.setText(null);
          this.TxtChkOtroDiag.setText(null);
          this.ChkHalluxIzq.setSelected(false);
          this.ChkDedo2Izq.setSelected(false);
          this.ChkDedo3Izq.setSelected(false);
          this.ChkDedo4Izq.setSelected(false);
          this.ChkDedo5Izq.setSelected(false);
          this.ChkZonaTalarIzq.setSelected(false);
          this.ChkZonaPlantIzq.setSelected(false);
          this.ChkZonaMedialIzq.setSelected(false);
          this.ChkZonaMetaIzq.setSelected(false);
          this.ChkEspInterdigitalIzq.setSelected(false);
          this.ChkHalluxDer.setSelected(false);
          this.ChkDedo2Der.setSelected(false);
          this.ChkDedo3Der.setSelected(false);
          this.ChkDedo4Der.setSelected(false);
          this.ChkDedo5Der.setSelected(false);
          this.ChkZonaTalarDer.setSelected(false);
          this.ChkZonaPlantDer.setSelected(false);
          this.ChkZonaMedialDer.setSelected(false);
          this.ChkZonaMetaDer.setSelected(false);
          this.ChkEspInterdigitalDer.setSelected(false);
          this.ChkIdemCons.setSelected(false);
          this.ChkReguLamina.setSelected(false);
          this.ChkLimpiezaSurcos.setSelected(false);
          this.ChkCorteU.setSelected(false);
          this.ChkEduPod.setSelected(false);
          this.ChkRemDent.setSelected(false);
          this.ChkHiperqueratomía.setSelected(false);
          this.ChkHelotomia.setSelected(false);
          this.ChkEspiculotomia.setSelected(false);
          this.ChkTopicacion.setSelected(false);
          this.ChkColacion.setSelected(false);
          this.ChkAblacOnic.setSelected(false);
          this.ChkAblacTotLamin.setSelected(false);
          this.ChkAblacParLamin.setSelected(false);
          this.ChkFresado.setSelected(false);
          this.ChkOtroTrat.setSelected(false);
          this.TxtOtroTrat.setText(null);
          this.ChkCompresas.setSelected(false);
          this.ChkTratAntimic.setSelected(false);
          this.ChkVolver7.setSelected(false);
          this.ChkVolver30.setSelected(false);
          this.ChkRealizarConsMed.setSelected(false);
          this.ChkAntiBac.setSelected(false);
          this.ChkCremaRegen.setSelected(false);
          this.ChkCremaHid.setSelected(false);
          this.ChkOrtesis.setSelected(false);
          this.ChkPlantillas.setSelected(false);
          this.ChkOtroIndic.setSelected(false);
          this.TxtOtroIndic.setText(null);
          this.ChkBajadedo.setSelected(false);
          this.ChkSeparador.setSelected(false);
          this.ChkCorrectorNoc.setSelected(false);
          this.ChkDedal.setSelected(false);
          this.ChkAcrilico.setSelected(false);
          this.ChkAnilloSil.setSelected(false);
          this.ChkDescargaMoles.setSelected(false);
          this.ChkDescargaGomaEva.setSelected(false);
          this.ChkOrtesisSilicona.setSelected(false);
          this.ChkFerula.setSelected(false);
          this.ChkOtroOrtesis.setSelected(false);
          this.TxtOtroOrtesis.setText(null);
          this.TxtObservHistoria.setText(null);
          this.TxtDetalleHistoriaClinica.setText(null);
          this.TxtOtroMotiv.setText(null);
          this.TxtHalluxIzq.setText(null);
          this.TxtDedo2Izq.setText(null);
          this.TxtDedo3Izq.setText(null);
          this.TxtDedo4Izq.setText(null);
          this.TxtDedo5Izq.setText(null);
          this.TxtZonaTalarIzq.setText(null);
          this.TxtZonaPlanIzq.setText(null);
          this.TxtZonaMedIzq.setText(null);
          this.TxtZonaMetIzq.setText(null);
          this.TxtEspInterdigitalIzq.setText(null);
          this.TxtHalluxDer.setText(null);
          this.TxtDedo2Der.setText(null);
          this.TxtDedo3Der.setText(null);
          this.TxtDedo4Der.setText(null);
          this.TxtDedo5Der.setText(null);
          this.TxtZonaTalarDer.setText(null);
          this.TxtZonaPlanDer.setText(null);
          this.TxtZonaMedDer.setText(null);
          this.TxtZonaMetDer.setText(null);
          this.TxtEspInterdigitalDer.setText(null);
          this.TxtOtroTrat.setText(null);
          this.TxtOtroIndic.setText(null);
          this.TxtOtroOrtesis.setText(null);
          this.TxtChkOtroDiag.setText(null);
          this.TxtHalluxIzq.setEditable(false);
        this.TxtDedo2Izq.setEditable(false);
        this.TxtDedo3Izq.setEditable(false);
        this.TxtDedo4Izq.setEditable(false);
        this.TxtDedo5Izq.setEditable(false);
        this.TxtZonaTalarIzq.setEditable(false);
        this.TxtZonaPlanIzq.setEditable(false);
        this.TxtZonaMedIzq.setEditable(false);
        this.TxtZonaMetIzq.setEditable(false);
        this.TxtEspInterdigitalIzq.setEditable(false);
        this.TxtHalluxDer.setEditable(false);
        this.TxtDedo2Der.setEditable(false);
        this.TxtDedo3Der.setEditable(false);
        this.TxtDedo4Der.setEditable(false);
        this.TxtDedo5Der.setEditable(false);
        this.TxtZonaTalarDer.setEditable(false);
        this.TxtZonaPlanDer.setEditable(false);
        this.TxtZonaMedDer.setEditable(false);
        this.TxtZonaMetDer.setEditable(false);
        this.TxtEspInterdigitalDer.setEditable(false);
        this.TxtChkOtroDiag.setEditable(false);
          //Limpiar, Detalle y Proximos Turnos
        this.TxtDetalleHistoriaClinica.setText(null);
          
    }     
     
    public void LimpiarHistoria() 
    {   
          this.TxtCodHist.setText(null);
          this.ChkControl.setSelected(false);
          this.ChkCuracion.setSelected(false);
          this.ChkAlgia.setSelected(false);
          this.ChkVisitaMen.setSelected(false);
          this.ChkTopic.setSelected(false);
          this.ChkPedigraf.setSelected(false);
          this.ChkOtroMotiv.setSelected(false);
          this.TxtOtroMotiv.setText(null);
          this.TxtChkOtroDiag.setText(null);
          this.ChkHalluxIzq.setSelected(false);
          this.ChkDedo2Izq.setSelected(false);
          this.ChkDedo3Izq.setSelected(false);
          this.ChkDedo4Izq.setSelected(false);
          this.ChkDedo5Izq.setSelected(false);
          this.ChkZonaTalarIzq.setSelected(false);
          this.ChkZonaPlantIzq.setSelected(false);
          this.ChkZonaMedialIzq.setSelected(false);
          this.ChkZonaMetaIzq.setSelected(false);
          this.ChkEspInterdigitalIzq.setSelected(false);
          this.ChkHalluxDer.setSelected(false);
          this.ChkDedo2Der.setSelected(false);
          this.ChkDedo3Der.setSelected(false);
          this.ChkDedo4Der.setSelected(false);
          this.ChkDedo5Der.setSelected(false);
          this.ChkZonaTalarDer.setSelected(false);
          this.ChkZonaPlantDer.setSelected(false);
          this.ChkZonaMedialDer.setSelected(false);
          this.ChkZonaMetaDer.setSelected(false);
          this.ChkEspInterdigitalDer.setSelected(false);
          this.ChkIdemCons.setSelected(false);
          this.ChkReguLamina.setSelected(false);
          this.ChkLimpiezaSurcos.setSelected(false);
          this.ChkCorteU.setSelected(false);
          this.ChkEduPod.setSelected(false);
          this.ChkRemDent.setSelected(false);
          this.ChkHiperqueratomía.setSelected(false);
          this.ChkHelotomia.setSelected(false);
          this.ChkEspiculotomia.setSelected(false);
          this.ChkTopicacion.setSelected(false);
          this.ChkColacion.setSelected(false);
          this.ChkAblacOnic.setSelected(false);
          this.ChkAblacTotLamin.setSelected(false);
          this.ChkAblacParLamin.setSelected(false);
          this.ChkFresado.setSelected(false);
          this.ChkOtroTrat.setSelected(false);
          this.TxtOtroTrat.setText(null);
          this.ChkCompresas.setSelected(false);
          this.ChkTratAntimic.setSelected(false);
          this.ChkVolver7.setSelected(false);
          this.ChkVolver30.setSelected(false);
          this.ChkRealizarConsMed.setSelected(false);
          this.ChkAntiBac.setSelected(false);
          this.ChkCremaRegen.setSelected(false);
          this.ChkCremaHid.setSelected(false);
          this.ChkOrtesis.setSelected(false);
          this.ChkPlantillas.setSelected(false);
          this.ChkOtroIndic.setSelected(false);
          this.TxtOtroIndic.setText(null);
          this.ChkBajadedo.setSelected(false);
          this.ChkSeparador.setSelected(false);
          this.ChkCorrectorNoc.setSelected(false);
          this.ChkDedal.setSelected(false);
          this.ChkAcrilico.setSelected(false);
          this.ChkAnilloSil.setSelected(false);
          this.ChkDescargaMoles.setSelected(false);
          this.ChkDescargaGomaEva.setSelected(false);
          this.ChkOrtesisSilicona.setSelected(false);
          this.ChkFerula.setSelected(false);
          this.ChkOtroOrtesis.setSelected(false);
          this.TxtOtroOrtesis.setText(null);
          this.TxtObservHistoria.setText(null);
          this.TxtDetalleHistoriaClinica.setText(null);
          this.TxtOtroMotiv.setText(null);
          this.TxtHalluxIzq.setText(null);
          this.TxtDedo2Izq.setText(null);
          this.TxtDedo3Izq.setText(null);
          this.TxtDedo4Izq.setText(null);
          this.TxtDedo5Izq.setText(null);
          this.TxtZonaTalarIzq.setText(null);
          this.TxtZonaPlanIzq.setText(null);
          this.TxtZonaMedIzq.setText(null);
          this.TxtZonaMetIzq.setText(null);
          this.TxtEspInterdigitalIzq.setText(null);
          this.TxtHalluxDer.setText(null);
          this.TxtDedo2Der.setText(null);
          this.TxtDedo3Der.setText(null);
          this.TxtDedo4Der.setText(null);
          this.TxtDedo5Der.setText(null);
          this.TxtZonaTalarDer.setText(null);
          this.TxtZonaPlanDer.setText(null);
          this.TxtZonaMedDer.setText(null);
          this.TxtZonaMetDer.setText(null);
          this.TxtEspInterdigitalDer.setText(null);
          this.TxtOtroTrat.setText(null);
          this.TxtOtroIndic.setText(null);
          this.TxtOtroOrtesis.setText(null);
          this.TxtChkOtroDiag.setText(null);
          this.TxtHalluxIzq.setEditable(false);
        this.TxtDedo2Izq.setEditable(false);
        this.TxtDedo3Izq.setEditable(false);
        this.TxtDedo4Izq.setEditable(false);
        this.TxtDedo5Izq.setEditable(false);
        this.TxtZonaTalarIzq.setEditable(false);
        this.TxtZonaPlanIzq.setEditable(false);
        this.TxtZonaMedIzq.setEditable(false);
        this.TxtZonaMetIzq.setEditable(false);
        this.TxtEspInterdigitalIzq.setEditable(false);
        this.TxtHalluxDer.setEditable(false);
        this.TxtDedo2Der.setEditable(false);
        this.TxtDedo3Der.setEditable(false);
        this.TxtDedo4Der.setEditable(false);
        this.TxtDedo5Der.setEditable(false);
        this.TxtZonaTalarDer.setEditable(false);
        this.TxtZonaPlanDer.setEditable(false);
        this.TxtZonaMedDer.setEditable(false);
        this.TxtZonaMetDer.setEditable(false);
        this.TxtEspInterdigitalDer.setEditable(false);
        this.TxtChkOtroDiag.setEditable(false);
        this.TxtDetalleHistoriaClinica.setText(null);
    }  
    
    public void VerDetalleHistoria()
    {
          
        String FechaConsHist; //la voy a pasar a String para mostrar en detalles
        String TxtDetalleTrat = "";
        String TxtDetalleIndic = "";
        String TxtDetalleOrtesis = "";
        String TxtDetalleNomPod = "";
        String TxtDetalleDiagnostic = "";
        String TxtDetalleMotivo = "";

        
        //Motivo
        if (this.ChkControl.isSelected())
        {
            TxtDetalleMotivo += "control, ";
        }
        if (this.ChkCuracion.isSelected())
        {
            TxtDetalleMotivo += "curación, ";
        }
        if (this.ChkAlgia.isSelected())
        {
            TxtDetalleMotivo += "algia, ";
        }
        if (this.ChkVisitaMen.isSelected())
        {
            TxtDetalleMotivo += "visita mensual, ";
        }
        if (this.ChkTopic.isSelected())
        {
            TxtDetalleMotivo += "topicación, ";
        }
        if (this.ChkPedigraf.isSelected())
        {
            TxtDetalleMotivo += "pedigrafía, ";
        }
        if (this.ChkOtroMotiv.isSelected())
        {
            TxtDetalleMotivo += "otro - " + this.TxtOtroMotiv.getText();
        }     

        //Podologa
        TxtDetalleNomPod = String.valueOf(this.ComboPodologa.getSelectedItem());

        // FECHA a string
           java.util.Date Fecha; 
           Fecha = this.DateFechaConsulta.getDate();
           java.sql.Date fechasql = ConvertirASql(Fecha);
           String TxtFechaCons = fechasql.toString();
           // doy vuelta la fecha
           String Anio = TxtFechaCons.substring(0, 4);    
           String Mes = TxtFechaCons.substring(5, 7);
           String Dia = TxtFechaCons.substring(8, 10);
           String FechaOrdenada = Dia + "/" + Mes + "/" + Anio; 
        // armar combo de diagnósitco
       
        
       if (this.ComboDiag.getSelectedItem() == "Otro")
        {
            this.TxtChkOtroDiag.setEditable(true);
        } 
        else 
        {
           this.TxtChkOtroDiag.setEditable(false);
        }

        //Terapeutica
         if (this.ChkIdemCons.isSelected())
        {
            TxtDetalleTrat += "idem consulta anterior ";
        } 
        if (this.ChkReguLamina.isSelected()) 
        {
            TxtDetalleTrat += "regularización de lámina - ";
        }
        if (this.ChkLimpiezaSurcos.isSelected())
        {
            TxtDetalleTrat += "limpieza de surcos - ";
        }
        if (this.ChkCorteU.isSelected())
        {
            TxtDetalleTrat += "corte de uñas - ";
        }
        if (this.ChkEduPod.isSelected())
        {
            TxtDetalleTrat += "educación podológica - ";
        }
        if (this.ChkRemDent.isSelected())
        {
            TxtDetalleTrat += "remocion de detritus - ";
        }
        if (this.ChkHiperqueratomía.isSelected())
        {
            TxtDetalleTrat += "hiperqueratomía - ";
        } 
        if (this.ChkHelotomia.isSelected())
        {
            TxtDetalleTrat += "helotomía - ";
        }
        if (this.ChkEspiculotomia.isSelected())
        {
            TxtDetalleTrat += "espiculotomía - ";
        }
        if (this.ChkColacion.isSelected())
        {
            TxtDetalleTrat += "colocación de descarga - ";
        }
        if (this.ChkAblacOnic.isSelected()) 
        {
            TxtDetalleTrat += "ablación de onicofosis - "; 
        }
        if (this.ChkAblacTotLamin.isSelected()) 
        {
            TxtDetalleTrat += "ablación total de lámina - ";
        }
        if (this.ChkAblacParLamin.isSelected()) 
        {
            TxtDetalleTrat += "ablación parcial de lámina - ";
        }
        if (this.ChkFresado.isSelected()) 
        {
            TxtDetalleTrat += "fresado ungueal - ";
        }
        if (this.ChkTopicacion.isSelected())
        {
            TxtDetalleTrat += "topicación - ";
        }    
        if (this.ChkOtroTrat.isSelected())
        {
            TxtDetalleTrat += "otro - " + this.TxtOtroTrat.getText();
        }

       
        //Indicaciones

        if (this.ChkCompresas.isSelected())
        {
            TxtDetalleIndic += "compresas - ";
        }
        if (this.ChkTratAntimic.isSelected())
        {
            TxtDetalleIndic += "tratamiento antimicótico tópico - ";
        }
        if (this.ChkVolver7.isSelected())
        {
            TxtDetalleIndic += "volver en 7 días - ";
        }
        if (this.ChkVolver30.isSelected())
        {
            TxtDetalleIndic += "volver en 30 días - ";
        }
        if (this.ChkRealizarConsMed.isSelected())
        {
            TxtDetalleIndic += "realizar consulta médica - ";
        }
        if (this.ChkAntiBac.isSelected())
        {
            TxtDetalleIndic += "antibacteriano tópico - ";
        }
        if (this.ChkCremaRegen.isSelected())
        {
            TxtDetalleIndic += "crema regenerativa - ";
        }
        if (this.ChkCremaHid.isSelected())
        {
            TxtDetalleIndic += "crema hidratante - ";
        }
        if (this.ChkOrtesis.isSelected())
        {
            TxtDetalleIndic += "ortesis - ";
        }
        if (this.ChkPlantillas.isSelected())
        {
            TxtDetalleIndic += "plantillas - ";
        }

        //Ortesis  
        if (this.ChkBajadedo.isSelected())
        {
            TxtDetalleOrtesis += "bajadedo - ";
        }
        if (this.ChkSeparador.isSelected())
        {
            TxtDetalleOrtesis += "separador - ";
        }
        if (this.ChkCorrectorNoc.isSelected())
        {
            TxtDetalleOrtesis += "corrector nocturno - ";
        }
        if (this.ChkDedal.isSelected())
        {
            TxtDetalleOrtesis += "dedal - ";
        }
        if (this.ChkAcrilico.isSelected())
        {
            TxtDetalleOrtesis += "acrilico - ";
        }
        if (this.ChkDescargaMoles.isSelected())
        {
            TxtDetalleOrtesis += "descarga de moleskin - ";
        }
        if (this.ChkDescargaGomaEva.isSelected())
        {
            TxtDetalleOrtesis += "descarga de goma eva - ";
        }
        if (this.ChkOrtesisSilicona.isSelected())
        {
            TxtDetalleOrtesis += "ortesis de silicona - ";
        }
        if (this.ChkFerula.isSelected())
        {
            TxtDetalleOrtesis += "ferula - ";
        }
        if (this.ChkAnilloSil.isSelected()) 
        {
             TxtDetalleOrtesis += "anillo de silicona - ";
        }
        if (this.ChkOtroOrtesis.isSelected())
        {
            TxtDetalleOrtesis += "otro - " + this.TxtOtroOrtesis.getText();
        }

        String TxtDetalleDiagnostico = "";
        for (int fila1 = 0; fila1 < 5; fila1++)
        {    if (matriz[fila1][0] != null) 
            {
                TxtDetalleDiagnostico += (matriz[fila1][0] + matriz [fila1][1] + matriz [fila1][2] + matriz [fila1][3] + matriz [fila1][4] + matriz [fila1][5] +  matriz [fila1][6] +  matriz [fila1][7] +  matriz [fila1][8] +  matriz [fila1][9] +  matriz [fila1][10] +  matriz [fila1][11] +  matriz [fila1][12] +  matriz [fila1][13] +  matriz [fila1][14] +  matriz [fila1][15] +  matriz [fila1][16] +  matriz [fila1][17]+  matriz [fila1][18]+  matriz [fila1][19]+  matriz [fila1][20] + "." + "\n");       
            }
            else
            {
               break; 
            }
        }
        
        //metodo para traer el detalle de historia clinica guardado en BDD sumarlo al nuevo detalle
             
             HistoriaClinica objBuscarHistClin = new HistoriaClinica ();
             String DetalleHist = "";
             int FkNroFicha = NroFicha;
             System.out.println(FkNroFicha);
             
            boolean existente = objBuscarHistClin.BuscarHistClinPorNroFicha(FkNroFicha);
            if (existente == true)
            {   
                DetalleHist =  objBuscarHistClin.getDetalleHistClin();
                //this.TxtDetalleHistoriaClinica.setText(DetalleHist);
                //this.TxtDetalleGrandeHistoria.setText(DetalleHist);
                this.TxtDetalleHistoriaClinica.setText("FECHA: " + FechaOrdenada + "  " + "PODOLOGA: " + TxtDetalleNomPod +  "\nPACIENTE ASISTE POR " + TxtDetalleMotivo + "." + "\nDIAGNOSTICO: " + TxtDetalleDiagnostico +  "SE REALIZA: " +  TxtDetalleTrat + "." + "\nSE INDICA: " + TxtDetalleIndic + "." + "\nORTESIS: " + TxtDetalleOrtesis + "." + "\nOBSERVACIONES: " + this.TxtObservHistoria.getText() + "."  + "\n\n" + DetalleHist);
                this.TxtDetalleHistoriaClinica.setText("FECHA: " + FechaOrdenada + "  " + "PODOLOGA: " + TxtDetalleNomPod + "\nPACIENTE ASISTE POR " + TxtDetalleMotivo + "." + "\nDIAGNOSTICO: " + TxtDetalleDiagnostico + "SE REALIZA: " +  TxtDetalleTrat + "." + "\nSE INDICA: " + TxtDetalleIndic + "." + "\nORTESIS: " + TxtDetalleOrtesis + "." + "\nOBSERVACIONES: " + this.TxtObservHistoria.getText() + "."  + "\n\n" + DetalleHist);
                
            }         
            else
            {
                this.TxtDetalleHistoriaClinica.setText("FECHA: " + FechaOrdenada + "  " + "PODOLOGA: " + TxtDetalleNomPod + "\nPACIENTE ASISTE POR " + TxtDetalleMotivo + "." + "\nDIAGNOSTICO: " + TxtDetalleDiagnostico +  "SE REALIZA: " +  TxtDetalleTrat + "." + "\nSE INDICA: " + TxtDetalleIndic + "." + "\nORTESIS: " + TxtDetalleOrtesis + "." + "\nOBSERVACIONES: " + this.TxtObservHistoria.getText() + "." );
                this.TxtDetalleHistoriaClinica.setText("FECHA: " + FechaOrdenada + "  " + "PODOLOGA: " + TxtDetalleNomPod + "\nPACIENTE ASISTE POR " + TxtDetalleMotivo + "." + "\nDIAGNOSTICO: " + TxtDetalleDiagnostico + "SE REALIZA: " +  TxtDetalleTrat + "." + "\nSE INDICA: " + TxtDetalleIndic + "." + "\nORTESIS: " + TxtDetalleOrtesis + "." + "\nOBSERVACIONES: " + this.TxtObservHistoria.getText() + "." );
            } 
        
    }   
    
        
    
    public void LimpiarDiagnostico()
    {
        this.TxtHalluxIzq.setText(null);
        this.TxtDedo2Izq.setText(null);
        this.TxtDedo3Izq.setText(null);
        this.TxtDedo4Izq.setText(null);
        this.TxtDedo5Izq.setText(null);
        this.TxtZonaTalarIzq.setText(null);
        this.TxtZonaPlanIzq.setText(null);
        this.TxtZonaMedIzq.setText(null);
        this.TxtZonaMetIzq.setText(null);
        this.TxtEspInterdigitalIzq.setText(null);
        this.TxtHalluxDer.setText(null);
        this.TxtDedo2Der.setText(null);
        this.TxtDedo3Der.setText(null);
        this.TxtDedo4Der.setText(null);
        this.TxtDedo5Der.setText(null);
        this.TxtZonaTalarDer.setText(null);
        this.TxtZonaPlanDer.setText(null);
        this.TxtZonaMedDer.setText(null);
        this.TxtZonaMetDer.setText(null);
        this.TxtEspInterdigitalDer.setText(null);
        this.TxtHalluxIzq.setEditable(false);
        this.TxtDedo2Izq.setEditable(false);
        this.TxtDedo3Izq.setEditable(false);
        this.TxtDedo4Izq.setEditable(false);
        this.TxtDedo5Izq.setEditable(false);
        this.TxtZonaTalarIzq.setEditable(false);
        this.TxtZonaPlanIzq.setEditable(false);
        this.TxtZonaMedIzq.setEditable(false);
        this.TxtZonaMetIzq.setEditable(false);
        this.TxtEspInterdigitalIzq.setEditable(false);
        this.TxtHalluxDer.setEditable(false);
        this.TxtDedo2Der.setEditable(false);
        this.TxtDedo3Der.setEditable(false);
        this.TxtDedo4Der.setEditable(false);
        this.TxtDedo5Der.setEditable(false);
        this.TxtZonaTalarDer.setEditable(false);
        this.TxtZonaPlanDer.setEditable(false);
        this.TxtZonaMedDer.setEditable(false);
        this.TxtZonaMetDer.setEditable(false);
        this.TxtChkOtroDiag.setEditable(false);
        this.ChkHalluxIzq.setSelected(false);
        this.ChkDedo2Izq.setSelected(false);
        this.ChkDedo3Izq.setSelected(false);
        this.ChkDedo4Izq.setSelected(false);
        this.ChkDedo5Izq.setSelected(false);
        this.ChkZonaTalarIzq.setSelected(false);
        this.ChkZonaPlantIzq.setSelected(false);
        this.ChkZonaMedialIzq.setSelected(false);
        this.ChkZonaMetaIzq.setSelected(false);
        this.ChkHalluxDer.setSelected(false);
        this.ChkDedo2Der.setSelected(false);
        this.ChkDedo3Der.setSelected(false);
        this.ChkDedo4Der.setSelected(false);
        this.ChkDedo5Der.setSelected(false);
        this.ChkZonaTalarDer.setSelected(false);
        this.ChkZonaPlantDer.setSelected(false);
        this.ChkZonaMedialDer.setSelected(false);
        this.ChkZonaMetaDer.setSelected(false);
        this.TxtEspInterdigitalIzq.setEditable(false);
    }   
    
  
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarEditFicha;
    private javax.swing.JButton BtnAceptarEditHistoriaClinica;
    private javax.swing.JButton BtnBajaRegistro;
    private javax.swing.JButton BtnBuscarHistoria;
    private javax.swing.JButton BtnBuscarPaciente;
    private javax.swing.JButton BtnCancelarEditFicha;
    private javax.swing.JButton BtnCancelarEditHistoriaClinica;
    private javax.swing.JButton BtnConfirmDiag;
    private javax.swing.JButton BtnEditarFicha;
    private javax.swing.JButton BtnEditarHistoriaClinica;
    private javax.swing.ButtonGroup BtnGrpSexo;
    private javax.swing.JButton BtnGuardarConsulta;
    private javax.swing.JButton BtnGuardarFicha;
    private javax.swing.JButton BtnGuardarHistoriaClinica;
    private javax.swing.JButton BtnGuardarProductos;
    private javax.swing.JButton BtnLimpiarForm;
    private javax.swing.JButton BtnLimpiarHistClinica;
    private javax.swing.JButton BtnVerDetalleHist;
    private javax.swing.JButton BtnVerTabla;
    private javax.swing.JCheckBox ChkAblacOnic;
    private javax.swing.JCheckBox ChkAblacParLamin;
    private javax.swing.JCheckBox ChkAblacTotLamin;
    private javax.swing.JCheckBox ChkAcrilico;
    private javax.swing.JCheckBox ChkAcrilicoProd;
    private javax.swing.JCheckBox ChkAlergia;
    private javax.swing.JCheckBox ChkAlgia;
    private javax.swing.JCheckBox ChkAnilloSil;
    private javax.swing.JCheckBox ChkAnilloSilProd;
    private javax.swing.JCheckBox ChkAntiBac;
    private javax.swing.JCheckBox ChkAnticoag;
    private javax.swing.JCheckBox ChkArcoBlandoDer;
    private javax.swing.JCheckBox ChkArcoBlandoIzq;
    private javax.swing.JCheckBox ChkArcoDuroDer;
    private javax.swing.JCheckBox ChkArcoDuroIzq;
    private javax.swing.JCheckBox ChkBajaDedoProd;
    private javax.swing.JCheckBox ChkBajadedo;
    private javax.swing.JCheckBox ChkColacion;
    private javax.swing.JCheckBox ChkCompresas;
    private javax.swing.JCheckBox ChkControl;
    private javax.swing.JCheckBox ChkCorrecHxProd;
    private javax.swing.JCheckBox ChkCorrectorNoc;
    private javax.swing.JCheckBox ChkCorteU;
    private javax.swing.JCheckBox ChkCremaHid;
    private javax.swing.JCheckBox ChkCremaRegen;
    private javax.swing.JCheckBox ChkCunPronDer;
    private javax.swing.JCheckBox ChkCunPronIzq;
    private javax.swing.JCheckBox ChkCunSupDer;
    private javax.swing.JCheckBox ChkCunSupIzq;
    private javax.swing.JCheckBox ChkCuracion;
    private javax.swing.JCheckBox ChkDedal;
    private javax.swing.JCheckBox ChkDedalProd;
    private javax.swing.JCheckBox ChkDedo2Der;
    private javax.swing.JCheckBox ChkDedo2Izq;
    private javax.swing.JCheckBox ChkDedo3Der;
    private javax.swing.JCheckBox ChkDedo3Izq;
    private javax.swing.JCheckBox ChkDedo4Der;
    private javax.swing.JCheckBox ChkDedo4Izq;
    private javax.swing.JCheckBox ChkDedo5Der;
    private javax.swing.JCheckBox ChkDedo5Izq;
    private javax.swing.JCheckBox ChkDescMolesProd;
    private javax.swing.JCheckBox ChkDescaGomaEvaProd;
    private javax.swing.JCheckBox ChkDescargaGomaEva;
    private javax.swing.JCheckBox ChkDescargaMoles;
    private javax.swing.JCheckBox ChkDiabetico;
    private javax.swing.JCheckBox ChkEduPod;
    private javax.swing.JCheckBox ChkEsguince;
    private javax.swing.JCheckBox ChkEspInterdigitalDer;
    private javax.swing.JCheckBox ChkEspInterdigitalIzq;
    private javax.swing.JCheckBox ChkEspiculotomia;
    private javax.swing.JCheckBox ChkFerula;
    private javax.swing.JCheckBox ChkFerulaProd;
    private javax.swing.JCheckBox ChkFresado;
    private javax.swing.JCheckBox ChkHalluxDer;
    private javax.swing.JCheckBox ChkHalluxIzq;
    private javax.swing.JCheckBox ChkHelotomia;
    private javax.swing.JCheckBox ChkHiperqueratomía;
    private javax.swing.JCheckBox ChkIdemCons;
    private javax.swing.JCheckBox ChkLimpiezaSurcos;
    private javax.swing.JCheckBox ChkMedicacion;
    private javax.swing.JCheckBox ChkOrtesis;
    private javax.swing.JCheckBox ChkOrtesisProd;
    private javax.swing.JCheckBox ChkOrtesisSilicona;
    private javax.swing.JCheckBox ChkOtroAntMed;
    private javax.swing.JCheckBox ChkOtroIndic;
    private javax.swing.JCheckBox ChkOtroMotiv;
    private javax.swing.JCheckBox ChkOtroOrtesis;
    private javax.swing.JCheckBox ChkOtroTrat;
    private javax.swing.JCheckBox ChkPedigraf;
    private javax.swing.JCheckBox ChkPlantillas;
    private javax.swing.JCheckBox ChkPlantillasProd;
    private javax.swing.JCheckBox ChkRealExtDer;
    private javax.swing.JCheckBox ChkRealExtIzq;
    private javax.swing.JCheckBox ChkRealIntDer;
    private javax.swing.JCheckBox ChkRealIntIzq;
    private javax.swing.JCheckBox ChkRealizarConsMed;
    private javax.swing.JCheckBox ChkReguLamina;
    private javax.swing.JCheckBox ChkRemDent;
    private javax.swing.JCheckBox ChkSeparador;
    private javax.swing.JCheckBox ChkSeparadorProd;
    private javax.swing.JCheckBox ChkTalonDer;
    private javax.swing.JCheckBox ChkTalonIzq;
    private javax.swing.JCheckBox ChkTopic;
    private javax.swing.JCheckBox ChkTopicacion;
    private javax.swing.JCheckBox ChkTratAntimic;
    private javax.swing.JCheckBox ChkVisitaMen;
    private javax.swing.JCheckBox ChkVolver30;
    private javax.swing.JCheckBox ChkVolver7;
    private javax.swing.JCheckBox ChkZonaMedialDer;
    private javax.swing.JCheckBox ChkZonaMedialIzq;
    private javax.swing.JCheckBox ChkZonaMetaDer;
    private javax.swing.JCheckBox ChkZonaMetaIzq;
    private javax.swing.JCheckBox ChkZonaPlantDer;
    private javax.swing.JCheckBox ChkZonaPlantIzq;
    private javax.swing.JCheckBox ChkZonaTalarDer;
    private javax.swing.JCheckBox ChkZonaTalarIzq;
    private javax.swing.JComboBox<String> ComboDiag;
    private javax.swing.JComboBox<String> ComboMaterial;
    private javax.swing.JComboBox<String> ComboPodologa;
    private com.toedter.calendar.JDateChooser DateFechaConsulta;
    private com.toedter.calendar.JDateChooser DateFechaNac;
    private com.toedter.calendar.JDateChooser DateFechaProductos;
    private org.edisoncor.gui.panel.PanelImage ImagenBuenAndarProd;
    private org.edisoncor.gui.panel.PanelImage ImagenLenox;
    private org.edisoncor.gui.panel.PanelImage ImagenPlantillas;
    private javax.swing.JLabel LblActFisica;
    private javax.swing.JLabel LblActividadFisica;
    private javax.swing.JLabel LblActividadFisicaReal;
    private javax.swing.JLabel LblAntMed;
    private javax.swing.JLabel LblAntMedicosList;
    private javax.swing.JLabel LblApe;
    private javax.swing.JLabel LblCantidadPlanitllas;
    private javax.swing.JLabel LblCel;
    private javax.swing.JLabel LblCodHist;
    private javax.swing.JLabel LblDetalleGrandeHistoria;
    private javax.swing.JLabel LblDetalleGrandeHistoria1;
    private javax.swing.JLabel LblDiag;
    private javax.swing.JLabel LblDir;
    private javax.swing.JLabel LblDni;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblFechaConsulta;
    private javax.swing.JLabel LblIndicaciones;
    private javax.swing.JLabel LblMail;
    private javax.swing.JLabel LblMaterial;
    private javax.swing.JLabel LblMm1;
    private javax.swing.JLabel LblMm2;
    private javax.swing.JLabel LblMm3;
    private javax.swing.JLabel LblMm4;
    private javax.swing.JLabel LblMostrarApe;
    private javax.swing.JLabel LblMostrarEdad;
    private javax.swing.JLabel LblMostrarNom;
    private javax.swing.JLabel LblMostrarNroFicha;
    private javax.swing.JLabel LblMostrarSexo;
    private javax.swing.JLabel LblMotivoCons;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblNroFicha;
    private javax.swing.JLabel LblObservFicha;
    private javax.swing.JLabel LblObservHistoria;
    private javax.swing.JLabel LblOrtesis;
    private javax.swing.JLabel LblPlanitllasTit;
    private javax.swing.JLabel LblPlantillaPieDer;
    private javax.swing.JLabel LblPlantillaPieIzq;
    private javax.swing.JLabel LblProdBuenAndar;
    private javax.swing.JLabel LblProdLenox;
    private javax.swing.JLabel LblSector;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTel;
    private javax.swing.JLabel LblTerap;
    private javax.swing.JLabel LblTituloFicha;
    private javax.swing.JLabel LblTituloHistoria;
    private javax.swing.JLabel LblTrat1;
    private javax.swing.JLabel LblZonaPod;
    private javax.swing.JPanel PanelBotonesFicha;
    private javax.swing.JPanel PanelBotonesHist;
    private javax.swing.JPanel PanelCodHistoria;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelDatos1;
    private javax.swing.JPanel PanelDatos2;
    private javax.swing.JPanel PanelDetalleGrandeHistoria;
    private javax.swing.JPanel PanelDetalleHistoria;
    private javax.swing.JPanel PanelDiag;
    private javax.swing.JPanel PanelFechaConsulta;
    private javax.swing.JPanel PanelFechaProd;
    private javax.swing.JPanel PanelFicha;
    private javax.swing.JPanel PanelHistoriaClinica;
    private javax.swing.JPanel PanelIndicaciones;
    private javax.swing.JPanel PanelMostrarDatos;
    private javax.swing.JPanel PanelMotiv;
    private javax.swing.JPanel PanelObservHistoria;
    private javax.swing.JPanel PanelOrtesis;
    private javax.swing.JTabbedPane PanelPestanas;
    private javax.swing.JPanel PanelPlantillaDer;
    private javax.swing.JPanel PanelPlantillaIzq;
    private javax.swing.JPanel PanelPlantillas;
    private javax.swing.JPanel PanelPodologas;
    private javax.swing.JPanel PanelProximosTurnos;
    private javax.swing.JPanel PanelSector;
    private javax.swing.JPanel PanelTituloDetalle;
    private javax.swing.JPanel PanelTrat;
    private javax.swing.JPanel PanelZona;
    private javax.swing.JPopupMenu PopMDeshacerRehacer;
    private javax.swing.JRadioButton RbFem;
    private javax.swing.JRadioButton RbMasc;
    private javax.swing.JRadioButton RbOtro;
    private javax.swing.JSpinner SpinCantAcrilico;
    private javax.swing.JSpinner SpinCantAnillo;
    private javax.swing.JSpinner SpinCantBajaDedo;
    private javax.swing.JSpinner SpinCantCorrecHx;
    private javax.swing.JSpinner SpinCantDedal;
    private javax.swing.JSpinner SpinCantDescGomaEva;
    private javax.swing.JSpinner SpinCantDescMoles;
    private javax.swing.JSpinner SpinCantFerula;
    private javax.swing.JSpinner SpinCantOrtesis;
    private javax.swing.JSpinner SpinCantSeparador;
    private javax.swing.JSpinner SpinCantidadPlantillas;
    private javax.swing.JSpinner SpinRealExtDer;
    private javax.swing.JSpinner SpinRealExtIzq;
    private javax.swing.JSpinner SpinRealIntDer;
    private javax.swing.JSpinner SpinRealIntIzq;
    private javax.swing.JTable TablaMostrar;
    private org.edisoncor.gui.textField.TextFieldRound TxtActFisica;
    private javax.swing.JTextField TxtAlergia;
    private org.edisoncor.gui.textField.TextFieldRound TxtApe;
    private javax.swing.JTextArea TxtAreaAntMed;
    private org.edisoncor.gui.textField.TextFieldRound TxtCel;
    private javax.swing.JTextField TxtChkOtroDiag;
    private javax.swing.JTextField TxtCodHist;
    private javax.swing.JTextField TxtDedo2Der;
    private javax.swing.JTextField TxtDedo2Izq;
    private javax.swing.JTextField TxtDedo3Der;
    private javax.swing.JTextField TxtDedo3Izq;
    private javax.swing.JTextField TxtDedo4Der;
    private javax.swing.JTextField TxtDedo4Izq;
    private javax.swing.JTextField TxtDedo5Der;
    private javax.swing.JTextField TxtDedo5Izq;
    private javax.swing.JTextArea TxtDetalleHistoriaClinica;
    private javax.swing.JTextField TxtDiabetico;
    private org.edisoncor.gui.textField.TextFieldRound TxtDir;
    private org.edisoncor.gui.textField.TextFieldRound TxtDni;
    private javax.swing.JTextArea TxtEsguinceFrac;
    private javax.swing.JTextField TxtEspInterdigitalDer;
    private javax.swing.JTextField TxtEspInterdigitalIzq;
    private javax.swing.JTextField TxtHalluxDer;
    private javax.swing.JTextField TxtHalluxIzq;
    private org.edisoncor.gui.textField.TextFieldRound TxtMail;
    private org.edisoncor.gui.textField.TextFieldRound TxtNom;
    private javax.swing.JTextField TxtNroFicha;
    private javax.swing.JTextArea TxtObservFicha;
    private javax.swing.JTextArea TxtObservHistoria;
    private javax.swing.JTextField TxtOtroAntMed;
    private javax.swing.JTextField TxtOtroIndic;
    private javax.swing.JTextField TxtOtroMotiv;
    private javax.swing.JTextField TxtOtroOrtesis;
    private javax.swing.JTextField TxtOtroTrat;
    private org.edisoncor.gui.textField.TextFieldRound TxtTel;
    private javax.swing.JTextField TxtTomaMedicacion;
    private javax.swing.JTextField TxtZonaMedDer;
    private javax.swing.JTextField TxtZonaMedIzq;
    private javax.swing.JTextField TxtZonaMetDer;
    private javax.swing.JTextField TxtZonaMetIzq;
    private javax.swing.JTextField TxtZonaPlanDer;
    private javax.swing.JTextField TxtZonaPlanIzq;
    private javax.swing.JTextField TxtZonaTalarDer;
    private javax.swing.JTextField TxtZonaTalarIzq;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenuItem opDeshacer;
    private javax.swing.JMenuItem opRehacer;
    private org.edisoncor.gui.panel.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
