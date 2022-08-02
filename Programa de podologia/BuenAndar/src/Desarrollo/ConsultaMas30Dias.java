
package Desarrollo;

import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaMas30Dias
{
    
    String Nom;
    String Ape;
    String Cel;
    Date FechaCons;
    
    PreparedStatement Ps;
    Conexion Con = new Conexion();
    ResultSet Registro;

    public ConsultaMas30Dias() {
    }

    public ConsultaMas30Dias(String Nom, String Ape, String Cel, Date FechaCons) {
        this.Nom = Nom;
        this.Ape = Ape;
        this.Cel = Cel;
        this.FechaCons = FechaCons;
    }

    public String getNom() {
        return Nom;
    }

    public String getApe() {
        return Ape;
    }

    public String getCel() {
        return Cel;
    }

    public Date getFechaCons() {
        return FechaCons;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public void setFechaCons(Date FechaCons) {
        this.FechaCons = FechaCons;
    }
    
    DefaultTableModel objtabla;
    String [] TitColumna = {"Nombre", "Apellido", "Celular", "Ultima Consulta"};
    String [][] Filas = {};
    
       public DefaultTableModel Titulos()
   {
       objtabla = new DefaultTableModel (Filas, TitColumna);
       return objtabla;
   }
        
    
    public DefaultTableModel Datos(String FechaMenos30, String FechaMenos90)
   {
       String SqlMostrar = "select ficha.nom, ficha.ape, ficha.cel, historiaclinica.fechaCons from ficha inner join historiaclinica on ficha.idFicha = historiaclinica.Ficha_idFicha where fechaCons <= '"+FechaMenos30+"' and fechaCons >= '"+FechaMenos90+"';";
       
       try
       {
       Ps = Con.Conectado().prepareStatement(SqlMostrar);
       Registro = Ps.executeQuery();
       while (Registro.next() == true)
       {
           this.setNom (Registro.getString(1));
           this.setApe(Registro.getString(2));
           this.setCel(Registro.getString(3));
           this.setFechaCons(Registro.getDate(4));
           
           String FechaConsulta = String.valueOf(this.getFechaCons());
           String Anio = FechaConsulta.substring(0, 4);    
           String Mes = FechaConsulta.substring(5, 7);
           String Dia = FechaConsulta.substring(8, 10);
           String FechaOrdenada = Dia + "-" + Mes + "-" + Anio;
           
           Object [] VecFilas = {this.getNom(), this.getApe(), this.getCel(), FechaOrdenada};
                 
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
