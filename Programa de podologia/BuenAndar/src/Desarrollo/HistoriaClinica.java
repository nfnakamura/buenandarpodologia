
package Desarrollo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Date;
import Bdd.Conexion;



public class HistoriaClinica 
{

    private String IdHistoriaClinica;
    private String DetalleHistClin;
    private Date FechaConsulta;
    private int FkNroFicha;
    
    private Conexion ConBdd = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    
    private String SqlAltaHistClinica = "INSERT INTO historiaclinica (idHistoriaClinica, detalleHist, fechaCons , Ficha_idFicha) VALUES(?,?,?,?);";

    
    
    public HistoriaClinica() {
    }
    
    public HistoriaClinica(String DetalleHistClin, int FkNroFicha) // para modif solo del DETALLE DE HISTORIA CLINICA
    {
      this.DetalleHistClin = DetalleHistClin;
      this.FkNroFicha = FkNroFicha;
    }        

    public HistoriaClinica(String IdHistoriaClinica, String DetalleHistClin, Date FechaConsulta, int FkNroFicha) {
        this.IdHistoriaClinica = IdHistoriaClinica;
        this.DetalleHistClin = DetalleHistClin;
        this.FechaConsulta = FechaConsulta;
        this.FkNroFicha = FkNroFicha;
    }

    public String getIdHistoriaClinica() {
        return IdHistoriaClinica;
    }

    public String getDetalleHistClin() {
        return DetalleHistClin;
    }

    public Date getFechaConsulta() {
        return FechaConsulta;
    }

    public int getFkNroFicha() {
        return FkNroFicha;
    }

    public void setIdHistoriaClinica(String IdHistoriaClinica) {
        this.IdHistoriaClinica = IdHistoriaClinica;
    }

    public void setDetalleHistClin(String DetalleHistClin) {
        this.DetalleHistClin = DetalleHistClin;
    }

    public void setFechaConsulta(Date FechaConsulta) {
        this.FechaConsulta = FechaConsulta;
    }

    public void setFkNroFicha(int FkNroFicha) {
        this.FkNroFicha = FkNroFicha;
    }
     
     
    public void AltaHistClinica() 
    {
        try
        {
        Ps = ConBdd.Conectado().prepareStatement (SqlAltaHistClinica);
        
         Ps.setString(1, this.getIdHistoriaClinica());
         Ps.setString(2, this.getDetalleHistClin());
         Ps.setDate(3, this.getFechaConsulta());
         Ps.setInt(4, this.getFkNroFicha());
                    
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Historia Clinica Guardada");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, no lo pudo agregar la ficha", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
           }
           
        }catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);  
        }
    }   
    
    
     public boolean BuscarCodHistoriaClinica(String CodHist)
    {
     String SqlConsIdHistoriaClinica = "select idHistoriaClinica, detalleHist, fechaCons, Ficha_idFicha from historiaclinica where idHistoriaClinica = '" + CodHist + "';";
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdHistoriaClinica);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
                // existe y devuelvo el contenido del id de la tabla SQL
                this.setIdHistoriaClinica(Rs.getString(1));
                this.setDetalleHistClin(Rs.getString(2));
                this.setFechaConsulta(Rs.getDate(3));
                this.setFkNroFicha(Rs.getInt(4));
                
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del código de historia clínica", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
     
     public boolean BuscarHistClinPorNroFicha(int FkNroFicha)
    {
     String SqlConsIdHistoriaClinica = "select idHistoriaClinica, detalleHist, fechaCons, Ficha_idFicha from historiaclinica where Ficha_idFicha = '" + FkNroFicha + "';";
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdHistoriaClinica);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
                // existe y devuelvo el contenido del id de la tabla SQL
                this.setIdHistoriaClinica(Rs.getString(1));
                this.setDetalleHistClin(Rs.getString(2));
                this.setFechaConsulta(Rs.getDate(3));
                this.setFkNroFicha(Rs.getInt(4));
                
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del código de historia clínica", "HISTORIA CLINICA", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    } 
     
     public void ModifDetalleHistoria(String CodHist, int IdFicha)
    {
    
        //update
        String SqlMod = "UPDATE historiaclinica SET idHistoriaClinica = '"+ this.getIdHistoriaClinica() + "' , detalleHist  = '" + this.getDetalleHistClin() + "' , fechaCons = '"+ this.getFechaConsulta() +"', Ficha_idFicha = '"+ this.getFkNroFicha() +"' WHERE idHistoriaClinica = '" + CodHist + "'  AND Ficha_idFicha = '"+ IdFicha +"';";
          try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlMod);
           
          
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Detalle de Historia Clinica Modificado"); //OPCIONAL puedo borrar el renglon y poner condicion dejar el else como if < 1
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, PRIMER INGRESO DEBE UTILIZAR EL BOTON 'ALTA'", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
           }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        }
      
    }         

}
