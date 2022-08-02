
package Desarrollo;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Date;
import Bdd.Conexion;

public class Ficha
{
    private int NroFicha;
    private String Nom;
    private String Ape;
    private String Dni;
    private String Sexo;
    private String Cel;
    private String Tel;
    private String Dir;
    private String Mail;
    private String ActFisica;
    private Date Fecha;
    private String Observ;
    private String Diabet;
    private String TxtDiabet;
    private String Anticoag;
    private String TomaAsp;
    private String TxtTomaAsp;
    private String Alergias;
    private String TxtAlergias;
    private String Esguince;
    private String TxtEsguince;
    private String OtroAnt;
    private String TxtOtroAnt;        
    
    
    
    private Conexion ConBdd = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    
    private String SqlAltaFicha = "INSERT INTO ficha(nom,ape,dni,sexo,fechaNac,cel,tel,mail,dir,actFis,observ,diabetico,anticoagulado,tomaAsp,alergias,esguinceFract,otroAnt,txtDiabetico,txtTomaAsp,TxtEsguince,TxtOtroAnt,TxtAlergias)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    public Ficha() {
    }

    public Ficha(String Nom, String Ape, String Dni, String Sexo, String Cel, String Tel, String Dir, String Mail, String ActFisica, Date Fecha, String Observ, String Diabet, String TxtDiabet, String Anticoag, String TomaAsp, String TxtTomaAsp, String Alergias, String TxtAlergias, String Esguince, String TxtEsguince, String OtroAnt, String TxtOtroAnt) {
        
        this.Nom = Nom;
        this.Ape = Ape;
        this.Dni = Dni;
        this.Sexo = Sexo;
        this.Cel = Cel;
        this.Tel = Tel;
        this.Dir = Dir;
        this.Mail = Mail;
        this.ActFisica = ActFisica;
        this.Fecha = Fecha;
        this.Observ = Observ;
        this.Diabet = Diabet;
        this.TxtDiabet = TxtDiabet;
        this.Anticoag = Anticoag;
        this.TomaAsp = TomaAsp;
        this.TxtTomaAsp = TxtTomaAsp;
        this.Alergias = Alergias;
        this.TxtAlergias = TxtAlergias;
        this.Esguince = Esguince;
        this.TxtEsguince = TxtEsguince;
        this.OtroAnt = OtroAnt;
        this.TxtOtroAnt = TxtOtroAnt;
    }

    public int getNroFicha() {
        return NroFicha;
    }

    public String getNom() {
        return Nom;
    }

    public String getApe() {
        return Ape;
    }

    public String getDni() {
        return Dni;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getCel() {
        return Cel;
    }

    public String getTel() {
        return Tel;
    }

    public String getDir() {
        return Dir;
    }

    public String getMail() {
        return Mail;
    }

    public String getActFisica() {
        return ActFisica;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getObserv() {
        return Observ;
    }

    public String isDiabet() {
        return Diabet;
    }
    
    public String getTxtDiabet() {
       return TxtDiabet; 
    }

    public String isAnticoag() {
        return Anticoag;
    }

    public String isTomaAsp() {
        return TomaAsp;
    }
    
    public String getTxtTomaAsp() {
        return TxtTomaAsp;
    }

    public String isAlergias() {
        return Alergias;
    }

    public String getTxtAlergias() {
        return TxtAlergias;
    }

    public String isEsguince() {
        return Esguince;
    }
    
    public String getTxtEsguince(){
        return TxtEsguince;
    }

    public String isOtroAnt() {
        return OtroAnt;
    }

    public String getTxtOtroAnt() {
        return TxtOtroAnt;
    }


    public void setNroFicha(int NroFicha) {
        this.NroFicha = NroFicha;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setActFisica(String ActFisica) {
        this.ActFisica = ActFisica;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setObserv(String Observ) {
        this.Observ = Observ;
    }

    public void setDiabet(String Diabet) {
        this.Diabet = Diabet;
    }
    
    public void setTxtDiabet(String TxtDiabet) {
         this.TxtDiabet = TxtDiabet;
    }

    public void setAnticoag(String Anticoag) {
        this.Anticoag = Anticoag;
    }

    public void setTomaAsp(String TomaAsp) {
        this.TomaAsp = TomaAsp;
    }
    
    public void setTxtTomaAsp(String TxtTomaAsp) {
        this.TxtTomaAsp = TxtTomaAsp;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public void setTxtAlergias(String TxtAlergias) {
        this.TxtAlergias = TxtAlergias;
    }

    public void setEsguince(String Esguince) {
        this.Esguince = Esguince;
    }
    
    public void setTxtEsguince(String TxtEsguince) {
        this.TxtEsguince = TxtEsguince;
    }

    public void setOtroAnt(String OtroAnt) {
        this.OtroAnt = OtroAnt;
    }

    public void setTxtOtroAnt(String TxtOtroAnt) {
        this.TxtOtroAnt = TxtOtroAnt;
    }

    
   
         
    
      public void AltaFicha()
    {
      try 
        {
      
           Ps = ConBdd.Conectado().prepareStatement (SqlAltaFicha);
           
           Ps.setString(1, this.getNom());
           Ps.setString(2, this.getApe());
           Ps.setString(3, this.getDni());
           Ps.setString(4, this.getSexo());
           Ps.setDate(5, this.getFecha());
           Ps.setString(6,this.getCel());
           Ps.setString(7,this.getTel());
           Ps.setString(8,this.getMail());
           Ps.setString(9,this.getDir());
           Ps.setString(10,this.getActFisica());
           Ps.setString(11, this.getObserv());
           Ps.setString(12, this.isDiabet());
           Ps.setString(13, this.isAnticoag());
           Ps.setString(14, this.isTomaAsp());
           Ps.setString(15, this.isAlergias());
           Ps.setString(16, this.isEsguince());
           Ps.setString(17, this.isOtroAnt()); 
           Ps.setString(18,this.getTxtDiabet());
           Ps.setString(19, this.getTxtTomaAsp());
           Ps.setString(20, this.getTxtEsguince()); 
           Ps.setString(21, this.getTxtOtroAnt());
           Ps.setString(22, this.getTxtAlergias());
           
           
           
           
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Ficha Guardada");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, no lo pudo agregar la ficha", "FICHA", JOptionPane.INFORMATION_MESSAGE);
           }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "FICHA", JOptionPane.INFORMATION_MESSAGE);  
        }
    }
      
    public void ModifFicha(int NroFicha)
    {
    
        //update
        String SqlMod = "UPDATE ficha SET nom ='" + this.getNom() + "',ape = '" + this.getApe() + "',dni = '" + this.getDni() + "',sexo = '" + this.getSexo() + "',fechaNac = '" + this.getFecha() + "',cel = '" + this.getCel() + "',tel = '" + this.getTel() + "',mail = '" + this.getMail() + "',dir = '" + this.getDir() + "',actFis = '" + this.getActFisica() + "',observ = '" + this.getObserv() + "',diabetico = '" + this.isDiabet() + "',anticoagulado = '" + this.isAnticoag() + "',tomaAsp = '" + this.isTomaAsp() + "',alergias = '" + this.isAlergias() + "',esguinceFract = '" + this.isEsguince() + "',otroAnt = '" + this.isOtroAnt() + "',txtDiabetico = '" + this.getTxtDiabet() + "',txtTomaAsp = '" + this.getTxtTomaAsp() + "',TxtEsguince = '" + this.getTxtEsguince() + "',TxtOtroAnt = '" + this.getTxtOtroAnt() + "',TxtAlergias = '" + this.getTxtAlergias() + "'WHERE idFicha = '" + NroFicha + "';";
          try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlMod);
           
          
           int registro = Ps.executeUpdate();
           if (registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Registro Modificado"); //OPCIONAL puedo borrar el renglon y poner condicion dejar el else como if < 1
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ERROR, no pudo actualizar la ficha", "FICHA", JOptionPane.INFORMATION_MESSAGE);
           }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "ERROR\n" + e, "FICHA", JOptionPane.INFORMATION_MESSAGE);
        }
      
    }        
    
    public boolean BuscarIdFicha(String NomAux, String ApeAux)
    {
     String SqlConsIdFicha = "select idFicha from ficha where nom = '"+ NomAux + "' and ape = '"+ ApeAux +"';";
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsIdFicha);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
                // existe y devuelvo el contenido del id de la tabla SQL
                this.setNroFicha(Rs.getInt(1));
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del número de ficha");
            return false;
        }
    }
    
    public boolean  BuscarPorNomyApe(String NomAux, String ApeAux)
    {
           String SqlConsPaciente = "select idFicha,nom,ape,dni,sexo,fechaNac,cel,tel,mail,dir,actFis,observ,diabetico,anticoagulado,tomaAsp,alergias,esguinceFract,otroAnt,txtDiabetico,txtTomaAsp,TxtEsguince,TxtOtroAnt,TxtAlergias from ficha where nom = '"+ NomAux + "' and ape = '"+ ApeAux +"';";
        try 
        {
           Ps = ConBdd.Conectado().prepareStatement (SqlConsPaciente);
           Rs = Ps.executeQuery();
            if (Rs.next())
            {
           // existe y devuelvo el contenido del id de la tabla SQL
           this.setNroFicha(Rs.getInt(1));
           this.setNom(Rs.getString(2));
           this.setApe(Rs.getString(3));
           this.setDni(Rs.getString(4));
           this.setSexo(Rs.getString(5));
           this.setFecha(Rs.getDate(6));
           this.setCel(Rs.getString(7));
           this.setTel(Rs.getString(8));
           this.setMail(Rs.getString(9));
           this.setDir(Rs.getString(10));
           this.setActFisica(Rs.getString(11));
           this.setObserv(Rs.getString(12));
           this.setDiabet(Rs.getString(13));
           this.setAnticoag(Rs.getString(14));
           this.setTomaAsp(Rs.getString(15));
           this.setAlergias(Rs.getString(16));
           this.setEsguince(Rs.getString(17));
           this.setOtroAnt(Rs.getString(18)); 
           this.setTxtDiabet(Rs.getString(19));
           this.setTxtTomaAsp(Rs.getString(20));
           this.setTxtEsguince(Rs.getString(21)); 
           this.setTxtOtroAnt(Rs.getString(22));
           this.setTxtAlergias(Rs.getString(23));
                return true;
            }
            else
            {
               return false;
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en la Busqueda del paciente");
            return false;
        }  
    }
}
