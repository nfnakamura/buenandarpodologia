
package Desarrollo;

import Bdd.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaPlantillas
{

int CantPlan;
String Material;


    PreparedStatement Ps;
    Conexion Con = new Conexion();
    ResultSet Registro;

    public ConsultaPlantillas() {
    }

    public ConsultaPlantillas(int CantPlan, String Material) {
        this.CantPlan = CantPlan;
        this.Material = Material;
    }

    public int getCantPlan() {
        return CantPlan;
    }

    public void setCantPlan(int CantPlan) {
        this.CantPlan = CantPlan;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

  DefaultTableModel objtabla;
    String [] TitColumna = {"Material", "Nro Plantillas Vendidas"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
       
    
    public DefaultTableModel Datos(String Mes, String Anio)
   {
       String SqlMostrar = "select pl.material, sum(pr.cantidad) from productos as pr inner join plantillas as pl on pr.idProd = pl.Productos_idProd where nomProd = 'Plantillas' and fechaVta like '%"+Anio+"-"+Mes+"-%' group by material;";
       
       try
       {
       Ps = Con.Conectado().prepareStatement(SqlMostrar);
       Registro = Ps.executeQuery();
       while (Registro.next() == true)
       {
           this.setMaterial(Registro.getString(1));
           this.setCantPlan (Registro.getInt(2));            
           Object [] VecFilas = {this.getMaterial(), this.getCantPlan()};
                 
           objtabla.addRow(VecFilas);
       }    
       } 
       catch (SQLException e)
       {
           JOptionPane.showMessageDialog(null, "no estaria mostrando");
       }
       
       return objtabla;
   }        
    
}
