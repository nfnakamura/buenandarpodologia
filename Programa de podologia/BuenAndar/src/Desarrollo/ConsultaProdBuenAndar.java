
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaProdBuenAndar 

{
    String Producto;
    int Cantidad;

    PreparedStatement Ps;
    Conexion Con = new Conexion();
    ResultSet Registro;
    
    public ConsultaProdBuenAndar() {
    }

    public ConsultaProdBuenAndar(String Producto, int Cantidad) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
       
     DefaultTableModel objtabla;
    String [] TitColumna = {"Producto", "Cantidad"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
       
    
    public DefaultTableModel Datos(String Mes, String Anio)
   {
       String SqlMostrar = "select nomProd, sum(cantidad) from productos where marca = 'BuenAndar' and fechaVta like '%"+Anio+"-"+Mes+"-%' group by nomProd;";
       
       try
       {
       Ps = Con.Conectado().prepareStatement(SqlMostrar);
       Registro = Ps.executeQuery();
       while (Registro.next() == true)
       {
           this.setProducto(Registro.getString(1));
           this.setCantidad (Registro.getInt(2));            
           Object [] VecFilas = {this.getProducto(), this.getCantidad()};
                 
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
