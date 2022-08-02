
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaProdTotal
{

    String Marca;
    int Cantidad;
    
    PreparedStatement Ps;
    Conexion Con = new Conexion();
    ResultSet Registro;

    public ConsultaProdTotal() {
    }

    public ConsultaProdTotal(String Marca, int Cantidad) {
       
        this.Marca = Marca;
        this.Cantidad = Cantidad;
    }
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

     DefaultTableModel objtabla;
    String [] TitColumna = {"Marca", "Cantidad"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
       
    
    public DefaultTableModel Datos(String Mes, String Anio)
   {
       String SqlMostrar = "select marca, sum(cantidad) from productos where fechaVta like '%"+Anio+"-"+Mes+"-%' group by marca;";
       
       try
       {
       Ps = Con.Conectado().prepareStatement(SqlMostrar);
       Registro = Ps.executeQuery();
       while (Registro.next() == true)
       {
           
           this.setMarca(Registro.getString(1));
           this.setCantidad (Registro.getInt(2));            
           Object [] VecFilas = {this.getMarca(), this.getCantidad()};
                 
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
