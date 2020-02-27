
package avion;

import javax.swing.*;

public class Avion {

  static int edad, puesto;
  static String clase, genero;
  static int opcion=0;
  static int opcion2;
  static Avion e=new Avion();
  static Pasajero vec[];
  static String pregunta="si";
  static int cont=0; 
  static String mujer;
   public Avion()
    {
        vec=new Pasajero[50];
    }

    public void setPasajero(Pasajero q, int f)
    {
        vec[f]=q;       
    }
    
    public Pasajero getPasajero(int f)
    {
        return vec[f];        
    }
   
    public void mostrarTodosPasajero()
    {
    String cadena="";
       for (int i = 0; i < vec.length; i++) 
       {
        cadena+=vec[i].mostrarPasajero()+"\n";              
       }
       JOptionPane.showMessageDialog(null,cadena);
    } 
  
  public static void main(String[] args) 
    {
       do{
          opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU\n"+
                  "1. Ingresar datos\n"+
                  "2. Estado del avion\n"+
                  "3. Niños en primera clase\n"+
                  "4. Disponibilidad de puestos\n"+
                  "5. Salir"));
          
             String s=String.valueOf(opcion2);
          switch(opcion)
                  {
                 case 1:
                     ingresar();
                       switch(opcion2)
                       {  
                           case 1:
                               System.out.println("Mujer");
                               
                             break;
                       case 2:
                               System.out.println("hombre");
                               
                             break;
                       }
                     break;
                 case 2:
                     estavion();
                     break;
                 case 3:
                     niños();
                     break;
                 case 4:
                     disponibles();
                     break;
          }                      
          }while(opcion<5);
    }
    static void ingresar()
    {     
        
        
    while(cont<50 && pregunta.equals("si"))
    {
        
        int puesto;
        puesto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de puesto"));
        String clase;
        clase=JOptionPane.showInputDialog("Ingrese clase");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        genero=JOptionPane.showInputDialog("Ingrese su genero");
        if (vec[puesto-1].getEdad()==0) 
        {
           if ((puesto-1<=10 && clase.equals("primera"))||(puesto>=10 && puesto<=50 && clase.equals("general"))) 
          {
           
            e.setPasajero(new Pasajero(genero,edad), puesto-1);
           
           cont++;
          }    
        }
      pregunta=JOptionPane.showInputDialog("¿Hay mas pasajeros?");
    }   
    
    }
    static void estavion()
    {
        if (cont==50) 
        {
           JOptionPane.showMessageDialog(null,"El avion esta lleno");
        }  
       else
        {
           JOptionPane.showMessageDialog(null,"El avion no esta lleno"); 
        }
    }
    static void niños()
    {
     int cont2=0;
     if(edad<=12 && clase.equals("primera"))
     {
         cont2++;
     }
     JOptionPane.showMessageDialog(null,"En primera clase viajan"+cont2+ "niños");
    }
    static void disponibles()
    {
        
    }
}
