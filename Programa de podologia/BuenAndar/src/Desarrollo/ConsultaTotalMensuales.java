
package Desarrollo;

import Bdd.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaTotalMensuales
{
    int CantidadCons;
    
    
    PreparedStatement Ps;
    Conexion Con = new Conexion();
    ResultSet Registro;

    public ConsultaTotalMensuales() {
    }

    public ConsultaTotalMensuales(int CantidadCons) {
        this.CantidadCons = CantidadCons;
    }

    public int getCantidadCons() {
        return CantidadCons;
    }

    public void setCantidadCons(int CantidadCons) {
        this.CantidadCons = CantidadCons;
    }
    
     DefaultTableModel objtabla;
    String [] TitColumna = {"Nro Personas"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
       
    
    public DefaultTableModel Datos(String Mes, String Anio)
   {
       String SqlMostrar = "select count(FechaCons) from HistoriaClinica where FechaCons like '%"+Anio+"-"+Mes+"-%';";
       
       try
       {
       Ps = Con.Conectado().prepareStatement(SqlMostrar);
       Registro = Ps.executeQuery();
       while (Registro.next() == true)
       {
           this.setCantidadCons (Registro.getInt(1));
                       
           Object [] VecFilas = {this.getCantidadCons()};
                 
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
