
package Desarrollo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Bdd.Conexion;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Plantillas extends Productos
{
    private int IdPlantilla;
    private String Material;
    private String ArcoDuroIzq;
    private String ArcoBlandoIzq;
    private String CuniaPronIzq;
    private String CuniaSupIzq;
    private String TalonOqIzq;
    private String RealceTalIntIzq;
    private int MmRealceTalIntIzq;
    private String RealceTalExtIzq;
    private int MmRealceTalExtIzq;
    private String ArcoDuroDer;
    private String ArcoBlandoDer;
    private String CuniaPronDer;
    private String CuniaSupDer;
    private String TalonOqDer;
    private String RealceTalIntDer;
    private int MmRealceTalIntDer;
    private String RealceTalExtDer;
    private int MmRealceTalExtDer;
    private int FkProductos;
    private Date FechaCons;
    
    private Conexion ConBdd = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    
    
    private String SqlAltaPlantillas = "INSERT INTO plantillas (material, arcoduroizq, arcoblandoizq, cunpronizq, cunsupizq, taloqizq, talrealintizq, mmtalrealintizq, talrealextizq, mmtalrealextizq, arcoduroder, arcoblandoder, cunpronder, cunsupder, taloqder, talrealintder, mmtalrealintder, talrealextder, mmtalrealextder, Productos_idProd) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    public Plantillas() {
    }

    public Plantillas(String Material, String ArcoDuroIzq, String ArcoBlandoIzq, String CuniaPronIzq, String CuniaSupIzq, String TalonOqIzq, String RealceTalIntIzq, int MmRealceTalIntIzq, String RealceTalExtIzq, int MmRealceTalExtIzq, String ArcoDuroDer, String ArcoBlandoDer, String CuniaPronDer, String CuniaSupDer, String TalonOqDer, String RealceTalIntDer, int MmRealceTalIntDer, String RealceTalExtDer, int MmRealceTalExtDer,int FkProductos) {
        this.Material = Material;
        this.ArcoDuroIzq = ArcoDuroIzq;
        this.ArcoBlandoIzq = ArcoBlandoIzq;
        this.CuniaPronIzq = CuniaPronIzq;
        this.CuniaSupIzq = CuniaSupIzq;
        this.TalonOqIzq = TalonOqIzq;
        this.RealceTalIntIzq = RealceTalIntIzq;
        this.MmRealceTalIntIzq = MmRealceTalIntIzq;
        this.RealceTalExtIzq = RealceTalExtIzq;
        this.MmRealceTalExtIzq = MmRealceTalExtIzq;
        this.ArcoDuroDer = ArcoDuroDer;
        this.ArcoBlandoDer = ArcoBlandoDer;
        this.CuniaPronDer = CuniaPronDer;
        this.CuniaSupDer = CuniaSupDer;
        this.TalonOqDer = TalonOqDer;
        this.RealceTalIntDer = RealceTalIntDer;
        this.MmRealceTalIntDer = MmRealceTalIntDer;
        this.RealceTalExtDer = RealceTalExtDer;
        this.MmRealceTalExtDer = MmRealceTalExtDer;
        this.FkProductos = FkProductos;
    }

    public Plantillas(int IdPlantilla, String Material, String ArcoDuroIzq, String ArcoBlandoIzq, String CuniaPronIzq, String CuniaSupIzq, String TalonOqIzq, int MmRealceTalIntIzq, int MmRealceTalExtIzq, String ArcoDuroDer, String ArcoBlandoDer, String CuniaPronDer, String CuniaSupDer, String TalonOqDer, int MmRealceTalIntDer, int MmRealceTalExtDer, Date FechaCons) {
        
        this.IdPlantilla = IdPlantilla;
        this.Material = Material;
        this.ArcoDuroIzq = ArcoDuroIzq;
        this.ArcoBlandoIzq = ArcoBlandoIzq;
        this.CuniaPronIzq = CuniaPronIzq;
        this.CuniaSupIzq = CuniaSupIzq;
        this.TalonOqIzq = TalonOqIzq;
        this.MmRealceTalIntIzq = MmRealceTalIntIzq;
        this.MmRealceTalExtIzq = MmRealceTalExtIzq;
        this.ArcoDuroDer = ArcoDuroDer;
        this.ArcoBlandoDer = ArcoBlandoDer;
        this.CuniaPronDer = CuniaPronDer;
        this.CuniaSupDer = CuniaSupDer;
        this.TalonOqDer = TalonOqDer;
        this.MmRealceTalIntDer = MmRealceTalIntDer;
        this.MmRealceTalExtDer = MmRealceTalExtDer;
        this.FechaCons = FechaCons;
    }

    public int getIdPlantilla() {
        return IdPlantilla;
    }
    
    public String getMaterial() {
        return Material;
    }

   
    public String getArcoDuroIzq() {
        return ArcoDuroIzq;
    }

    public String getArcoBlandoIzq() {
        return ArcoBlandoIzq;
    }

    public String getCuniaPronIzq() {
        return CuniaPronIzq;
    }

    public String getCuniaSupIzq() {
        return CuniaSupIzq;
    }

    public String getTalonOqIzq() {
        return TalonOqIzq;
    }

    public String getRealceTalIntIzq() {
        return RealceTalIntIzq;
    }

    public int getMmRealceTalIntIzq() {
        return MmRealceTalIntIzq;
    }

    public String getRealceTalExtIzq() {
        return RealceTalExtIzq;
    }

    public int getMmRealceTalExtIzq() {
        return MmRealceTalExtIzq;
    }

    public String getArcoDuroDer() {
        return ArcoDuroDer;
    }

    public String getArcoBlandoDer() {
        return ArcoBlandoDer;
    }

    public String getCuniaPronDer() {
        return CuniaPronDer;
    }

    public String getCuniaSupDer() {
        return CuniaSupDer;
    }

    public String getTalonOqDer() {
        return TalonOqDer;
    }

    public String getRealceTalIntDer() {
        return RealceTalIntDer;
    }

    public int getMmRealceTalIntDer() {
        return MmRealceTalIntDer;
    }

    public String getRealceTalExtDer() {
        return RealceTalExtDer;
    }

    public int getMmRealceTalExtDer() {
        return MmRealceTalExtDer;
    }
    
    public int getFkProductos() {
        return FkProductos;
    }

    public Date getFechaCons(){
        return FechaCons;
    }

    public void setIdPlantilla(int IdPlantilla) {
        this.IdPlantilla = IdPlantilla;
    }
    
    
      
    public void setMaterial(String Material) {
        this.Material = Material;
    }

 
    public void setArcoDuroIzq(String ArcoDuroIzq) {
        this.ArcoDuroIzq = ArcoDuroIzq;
    }

    public void setArcoBlandoIzq(String ArcoBlandoIzq) {
        this.ArcoBlandoIzq = ArcoBlandoIzq;
    }

    public void setCuniaPronIzq(String CuniaPronIzq) {
        this.CuniaPronIzq = CuniaPronIzq;
    }

    public void setCuniaSupIzq(String CuniaSupIzq) {
        this.CuniaSupIzq = CuniaSupIzq;
    }

    public void setTalonOqIzq(String TalonOqIzq) {
        this.TalonOqIzq = TalonOqIzq;
    }

    public void setRealceTalIntIzq(String RealceTalIntIzq) {
        this.RealceTalIntIzq = RealceTalIntIzq;
    }

    public void setMmRealceTalIntIzq(int MmRealceTalIntIzq) {
        this.MmRealceTalIntIzq = MmRealceTalIntIzq;
    }

    public void setRealceTalExtIzq(String RealceTalExtIzq) {
        this.RealceTalExtIzq = RealceTalExtIzq;
    }

    public void setMmRealceTalExtIzq(int MmRealceTalExtIzq) {
        this.MmRealceTalExtIzq = MmRealceTalExtIzq;
    }

    public void setArcoDuroDer(String ArcoDuroDer) {
        this.ArcoDuroDer = ArcoDuroDer;
    }

    public void setArcoBlandoDer(String ArcoBlandoDer) {
        this.ArcoBlandoDer = ArcoBlandoDer;
    }

    public void setCuniaPronDer(String CuniaPronDer) {
        this.CuniaPronDer = CuniaPronDer;
    }

    public void setCuniaSupDer(String CuniaSupDer) {
        this.CuniaSupDer = CuniaSupDer;
    }

    public void setTalonOqDer(String TalonOqDer) {
        this.TalonOqDer = TalonOqDer;
    }

    public void setRealceTalIntDer(String RealceTalIntDer) {
        this.RealceTalIntDer = RealceTalIntDer;
    }

    public void setMmRealceTalIntDer(int MmRealceTalIntDer) {
        this.MmRealceTalIntDer = MmRealceTalIntDer;
    }

    public void setRealceTalExtDer(String RealceTalExtDer) {
        this.RealceTalExtDer = RealceTalExtDer;
    }

    public void setMmRealceTalExtDer(int MmRealceTalExtDer) {
        this.MmRealceTalExtDer = MmRealceTalExtDer;
    }
    
    public void setFkProductos (int FkProductos) {
        this.FkProductos = FkProductos;
    }
    
    public void setFechaCons (Date FechaCons){
        this.FechaCons = FechaCons;
    }
    
    public void AltaPlantillas()
    {
     try 
        {
      
           Ps = ConBdd.Conectado().prepareStatement (SqlAltaPlantillas);
           
           
           Ps.setString(1, this.getMaterial());
           Ps.setString(2, this.getArcoDuroIzq());
           Ps.setString(3, this.getArcoBlandoIzq());
           Ps.setString(4, this.getCuniaPronIzq());
           Ps.setString(5,this.getCuniaSupIzq());
           Ps.setString(6,this.getTalonOqIzq());
           Ps.setString(7,this.getRealceTalIntIzq());
           Ps.setInt(8,this.getMmRealceTalIntIzq());
           Ps.setString(9,this.getRealceTalExtIzq());
           Ps.setInt(10, this.getMmRealceTalExtIzq());
           Ps.setString(11, this.getArcoDuroDer());
           Ps.setString(12, this.getArcoBlandoDer());
           Ps.setString(13, this.getCuniaPronDer());
           Ps.setString(14, this.getCuniaSupDer());
           Ps.setString(15, this.getTalonOqDer());
           Ps.setString(16, this.getRealceTalIntDer()); 
           Ps.setInt(17,this.getMmRealceTalIntDer());
           Ps.setString(18, this.getRealceTalExtDer());
           Ps.setInt(19, this.getMmRealceTalExtDer()); 
           Ps.setInt(20, this.getFkProductos());
                   
          
           
           int registro = Ps.executeUpdate();
           if (registro > 1) 
           {
               JOptionPane.showMessageDialog(null, "ERROR, al guardar Planitllas", "PLANTILLAS", JOptionPane.INFORMATION_MESSAGE);
           }
           
           } catch (SQLException e) 
           {
                JOptionPane.showMessageDialog(null, "ERROR\n" + e, "PLANTILLAS", JOptionPane.INFORMATION_MESSAGE);  
           }   
    }
    
     DefaultTableModel objtabla;
    String [] TitColumna = {"Id Planitlla","Material", "Arc Dr I", "Arc Bl I", "Cuñ Pr I", "Cuñ Sp I", "Tln Oq I", "R Tl Int I", "R Tl Ext I", "Arc Dr D", "Arc Bl D", "Cuñ Pr D", "Cuñ Sp D", "Tln Oq D", "R Tl Int D", "R Tl Ext I", "Fecha Consulta"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
       
    
    public DefaultTableModel Datos(String CodHistAux)
   {
       String SqlMostrar = "select idPlantilla, material, arcoduroizq, arcoblandoizq, cunpronizq, cunsupizq, taloqizq, mmtalrealintizq, mmtalrealextizq, arcoduroder, arcoblandoder, cunpronder, cunsupder, taloqder, mmtalrealintder, mmtalrealextder, fechaVta from productos as p inner join plantillas inner join historiaclinica on idProd = Productos_idProd and idHistoriaClinica = HistoriaClinica_idHistoriaClinica where p.HistoriaClinica_idHistoriaClinica = '"+ CodHistAux +"';";
       
       try
       {
       Ps = ConBdd.Conectado().prepareStatement(SqlMostrar);
       Rs = Ps.executeQuery();
       while (Rs.next() == true)
       {   
           this.setIdPlantilla(Rs.getInt(1));
           this.setMaterial(Rs.getString(2));
           this.setArcoDuroIzq(Rs.getString(3));
           this.setArcoBlandoIzq (Rs.getString(4));
           this.setCuniaPronIzq(Rs.getString(5));
           this.setCuniaSupIzq(Rs.getString(6));
           this.setTalonOqIzq(Rs.getString(7));
           this.setMmRealceTalIntIzq(Rs.getInt(8));
           this.setMmRealceTalExtIzq(Rs.getInt(9));
           this.setArcoDuroDer(Rs.getString(10));
           this.setArcoBlandoDer (Rs.getString(11));
           this.setCuniaPronDer(Rs.getString(12));
           this.setCuniaSupDer(Rs.getString(13));
           this.setTalonOqDer(Rs.getString(14));
           this.setMmRealceTalIntDer(Rs.getInt(15));
           this.setMmRealceTalExtDer(Rs.getInt(16));
           this.setFechaCons(Rs.getDate(17));
             
           String FechaConsulta = String.valueOf(this.getFechaCons());
           String Anio = FechaConsulta.substring(0, 4);    
           String Mes = FechaConsulta.substring(5, 7);
           String Dia = FechaConsulta.substring(8, 10);
           String FechaOrdenada = Dia + "-" + Mes + "-" + Anio;
           
           Object [] VecFilas = {this.getIdPlantilla(), this.getMaterial(), this.getArcoDuroIzq(), this.getArcoBlandoIzq(),this.getCuniaPronIzq(), this.getCuniaSupIzq(), this.getTalonOqIzq(), this.getMmRealceTalIntIzq(), this.getMmRealceTalExtIzq(), this.getArcoDuroIzq(), this.getArcoBlandoDer(),this.getCuniaPronDer(), this.getCuniaSupDer(), this.getTalonOqDer(), this.getMmRealceTalIntDer(), this.getMmRealceTalExtDer(), FechaOrdenada};
                 
           objtabla.addRow(VecFilas);
       }    
       } 
       catch (SQLException e)
       {
           JOptionPane.showMessageDialog(null, "no estaria mostrando");
       }
       
       return objtabla;
   }        
   
      
       public void Bajas(int IdPlantillaAux) // DELETE EN SQL
    {
        boolean existe;
        String SqlBorrar = " DELETE FROM plantillas WHERE idPlantilla = '"+IdPlantillaAux+"';";
        
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement(SqlBorrar); 
            int Registro = Ps.executeUpdate(); //Borra (el rayito de SQL pero para UPDATE)
            if (Registro > 0)
            {
                JOptionPane.showMessageDialog(null, "registro Eliminado"); // no hace falta
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO LO PUDO Borrar");    
            }                    
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "");
            existe = false;
            
        }
    }
    
    public void BuscarIdPlantilla(int IdPlantillaAux)
    {
        
        
        
    }
    
            
       
}
