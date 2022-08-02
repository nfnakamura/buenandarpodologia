
package Bdd;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion 
{

    private final String bdd = "jdbc:mysql://Localhost/buenandar";
    private final String usu = "root";
    private final String clave = "";
    
    private final String Driver = "com.mysql.jdbc.Driver";
    Connection con;
    
      public Conexion() {
        con = null;
         try 
        {
           Class.forName(Driver);
           con = DriverManager.getConnection(bdd, usu, clave);
           if (con != null)  
           {
               System.out.println("conectado"); 
           }  
               
        } 
        catch (Exception e)
        {
            System.out.println("ERROR EN CONEXION!!!");
        } 
        
            
    }
    
    public Connection Conectado() 
    {
      
        return con; 
    
    }

    public void Desconectar()
    {

    }
    
}
