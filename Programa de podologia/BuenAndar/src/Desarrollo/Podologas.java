
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Podologas
{

    private int IdPodologa;    
    private String Nom; 
    private String Ape;
    
    
    PreparedStatement Ps;
    Conexion ConBdd = new Conexion();
    ResultSet Rs;
    
     private DefaultComboBoxModel objcombo = new DefaultComboBoxModel();
   
    
    public Podologas() {
    }


    public Podologas(String Nom, String Ape) {
        
        this.Nom = Nom;
        this.Ape = Ape;
    }

    public int getIdPodologa() {
        return IdPodologa;
    }

    public void setIdPodologa(int IdPodologa) {
        this.IdPodologa = IdPodologa;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getApe() {
        return Ape;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }
    
    
    public void AltasPodologa()
    {
         String SqlAlta = "INSERT INTO podologas (nom,ape) VALUES(?,?);";
         
         try
        {
        Ps = ConBdd.Conectado().prepareStatement (SqlAlta);
        
         Ps.setString(1, this.getNom());
         Ps.setString(2, this.getApe());
                            
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Regitro Realizado");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, no se pudo registrar a la Podóloga", "PODOLOGAS", JOptionPane.INFORMATION_MESSAGE);
           }
           
        }catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "PODOLOGAS", JOptionPane.INFORMATION_MESSAGE);  
        }
    }
    
    public void BajaPodologa(int IdPodologaAux)
    {
       String SqlBaja = "DELETE FROM podologas WHERE idPodologas = '"+ IdPodologaAux +"';"; 
       boolean existe;
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement(SqlBaja); 
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
    
    public void ModifPodologa(int IdPodologaAux)
    {
        String SqlModif = "UPDATE podologas SET nom = '"+ this.getNom() +"',ape = '"+ this.getApe() +"' WHERE idPodologas = '"+ IdPodologaAux +"';";
        
         try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlModif);
           
          
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Registro Modificado"); 
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, no pudo actualizar los datos", "PODOLOGA", JOptionPane.INFORMATION_MESSAGE);
           }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "PODOLOGA", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean BuscarPodId(String NomAux, String ApeAux)
    {
         String SqlConsIdPod = "select idPodologas, nom, ape from podologas where nom = '"+ NomAux +"' and ape = '"+ ApeAux + "';";
         try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdPod);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
           // existe y devuelvo el contenido del id de la tabla SQL
           this.setIdPodologa(Rs.getInt(1));
           this.setNom(Rs.getString(2));
           this.setApe(Rs.getString(3));

                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda de la profesional");
            return false;
        }  
    }
    
        public DefaultComboBoxModel MostrarNom() // para alimentar el combo
    {
        //combo alimentado por SQL
        String SqlComboNom = "select nom, ape from podologas order by idPodologas;";
        try 
        {
            Ps = ConBdd.Conectado().prepareStatement (SqlComboNom);
            Rs = Rs = Ps.executeQuery();
            while (Rs.next()) // 
            {
                   
               objcombo.addElement(Rs.getString(1) + " " + Rs.getString(2));
               
                            
            }
            
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "NO AGREGA DATOS AL COMBO");
            JOptionPane.showMessageDialog(null, e); // codigo de error
            objcombo = null;
          
        }
        return objcombo;
    }
}
