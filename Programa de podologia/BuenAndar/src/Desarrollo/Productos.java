
package Desarrollo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Date;
import Bdd.Conexion;


public class Productos
{
    int IdProducto;
    String NomProd;
    String Marca;
    int Cantidad;
    Date FechaVta;
    String FkCodHistoria;
    int FkIdFicha;
        
    private Conexion ConBdd = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    
    private String SqlAltaProd = "INSERT INTO productos (nomProd, marca, cantidad, fechaVta, HistoriaClinica_idHistoriaClinica, HistoriaClinica_Ficha_idFicha) VALUES (?,?,?,?,?,?);";
    

    public Productos() {
    }

    public Productos(String NomProd, int Cantidad, String Marca, Date FechaVta, String FkCodHistoria,int FkIdFicha) {
        
        this.NomProd = NomProd;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.FechaVta = FechaVta;
        this.FkCodHistoria = FkCodHistoria;
        this.FkIdFicha = FkIdFicha;
       
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public String getNomProd() {
        return NomProd;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getMarca() {
        return Marca;
    }

    public Date getFechaVta() {
        return FechaVta;
    }
    
    public String getFkCodHistoria() {
        return FkCodHistoria;
    }
    
    public int getFkIdFicha() {
        return FkIdFicha;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public void setNomProd(String NomProd) {
        this.NomProd = NomProd;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setFechaVta(Date FechaVta) {
        this.FechaVta = FechaVta;
    }
    
    public void setFkCodHistoria(String FkCodHistoria) {
        this.FkCodHistoria = FkCodHistoria;
    }
    
     public void setFkIdFicha(int FkIdFicha) {
        this.FkIdFicha = FkIdFicha;
    }
     public void AltaProd()
    {
        try 
        {
      
           Ps = ConBdd.Conectado().prepareStatement (SqlAltaProd);
           
           Ps.setString(1, this.getNomProd());
           Ps.setString(2, this.getMarca());
           Ps.setInt(3,this.getCantidad());
           Ps.setDate(4,this.getFechaVta());
           Ps.setString(5, this.getFkCodHistoria());
           Ps.setInt(6,this.getFkIdFicha());
          
            
           
           int registro = Ps.executeUpdate();
           if (registro > 1) 
           
           {
               JOptionPane.showMessageDialog(null, "ERROR, al guardar Productos", "PRODUCTOS", JOptionPane.INFORMATION_MESSAGE);
           }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "PRODUCTOS", JOptionPane.INFORMATION_MESSAGE);  
        }   
    }
     
     
     public boolean BuscarxNomProd(String NomProdAux)
    {
     String SqlConsIdProd = "select idProd from productos where nomProd = '"+ NomProdAux +"';";
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdProd);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
                // existe y devuelvo el contenido del nombre de la tabla SQL
                this.setIdProducto(Rs.getInt(1));
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del número de prod");
            return false;
        }
    }
     
    public boolean BuscarxCodHist (String CodHistProdAux, String fechaVtaAux, String nomProdAux) 
    {
       String SqlConsIdProd = "select idProd from productos where HistoriaClinica_idHistoriaClinica = '"+CodHistProdAux+"' and fechaVta = '"+fechaVtaAux+"' and nomProd = '"+nomProdAux+"';";
       
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdProd);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
                // existe y devuelvo el contenido del nombre de la tabla SQL
                this.setIdProducto(Rs.getInt(1));
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del número de prod");
            return false;
        }  
    }
}
