
package avion;

import javax.swing.*;


public class Pasajero 
{
    static String genero; 
    static int edad;

      public Pasajero(String gen, int edad)
    {
     genero=gen;
     this.edad=edad;    
    } 
      
    public static int getEdad() 
    {
        return edad;
    }

    public static void setEdad(int edad) 
    {
        Pasajero.edad = edad;
    }

    public static String getGenero() 
    {
        return genero;
    }
    
    public static void setGenero(String genero) 
    {
        Pasajero.genero = genero;
    }

    public String mostrarPasajero()
    {
        String cadena="\nGenero"+genero+ "\nEdad: "+edad+ "\n~~~~~~~";
        return cadena;
        
    }
}
