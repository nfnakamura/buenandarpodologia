
package Desarrollo;

import javax.swing.JOptionPane;


public class Validaciones 
{
    
    
    public Validaciones() 
    {
          
    }
    
    public void sololetras(java.awt.event.KeyEvent evt)
    {        
        char letra =  evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isLetter(letra) && Bs != 32  && Bs != 8 && Bs !=127 ) 
            {
                
                evt.consume();
            
            }
    }
    
    public void validarLongitud(String campo, int longitud, java.awt.event.KeyEvent evt) {
        if (campo.length() > longitud) {
            JOptionPane.showMessageDialog(null, "El valor ingresado supera la longitud permitida", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }

    
    public void solonumero(java.awt.event.KeyEvent evt)
    {
        char nro = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isDigit(nro)  && Bs != 8 && Bs !=32 && Bs !=127  ) 
            {
                
                evt.consume();
            }
    }
    
}
